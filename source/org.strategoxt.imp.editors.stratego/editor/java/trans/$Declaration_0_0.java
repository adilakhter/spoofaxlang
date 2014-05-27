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

@SuppressWarnings("all") public class $Declaration_0_0 extends Strategy 
{ 
  public static $Declaration_0_0 instance = new $Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Declaration_0_0");
    Fail23607:
    { 
      TermReference v_4867 = new TermReference();
      TermReference w_4867 = new TermReference();
      IStrategoTerm a_4868 = null;
      if(w_4867.value == null)
        w_4867.value = term;
      else
        if(w_4867.value != term && !w_4867.value.match(term))
          break Fail23607;
      if(v_4867.value == null)
        v_4867.value = term;
      else
        if(v_4867.value != term && !v_4867.value.match(term))
          break Fail23607;
      a_4868 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, a_4868, trans.const4570, w_4867.value);
      if(term == null)
        break Fail23607;
      lifted7047 lifted70470 = new lifted7047();
      lifted70470.v_4867 = v_4867;
      lifted70470.w_4867 = w_4867;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70470);
      if(term == null)
        break Fail23607;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}