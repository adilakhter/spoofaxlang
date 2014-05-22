package org.spoofax.interpreter.library.language.spxlang.index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.library.language.spxlang.index.data.ModuleDeclaration;
import org.spoofax.interpreter.library.language.spxlang.index.data.NamespaceUri;
import org.spoofax.interpreter.library.language.spxlang.index.data.PackageDeclaration;
import org.spoofax.interpreter.library.language.spxlang.index.data.SpxSymbol;
import org.spoofax.interpreter.library.language.spxlang.index.data.SpxSymbolTableException;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;


/**
 * Implementation of a PackageNamesapce.  Every PackageDeclaration is associated with a PackageNamespace 
 * which has 0 or more ModuleNamepsaces enclosed. 
 * 
 * @author Md. Adil Akhter
 */
public final class PackageNamespace  extends BaseNamespace {
	
	//TODO improvement : Implement a Query Pattern for symbol resolving . 
	
	private static final long serialVersionUID = 7324156752002137217L;
	private static final String INTERNAL_NAMESPACENAME = "__internal";

	transient Set<NamespaceUri> importedNamespaceUris;
	transient Set<NamespaceUri> enclosedNamespaceUris;
	
	/**
	 * Instantiates a new instance of {@link PackageNamespace}
	 * 
	 * @param currentNamespace
	 * @param type
	 * @param enclosingNamespace
	 * @param manager
	 */
	private PackageNamespace(NamespaceUri currentNamespace, IStrategoConstructor type, NamespaceUri enclosingNamespace, ISpxPersistenceManager manager) {
		super(currentNamespace, type, manager, enclosingNamespace);
	}
	
	@Override 
	public void clear() { 
		super.clear();
		
		importedNamespaceUris = null;
		enclosedNamespaceUris = null;
	};
	
	/**
	 * Ensures that the enclosed Namespaces of this {@link} PackageNamespace is already loaded. If not, then they  
	 * are loaded. 
	 * 
	 * @param facade
	 * @throws SpxSymbolTableException
	 */
	void ensureEnclosedNamespaceUrisLoaded(SpxSemanticIndexFacade facade) throws SpxSymbolTableException{
		if( enclosedNamespaceUris == null){
			enclosedNamespaceUris = new HashSet<NamespaceUri>();
			
			//add internal Module's namespace uri  
			enclosedNamespaceUris.add(packageInternalNamespace(this.namespaceUri() , facade));
			
			Iterable<ModuleDeclaration> mDecls = facade.getModuleDeclarations( this.namespaceUri().strategoID(facade.getTermFactory()));
			if(mDecls !=null){
				for(ModuleDeclaration m : mDecls){
					enclosedNamespaceUris.add(m.getNamespaceUri(facade));
				}	
			}
		}
	}
	
	/**
	 * Ensures imported Namespaces are loaded of this {@link PackageNamespace} 
	 * 
	 * @param facade
	 * @throws SpxSymbolTableException
	 */
	void ensureImportedNamespaceUrisLoaded(SpxSemanticIndexFacade facade) throws SpxSymbolTableException{
		if( importedNamespaceUris == null){
			
			importedNamespaceUris= new HashSet<NamespaceUri>();
			
			SpxPrimarySymbolTable symTable =  facade.getPersistenceManager().spxSymbolTable();
			
			//getting the package declaration and retrieving it imported references 
			PackageDeclaration assiciatedPackageDeclaration = facade.lookupPackageDecl(this.namespaceUri().strategoID(facade.getTermFactory()));
			
			Set<IStrategoList> importedIds = assiciatedPackageDeclaration.getImportReferneces();
			
			for(IStrategoList l : importedIds){
				importedNamespaceUris.add(symTable.toNamespaceUri(l));; 
			}	
		}
	}

