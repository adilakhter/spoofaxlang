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

@SuppressWarnings("all") final class lifted21629 extends Strategy 
{ 
  TermReference k_92097;

  TermReference l_92097;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76350:
    { 
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, term, k_92097.value, l_92097.value);
      if(term == null)
        break Fail76350;
      if(true)
        return term;
    }
    return null;
  }
}