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

@SuppressWarnings("all") public class break_to_label_$Content$Proposals_0_1 extends Strategy 
{ 
  public static break_to_label_$Content$Proposals_0_1 instance = new break_to_label_$Content$Proposals_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4336)
  { 
    context.push("break_to_label_ContentProposals_0_1");
    Fail22268:
    { 
      IStrategoTerm v_4336 = null;
      v_4336 = term;
      term = dr_break_0_2.instance.invoke(context, v_4336, trans.const4401, t_4336);
      if(term == null)
        break Fail22268;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}