package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24793 extends Strategy 
{ 
  TermReference y_17588;

  TermReference z_17588;

  TermReference a_17589;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87839:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, y_17588.value, z_17588.value);
      if(term == null)
        break Fail87839;
      if(a_17589.value == null)
        a_17589.value = term;
      else
        if(a_17589.value != term && !a_17589.value.match(term))
          break Fail87839;
      if(true)
        return term;
    }
    return null;
  }
}