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

@SuppressWarnings("all") final class lifted6746 extends Strategy 
{ 
  TermReference w_4299;

  TermReference x_4299;

  TermReference y_4299;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22408:
    { 
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, term, w_4299.value, x_4299.value);
      if(term == null)
        break Fail22408;
      if(y_4299.value == null)
        y_4299.value = term;
      else
        if(y_4299.value != term && !y_4299.value.match(term))
          break Fail22408;
      if(true)
        return term;
    }
    return null;
  }
}