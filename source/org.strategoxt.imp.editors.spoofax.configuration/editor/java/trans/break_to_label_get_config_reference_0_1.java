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

@SuppressWarnings("all") public class break_to_label_get_config_reference_0_1 extends Strategy 
{ 
  public static break_to_label_get_config_reference_0_1 instance = new break_to_label_get_config_reference_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_4633)
  { 
    context.push("break_to_label_get_config_reference_0_1");
    Fail22956:
    { 
      IStrategoTerm t_4633 = null;
      t_4633 = term;
      term = dr_break_0_2.instance.invoke(context, t_4633, trans.const4482, r_4633);
      if(term == null)
        break Fail22956;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}