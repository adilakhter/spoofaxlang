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

@SuppressWarnings("all") public class break_bp_get_config_reference_0_0 extends Strategy 
{ 
  public static break_bp_get_config_reference_0_0 instance = new break_bp_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_bp_get_config_reference_0_0");
    Fail87763:
    { 
      IStrategoTerm n_17577 = null;
      n_17577 = term;
      term = dr_break_bp_0_1.instance.invoke(context, n_17577, trans.const17869);
      if(term == null)
        break Fail87763;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}