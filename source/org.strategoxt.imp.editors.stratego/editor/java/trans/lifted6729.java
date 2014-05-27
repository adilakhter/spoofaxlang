package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6729 extends Strategy 
{ 
  TermReference a_4726;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24211:
    { 
      if(a_4726.value == null)
        a_4726.value = term;
      else
        if(a_4726.value != term && !a_4726.value.match(term))
          break Fail24211;
      if(true)
        return term;
    }
    return null;
  }
}