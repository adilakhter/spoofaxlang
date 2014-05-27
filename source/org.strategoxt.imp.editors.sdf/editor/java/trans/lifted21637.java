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

@SuppressWarnings("all") final class lifted21637 extends Strategy 
{ 
  TermReference j_92101;

  TermReference k_92101;

  TermReference l_92101;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76342:
    { 
      term = aux_$Declaration$File_0_2.instance.invoke(context, term, j_92101.value, k_92101.value);
      if(term == null)
        break Fail76342;
      if(l_92101.value == null)
        l_92101.value = term;
      else
        if(l_92101.value != term && !l_92101.value.match(term))
          break Fail76342;
      if(true)
        return term;
    }
    return null;
  }
}