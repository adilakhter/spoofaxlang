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

@SuppressWarnings("all") final class lifted6728 extends Strategy 
{ 
  TermReference z_4290;

  TermReference a_4291;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22426:
    { 
      term = aux_$Source$Dir_0_1.instance.invoke(context, term, z_4290.value);
      if(term == null)
        break Fail22426;
      if(a_4291.value == null)
        a_4291.value = term;
      else
        if(a_4291.value != term && !a_4291.value.match(term))
          break Fail22426;
      if(true)
        return term;
    }
    return null;
  }
}