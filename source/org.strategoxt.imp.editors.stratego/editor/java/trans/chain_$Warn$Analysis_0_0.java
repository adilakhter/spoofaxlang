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
    Fail23520:
    { 
      IStrategoTerm w_4852 = null;
      IStrategoTerm y_4852 = null;
      y_4852 = term;
      Success12611:
      { 
        Fail23521:
        { 
          IStrategoTerm z_4852 = null;
          IStrategoTerm b_4853 = null;
          IStrategoTerm c_4853 = null;
          b_4853 = term;
          z_4852 = trans.const4562;
          c_4853 = b_4853;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4853, z_4852, trans.constCons2047);
          if(term == null)
            break Fail23521;
          if(true)
            break Success12611;
        }
        term = trans.constNil4;
      }
      w_4852 = term;
      term = y_4852;
      term = termFactory.makeTuple(w_4852, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7015.instance);
      if(term == null)
        break Fail23520;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}