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

@SuppressWarnings("all") final class lifted21601 extends Strategy 
{ 
  TermReference y_92083;

  TermReference z_92083;

  TermReference a_92084;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76378:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, y_92083.value, z_92083.value);
      if(term == null)
        break Fail76378;
      if(a_92084.value == null)
        a_92084.value = term;
      else
        if(a_92084.value != term && !a_92084.value.match(term))
          break Fail76378;
      if(true)
        return term;
    }
    return null;
  }
}