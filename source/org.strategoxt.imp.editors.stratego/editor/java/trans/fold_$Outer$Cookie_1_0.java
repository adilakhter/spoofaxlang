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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4887)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_OuterCookie_1_0");
    Fail23723:
    { 
      IStrategoTerm c_4887 = null;
      IStrategoTerm g_4887 = null;
      IStrategoTerm i_4887 = null;
      c_4887 = term;
      i_4887 = term;
      Success12682:
      { 
        Fail23724:
        { 
          IStrategoTerm k_4887 = null;
          k_4887 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4887, trans.const4604, c_4887);
          if(term == null)
            break Fail23724;
          if(true)
            break Success12682;
        }
        term = trans.constNil4;
      }
      g_4887 = term;
      term = i_4887;
      term = termFactory.makeTuple(g_4887, term);
      term = f_4887.invoke(context, term, lifted7086.instance);
      if(term == null)
        break Fail23723;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}