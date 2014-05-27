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

@SuppressWarnings("all") final class lifted21628 extends Strategy 
{ 
  TermReference z_92096;

  TermReference a_92097;

  TermReference b_92097;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76351:
    { 
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, term, z_92096.value, a_92097.value);
      if(term == null)
        break Fail76351;
      if(b_92097.value == null)
        b_92097.value = term;
      else
        if(b_92097.value != term && !b_92097.value.match(term))
          break Fail76351;
      if(true)
        return term;
    }
    return null;
  }
}