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

@SuppressWarnings("all") final class lifted6759 extends Strategy 
{ 
  public static final lifted6759 instance = new lifted6759();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22395:
    { 
      IStrategoTerm k_4307 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22395;
      k_4307 = term.getSubterm(0);
      IStrategoTerm arg7923 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, k_4307, arg7923);
      if(term == null)
        break Fail22395;
      if(true)
        return term;
    }
    return null;
  }
}