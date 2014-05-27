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

@SuppressWarnings("all") public class element_to_box_0_0 extends Strategy 
{ 
  public static element_to_box_0_0 instance = new element_to_box_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("element_to_box_0_0");
    Fail25439:
    { 
      IStrategoTerm term10032 = term;
      IStrategoConstructor cons325 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10032:
      { 
        if(cons325 == SpoofaxGenerator._consEmptyElement_2)
        { 
          Fail25440:
          { 
            IStrategoTerm l_4219 = null;
            IStrategoTerm m_4219 = null;
            l_4219 = term.getSubterm(0);
            m_4219 = term.getSubterm(1);
            IStrategoList list363;
            list363 = checkListTail(m_4219);
            if(list363 == null)
              break Fail25440;
            term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX10, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(l_4219, list363)}), (IStrategoList)generator.constCons4525))});
            if(true)
              break Success10032;
          }
          term = term10032;
        }
        if(cons325 == SpoofaxGenerator._consElement_4)
        { 
          IStrategoTerm e_4219 = null;
          IStrategoTerm f_4219 = null;
          IStrategoTerm g_4219 = null;
          IStrategoTerm h_4219 = null;
          IStrategoTerm i_4219 = null;
          IStrategoTerm j_4219 = null;
          IStrategoTerm k_4219 = null;
          f_4219 = term.getSubterm(0);
          g_4219 = term.getSubterm(1);
          e_4219 = term.getSubterm(2);
          i_4219 = term;
          term = termFactory.makeTuple(f_4219, g_4219);
          term = open_tag_to_box_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25439;
          h_4219 = term;
          k_4219 = i_4219;
          term = termFactory.makeTuple(e_4219, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX11, termFactory.makeListCons(f_4219, (IStrategoList)generator.constCons4519)));
          term = make$Conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25439;
          j_4219 = term;
          term = k_4219;
          IStrategoList list364;
          list364 = checkListTail(j_4219);
          if(list364 == null)
            break Fail25439;
          term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(h_4219, list364)});
        }
        else
        { 
          break Fail25439;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}