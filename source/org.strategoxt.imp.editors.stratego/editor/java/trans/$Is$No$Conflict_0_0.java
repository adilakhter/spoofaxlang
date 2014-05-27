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

@SuppressWarnings("all") public class $Is$No$Conflict_0_0 extends Strategy 
{ 
  public static $Is$No$Conflict_0_0 instance = new $Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsNoConflict_0_0");
    Fail23788:
    { 
      TermReference w_4897 = new TermReference();
      TermReference x_4897 = new TermReference();
      IStrategoTerm b_4898 = null;
      if(x_4897.value == null)
        x_4897.value = term;
      else
        if(x_4897.value != term && !x_4897.value.match(term))
          break Fail23788;
      if(w_4897.value == null)
        w_4897.value = term;
      else
        if(w_4897.value != term && !w_4897.value.match(term))
          break Fail23788;
      b_4898 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, b_4898, trans.const4637, x_4897.value);
      if(term == null)
        break Fail23788;
      lifted7111 lifted71110 = new lifted7111();
      lifted71110.w_4897 = w_4897;
      lifted71110.x_4897 = x_4897;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted71110);
      if(term == null)
        break Fail23788;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}