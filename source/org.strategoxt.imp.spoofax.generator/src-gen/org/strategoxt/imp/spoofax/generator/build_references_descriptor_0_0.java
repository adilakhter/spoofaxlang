package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class build_references_descriptor_0_0 extends Strategy 
{ 
  public static build_references_descriptor_0_0 instance = new build_references_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("build_references_descriptor_0_0");
    Fail26084:
    { 
      IStrategoTerm d_4299 = null;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7226);
      if(term == null)
        break Fail26084;
      d_4299 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7216);
      if(term == null)
        break Fail26084;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{d_4299, termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)}), generator.constCons4675});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}