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

@SuppressWarnings("all") final class lifted9347 extends Strategy 
{ 
  public static final lifted9347 instance = new lifted9347();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28714:
    { 
      IStrategoTerm l_4302 = null;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7232);
      if(term == null)
        break Fail28714;
      l_4302 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7234);
      if(term == null)
        break Fail28714;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{l_4302, termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)}), generator.constCons4678});
      if(true)
        return term;
    }
    return null;
  }
}