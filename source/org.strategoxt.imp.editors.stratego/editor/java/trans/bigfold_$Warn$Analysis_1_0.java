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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4851)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_WarnAnalysis_1_0");
    Fail23514:
    { 
      IStrategoTerm i_4851 = null;
      IStrategoTerm k_4851 = null;
      k_4851 = term;
      Success12608:
      { 
        Fail23515:
        { 
          IStrategoTerm l_4851 = null;
          IStrategoTerm n_4851 = null;
          IStrategoTerm o_4851 = null;
          n_4851 = term;
          l_4851 = trans.const4562;
          o_4851 = n_4851;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4851, l_4851, trans.constCons2047);
          if(term == null)
            break Fail23515;
          if(true)
            break Success12608;
        }
        term = trans.constNil4;
      }
      i_4851 = term;
      term = k_4851;
      term = termFactory.makeTuple(i_4851, term);
      term = h_4851.invoke(context, term, lifted7012.instance);
      if(term == null)
        break Fail23514;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}