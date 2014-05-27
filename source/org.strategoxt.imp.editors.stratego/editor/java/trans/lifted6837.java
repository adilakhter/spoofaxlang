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

@SuppressWarnings("all") final class lifted6837 extends Strategy 
{ 
  TermReference i_4343;

  TermReference j_4343;

  TermReference k_4343;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22317:
    { 
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, term, i_4343.value, j_4343.value);
      if(term == null)
        break Fail22317;
      if(k_4343.value == null)
        k_4343.value = term;
      else
        if(k_4343.value != term && !k_4343.value.match(term))
          break Fail22317;
      if(true)
        return term;
    }
    return null;
  }
}