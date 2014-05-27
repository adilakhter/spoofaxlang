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

@SuppressWarnings("all") final class lifted7104 extends Strategy 
{ 
  public static final lifted7104 instance = new lifted7104();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23797:
    { 
      IStrategoTerm n_4895 = null;
      IStrategoTerm w_4895 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23797;
      w_4895 = term.getSubterm(0);
      IStrategoTerm arg8459 = term.getSubterm(1);
      n_4895 = arg8459;
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, w_4895, arg8459, n_4895);
      if(term == null)
        break Fail23797;
      if(true)
        return term;
    }
    return null;
  }
}