package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class innermost_scope_$Declaration_1_0 extends Strategy 
{ 
  public static innermost_scope_$Declaration_1_0 instance = new innermost_scope_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_92102)
  { 
    context.push("innermost_scope_Declaration_1_0");
    Fail76268:
    { 
      IStrategoTerm r_92102 = null;
      r_92102 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, r_92102, p_92102, trans.const15522);
      if(term == null)
        break Fail76268;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}