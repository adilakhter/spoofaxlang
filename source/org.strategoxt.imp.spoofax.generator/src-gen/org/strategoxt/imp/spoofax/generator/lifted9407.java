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

@SuppressWarnings("all") final class lifted9407 extends Strategy 
{ 
  TermReference x_4314;

  TermReference y_4314;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28668:
    { 
      IStrategoTerm d_4315 = null;
      IStrategoTerm f_4315 = null;
      IStrategoTerm e_4315 = null;
      IStrategoTerm g_4315 = null;
      term = trans_module_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28668;
      term = termFactory.makeTuple(generator.const7420, term, generator.const7421);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28668;
      if(x_4314.value == null)
        x_4314.value = term;
      else
        if(x_4314.value != term && !x_4314.value.match(term))
          break Fail28668;
      term = trans_module_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28668;
      term = termFactory.makeTuple(generator.const7420, term, generator.const7422);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28668;
      if(y_4314.value == null)
        y_4314.value = term;
      else
        if(y_4314.value != term && !y_4314.value.match(term))
          break Fail28668;
      f_4315 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7254);
      if(term == null)
        break Fail28668;
      d_4315 = term;
      g_4315 = f_4315;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7385);
      if(term == null)
        break Fail28668;
      e_4315 = term;
      term = g_4315;
      if(x_4314.value == null || y_4314.value == null)
        break Fail28668;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{d_4315, termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{e_4315}), (IStrategoList)generator.constNil7)}), (IStrategoTerm)termFactory.makeListCons(generator.constBuilders1, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consBuilders_2, new IStrategoTerm[]{generator.const7000, (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consSemanticProvider_1, new IStrategoTerm[]{x_4314.value}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consSemanticProvider_1, new IStrategoTerm[]{y_4314.value}), (IStrategoList)generator.constCons4921)))}), (IStrategoList)generator.constCons4910))});
      if(true)
        return term;
    }
    return null;
  }
}