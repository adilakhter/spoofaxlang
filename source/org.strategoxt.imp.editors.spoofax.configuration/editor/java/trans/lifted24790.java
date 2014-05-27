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

@SuppressWarnings("all") final class lifted24790 extends Strategy 
{ 
  public static final lifted24790 instance = new lifted24790();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87842:
    { 
      IStrategoTerm x_17587 = null;
      IStrategoTerm f_17588 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87842;
      f_17588 = term.getSubterm(0);
      IStrategoTerm arg30028 = term.getSubterm(1);
      x_17587 = arg30028;
      term = aux_$Is$Imported_0_2.instance.invoke(context, f_17588, arg30028, x_17587);
      if(term == null)
        break Fail87842;
      if(true)
        return term;
    }
    return null;
  }
}