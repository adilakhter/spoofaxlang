package org.spoofax.interpreter.library.language.spxlang.index;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.library.IOAgent;
import org.spoofax.interpreter.library.language.spxlang.index.data.IdentifiableConstruct;
import org.spoofax.interpreter.library.language.spxlang.index.data.NamespaceUri;
import org.spoofax.interpreter.library.language.spxlang.index.data.SpxSymbol;
import org.spoofax.interpreter.library.language.spxlang.index.data.SpxSymbolKey;
import org.spoofax.interpreter.library.language.spxlang.index.data.SpxSymbolTableException;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.StrategoListIterator;
import org.spoofax.terms.attachments.TermAttachmentSerializer;

/**
 * @author Md. Adil Akhter
 * Created On : Jul 23, 2012
 */
public final class SpxIndexUtils {
	private SpxIndexUtils() {
		
	}
	
	public static final String AllWithDuplicates = "**";

	public static final String All = "*";
	public static final String DIRTY = "-";
	public static final String ONLY_ONE= ".";
	
	public static final String All_SYMBOLS = "\".*\"";
	
	/**
	 * Constructs {@link IStrategoList} from {@code decls}  
	 * 
	 * @param idxFacade an instance of {@link SpxSemanticIndexFacade }
	 * @param decls A collection of ModuleDeclataions 
	 * @return {@link IStrategoList}
	 */
	public static <T extends IdentifiableConstruct> IStrategoList toTerm( SpxSemanticIndexFacade idxFacade , Iterable<T> decls){
		ITermFactory termFactory = idxFacade.getTermFactory();
		IStrategoList result = termFactory.makeList();
		
		if(decls!=null){	
			for ( T decl: decls)
				result = termFactory.makeListCons(decl.toTerm(idxFacade), result);
		}
		
		return result;
	}

	public static String uriToAbsPathString(URI uri){
		return new File(uri).getAbsolutePath();
	}
	
	public static String toAbsPathString(String path) {
		return new File(path).getAbsolutePath().trim();
	}
	
	public static URI getAbsolutePathUri(String path, IOAgent agent){
		File file = new File(path);
		
		return	file.isAbsolute()? file.toURI() : new File(agent.getWorkingDir(), path).toURI();
	}
	
	public static String getAbsolutePathString(String path , IOAgent agent){
		return uriToAbsPathString(getAbsolutePathUri(path , agent));
	}
	
	static String now(String dateFormat) {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	    return sdf.format(cal.getTime());
	}
	
	// Deletes all the file and directories exists inside 
	// SPX Index directory. If it can't delete the files 
	// then just ignore it. 
	static  void  tryDeleteSpxIndexDir(File cacheDir){
	    if ( cacheDir.exists() &&  cacheDir.isDirectory()) {
	        String[] children = cacheDir.list();
	        for (int i=0; i<children.length; i++) {
	        	tryDeleteSpxIndexDir(new File(cacheDir, children[i]));
	        }
	    }
	    cacheDir.delete();
	}
	
	// Deletes all the files and directories inside 
	// the cache directory denoted using cacheDir. 
	// If it fails to delete any Files or Directories
	// , it returns false. Otherwise, it returns true.
	static  boolean deleteSpxCacheDir(File cacheDir , boolean isRoot){
	    if ( cacheDir.exists() &&  cacheDir.isDirectory()) {
	        String[] children = cacheDir.list();
	        for (int i=0; i<children.length; i++) {
	            boolean success = deleteSpxCacheDir(new File(cacheDir, children[i]) , false);
	            if (!success) {
	                return false;
	            }
	        }
	    }
	    
	    if(isRoot)
	    	return true; // avoid deleting the root directories 
	    		
	    return cacheDir.delete();
	}
	
	public static String serializeToString(TermAttachmentSerializer serializer , IStrategoTerm t) throws IOException{
		if(t == null) return null;
		IStrategoTerm annotatedTerm = serializer.toAnnotations(t);
		
		return termToString(annotatedTerm);
	}
	
	public static String termToString(IStrategoTerm t) throws IOException{
		StringBuilder sb = new StringBuilder();
		t.writeAsString(sb ,Integer.MAX_VALUE);
		
		
		return sb.toString();
	}
	
	public static IStrategoTerm stringToTerm (ITermFactory fac  , String s){
		return fac.parseFromString(s);
	}
	
