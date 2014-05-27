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

@SuppressWarnings("all") public class bigchain_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static bigchain_$Outer$Cookie_0_0 instance = new bigchain_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_OuterCookie_0_0");
    Fail22249:
    { 
      IStrategoTerm w_4333 = null;
      IStrategoTerm z_4333 = null;
      IStrategoTerm b_4334 = null;
      w_4333 = term;
      b_4334 = term;
      Success11974:
      { 
        Fail22250:
        { 
          IStrategoTerm d_4334 = null;
          d_4334 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4334, trans.const4394, w_4333);
          if(term == null)
            break Fail22250;
          if(true)
            break Success11974;
        }
        term = trans.constNil3;
      }
      z_4333 = term;
      term = b_4334;
      term = termFactory.makeTuple(z_4333, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6816.instance);
      if(term == null)
        break Fail22249;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}