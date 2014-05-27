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

@SuppressWarnings("all") final class lifted21606 extends Strategy 
{ 
  public static final lifted21606 instance = new lifted21606();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76373:
    { 
      IStrategoTerm x_92086 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76373;
      x_92086 = term.getSubterm(0);
      IStrategoTerm arg26203 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, x_92086, arg26203);
      if(term == null)
        break Fail76373;
      if(true)
        return term;
    }
    return null;
  }
}