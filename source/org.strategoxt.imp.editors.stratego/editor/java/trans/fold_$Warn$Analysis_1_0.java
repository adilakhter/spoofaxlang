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

@SuppressWarnings("all") public class fold_$Warn$Analysis_1_0 extends Strategy 
{ 
  public static fold_$Warn$Analysis_1_0 instance = new fold_$Warn$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4298)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_WarnAnalysis_1_0");
    Fail22040:
    { 
      IStrategoTerm e_4298 = null;
      IStrategoTerm g_4298 = null;
      g_4298 = term;
      Success11900:
      { 
        Fail22041:
        { 
          IStrategoTerm h_4298 = null;
          IStrategoTerm j_4298 = null;
          IStrategoTerm k_4298 = null;
          j_4298 = term;
          h_4298 = trans.const4352;
          k_4298 = j_4298;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4298, h_4298, trans.constCons1966);
          if(term == null)
            break Fail22041;
          if(true)
            break Success11900;
        }
        term = trans.constNil3;
      }
      e_4298 = term;
      term = g_4298;
      term = termFactory.makeTuple(e_4298, term);
      term = d_4298.invoke(context, term, lifted6742.instance);
      if(term == null)
        break Fail22040;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}