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

@SuppressWarnings("all") final class lifted21649 extends Strategy 
{ 
  TermReference i_92106;

  TermReference j_92106;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76330:
    { 
      term = aux_$Declaration_0_2.instance.invoke(context, term, i_92106.value, j_92106.value);
      if(term == null)
        break Fail76330;
      if(true)
        return term;
    }
    return null;
  }
}