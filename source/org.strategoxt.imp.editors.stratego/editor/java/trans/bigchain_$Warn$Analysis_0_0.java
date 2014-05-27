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

@SuppressWarnings("all") public class bigchain_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static bigchain_$Warn$Analysis_0_0 instance = new bigchain_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_WarnAnalysis_0_0");
    Fail22042:
    { 
      IStrategoTerm r_4298 = null;
      IStrategoTerm t_4298 = null;
      t_4298 = term;
      Success11901:
      { 
        Fail22043:
        { 
          IStrategoTerm u_4298 = null;
          IStrategoTerm w_4298 = null;
          IStrategoTerm x_4298 = null;
          w_4298 = term;
          u_4298 = trans.const4352;
          x_4298 = w_4298;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4298, u_4298, trans.constCons1966);
          if(term == null)
            break Fail22043;
          if(true)
            break Success11901;
        }
        term = trans.constNil3;
      }
      r_4298 = term;
      term = t_4298;
      term = termFactory.makeTuple(r_4298, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6743.instance);
      if(term == null)
        break Fail22042;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}