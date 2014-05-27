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

@SuppressWarnings("all") public class bigchain_$Content$Proposals_0_0 extends Strategy 
{ 
  public static bigchain_$Content$Proposals_0_0 instance = new bigchain_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ContentProposals_0_0");
    Fail22275:
    { 
      IStrategoTerm a_4338 = null;
      IStrategoTerm c_4338 = null;
      c_4338 = term;
      Success11981:
      { 
        Fail22276:
        { 
          IStrategoTerm d_4338 = null;
          IStrategoTerm f_4338 = null;
          IStrategoTerm g_4338 = null;
          f_4338 = term;
          d_4338 = trans.const4401;
          g_4338 = f_4338;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4338, d_4338, trans.constCons1966);
          if(term == null)
            break Fail22276;
          if(true)
            break Success11981;
        }
        term = trans.constNil3;
      }
      a_4338 = term;
      term = c_4338;
      term = termFactory.makeTuple(a_4338, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6825.instance);
      if(term == null)
        break Fail22275;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}