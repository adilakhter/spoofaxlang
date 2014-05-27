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

@SuppressWarnings("all") public class reverse_bagof_$Declaration_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Declaration_1_0 instance = new reverse_bagof_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4313)
  { 
    context.push("reverse_bagof_Declaration_1_0");
    Fail22127:
    { 
      TermReference q_4313 = new TermReference();
      TermReference r_4313 = new TermReference();
      if(r_4313.value == null)
        r_4313.value = term;
      else
        if(r_4313.value != term && !r_4313.value.match(term))
          break Fail22127;
      if(q_4313.value == null)
        q_4313.value = term;
      else
        if(q_4313.value != term && !q_4313.value.match(term))
          break Fail22127;
      Success11925:
      { 
        Fail22128:
        { 
          IStrategoTerm w_4313 = null;
          w_4313 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4313, trans.const4360, r_4313.value);
          if(term == null)
            break Fail22128;
          if(true)
            break Success11925;
        }
        term = trans.constNil3;
      }
      lifted6774 lifted67740 = new lifted6774();
      lifted67740.q_4313 = q_4313;
      lifted67740.r_4313 = r_4313;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67740, t_4313);
      if(term == null)
        break Fail22127;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}