	/**
	 * Restricts transitive imports. If {@code searchOrigin}  {@link INamespace} imports 
	 * current {@link INamespace}, then in order to avoid transitive lookup , resolving in 
	 * the imported {@link INamespace}s is avoided.  It also detects cyclic import references.    
	 * 
	 * @param facade
	 * @param searchOrigin
	 * @return
	 * @throws SpxSymbolTableException
	 */
	boolean isTransitiveImportLookup(SpxSemanticIndexFacade facade , INamespace searchOrigin) throws SpxSymbolTableException{
		
		PackageDeclaration	assiciatedPackageDeclaration = facade.lookupPackageDecl(this.namespaceUri().strategoID(facade.getTermFactory()));
		
		Set<IStrategoList> importedToPackages = facade.getPersistenceManager().spxPackageTable().getImportedToReferencesOf(assiciatedPackageDeclaration.getId());
		
		return importedToPackages.contains(searchOrigin.namespaceUri().strategoID(facade.getTermFactory()));
	}
	
	
	/* Resolving symbol in PackageNamespace following few   
	 * basic rules. First it try to resolve symbol in its enclosed namespace , then it try to resolve 
	 * the symbol in its enclosing namespace and at last, it looks for the symbol in the imported 
	 * namespaces.
	 * 
	 * @see org.spoofax.interpreter.library.language.spxlang.BaseNamespace#resolve(org.spoofax.interpreter.terms.IStrategoTerm, org.spoofax.interpreter.terms.IStrategoTerm, org.spoofax.interpreter.library.language.spxlang.INamespace, org.spoofax.interpreter.library.language.spxlang.SpxSemanticIndexFacade)
	 */
	@Override
	public SpxSymbol resolve(IStrategoTerm id, IStrategoTerm type, INamespace searchedBy, SpxSemanticIndexFacade facade, int lookupDepth) throws SpxSymbolTableException {
		facade.getPersistenceManager().logMessage(this.src, "resolve | Resolving Symbol in " + this.namespaceUri() +  " . Key :  " + id + " origin Namespace: " + searchedBy.namespaceUri().id() );
		
		ensureEnclosedNamespaceUrisLoaded(facade);
		SpxSymbol retSymbol = resolveSymbolinNamespaces(this.enclosedNamespaceUris, id, type, searchedBy, facade);

		if (retSymbol == null) {
			// Searching in package's local symbols. If not found, search
			// in the enclosing namespaces i.e. in Global Namespace
			retSymbol = super.resolve(id, type, searchedBy, facade, lookupDepth);

			if (retSymbol == null) {
				if ( shouldSearchInImportedNamespace(facade , searchedBy , lookupDepth)) {
					// try to resolve in the imported namespaces
					ensureImportedNamespaceUrisLoaded(facade);
					retSymbol = resolveSymbolinNamespaces(this.importedNamespaceUris, id, type, searchedBy, facade);
				}
			}
		}
		return retSymbol;
	}

	/* Resolves all the symbol with the {@code key} as ID in the current Scope-Tree 
	 * based  implementation of the Symbol Table.
	 * 
	 * @see org.spoofax.interpreter.library.language.spxlang.BaseNamespace#resolveAll(org.spoofax.interpreter.terms.IStrategoTerm, org.spoofax.interpreter.library.language.spxlang.INamespace, org.spoofax.interpreter.library.language.spxlang.SpxSemanticIndexFacade)
	 */
	@Override
	public Collection<SpxSymbol> resolveAll(SpxSemanticIndexFacade facade,IStrategoTerm key, IStrategoTerm type, INamespace originNamespace, int lookupDepth, boolean returnDuplicate) throws SpxSymbolTableException{
		facade.getPersistenceManager().logMessage(this.src, "resolveAll | Resolving Symbol in " + this.namespaceUri() +  " . Key :  " + key + " origin Namespace: " + originNamespace.namespaceUri().id() );
		
		Collection<SpxSymbol> retResult = null;
		
		if (returnDuplicate)
			retResult =	new ArrayList<SpxSymbol>();
		else
			retResult =	new HashSet<SpxSymbol>();
		
		//searching in the enclosed namespace. For PackageNamespace, all the enclosed ModuleNamespace is searched. 
		ensureEnclosedNamespaceUrisLoaded(facade);
		retResult.addAll(resolveAllSymbolsInNamespaces(this.enclosedNamespaceUris, key, type, originNamespace, facade , returnDuplicate)) ;
		
		//searching in the current scope and its enclosing scope
		retResult.addAll(super.resolveAll(facade, key, type, originNamespace, lookupDepth, returnDuplicate));
		
		
		//searching in the imported namespaces. Also  detect transitive and cyclic import references.  
		if ( shouldSearchInImportedNamespace(facade , originNamespace , lookupDepth)) {
			ensureImportedNamespaceUrisLoaded(facade);
			retResult.addAll(resolveAllSymbolsInNamespaces(this.importedNamespaceUris, key, type, originNamespace, facade, returnDuplicate)) ;
		}
		//returning the result 
		return retResult;
	}
	protected boolean shouldSearchInImportedNamespace( SpxSemanticIndexFacade facade , INamespace originNamespace, int lookupDepth) throws SpxSymbolTableException{
		return !isTransitiveImportLookup(facade , originNamespace) && verifyIsValidForLookup(lookupDepth) ;
	}
	
