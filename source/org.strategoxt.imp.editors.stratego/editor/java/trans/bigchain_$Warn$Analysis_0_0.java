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
    Fail23518:
    { 
      IStrategoTerm j_4852 = null;
      IStrategoTerm l_4852 = null;
      l_4852 = term;
      Success12610:
      { 
        Fail23519:
        { 
          IStrategoTerm m_4852 = null;
          IStrategoTerm o_4852 = null;
          IStrategoTerm p_4852 = null;
          o_4852 = term;
          m_4852 = trans.const4562;
          p_4852 = o_4852;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4852, m_4852, trans.constCons2047);
          if(term == null)
            break Fail23519;
          if(true)
            break Success12610;
        }
        term = trans.constNil4;
      }
      j_4852 = term;
      term = l_4852;
      term = termFactory.makeTuple(j_4852, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7014.instance);
      if(term == null)
        break Fail23518;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}