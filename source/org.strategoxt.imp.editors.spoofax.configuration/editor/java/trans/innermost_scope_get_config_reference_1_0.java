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

@SuppressWarnings("all") public class innermost_scope_get_config_reference_1_0 extends Strategy 
{ 
  public static innermost_scope_get_config_reference_1_0 instance = new innermost_scope_get_config_reference_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4632)
  { 
    context.push("innermost_scope_get_config_reference_1_0");
    Fail22947:
    { 
      IStrategoTerm y_4632 = null;
      y_4632 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, y_4632, w_4632, trans.const4482);
      if(term == null)
        break Fail22947;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}