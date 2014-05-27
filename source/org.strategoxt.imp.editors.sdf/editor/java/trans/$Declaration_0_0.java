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

@SuppressWarnings("all") public class $Declaration_0_0 extends Strategy 
{ 
  public static $Declaration_0_0 instance = new $Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Declaration_0_0");
    Fail76292:
    { 
      TermReference i_92106 = new TermReference();
      TermReference j_92106 = new TermReference();
      IStrategoTerm n_92106 = null;
      if(j_92106.value == null)
        j_92106.value = term;
      else
        if(j_92106.value != term && !j_92106.value.match(term))
          break Fail76292;
      if(i_92106.value == null)
        i_92106.value = term;
      else
        if(i_92106.value != term && !i_92106.value.match(term))
          break Fail76292;
      n_92106 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, n_92106, trans.const15522, j_92106.value);
      if(term == null)
        break Fail76292;
      lifted21649 lifted216490 = new lifted21649();
      lifted216490.i_92106 = i_92106;
      lifted216490.j_92106 = j_92106;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216490);
      if(term == null)
        break Fail76292;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}