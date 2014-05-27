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

@SuppressWarnings("all") public class bigbagof_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static bigbagof_$Warn$Analysis_0_0 instance = new bigbagof_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_WarnAnalysis_0_0");
    Fail23522:
    { 
      TermReference f_4853 = new TermReference();
      TermReference g_4853 = new TermReference();
      if(g_4853.value == null)
        g_4853.value = term;
      else
        if(g_4853.value != term && !g_4853.value.match(term))
          break Fail23522;
      if(f_4853.value == null)
        f_4853.value = term;
      else
        if(f_4853.value != term && !f_4853.value.match(term))
          break Fail23522;
      Success12612:
      { 
        Fail23523:
        { 
          IStrategoTerm j_4853 = null;
          IStrategoTerm l_4853 = null;
          IStrategoTerm m_4853 = null;
          l_4853 = term;
          j_4853 = trans.const4562;
          m_4853 = l_4853;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4853, j_4853, trans.constCons2047);
          if(term == null)
            break Fail23523;
          if(true)
            break Success12612;
        }
        term = trans.constNil4;
      }
      lifted7016 lifted70160 = new lifted7016();
      lifted70160.f_4853 = f_4853;
      lifted70160.g_4853 = g_4853;
      term = filter_1_0.instance.invoke(context, term, lifted70160);
      if(term == null)
        break Fail23522;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}