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

@SuppressWarnings("all") public class bigfold_$Content$Proposals_1_0 extends Strategy 
{ 
  public static bigfold_$Content$Proposals_1_0 instance = new bigfold_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ContentProposals_1_0");
    Fail22271:
    { 
      IStrategoTerm d_4337 = null;
      IStrategoTerm f_4337 = null;
      f_4337 = term;
      Success11979:
      { 
        Fail22272:
        { 
          IStrategoTerm g_4337 = null;
          IStrategoTerm i_4337 = null;
          IStrategoTerm j_4337 = null;
          i_4337 = term;
          g_4337 = trans.const4401;
          j_4337 = i_4337;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4337, g_4337, trans.constCons1966);
          if(term == null)
            break Fail22272;
          if(true)
            break Success11979;
        }
        term = trans.constNil3;
      }
      d_4337 = term;
      term = f_4337;
      term = termFactory.makeTuple(d_4337, term);
      term = c_4337.invoke(context, term, lifted6823.instance);
      if(term == null)
        break Fail22271;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}