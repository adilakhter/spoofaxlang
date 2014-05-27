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

@SuppressWarnings("all") public class once_$Production$Visited_0_0 extends Strategy 
{ 
  public static once_$Production$Visited_0_0 instance = new once_$Production$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ProductionVisited_0_0");
    Fail27500:
    { 
      IStrategoTerm t_4495 = null;
      TermReference u_4495 = new TermReference();
      TermReference v_4495 = new TermReference();
      TermReference w_4495 = new TermReference();
      IStrategoTerm x_4495 = null;
      IStrategoTerm y_4495 = null;
      IStrategoTerm a_4496 = null;
      IStrategoTerm c_4496 = null;
      if(v_4495.value == null)
        v_4495.value = term;
      else
        if(v_4495.value != term && !v_4495.value.match(term))
          break Fail27500;
      if(u_4495.value == null)
        u_4495.value = term;
      else
        if(u_4495.value != term && !u_4495.value.match(term))
          break Fail27500;
      a_4496 = term;
      c_4496 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, c_4496, generator.const7489, v_4495.value);
      if(term == null)
        break Fail27500;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27500;
      t_4495 = term.getSubterm(0);
      y_4495 = term.getSubterm(1);
      x_4495 = term.getSubterm(2);
      term = t_4495;
      lifted10182 lifted101820 = new lifted10182();
      lifted101820.u_4495 = u_4495;
      lifted101820.v_4495 = v_4495;
      lifted101820.w_4495 = w_4495;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101820);
      if(term == null)
        break Fail27500;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27500;
      term = hashtable_put_0_2.instance.invoke(context, x_4495, y_4495, term);
      if(term == null)
        break Fail27500;
      term = a_4496;
      if(w_4495.value == null)
        break Fail27500;
      term = w_4495.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}