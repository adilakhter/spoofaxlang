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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4851)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_WarnAnalysis_1_0");
    Fail23516:
    { 
      IStrategoTerm w_4851 = null;
      IStrategoTerm y_4851 = null;
      y_4851 = term;
      Success12609:
      { 
        Fail23517:
        { 
          IStrategoTerm z_4851 = null;
          IStrategoTerm b_4852 = null;
          IStrategoTerm c_4852 = null;
          b_4852 = term;
          z_4851 = trans.const4562;
          c_4852 = b_4852;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4852, z_4851, trans.constCons2047);
          if(term == null)
            break Fail23517;
          if(true)
            break Success12609;
        }
        term = trans.constNil4;
      }
      w_4851 = term;
      term = y_4851;
      term = termFactory.makeTuple(w_4851, term);
      term = v_4851.invoke(context, term, lifted7013.instance);
      if(term == null)
        break Fail23516;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}