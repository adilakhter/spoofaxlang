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

@SuppressWarnings("all") public class $Content$Proposals_0_0 extends Strategy 
{ 
  public static $Content$Proposals_0_0 instance = new $Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ContentProposals_0_0");
    Fail22286:
    { 
      TermReference b_4340 = new TermReference();
      IStrategoTerm e_4340 = null;
      IStrategoTerm g_4340 = null;
      IStrategoTerm h_4340 = null;
      if(b_4340.value == null)
        b_4340.value = term;
      else
        if(b_4340.value != term && !b_4340.value.match(term))
          break Fail22286;
      g_4340 = term;
      e_4340 = trans.const4401;
      h_4340 = g_4340;
      term = dr_lookup_rule_0_2.instance.invoke(context, h_4340, e_4340, trans.constCons1966);
      if(term == null)
        break Fail22286;
      lifted6831 lifted68310 = new lifted6831();
      lifted68310.b_4340 = b_4340;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68310);
      if(term == null)
        break Fail22286;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}