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

@SuppressWarnings("all") public class throw_$Warn$Analysis_1_1 extends Strategy 
{ 
  public static throw_$Warn$Analysis_1_1 instance = new throw_$Warn$Analysis_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4850, IStrategoTerm l_4850)
  { 
    context.push("throw_WarnAnalysis_1_1");
    Fail23507:
    { 
      IStrategoTerm o_4850 = null;
      o_4850 = term;
      term = dr_throw_1_2.instance.invoke(context, o_4850, m_4850, l_4850, trans.const4562);
      if(term == null)
        break Fail23507;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}