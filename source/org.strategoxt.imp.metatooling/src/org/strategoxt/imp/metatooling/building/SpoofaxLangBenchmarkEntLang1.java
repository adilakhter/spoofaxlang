package org.strategoxt.imp.metatooling.building;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.imp.language.Language;
import org.eclipse.imp.language.LanguageRegistry;
import org.spoofax.interpreter.terms.IStrategoString;
import org.strategoxt.imp.editors.spoofax.generated.build_spoofaxlang_jvm_0_0;
import org.strategoxt.imp.editors.spoofax.generated.spoofaxlang;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.parser.SGLRParseController;
import org.strategoxt.imp.runtime.services.StrategoObserver;
import org.strategoxt.imp.runtime.stratego.EditorIOAgent;
import org.strategoxt.imp.runtime.stratego.IMPLibrary;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoErrorExit;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.stratego_lib.dr_scope_all_end_0_0;
import org.strategoxt.stratego_lib.dr_scope_all_start_0_0;

/**
 * Triggers spoofaxlang building and loading from an Ant build file.
 */
public class SpoofaxLangBenchmarkEntLang1 {
	private static volatile boolean active;

	public static boolean isActive() {
		return active;
	}

	private static void refresh(IResource workingdir) throws Exception
	{
		final int depthArg =  IResource.DEPTH_INFINITE;
		final IResource file = workingdir;

		Job job = new Job("Refresh") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					file.touch(monitor);
					file.refreshLocal(depthArg, monitor);
				} catch (Exception e) {
					Environment.logWarning("Could not refresh file", e);
				}
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.schedule(5000);

	}

//	public static void run() throws Exception{
//
//		final String workingDirectoryArg = "path-to-the-project";
//		final IResource file = EditorIOAgent.getResource(new File(workingDirectoryArg));
//		final IProject project = file.getProject();
//		
//		String buildStrategy = "-i"; 
//
//		if (args.length >1)
//			buildStrategy = args[1];
//
//		boolean success  = false;
//		Environment.getStrategoLock().lock();
//		try {
//			if (!isActive())
//			{
//				active = true;
//				try {
//					if (!file.exists()) {
//						Environment.logException("Could not find project at following location :" + file.getLocation(), new FileNotFoundException(file.getFullPath().toOSString()));
//						System.err.println("Build failed: could not find  project at following location :" + file.getLocation());
//						System.exit(1);
//					}
//					final String absolutePath = file.getLocation().toOSString();
//					final String languageName = SpoofaxLangParseController.LANGUAGE;
//					
//					//TODO : FIX 
//					//StrategoObserver observer = newStrategoObserverOf(languageName);
//					StrategoObserver observer =null;
//					
//					success = generateArtefacts(file, new NullProgressMonitor() , newEditorIOAgent(project, absolutePath ,observer , getDescriptor(languageName)), buildStrategy);
//				} finally {
//					active = false;
//				}
//			}	
//		} finally {
//			Environment.getStrategoLock().unlock();
//			refresh(file);
//		}
//
//
//		if (!success) {
//			System.exit(1);
//		}
//
//	}

	private static Descriptor getDescriptor(String languageName){
		Language lang = LanguageRegistry.findLanguage(languageName);
		Descriptor descriptor = Environment.getDescriptor(lang); 

		return descriptor;
	}
	private static  StrategoObserver newStrategoObserverOf(String languageName) throws BadDescriptorException{
		Descriptor desc = getDescriptor(languageName);
		
		// Get parse controller
		SGLRParseController parseController = desc.createService(SGLRParseController.class, null);
		StrategoObserver observer = desc.createService(StrategoObserver.class, parseController);

		return observer;
	}

	
	
	private  static EditorIOAgent newEditorIOAgent(IProject project , String projectPath , StrategoObserver observer, Descriptor desc) throws FileNotFoundException, IOException{
		EditorIOAgent agent = new EditorIOAgent();
		
		agent.setAlwaysActivateConsole(true);
		agent.setProject(project);
		agent.setWorkingDir(projectPath);
		agent.setProjectPath(projectPath);
		agent.setDescriptor(desc);
		agent.clearLog();
			
		//  TODO FIX : imploder attachment is null while project is built from ant script.
		//  hence, adding an stratego observer is not adding any value

		//observer.getRuntime().setIOAgent(agent);
		//((EditorIOAgent)observer.getRuntime().getIOAgent()).setJob(new StrategoObserverUpdateJob(observer));

		return agent;
	}

	private static boolean generateArtefacts(IResource file, IProgressMonitor monitor , EditorIOAgent agent,  String buildStrategy) {

		IPath absoluteProjectLocation = file.getLocation();
		if (absoluteProjectLocation == null) return false;

		try {
			monitor.setTaskName("Generating artefacts for following spx project:  " + file.getName());

			if (file.exists() ) {
				Context contextSpoofaxLang = new Context(Environment.getTermFactory(), agent);
				contextSpoofaxLang.addOperatorRegistry(new IMPLibrary());
				spoofaxlang.init(contextSpoofaxLang);

				IStrategoString input = contextSpoofaxLang.getFactory().makeString(file.getLocation().toOSString());
				IStrategoString buildStrategyTerm = contextSpoofaxLang.getFactory().makeString(buildStrategy);

				dr_scope_all_start_0_0.instance.invoke(contextSpoofaxLang, input);

				try {
					System.out.println("compiling SPX files and generating intermediate artefacts.");
					System.out.println("invoking build-spoofaxlang-jvm.");

					build_spoofaxlang_jvm_0_0.instance.invoke( contextSpoofaxLang , contextSpoofaxLang.getFactory().makeTuple(input, buildStrategyTerm));
					System.out.println("intermediate artefacts have been generated successfully.");
					return true;
				} catch (StrategoErrorExit e) {
					logBuildError(e , "." , true);
				} catch (StrategoExit e) {
					logBuildError(e  , agent.getLog() +" due to StrategoExit");
				}
				finally {
					dr_scope_all_end_0_0.instance.invoke(contextSpoofaxLang, input);
				}
				monitor.setTaskName(null);
			}
		} catch (Exception e) {
			logBuildError(e  , "due to unexpected error.");
		}

		return false;
	}
	private static void logBuildError( Throwable t , String possibleReason){
		logBuildError(t, possibleReason, false);
	}
	private static void logBuildError( Throwable t , String possibleReason, boolean disableLogException){
		System.err.println("=== Spoofaxlang Build failed " + possibleReason);
		
		if(!disableLogException)
			Environment.logException("=== Spoofaxlang Build failed " + possibleReason + " "+t.getMessage() , t );
		else
		{
			System.err.println(t.getMessage());
		}
	}
}
