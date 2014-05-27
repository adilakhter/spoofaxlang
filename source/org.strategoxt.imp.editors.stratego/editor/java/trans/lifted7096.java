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

@SuppressWarnings("all") final class lifted7096 extends Strategy 
{ 
  public static final lifted7096 instance = new lifted7096();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23805:
    { 
      IStrategoTerm a_4892 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23805;
      a_4892 = term.getSubterm(0);
      IStrategoTerm arg8455 = term.getSubterm(1);
      term = aux_$Content$Proposals_0_1.instance.invoke(context, a_4892, arg8455);
      if(term == null)
        break Fail23805;
      if(true)
        return term;
    }
    return null;
  }
}