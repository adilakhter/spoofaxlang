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

@SuppressWarnings("all") public class innermost_scope_$Current$Dir_1_0 extends Strategy 
{ 
  public static innermost_scope_$Current$Dir_1_0 instance = new innermost_scope_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4859)
  { 
    context.push("innermost_scope_CurrentDir_1_0");
    Fail23557:
    { 
      IStrategoTerm x_4859 = null;
      x_4859 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, x_4859, v_4859, trans.const4556);
      if(term == null)
        break Fail23557;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}