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

@SuppressWarnings("all") public class fold_$Outer$Cookie_1_0 extends Strategy 
{ 
  public static fold_$Outer$Cookie_1_0 instance = new fold_$Outer$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_OuterCookie_1_0");
    Fail22247:
    { 
      IStrategoTerm k_4333 = null;
      IStrategoTerm o_4333 = null;
      IStrategoTerm q_4333 = null;
      k_4333 = term;
      q_4333 = term;
      Success11973:
      { 
        Fail22248:
        { 
          IStrategoTerm s_4333 = null;
          s_4333 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_4333, trans.const4394, k_4333);
          if(term == null)
            break Fail22248;
          if(true)
            break Success11973;
        }
        term = trans.constNil3;
      }
      o_4333 = term;
      term = q_4333;
      term = termFactory.makeTuple(o_4333, term);
      term = n_4333.invoke(context, term, lifted6815.instance);
      if(term == null)
        break Fail22247;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}