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

@SuppressWarnings("all") final class lifted21619 extends Strategy 
{ 
  TermReference j_92092;

  TermReference k_92092;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76360:
    { 
      term = aux_$Current$Dir_0_1.instance.invoke(context, term, j_92092.value);
      if(term == null)
        break Fail76360;
      if(k_92092.value == null)
        k_92092.value = term;
      else
        if(k_92092.value != term && !k_92092.value.match(term))
          break Fail76360;
      if(true)
        return term;
    }
    return null;
  }
}