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

@SuppressWarnings("all") final class lifted6701 extends Strategy 
{ 
  TermReference i_4278;

  TermReference j_4278;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22453:
    { 
      term = aux_$Project$Dir_0_1.instance.invoke(context, term, i_4278.value);
      if(term == null)
        break Fail22453;
      if(j_4278.value == null)
        j_4278.value = term;
      else
        if(j_4278.value != term && !j_4278.value.match(term))
          break Fail22453;
      if(true)
        return term;
    }
    return null;
  }
}