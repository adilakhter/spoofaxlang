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

@SuppressWarnings("all") public class chain_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static chain_$Warn$Analysis_0_0 instance = new chain_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_WarnAnalysis_0_0");
    Fail22044:
    { 
      IStrategoTerm e_4299 = null;
      IStrategoTerm g_4299 = null;
      g_4299 = term;
      Success11902:
      { 
        Fail22045:
        { 
          IStrategoTerm h_4299 = null;
          IStrategoTerm j_4299 = null;
          IStrategoTerm k_4299 = null;
          j_4299 = term;
          h_4299 = trans.const4352;
          k_4299 = j_4299;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4299, h_4299, trans.constCons1966);
          if(term == null)
            break Fail22045;
          if(true)
            break Success11902;
        }
        term = trans.constNil3;
      }
      e_4299 = term;
      term = g_4299;
      term = termFactory.makeTuple(e_4299, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6744.instance);
      if(term == null)
        break Fail22044;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}