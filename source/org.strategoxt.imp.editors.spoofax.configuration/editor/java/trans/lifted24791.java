package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24791 extends Strategy 
{ 
  public static final lifted24791 instance = new lifted24791();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87841:
    { 
      IStrategoTerm i_17588 = null;
      IStrategoTerm q_17588 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87841;
      q_17588 = term.getSubterm(0);
      IStrategoTerm arg30029 = term.getSubterm(1);
      i_17588 = arg30029;
      term = aux_$Is$Imported_0_2.instance.invoke(context, q_17588, arg30029, i_17588);
      if(term == null)
        break Fail87841;
      if(true)
        return term;
    }
    return null;
  }
}