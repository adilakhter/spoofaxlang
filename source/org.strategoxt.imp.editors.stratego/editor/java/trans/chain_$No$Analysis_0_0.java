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

@SuppressWarnings("all") public class chain_$No$Analysis_0_0 extends Strategy 
{ 
  public static chain_$No$Analysis_0_0 instance = new chain_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_NoAnalysis_0_0");
    Fail23546:
    { 
      IStrategoTerm q_4857 = null;
      IStrategoTerm s_4857 = null;
      s_4857 = term;
      Success12618:
      { 
        Fail23547:
        { 
          IStrategoTerm t_4857 = null;
          IStrategoTerm v_4857 = null;
          IStrategoTerm w_4857 = null;
          v_4857 = term;
          t_4857 = trans.const4559;
          w_4857 = v_4857;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4857, t_4857, trans.constCons2047);
          if(term == null)
            break Fail23547;
          if(true)
            break Success12618;
        }
        term = trans.constNil4;
      }
      q_4857 = term;
      term = s_4857;
      term = termFactory.makeTuple(q_4857, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7024.instance);
      if(term == null)
        break Fail23546;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}