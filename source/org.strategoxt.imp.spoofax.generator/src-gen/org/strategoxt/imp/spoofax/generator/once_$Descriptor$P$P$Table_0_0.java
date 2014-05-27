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

@SuppressWarnings("all") public class once_$Descriptor$P$P$Table_0_0 extends Strategy 
{ 
  public static once_$Descriptor$P$P$Table_0_0 instance = new once_$Descriptor$P$P$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_DescriptorPPTable_0_0");
    Fail27106:
    { 
      IStrategoTerm t_4430 = null;
      TermReference u_4430 = new TermReference();
      TermReference v_4430 = new TermReference();
      IStrategoTerm w_4430 = null;
      IStrategoTerm x_4430 = null;
      IStrategoTerm z_4430 = null;
      IStrategoTerm a_4431 = null;
      IStrategoTerm c_4431 = null;
      IStrategoTerm d_4431 = null;
      if(u_4430.value == null)
        u_4430.value = term;
      else
        if(u_4430.value != term && !u_4430.value.match(term))
          break Fail27106;
      z_4430 = term;
      c_4431 = term;
      a_4431 = generator.const7124;
      d_4431 = c_4431;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, d_4431, a_4431, generator.constCons4561);
      if(term == null)
        break Fail27106;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27106;
      t_4430 = term.getSubterm(0);
      x_4430 = term.getSubterm(1);
      w_4430 = term.getSubterm(2);
      term = t_4430;
      lifted10047 lifted100470 = new lifted10047();
      lifted100470.u_4430 = u_4430;
      lifted100470.v_4430 = v_4430;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100470);
      if(term == null)
        break Fail27106;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27106;
      term = hashtable_put_0_2.instance.invoke(context, w_4430, x_4430, term);
      if(term == null)
        break Fail27106;
      term = z_4430;
      if(v_4430.value == null)
        break Fail27106;
      term = v_4430.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}