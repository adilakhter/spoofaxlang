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

@SuppressWarnings("all") public class once_$Follow$Visited_0_0 extends Strategy 
{ 
  public static once_$Follow$Visited_0_0 instance = new once_$Follow$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_FollowVisited_0_0");
    Fail27448:
    { 
      IStrategoTerm n_4487 = null;
      TermReference o_4487 = new TermReference();
      TermReference p_4487 = new TermReference();
      TermReference q_4487 = new TermReference();
      IStrategoTerm r_4487 = null;
      IStrategoTerm s_4487 = null;
      IStrategoTerm u_4487 = null;
      IStrategoTerm w_4487 = null;
      if(p_4487.value == null)
        p_4487.value = term;
      else
        if(p_4487.value != term && !p_4487.value.match(term))
          break Fail27448;
      if(o_4487.value == null)
        o_4487.value = term;
      else
        if(o_4487.value != term && !o_4487.value.match(term))
          break Fail27448;
      u_4487 = term;
      w_4487 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, w_4487, generator.const7485, p_4487.value);
      if(term == null)
        break Fail27448;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27448;
      n_4487 = term.getSubterm(0);
      s_4487 = term.getSubterm(1);
      r_4487 = term.getSubterm(2);
      term = n_4487;
      lifted10164 lifted101640 = new lifted10164();
      lifted101640.o_4487 = o_4487;
      lifted101640.p_4487 = p_4487;
      lifted101640.q_4487 = q_4487;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101640);
      if(term == null)
        break Fail27448;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27448;
      term = hashtable_put_0_2.instance.invoke(context, r_4487, s_4487, term);
      if(term == null)
        break Fail27448;
      term = u_4487;
      if(q_4487.value == null)
        break Fail27448;
      term = q_4487.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}