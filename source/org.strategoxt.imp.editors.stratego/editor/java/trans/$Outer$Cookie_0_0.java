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

@SuppressWarnings("all") public class $Outer$Cookie_0_0 extends Strategy 
{ 
  public static $Outer$Cookie_0_0 instance = new $Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("OuterCookie_0_0");
    Fail22260:
    { 
      TermReference u_4335 = new TermReference();
      TermReference v_4335 = new TermReference();
      IStrategoTerm z_4335 = null;
      if(v_4335.value == null)
        v_4335.value = term;
      else
        if(v_4335.value != term && !v_4335.value.match(term))
          break Fail22260;
      if(u_4335.value == null)
        u_4335.value = term;
      else
        if(u_4335.value != term && !u_4335.value.match(term))
          break Fail22260;
      z_4335 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_4335, trans.const4394, v_4335.value);
      if(term == null)
        break Fail22260;
      lifted6822 lifted68220 = new lifted6822();
      lifted68220.u_4335 = u_4335;
      lifted68220.v_4335 = v_4335;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68220);
      if(term == null)
        break Fail22260;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}