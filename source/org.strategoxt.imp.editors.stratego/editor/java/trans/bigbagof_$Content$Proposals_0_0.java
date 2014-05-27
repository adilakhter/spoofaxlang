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

@SuppressWarnings("all") public class bigbagof_$Content$Proposals_0_0 extends Strategy 
{ 
  public static bigbagof_$Content$Proposals_0_0 instance = new bigbagof_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ContentProposals_0_0");
    Fail22279:
    { 
      TermReference u_4338 = new TermReference();
      if(u_4338.value == null)
        u_4338.value = term;
      else
        if(u_4338.value != term && !u_4338.value.match(term))
          break Fail22279;
      Success11983:
      { 
        Fail22280:
        { 
          IStrategoTerm x_4338 = null;
          IStrategoTerm z_4338 = null;
          IStrategoTerm a_4339 = null;
          z_4338 = term;
          x_4338 = trans.const4401;
          a_4339 = z_4338;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4339, x_4338, trans.constCons1966);
          if(term == null)
            break Fail22280;
          if(true)
            break Success11983;
        }
        term = trans.constNil3;
      }
      lifted6827 lifted68270 = new lifted6827();
      lifted68270.u_4338 = u_4338;
      term = filter_1_0.instance.invoke(context, term, lifted68270);
      if(term == null)
        break Fail22279;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}