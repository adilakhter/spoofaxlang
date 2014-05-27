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

@SuppressWarnings("all") final class lifted7042 extends Strategy 
{ 
  public static final lifted7042 instance = new lifted7042();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23859:
    { 
      IStrategoTerm j_4866 = null;
      IStrategoTerm r_4866 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23859;
      r_4866 = term.getSubterm(0);
      IStrategoTerm arg8398 = term.getSubterm(1);
      j_4866 = arg8398;
      term = aux_$Declaration_0_2.instance.invoke(context, r_4866, arg8398, j_4866);
      if(term == null)
        break Fail23859;
      if(true)
        return term;
    }
    return null;
  }
}