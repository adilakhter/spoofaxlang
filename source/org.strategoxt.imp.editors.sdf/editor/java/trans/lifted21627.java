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

@SuppressWarnings("all") final class lifted21627 extends Strategy 
{ 
  TermReference q_92096;

  TermReference r_92096;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76352:
    { 
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, term, q_92096.value, r_92096.value);
      if(term == null)
        break Fail76352;
      if(true)
        return term;
    }
    return null;
  }
}