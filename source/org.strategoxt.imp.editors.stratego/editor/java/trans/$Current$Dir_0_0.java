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

@SuppressWarnings("all") public class $Current$Dir_0_0 extends Strategy 
{ 
  public static $Current$Dir_0_0 instance = new $Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentDir_0_0");
    Fail23581:
    { 
      TermReference s_4863 = new TermReference();
      IStrategoTerm v_4863 = null;
      IStrategoTerm x_4863 = null;
      IStrategoTerm y_4863 = null;
      if(s_4863.value == null)
        s_4863.value = term;
      else
        if(s_4863.value != term && !s_4863.value.match(term))
          break Fail23581;
      x_4863 = term;
      v_4863 = trans.const4556;
      y_4863 = x_4863;
      term = dr_lookup_rule_0_2.instance.invoke(context, y_4863, v_4863, trans.constCons2047);
      if(term == null)
        break Fail23581;
      lifted7038 lifted70380 = new lifted7038();
      lifted70380.s_4863 = s_4863;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70380);
      if(term == null)
        break Fail23581;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}