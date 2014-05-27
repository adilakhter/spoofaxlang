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

@SuppressWarnings("all") final class lifted7094 extends Strategy 
{ 
  public static final lifted7094 instance = new lifted7094();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23807:
    { 
      IStrategoTerm d_4891 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23807;
      d_4891 = term.getSubterm(0);
      IStrategoTerm arg8453 = term.getSubterm(1);
      term = aux_$Content$Proposals_0_1.instance.invoke(context, d_4891, arg8453);
      if(term == null)
        break Fail23807;
      if(true)
        return term;
    }
    return null;
  }
}