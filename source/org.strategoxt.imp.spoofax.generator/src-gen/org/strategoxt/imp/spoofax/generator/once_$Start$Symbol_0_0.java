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

@SuppressWarnings("all") public class once_$Start$Symbol_0_0 extends Strategy 
{ 
  public static once_$Start$Symbol_0_0 instance = new once_$Start$Symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_StartSymbol_0_0");
    Fail27314:
    { 
      IStrategoTerm p_4464 = null;
      TermReference q_4464 = new TermReference();
      TermReference r_4464 = new TermReference();
      IStrategoTerm s_4464 = null;
      IStrategoTerm t_4464 = null;
      IStrategoTerm v_4464 = null;
      IStrategoTerm w_4464 = null;
      IStrategoTerm y_4464 = null;
      IStrategoTerm z_4464 = null;
      if(q_4464.value == null)
        q_4464.value = term;
      else
        if(q_4464.value != term && !q_4464.value.match(term))
          break Fail27314;
      v_4464 = term;
      y_4464 = term;
      w_4464 = generator.const7443;
      z_4464 = y_4464;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, z_4464, w_4464, generator.constCons4561);
      if(term == null)
        break Fail27314;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27314;
      p_4464 = term.getSubterm(0);
      t_4464 = term.getSubterm(1);
      s_4464 = term.getSubterm(2);
      term = p_4464;
      lifted10119 lifted101190 = new lifted10119();
      lifted101190.q_4464 = q_4464;
      lifted101190.r_4464 = r_4464;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101190);
      if(term == null)
        break Fail27314;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27314;
      term = hashtable_put_0_2.instance.invoke(context, s_4464, t_4464, term);
      if(term == null)
        break Fail27314;
      term = v_4464;
      if(r_4464.value == null)
        break Fail27314;
      term = r_4464.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}