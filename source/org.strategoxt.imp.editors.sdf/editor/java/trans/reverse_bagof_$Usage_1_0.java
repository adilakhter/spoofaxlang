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

@SuppressWarnings("all") public class reverse_bagof_$Usage_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Usage_1_0 instance = new reverse_bagof_$Usage_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_92110)
  { 
    context.push("reverse_bagof_Usage_1_0");
    Fail76315:
    { 
      TermReference c_92110 = new TermReference();
      TermReference d_92110 = new TermReference();
      if(d_92110.value == null)
        d_92110.value = term;
      else
        if(d_92110.value != term && !d_92110.value.match(term))
          break Fail76315;
      if(c_92110.value == null)
        c_92110.value = term;
      else
        if(c_92110.value != term && !c_92110.value.match(term))
          break Fail76315;
      Success41861:
      { 
        Fail76316:
        { 
          IStrategoTerm i_92110 = null;
          i_92110 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_92110, trans.const15535, d_92110.value);
          if(term == null)
            break Fail76316;
          if(true)
            break Success41861;
        }
        term = trans.constNil11;
      }
      lifted21656 lifted216560 = new lifted21656();
      lifted216560.c_92110 = c_92110;
      lifted216560.d_92110 = d_92110;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216560, f_92110);
      if(term == null)
        break Fail76315;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}