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

@SuppressWarnings("all") public class bagof_$Usage_0_0 extends Strategy 
{ 
  public static bagof_$Usage_0_0 instance = new bagof_$Usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Usage_0_0");
    Fail76317:
    { 
      TermReference j_92110 = new TermReference();
      TermReference k_92110 = new TermReference();
      if(k_92110.value == null)
        k_92110.value = term;
      else
        if(k_92110.value != term && !k_92110.value.match(term))
          break Fail76317;
      if(j_92110.value == null)
        j_92110.value = term;
      else
        if(j_92110.value != term && !j_92110.value.match(term))
          break Fail76317;
      Success41862:
      { 
        Fail76318:
        { 
          IStrategoTerm o_92110 = null;
          o_92110 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_92110, trans.const15535, k_92110.value);
          if(term == null)
            break Fail76318;
          if(true)
            break Success41862;
        }
        term = trans.constNil11;
      }
      lifted21657 lifted216570 = new lifted21657();
      lifted216570.j_92110 = j_92110;
      lifted216570.k_92110 = k_92110;
      term = filter_1_0.instance.invoke(context, term, lifted216570);
      if(term == null)
        break Fail76317;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}