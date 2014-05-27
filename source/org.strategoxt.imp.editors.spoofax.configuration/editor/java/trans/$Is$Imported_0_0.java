package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Is$Imported_0_0 extends Strategy 
{ 
  public static $Is$Imported_0_0 instance = new $Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImported_0_0");
    Fail87834:
    { 
      TermReference u_17589 = new TermReference();
      TermReference v_17589 = new TermReference();
      IStrategoTerm z_17589 = null;
      if(v_17589.value == null)
        v_17589.value = term;
      else
        if(v_17589.value != term && !v_17589.value.match(term))
          break Fail87834;
      if(u_17589.value == null)
        u_17589.value = term;
      else
        if(u_17589.value != term && !u_17589.value.match(term))
          break Fail87834;
      z_17589 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_17589, trans.const17874, v_17589.value);
      if(term == null)
        break Fail87834;
      lifted24796 lifted247960 = new lifted24796();
      lifted247960.u_17589 = u_17589;
      lifted247960.v_17589 = v_17589;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted247960);
      if(term == null)
        break Fail87834;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}