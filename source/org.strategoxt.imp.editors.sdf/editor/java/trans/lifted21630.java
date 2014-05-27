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

@SuppressWarnings("all") final class lifted21630 extends Strategy 
{ 
  TermReference t_92097;

  TermReference u_92097;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76349:
    { 
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, term, t_92097.value, u_92097.value);
      if(term == null)
        break Fail76349;
      if(true)
        return term;
    }
    return null;
  }
}