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

@SuppressWarnings("all") public class reverse_bagof_$Declaration_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Declaration_1_0 instance = new reverse_bagof_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_92105)
  { 
    context.push("reverse_bagof_Declaration_1_0");
    Fail76288:
    { 
      TermReference v_92105 = new TermReference();
      TermReference w_92105 = new TermReference();
      if(w_92105.value == null)
        w_92105.value = term;
      else
        if(w_92105.value != term && !w_92105.value.match(term))
          break Fail76288;
      if(v_92105.value == null)
        v_92105.value = term;
      else
        if(v_92105.value != term && !v_92105.value.match(term))
          break Fail76288;
      Success41853:
      { 
        Fail76289:
        { 
          IStrategoTerm b_92106 = null;
          b_92106 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_92106, trans.const15522, w_92105.value);
          if(term == null)
            break Fail76289;
          if(true)
            break Success41853;
        }
        term = trans.constNil11;
      }
      lifted21647 lifted216470 = new lifted21647();
      lifted216470.v_92105 = v_92105;
      lifted216470.w_92105 = w_92105;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216470, y_92105);
      if(term == null)
        break Fail76288;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}