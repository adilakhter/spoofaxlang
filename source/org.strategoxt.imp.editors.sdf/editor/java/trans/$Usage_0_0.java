package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Usage_0_0 extends Strategy 
{ 
  public static $Usage_0_0 instance = new $Usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Usage_0_0");
    Fail76319:
    { 
      TermReference p_92110 = new TermReference();
      TermReference q_92110 = new TermReference();
      IStrategoTerm u_92110 = null;
      if(q_92110.value == null)
        q_92110.value = term;
      else
        if(q_92110.value != term && !q_92110.value.match(term))
          break Fail76319;
      if(p_92110.value == null)
        p_92110.value = term;
      else
        if(p_92110.value != term && !p_92110.value.match(term))
          break Fail76319;
      u_92110 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, u_92110, trans.const15535, q_92110.value);
      if(term == null)
        break Fail76319;
      lifted21658 lifted216580 = new lifted21658();
      lifted216580.p_92110 = p_92110;
      lifted216580.q_92110 = q_92110;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216580);
      if(term == null)
        break Fail76319;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}