	@Override
	protected boolean shouldSearchInEnclosingNamespace(INamespace searchedBy,int lookupDepth ) {
		boolean retValue =  super.shouldSearchInEnclosingNamespace(searchedBy,lookupDepth);
		if(retValue) {
			// Primary goal of this extra check is to prune search tree. 
			// Only allowing Searching in the global namespace if search started in one of the 
			// enclosing modules of this Package or it is indeed a package namespace.
			// By this way, global namespace ( which could contain considerable amount of symbol) 
			// lookup will be performed only once. 
			retValue =  enclosedNamespaceUris.contains(searchedBy.namespaceUri());
		}
		return retValue;	
	}
	
	/** 
	 * Resolving a Symbol in the Namespaces specified in {@code resolvableUris} 
	 * @param resolvableUris 
	 * @param key
	 * @param type
	 * @param searchedOrigin
	 * @param facade
	 * @return a {@link SpxSymbol} matched with the search criteria mentioned 
	 * @throws SpxSymbolTableException 
	 */
	private SpxSymbol resolveSymbolinNamespaces(Iterable<NamespaceUri> resolvableUris  ,IStrategoTerm key, IStrategoTerm type, INamespace searchedOrigin, SpxSemanticIndexFacade facade) throws SpxSymbolTableException {
		
		SpxSymbol retSymbol = null;
		INamespaceResolver namespaceResolver = facade.getPersistenceManager().spxSymbolTable();
		 
		for( NamespaceUri uri : resolvableUris){

			INamespace thisNamespace = uri.resolve(namespaceResolver);
			
			if (disallowLookupIn(thisNamespace , searchedOrigin)){	
				// Current Namespace is an internal Namespace and
				// Internal Namespace Search is disabled for searchedBy 
				// hence, ignoring it.
				continue;
			}
			
			retSymbol = thisNamespace.resolve(key, type, this, facade, Integer.MAX_VALUE) ;
			if(retSymbol != null)
				break;
		}
		
		return retSymbol;
	}
	
	private Collection<SpxSymbol> resolveAllSymbolsInNamespaces(Iterable<NamespaceUri> resolvableUris  ,IStrategoTerm key, IStrategoTerm ofType,  INamespace searchOrigin, SpxSemanticIndexFacade facade, boolean returnDuplicates) throws SpxSymbolTableException {
		
		Collection<SpxSymbol> retSymbol = null;
		
		if (returnDuplicates)
			retSymbol =	new ArrayList<SpxSymbol>();
		else
			retSymbol =	new HashSet<SpxSymbol>();
		
		INamespaceResolver namespaceResolver = facade.getPersistenceManager().spxSymbolTable();
		 
		for( NamespaceUri uri : resolvableUris){

			INamespace thisNamespace = uri.resolve(namespaceResolver);
			
			if (disallowLookupIn(thisNamespace , searchOrigin)){	
				// Current Namespace is an internal Namespace and
				// Internal Namespace Search is disabled for searchedBy 
				// hence, ignoring it.
				continue;
			}
			retSymbol.addAll(thisNamespace.resolveAll(facade, key, ofType, this, Integer.MAX_VALUE, returnDuplicates));
		}
		
		return retSymbol;
	}
	
	protected boolean shouldSearchInInternalNamespace( INamespace namespaceToSearchIn , INamespace searchedBy) {
		// If searchedBy's enclosing namespace uri  is CurrentNamespace 
		// or searchBy is indeed this Namespace 
		// then , searching _internal Namespace 
		if ( namespaceToSearchIn.enclosingNamespaceUri().equals(this.namespaceUri()))
			return searchedBy.enclosingNamespaceUri().equals(this.namespaceUri())   
				|| searchedBy.namespaceUri().equals(this.namespaceUri());   
		
		return false;
	}
	
