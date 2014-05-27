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

@SuppressWarnings("all") final class lifted7017 extends Strategy 
{ 
  TermReference o_4853;

  TermReference p_4853;

  TermReference q_4853;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23884:
    { 
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, term, o_4853.value, p_4853.value);
      if(term == null)
        break Fail23884;
      if(q_4853.value == null)
        q_4853.value = term;
      else
        if(q_4853.value != term && !q_4853.value.match(term))
          break Fail23884;
      if(true)
        return term;
    }
    return null;
  }
}