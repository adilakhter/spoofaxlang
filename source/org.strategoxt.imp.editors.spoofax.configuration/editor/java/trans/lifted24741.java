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

@SuppressWarnings("all") final class lifted24741 extends Strategy 
{ 
  TermReference y_17558;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87891:
    { 
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87891;
      if(y_17558.value == null)
        y_17558.value = term.getSubterm(0);
      else
        if(y_17558.value != term.getSubterm(0) && !y_17558.value.match(term.getSubterm(0)))
          break Fail87891;
      if(true)
        return term;
    }
    return null;
  }
}