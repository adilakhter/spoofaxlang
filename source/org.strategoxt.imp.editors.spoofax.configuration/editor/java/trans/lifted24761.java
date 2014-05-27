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

@SuppressWarnings("all") final class lifted24761 extends Strategy 
{ 
  TermReference l_17572;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87864:
    { 
      if(l_17572.value == null)
        l_17572.value = term;
      else
        if(l_17572.value != term && !l_17572.value.match(term))
          break Fail87864;
      if(true)
        return term;
    }
    return null;
  }
}