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

@SuppressWarnings("all") final class lifted7026 extends Strategy 
{ 
  TermReference i_4858;

  TermReference j_4858;

  TermReference k_4858;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23875:
    { 
      term = aux_$No$Analysis_0_2.instance.invoke(context, term, i_4858.value, j_4858.value);
      if(term == null)
        break Fail23875;
      if(k_4858.value == null)
        k_4858.value = term;
      else
        if(k_4858.value != term && !k_4858.value.match(term))
          break Fail23875;
      if(true)
        return term;
    }
    return null;
  }
}