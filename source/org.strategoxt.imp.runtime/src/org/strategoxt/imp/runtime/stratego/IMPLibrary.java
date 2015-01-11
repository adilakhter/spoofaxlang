package org.strategoxt.imp.runtime.stratego;

import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;

/**
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class IMPLibrary extends AbstractStrategoOperatorRegistry {
	
	public static final String REGISTRY_NAME = "sdf2imp";
	
	public IMPLibrary() {
		add(new NameDialogPrimitive());
		add(new SubtermPrimitive());
		add(new TermPathPrimitive());
		add(new ProjectPathPrimitive());
		add(new PluginPathPrimitive());
		add(new RefreshResourcePrimitive());
		add(new QueueAnalysisPrimitive());
		add(new QueueStrategyPrimitive());
		add(new SetMarkersPrimitive());
		add(new CandidateSortsPrimitive());
		
		add(new SetTotalWorkUnitsPrimitive());
		add(new CompleteWorkUnitPrimitive());
		add(new SaveAllResourcesPrimitive());
		add(new MessageDialogPrimitive());
		add(new LanguageDescriptionPrimitive());
		add(new OverrideInputPrimitive());

		add(new OriginSurroundingCommentsPrimitive());

		add(new InSelectedFragmentPrimitive());

		add(new OriginLanguagePrimitive());
		
		add(new EchoTest());
		add(new deltree_0_0());
		add(new path_to_dataurl_0_0());
	}

	public String getOperatorRegistryName() {
		return REGISTRY_NAME;
	}
}
