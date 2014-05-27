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

@SuppressWarnings("all") public class position_of_term_1_1 extends Strategy 
{ 
  public static position_of_term_1_1 instance = new position_of_term_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4267, IStrategoTerm q_4267)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("position_of_term_1_1");
    Fail25836:
    { 
      IStrategoTerm r_4267 = null;
      IStrategoTerm s_4267 = null;
      IStrategoTerm t_4267 = null;
      IStrategoTerm u_4267 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail25836;
      r_4267 = ((IStrategoList)term).head();
      t_4267 = ((IStrategoList)term).tail();
      Success10214:
      { 
        Fail25837:
        { 
          IStrategoTerm v_4267 = null;
          v_4267 = term;
          term = position_of_term_1_0.instance.invoke(context, r_4267, w_4267);
          if(term == null)
            break Fail25837;
          s_4267 = term;
          term = v_4267;
          { 
            IStrategoList list390;
            list390 = checkListTail(s_4267);
            if(list390 == null)
              break Fail25836;
            term = (IStrategoTerm)termFactory.makeListCons(q_4267, list390);
            u_4267 = term;
            if(true)
              break Success10214;
          }
        }
        IStrategoTerm z_4267 = null;
        z_4267 = t_4267;
        term = inc_0_0.instance.invoke(context, q_4267);
        if(term == null)
          break Fail25836;
        term = this.invoke(context, z_4267, w_4267, term);
        if(term == null)
          break Fail25836;
        u_4267 = term;
      }
      term = u_4267;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}