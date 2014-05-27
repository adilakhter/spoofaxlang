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

@SuppressWarnings("all") public class $Source$Dir_0_0 extends Strategy 
{ 
  public static $Source$Dir_0_0 instance = new $Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("SourceDir_0_0");
    Fail23477:
    { 
      TermReference q_4845 = new TermReference();
      IStrategoTerm t_4845 = null;
      IStrategoTerm v_4845 = null;
      IStrategoTerm w_4845 = null;
      if(q_4845.value == null)
        q_4845.value = term;
      else
        if(q_4845.value != term && !q_4845.value.match(term))
          break Fail23477;
      v_4845 = term;
      t_4845 = trans.const4552;
      w_4845 = v_4845;
      term = dr_lookup_rule_0_2.instance.invoke(context, w_4845, t_4845, trans.constCons2047);
      if(term == null)
        break Fail23477;
      lifted7002 lifted70020 = new lifted7002();
      lifted70020.q_4845 = q_4845;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70020);
      if(term == null)
        break Fail23477;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}