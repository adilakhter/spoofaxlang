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

@SuppressWarnings("all") public class innermost_scope_$Outer$Cookie_1_0 extends Strategy 
{ 
  public static innermost_scope_$Outer$Cookie_1_0 instance = new innermost_scope_$Outer$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4885)
  { 
    context.push("innermost_scope_OuterCookie_1_0");
    Fail23712:
    { 
      IStrategoTerm v_4885 = null;
      v_4885 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, v_4885, t_4885, trans.const4604);
      if(term == null)
        break Fail23712;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}