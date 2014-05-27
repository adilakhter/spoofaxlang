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

@SuppressWarnings("all") public class $No$Analysis_0_0 extends Strategy 
{ 
  public static $No$Analysis_0_0 instance = new $No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("NoAnalysis_0_0");
    Fail22079:
    { 
      TermReference s_4305 = new TermReference();
      TermReference t_4305 = new TermReference();
      IStrategoTerm w_4305 = null;
      IStrategoTerm y_4305 = null;
      IStrategoTerm z_4305 = null;
      if(t_4305.value == null)
        t_4305.value = term;
      else
        if(t_4305.value != term && !t_4305.value.match(term))
          break Fail22079;
      if(s_4305.value == null)
        s_4305.value = term;
      else
        if(s_4305.value != term && !s_4305.value.match(term))
          break Fail22079;
      y_4305 = term;
      w_4305 = trans.const4349;
      z_4305 = y_4305;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_4305, w_4305, trans.constCons1966);
      if(term == null)
        break Fail22079;
      lifted6758 lifted67580 = new lifted6758();
      lifted67580.s_4305 = s_4305;
      lifted67580.t_4305 = t_4305;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67580);
      if(term == null)
        break Fail22079;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}