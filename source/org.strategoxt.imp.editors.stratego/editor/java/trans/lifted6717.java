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

@SuppressWarnings("all") final class lifted6717 extends Strategy 
{ 
  public static final lifted6717 instance = new lifted6717();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22437:
    { 
      IStrategoTerm f_4286 = null;
      IStrategoTerm n_4286 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22437;
      n_4286 = term.getSubterm(0);
      IStrategoTerm arg7903 = term.getSubterm(1);
      f_4286 = arg7903;
      term = aux_$Is$Imported_0_2.instance.invoke(context, n_4286, arg7903, f_4286);
      if(term == null)
        break Fail22437;
      if(true)
        return term;
    }
    return null;
  }
}