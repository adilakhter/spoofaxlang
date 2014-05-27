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

@SuppressWarnings("all") final class lifted6741 extends Strategy 
{ 
  public static final lifted6741 instance = new lifted6741();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22413:
    { 
      IStrategoTerm n_4297 = null;
      IStrategoTerm y_4297 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22413;
      y_4297 = term.getSubterm(0);
      IStrategoTerm arg7915 = term.getSubterm(1);
      n_4297 = arg7915;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, y_4297, arg7915, n_4297);
      if(term == null)
        break Fail22413;
      if(true)
        return term;
    }
    return null;
  }
}