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

@SuppressWarnings("all") final class lifted6823 extends Strategy 
{ 
  TermReference b_4760;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24083:
    { 
      if(b_4760.value == null)
        b_4760.value = term;
      else
        if(b_4760.value != term && !b_4760.value.match(term))
          break Fail24083;
      if(true)
        return term;
    }
    return null;
  }
}