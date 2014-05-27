package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21623 extends Strategy 
{ 
  public static final lifted21623 instance = new lifted21623();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76356:
    { 
      IStrategoTerm q_92094 = null;
      IStrategoTerm b_92095 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76356;
      b_92095 = term.getSubterm(0);
      IStrategoTerm arg26212 = term.getSubterm(1);
      q_92094 = arg26212;
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, b_92095, arg26212, q_92094);
      if(term == null)
        break Fail76356;
      if(true)
        return term;
    }
    return null;
  }
}