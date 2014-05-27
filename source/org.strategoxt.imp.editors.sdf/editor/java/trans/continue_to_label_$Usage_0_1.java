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

@SuppressWarnings("all") public class continue_to_label_$Usage_0_1 extends Strategy 
{ 
  public static continue_to_label_$Usage_0_1 instance = new continue_to_label_$Usage_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_92107)
  { 
    context.push("continue_to_label_Usage_0_1");
    Fail76298:
    { 
      IStrategoTerm g_92107 = null;
      g_92107 = term;
      term = dr_continue_0_2.instance.invoke(context, g_92107, trans.const15535, e_92107);
      if(term == null)
        break Fail76298;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}