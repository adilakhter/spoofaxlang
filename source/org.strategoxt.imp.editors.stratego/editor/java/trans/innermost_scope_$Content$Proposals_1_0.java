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

@SuppressWarnings("all") public class innermost_scope_$Content$Proposals_1_0 extends Strategy 
{ 
  public static innermost_scope_$Content$Proposals_1_0 instance = new innermost_scope_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4336)
  { 
    context.push("innermost_scope_ContentProposals_1_0");
    Fail22262:
    { 
      IStrategoTerm g_4336 = null;
      g_4336 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, g_4336, e_4336, trans.const4401);
      if(term == null)
        break Fail22262;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}