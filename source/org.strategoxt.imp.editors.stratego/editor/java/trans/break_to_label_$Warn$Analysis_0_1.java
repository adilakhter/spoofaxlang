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

@SuppressWarnings("all") public class break_to_label_$Warn$Analysis_0_1 extends Strategy 
{ 
  public static break_to_label_$Warn$Analysis_0_1 instance = new break_to_label_$Warn$Analysis_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4297)
  { 
    context.push("break_to_label_WarnAnalysis_0_1");
    Fail22035:
    { 
      IStrategoTerm g_4297 = null;
      g_4297 = term;
      term = dr_break_0_2.instance.invoke(context, g_4297, trans.const4352, e_4297);
      if(term == null)
        break Fail22035;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}