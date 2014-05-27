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

@SuppressWarnings("all") final class lifted6990 extends Strategy 
{ 
  TermReference n_4840;

  TermReference o_4840;

  TermReference p_4840;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23911:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, n_4840.value, o_4840.value);
      if(term == null)
        break Fail23911;
      if(p_4840.value == null)
        p_4840.value = term;
      else
        if(p_4840.value != term && !p_4840.value.match(term))
          break Fail23911;
      if(true)
        return term;
    }
    return null;
  }
}