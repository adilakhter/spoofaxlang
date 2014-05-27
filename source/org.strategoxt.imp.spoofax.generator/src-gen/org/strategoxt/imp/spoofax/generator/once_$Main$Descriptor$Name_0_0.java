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

@SuppressWarnings("all") public class once_$Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static once_$Main$Descriptor$Name_0_0 instance = new once_$Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_MainDescriptorName_0_0");
    Fail27734:
    { 
      IStrategoTerm o_4535 = null;
      TermReference p_4535 = new TermReference();
      TermReference q_4535 = new TermReference();
      IStrategoTerm r_4535 = null;
      IStrategoTerm s_4535 = null;
      IStrategoTerm u_4535 = null;
      IStrategoTerm v_4535 = null;
      IStrategoTerm x_4535 = null;
      IStrategoTerm y_4535 = null;
      if(p_4535.value == null)
        p_4535.value = term;
      else
        if(p_4535.value != term && !p_4535.value.match(term))
          break Fail27734;
      u_4535 = term;
      x_4535 = term;
      v_4535 = generator.const7897;
      y_4535 = x_4535;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, y_4535, v_4535, generator.constCons4561);
      if(term == null)
        break Fail27734;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27734;
      o_4535 = term.getSubterm(0);
      s_4535 = term.getSubterm(1);
      r_4535 = term.getSubterm(2);
      term = o_4535;
      lifted10263 lifted102630 = new lifted10263();
      lifted102630.p_4535 = p_4535;
      lifted102630.q_4535 = q_4535;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102630);
      if(term == null)
        break Fail27734;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27734;
      term = hashtable_put_0_2.instance.invoke(context, r_4535, s_4535, term);
      if(term == null)
        break Fail27734;
      term = u_4535;
      if(q_4535.value == null)
        break Fail27734;
      term = q_4535.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}