	private boolean disallowLookupIn( INamespace namespaceToSearchIn , INamespace originNamespace){
		
		// checking whether searching in Internal Namespace is allowed
		// Rule : if namespaceToSearchIn is an internal namespace 
		boolean resolveInCurrentNamespaceIsNotAllowed = namespaceToSearchIn.isInternalNamespace() && !shouldSearchInInternalNamespace( namespaceToSearchIn , originNamespace) ;
		
		
		// checks whether we are searching nameapceToSearchIn multiple times
		// if search origin is NamespaceToSearchIn, then we already searched namespaceToSearchIn namespace
		boolean currentNamespaceIsSearchedOrigin = namespaceToSearchIn.namespaceUri() == originNamespace.namespaceUri();  // disallowing repeatative resolve of the namespace from where search originated.
		
		
		// if either one condition is true, lookup in namespaceToSearchIn is avoided. 
		return resolveInCurrentNamespaceIsNotAllowed ||  currentNamespaceIsSearchedOrigin;
	}
	
	/**
	 * Creates an instance of PackageScope. Also creates internal symbol scopes
	 * 
	 * @param facade
	 * @return
	 */
	public static Iterable<INamespace> createInstances(IStrategoList id, SpxSemanticIndexFacade facade){
		
		SpxPrimarySymbolTable  table =  facade.getPersistenceManager().spxSymbolTable() ;
		List<INamespace> namespaces = new ArrayList<INamespace>();
		INamespace ns = table.resolveNamespace(id); 
		if(ns == null)
		{				
			NamespaceUri globalNsUri =  table.toNamespaceUri(GlobalNamespace.getGlobalNamespaceId(facade));
			NamespaceUri currentPackageUri = table.toNamespaceUri(id);
	
			ns = new PackageNamespace(currentPackageUri, facade.getCons().getPackageNamespaceTypeCon(), globalNsUri,facade.getPersistenceManager());
			namespaces.add(ns);
			namespaces.add(createInternalNamespace(ns.namespaceUri() , facade));
		}
	
		return namespaces;
	}
	
	/**
	 * Creates a new Internal namespace for the current package namespace.
	 * @param enclosingNamespaceId
	 * @param idxFacade
	 * @return
	 */
	private static INamespace createInternalNamespace( NamespaceUri enclosingNamespaceId , SpxSemanticIndexFacade facade)
	{
		SpxPrimarySymbolTable  table =  facade.getPersistenceManager().spxSymbolTable() ;
		
		NamespaceUri internalNamespaceUri = packageInternalNamespace(enclosingNamespaceId, facade);
		INamespace ns = table.resolveNamespace(internalNamespaceUri) ;
		
		if(ns == null) {	
			ns = (ModuleNamespace)ModuleNamespace.createInstance(internalNamespaceUri, enclosingNamespaceId, facade, null);
			((ModuleNamespace)ns).isInternalNamespace = true;
		}
		return ns;
	}

	/**
	 * @param enclosingNamespaceId
	 * @param idxFacade
	 * @return NamespaceUri
	 */
	public static NamespaceUri packageInternalNamespace(NamespaceUri enclosingNamespaceId, SpxSemanticIndexFacade idxFacade) {
		
		SpxPrimarySymbolTable  table =  idxFacade.getPersistenceManager().spxSymbolTable() ;
		
		IStrategoList internalModuleID  = packageInternalModuleId(enclosingNamespaceId.strategoID(idxFacade.getTermFactory()), idxFacade);
		NamespaceUri internalModuleUri  = table.toNamespaceUri(internalModuleID);
		return internalModuleUri;
	}
	
	public static IStrategoList packageInternalModuleId(IStrategoList id, SpxSemanticIndexFacade idxFacade) {
		ITermFactory termFactory =  idxFacade.getTermFactory();
		
		List<IStrategoTerm> subTerms = new ArrayList<IStrategoTerm>();
		
		IStrategoList spoofaxNamespaceId = id;
		
		subTerms.addAll(Arrays.asList(spoofaxNamespaceId.getAllSubterms()));
		subTerms.add(termFactory.makeString(INTERNAL_NAMESPACENAME));
		
		return termFactory.makeList(subTerms);
	}

	@Override
	public IStrategoAppl toTypedQualifiedName(SpxSemanticIndexFacade facade) {
		return PackageDeclaration.toPackageQNameAppl(facade, this.namespaceUri().strategoID(facade.getTermFactory()));
	}
	
	@Override
	public String getFormattedName(){
		return  "Package/" + this.namespaceUri().getFormattedStringID();
		
	}
}