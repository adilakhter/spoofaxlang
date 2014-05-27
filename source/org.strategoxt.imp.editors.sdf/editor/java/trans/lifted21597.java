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

@SuppressWarnings("all") final class lifted21597 extends Strategy 
{ 
  public static final lifted21597 instance = new lifted21597();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76382:
    { 
      IStrategoTerm l_92082 = null;
      IStrategoTerm u_92082 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76382;
      u_92082 = term.getSubterm(0);
      IStrategoTerm arg26198 = term.getSubterm(1);
      l_92082 = arg26198;
      term = aux_$Is$Imported_0_2.instance.invoke(context, u_92082, arg26198, l_92082);
      if(term == null)
        break Fail76382;
      if(true)
        return term;
    }
    return null;
  }
}