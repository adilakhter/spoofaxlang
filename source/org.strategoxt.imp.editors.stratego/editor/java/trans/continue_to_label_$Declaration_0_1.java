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

@SuppressWarnings("all") public class continue_to_label_$Declaration_0_1 extends Strategy 
{ 
  public static continue_to_label_$Declaration_0_1 instance = new continue_to_label_$Declaration_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4310)
  { 
    context.push("continue_to_label_Declaration_0_1");
    Fail22110:
    { 
      IStrategoTerm u_4310 = null;
      u_4310 = term;
      term = dr_continue_0_2.instance.invoke(context, u_4310, trans.const4360, s_4310);
      if(term == null)
        break Fail22110;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}