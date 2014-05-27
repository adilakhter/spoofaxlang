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

@SuppressWarnings("all") final class lifted6738 extends Strategy 
{ 
  TermReference y_4727;

  TermReference z_4727;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24205:
    { 
      if(y_4727.value == null)
        y_4727.value = term;
      else
        if(y_4727.value != term && !y_4727.value.match(term))
          break Fail24205;
      if(z_4727.value == null)
        break Fail24205;
      term = z_4727.value;
      if(true)
        return term;
    }
    return null;
  }
}