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

@SuppressWarnings("all") final class lifted6819 extends Strategy 
{ 
  TermReference y_4334;

  TermReference z_4334;

  TermReference a_4335;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22335:
    { 
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, term, y_4334.value, z_4334.value);
      if(term == null)
        break Fail22335;
      if(a_4335.value == null)
        a_4335.value = term;
      else
        if(a_4335.value != term && !a_4335.value.match(term))
          break Fail22335;
      if(true)
        return term;
    }
    return null;
  }
}