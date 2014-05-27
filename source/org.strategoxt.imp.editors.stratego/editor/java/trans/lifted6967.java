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

@SuppressWarnings("all") final class lifted6967 extends Strategy 
{ 
  public static final lifted6967 instance = new lifted6967();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23934:
    { 
      IStrategoTerm j_4830 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23934;
      j_4830 = term.getSubterm(0);
      IStrategoTerm arg8357 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, j_4830, arg8357);
      if(term == null)
        break Fail23934;
      if(true)
        return term;
    }
    return null;
  }
}