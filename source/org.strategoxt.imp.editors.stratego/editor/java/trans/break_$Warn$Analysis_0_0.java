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

@SuppressWarnings("all") public class break_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static break_$Warn$Analysis_0_0 instance = new break_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_WarnAnalysis_0_0");
    Fail22036:
    { 
      IStrategoTerm i_4297 = null;
      i_4297 = term;
      term = dr_break_0_1.instance.invoke(context, i_4297, trans.const4352);
      if(term == null)
        break Fail22036;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}