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

@SuppressWarnings("all") public class fold_$Content$Proposals_1_0 extends Strategy 
{ 
  public static fold_$Content$Proposals_1_0 instance = new fold_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ContentProposals_1_0");
    Fail22273:
    { 
      IStrategoTerm p_4337 = null;
      IStrategoTerm r_4337 = null;
      r_4337 = term;
      Success11980:
      { 
        Fail22274:
        { 
          IStrategoTerm s_4337 = null;
          IStrategoTerm u_4337 = null;
          IStrategoTerm v_4337 = null;
          u_4337 = term;
          s_4337 = trans.const4401;
          v_4337 = u_4337;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_4337, s_4337, trans.constCons1966);
          if(term == null)
            break Fail22274;
          if(true)
            break Success11980;
        }
        term = trans.constNil3;
      }
      p_4337 = term;
      term = r_4337;
      term = termFactory.makeTuple(p_4337, term);
      term = o_4337.invoke(context, term, lifted6824.instance);
      if(term == null)
        break Fail22273;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}