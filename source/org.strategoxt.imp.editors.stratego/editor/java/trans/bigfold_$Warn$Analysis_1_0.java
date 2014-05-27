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

@SuppressWarnings("all") public class bigfold_$Warn$Analysis_1_0 extends Strategy 
{ 
  public static bigfold_$Warn$Analysis_1_0 instance = new bigfold_$Warn$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4297)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_WarnAnalysis_1_0");
    Fail22038:
    { 
      IStrategoTerm q_4297 = null;
      IStrategoTerm s_4297 = null;
      s_4297 = term;
      Success11899:
      { 
        Fail22039:
        { 
          IStrategoTerm t_4297 = null;
          IStrategoTerm v_4297 = null;
          IStrategoTerm w_4297 = null;
          v_4297 = term;
          t_4297 = trans.const4352;
          w_4297 = v_4297;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4297, t_4297, trans.constCons1966);
          if(term == null)
            break Fail22039;
          if(true)
            break Success11899;
        }
        term = trans.constNil3;
      }
      q_4297 = term;
      term = s_4297;
      term = termFactory.makeTuple(q_4297, term);
      term = p_4297.invoke(context, term, lifted6741.instance);
      if(term == null)
        break Fail22038;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}