	public static IStrategoTerm deserializeToTerm(ITermFactory fac , TermAttachmentSerializer serializer, String termString){
		if(termString == null) return null;
		
		IStrategoTerm deserializedAtermWithAnnotation = fac.parseFromString(termString);
		IStrategoTerm deserializedAterm  = serializer.fromAnnotations(deserializedAtermWithAnnotation, true);
		
		return deserializedAterm;
	}
	
	public static String getCsvFormatted(String text){
		if(text ==null) return "";
		
		return text.replace(",", SpxIndexConfiguration.getCSVDelimiter() );
	}
	
	
	
	static  void logEntries(SpxSemanticIndexFacade f,  INamespace namespace , BufferedWriter logger) throws IOException, SpxSymbolTableException{
		Map<SpxSymbolKey , List<SpxSymbol>> members = namespace.getMembers();
		if( namespace instanceof PackageNamespace){
			PackageNamespace ns = (PackageNamespace)namespace;
			ns.ensureEnclosedNamespaceUrisLoaded(f);
			ns.ensureImportedNamespaceUrisLoaded(f);

			for(NamespaceUri uri : ns.enclosedNamespaceUris ){
				logger.write(
						namespace.namespaceUri().getFormattedStringID()  
						+ ","
						+ namespace.getFormattedName()
						+ ",EnclosedNamespace,");
				logger.write( uri.getFormattedStringID() +"\n");
			}
			logger.write("\n");



			for(NamespaceUri uri : ns.importedNamespaceUris ){
				logger.write(
						namespace.namespaceUri().getFormattedStringID()  
						+ ","
						+ namespace.getFormattedName()
						+ ",ImportedNamespace,");
				logger.write(uri.getFormattedStringID()+"\n");
			}

			logger.write("\n");
		}


		if( namespace instanceof ModuleNamespace){
			logger.write(
					namespace.namespaceUri().getFormattedStringID()
					+ ","
					+ namespace.getFormattedName()
					+ ",ParentNamespace,"
					+ ((ModuleNamespace) namespace).enclosingNamespaceUri()
					.getFormattedStringID() + "\n");
		}

		int symbolCount = 0;
		for( SpxSymbolKey k : members.keySet()) {
			for( SpxSymbol s : members.get(k) ){
				symbolCount = symbolCount  + 1; 
				logger.write(namespace.namespaceUri()
						.getFormattedStringID()
						+ ","
						+ SpxIndexUtils.getCsvFormatted(k.printSymbolKey())
						+ ",");
				logger.write( s.printSymbol(f) + "\n");
			}
		}
		logger.write(namespace.namespaceUri().getFormattedStringID() + ","
				+ namespace.getFormattedName() + ",SymbolCount,"
				+ symbolCount  + "\n");
		
		logger.write("\n");
		
		
	}
	
	static void printSymbolTable(SpxSemanticIndexFacade f, boolean printIfDebug, String stageName) throws IOException {
		ISpxPersistenceManager persistenceManager = f.getPersistenceManager();
		if (printIfDebug){
			try {
				persistenceManager.spxSymbolTable().printSymbols(f, stageName, f.getProjectPath(), f.getIndexId());
			
				// System.out.println(persistenceManager.spxCompilcationUnitTable());
				// System.out.println(persistenceManager.spxPackageTable());
				// System.out.println(persistenceManager.spxModuleTable());
				
			} catch (SpxSymbolTableException e) {
			}
		}
	}
	
	public static String listToString ( IStrategoList l , String seperator){
		if ((seperator == null) || seperator.equals("")) 
			throw new IllegalArgumentException("Illegal Seperator provided as argument. Expected : Non Null and Not Empty String.");
		
		if( l == null) { return "" ; }
		
		final StringBuilder sb = new StringBuilder();
		for (IStrategoTerm i: StrategoListIterator.iterable(l)) {
			if(!((i instanceof IStrategoString) || (i instanceof IStrategoConstructor))){
				throw new IllegalStateException("Only IStrategoString expected as a SubTerm of ID");
			}
			if( i instanceof IStrategoString){
				sb.append(Tools.asJavaString(i));
			}
			else
			{
				sb.append( ((IStrategoConstructor)i).getName() );	
			}
			sb.append(seperator);
		}	

		// removing extra separator before returning string representation
		if(sb.length() > 1){
			return sb.substring(0, sb.length()-seperator.length());  
		}
		
		return sb.toString();
	} 

}
