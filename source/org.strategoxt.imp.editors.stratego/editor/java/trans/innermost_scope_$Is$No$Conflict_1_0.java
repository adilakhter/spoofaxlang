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

@SuppressWarnings("all") public class innermost_scope_$Is$No$Conflict_1_0 extends Strategy 
{ 
  public static innermost_scope_$Is$No$Conflict_1_0 instance = new innermost_scope_$Is$No$Conflict_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4340)
  { 
    context.push("innermost_scope_IsNoConflict_1_0");
    Fail22288:
    { 
      IStrategoTerm n_4340 = null;
      n_4340 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, n_4340, l_4340, trans.const4427);
      if(term == null)
        break Fail22288;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}