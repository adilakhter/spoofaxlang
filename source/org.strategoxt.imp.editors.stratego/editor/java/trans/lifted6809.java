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

@SuppressWarnings("all") final class lifted6809 extends Strategy 
{ 
  TermReference h_4330;

  TermReference i_4330;

  TermReference j_4330;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22345:
    { 
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, term, h_4330.value, i_4330.value);
      if(term == null)
        break Fail22345;
      if(j_4330.value == null)
        j_4330.value = term;
      else
        if(j_4330.value != term && !j_4330.value.match(term))
          break Fail22345;
      if(true)
        return term;
    }
    return null;
  }
}