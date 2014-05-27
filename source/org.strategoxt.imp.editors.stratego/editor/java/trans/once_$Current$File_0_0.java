package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class once_$Current$File_0_0 extends Strategy 
{ 
  public static once_$Current$File_0_0 instance = new once_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentFile_0_0");
    Fail21944:
    { 
      IStrategoTerm o_4282 = null;
      TermReference p_4282 = new TermReference();
      TermReference q_4282 = new TermReference();
      IStrategoTerm r_4282 = null;
      IStrategoTerm s_4282 = null;
      IStrategoTerm u_4282 = null;
      IStrategoTerm v_4282 = null;
      IStrategoTerm x_4282 = null;
      IStrategoTerm y_4282 = null;
      if(p_4282.value == null)
        p_4282.value = term;
      else
        if(p_4282.value != term && !p_4282.value.match(term))
          break Fail21944;
      u_4282 = term;
      x_4282 = term;
      v_4282 = trans.const4263;
      y_4282 = x_4282;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, y_4282, v_4282, trans.constCons1966);
      if(term == null)
        break Fail21944;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21944;
      o_4282 = term.getSubterm(0);
      s_4282 = term.getSubterm(1);
      r_4282 = term.getSubterm(2);
      term = o_4282;
      lifted6710 lifted67100 = new lifted6710();
      lifted67100.p_4282 = p_4282;
      lifted67100.q_4282 = q_4282;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67100);
      if(term == null)
        break Fail21944;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21944;
      term = hashtable_put_0_2.instance.invoke(context, r_4282, s_4282, term);
      if(term == null)
        break Fail21944;
      term = u_4282;
      if(q_4282.value == null)
        break Fail21944;
      term = q_4282.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}