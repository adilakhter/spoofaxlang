package org.strategoxt.imp.metatooling.wizards;

import static org.eclipse.core.resources.IResource.DEPTH_INFINITE;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.spoofax.interpreter.core.Interpreter;
import org.strategoxt.imp.editors.spoofax.ui.SpoofaxlangDependencyViewImages;
import org.strategoxt.imp.runtime.EditorState;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.stratego.EditorIOAgent;
import org.strategoxt.imp.spoofax.generator.SpoofaxGenerator;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoErrorExit;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.permissivegrammars.make_permissive;

/**
 * A wizard for creating new Spoofax/IMP projects using SPX Language .
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 * @author Md Adil Akhter  <md.adilakhter add gmail.com>
 */
public class NewSpxEditorWizard extends Wizard implements INewWizard {
	
	private final SpoofaxlangEditorWizardPage input;
	private final String title = "SpoofaxLang Editor Project";
	private final String description = "Creates a new SpoofaxLang project (using SpoofaxLang beta)";
	
	private IProject lastProject;

	// TODO: Support external directory and working set selection in wizard
			
	public NewSpxEditorWizard() {
		input = new SpoofaxlangEditorWizardPage(title, description);
		setDefaultPageImageDescriptor(SpoofaxlangDependencyViewImages.DESC_NEW_PROJ);
		setNeedsProgressMonitor(true);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// No further initialization required
	}
	
	@Override
	public void addPages() {
		addPage(input);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		final String languageName = input.getInputLanguageName();
		final String projectName = input.getInputProjectName();
		final String packageName = input.getInputPackageName();
		final String extensions = input.getInputExtensions();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(languageName, projectName, packageName, extensions, monitor);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			rollback();
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			Environment.logException("Exception while creating new project", realException);
			MessageDialog.openError(getShell(), "Error: " + realException.getClass().getName(), realException.getMessage());
			rollback();
			return false;
		}
		return true;
	}
	
	private void rollback() {
		// monitor.setTaskName("Undoing workspace operations");
		try {
			if (lastProject != null) lastProject.delete(true, null);
		} catch (CoreException e) {
			Environment.logException("Could not remove new project", e);
		}
	}
	
	
 	private void doFinish(String languageName, String projectName, String packageName, String extensions, IProgressMonitor monitor) throws IOException, CoreException {
		final int TASK_COUNT = 20;
		lastProject = null;
		monitor.beginTask("Creating " + languageName + " project", TASK_COUNT);
		
		monitor.setTaskName("Preparing project builder");
		EditorIOAgent agent = new EditorIOAgent();
		agent.setAlwaysActivateConsole(true);
		Context context = new Context(Environment.getTermFactory(), agent);
		context.registerClassLoader(make_permissive.class.getClassLoader());
		SpoofaxGenerator.init(context);
		monitor.worked(1);

		monitor.setTaskName("Creating project");
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject project = lastProject = workspace.getRoot().getProject(projectName);
		project.create(null);
		project.open(null);
		monitor.worked(1);

		agent.setWorkingDir(project.getLocation().toOSString());
		
		try {
			SpoofaxGenerator.mainNoExit(context, "-m", languageName, "-pn", projectName, "-n", packageName, "-e", extensions, "--verbose", "2","-nproj");
		} catch (StrategoErrorExit e) {
			Environment.logException(e);
			throw new StrategoException("Project builder failed: " + e.getMessage() + "\nLog follows:\n\n"
					+ agent.getLog(), e);
		} catch (StrategoExit e) {
			if (e.getValue() != 0) {
				throw new StrategoException("Project builder failed.\nLog follows:\n\n"
						+ agent.getLog(), e);
			}
		}
		monitor.worked(8);
		
		if ( !project.isSynchronized(DEPTH_INFINITE))
		{
			project.refreshLocal(DEPTH_INFINITE, new NullProgressMonitor());
			
			IFolder srcFolder = project.getFolder("src");
			srcFolder.touch(new NullProgressMonitor());
			srcFolder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
		}
		
		//AntSpxGenerateArtefacts.generateArtefacts(project , monitor, agent);
		//project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		monitor.setTaskName("Acquiring workspace lock"); // need root lock for builder
		IWorkspaceRoot root = project.getWorkspace().getRoot();
		Job.getJobManager().beginRule(root, monitor); // avoid ant builder launching
		try {
			monitor.setTaskName("Acquiring environment lock");
			monitor.worked(1);
			Environment.getStrategoLock().lock();
			try { // avoid background editor loading
				
				monitor.setTaskName("Loading new resources");
				project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				
				monitor.worked(1);
				
				
				monitor.setTaskName("Building and loading example editor");
				project.build(IncrementalProjectBuilder.FULL_BUILD, null);
				monitor.worked(6);

				// TODO: Optimize - don't reload editor (already done from Ant file)
				// DynamicDescriptorLoader.getInstance().forceNoUpdate(descriptor);
				
				//monitor.setTaskName("Loading editor");
				//IResource descriptor = project.findMember("include/" + languageName + ".packed.esv");
				//DynamicDescriptorLoader.getInstance().forceUpdate(descriptor);
				monitor.worked(2);
				project.refreshLocal(DEPTH_INFINITE, new NullProgressMonitor());
				monitor.worked(1);
				
			} finally {
				Environment.getStrategoLock().unlock();
			}
		} finally {
			Job.getJobManager().endRule(root);
		}

		monitor.setTaskName("Opening editor tabs. Please rebuild the whole project.");
		Display display = getShell().getDisplay();
		EditorState.asyncOpenEditor(display, project.getFile("/src/" + (languageName+"-descriptor").toLowerCase() +  ".spx"), true);
		monitor.worked(2);
		EditorState.asyncOpenEditor(display, project.getFile("/src/" + (languageName+"-definitions").toLowerCase() +  ".spx"), true);
		monitor.worked(2);
		EditorState.asyncOpenEditor(display, project.getFile("/test/example." + extensions.split(",")[0]), false);
		refreshProject(project);
	
		monitor.worked(2);
	
		monitor.done();
	}
 	
 	private static void refreshProject(final IProject project) {
		// We schedule a project refresh to make all ".generated" files readable
		Job job = new Job("Refreshing project") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Wait for update thread
				Environment.getStrategoLock().lock();
				Environment.getStrategoLock().unlock();
				try {
					project.refreshLocal(DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					// Ignore
				}
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.schedule(5000);
	}
 	
 	private static String toStrategoName(String languageName) {
 		return Interpreter.cify(languageName.toLowerCase()).replace('-', '_');
 	}

 	
	/*
	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.strategoxt.imp.metatooling", IStatus.OK, message, null);
		throw new CoreException(status);
	}
	*/
}
