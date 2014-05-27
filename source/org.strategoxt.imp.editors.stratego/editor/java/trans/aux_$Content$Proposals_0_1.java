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

@SuppressWarnings("all") public class aux_$Content$Proposals_0_1 extends Strategy 
{ 
  public static aux_$Content$Proposals_0_1 instance = new aux_$Content$Proposals_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_4894)
  { 
    Fail23763:
    { 
      IStrategoTerm b_4894 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23763;
      IStrategoTerm arg8457 = term.getSubterm(0);
      if(arg8457.getTermType() != IStrategoTerm.STRING || !"-535431".equals(((IStrategoString)arg8457).stringValue()))
        break Fail23763;
      b_4894 = term.getSubterm(1);
      term = b_4894;
      if(true)
        return term;
    }
    context.push("aux_ContentProposals_0_1");
    context.popOnFailure();
    return null;
  }
}