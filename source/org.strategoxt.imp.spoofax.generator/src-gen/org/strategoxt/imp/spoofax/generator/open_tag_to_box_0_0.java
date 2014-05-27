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

@SuppressWarnings("all") public class open_tag_to_box_0_0 extends Strategy 
{ 
  public static open_tag_to_box_0_0 instance = new open_tag_to_box_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("open_tag_to_box_0_0");
    Fail25441:
    { 
      IStrategoTerm term10033 = term;
      Success10033:
      { 
        Fail25442:
        { 
          IStrategoTerm s_4219 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25442;
          s_4219 = term.getSubterm(0);
          IStrategoTerm arg5849 = term.getSubterm(1);
          if(arg5849.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5849).isEmpty())
            break Fail25442;
          term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX10, termFactory.makeListCons(s_4219, (IStrategoList)generator.constCons4519))});
          if(true)
            break Success10033;
        }
        term = term10033;
        IStrategoTerm n_4219 = null;
        IStrategoTerm o_4219 = null;
        IStrategoTerm p_4219 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail25441;
        n_4219 = term.getSubterm(0);
        o_4219 = term.getSubterm(1);
        p_4219 = term;
        term = length_0_0.instance.invoke(context, o_4219);
        if(term == null)
          break Fail25441;
        term = termFactory.makeTuple(term, generator.const6964);
        term = gt_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25441;
        term = p_4219;
        IStrategoList list365;
        list365 = checkListTail(o_4219);
        if(list365 == null)
          break Fail25441;
        term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX10, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(n_4219, list365)}), (IStrategoList)generator.constCons4519))});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}