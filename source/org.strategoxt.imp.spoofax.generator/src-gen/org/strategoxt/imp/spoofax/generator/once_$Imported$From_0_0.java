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

@SuppressWarnings("all") public class once_$Imported$From_0_0 extends Strategy 
{ 
  public static once_$Imported$From_0_0 instance = new once_$Imported$From_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ImportedFrom_0_0");
    Fail27080:
    { 
      IStrategoTerm p_4426 = null;
      TermReference q_4426 = new TermReference();
      TermReference r_4426 = new TermReference();
      TermReference s_4426 = new TermReference();
      IStrategoTerm t_4426 = null;
      IStrategoTerm u_4426 = null;
      IStrategoTerm w_4426 = null;
      IStrategoTerm y_4426 = null;
      if(r_4426.value == null)
        r_4426.value = term;
      else
        if(r_4426.value != term && !r_4426.value.match(term))
          break Fail27080;
      if(q_4426.value == null)
        q_4426.value = term;
      else
        if(q_4426.value != term && !q_4426.value.match(term))
          break Fail27080;
      w_4426 = term;
      y_4426 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, y_4426, generator.const7027, r_4426.value);
      if(term == null)
        break Fail27080;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27080;
      p_4426 = term.getSubterm(0);
      u_4426 = term.getSubterm(1);
      t_4426 = term.getSubterm(2);
      term = p_4426;
      lifted10038 lifted100380 = new lifted10038();
      lifted100380.q_4426 = q_4426;
      lifted100380.r_4426 = r_4426;
      lifted100380.s_4426 = s_4426;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100380);
      if(term == null)
        break Fail27080;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27080;
      term = hashtable_put_0_2.instance.invoke(context, t_4426, u_4426, term);
      if(term == null)
        break Fail27080;
      term = w_4426;
      if(s_4426.value == null)
        break Fail27080;
      term = s_4426.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}