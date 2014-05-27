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

@SuppressWarnings("all") final class lifted9456 extends Strategy 
{ 
  Strategy k_4326;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28620:
    { 
      IStrategoTerm i_4326 = null;
      IStrategoTerm term10644 = term;
      Success11340:
      { 
        Fail28621:
        { 
          term = $Follow$Success_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28621;
          if(true)
            break Success11340;
        }
        term = term10644;
        IStrategoTerm term10645 = term;
        Success11341:
        { 
          Fail28622:
          { 
            term = k_4326.invoke(context, term);
            if(term == null)
              break Fail28622;
            if(true)
              break Success11341;
          }
          term = term10645;
          IStrategoTerm u_4326 = null;
          IStrategoTerm j_4326 = null;
          IStrategoTerm v_4326 = null;
          IStrategoTerm x_4326 = null;
          IStrategoTerm y_4326 = null;
          i_4326 = term;
          term = heuristic_child_sorts_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28620;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail28620;
          u_4326 = ((IStrategoList)term).head();
          IStrategoTerm arg6367 = ((IStrategoList)term).tail();
          if(arg6367.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6367).isEmpty())
            break Fail28620;
          term = u_4326;
          l_4326 l_43260 = new l_4326();
          l_43260.k_4326 = k_4326;
          term = l_43260.invoke(context, term);
          if(term == null)
            break Fail28620;
          j_4326 = term;
          x_4326 = term;
          v_4326 = generator.const7487;
          y_4326 = x_4326;
          term = termFactory.makeTuple(generator.const7488, i_4326);
          term = dr_set_rule_0_3.instance.invoke(context, y_4326, v_4326, i_4326, term);
          if(term == null)
            break Fail28620;
          term = j_4326;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}