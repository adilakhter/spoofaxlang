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

@SuppressWarnings("all") final class lifted6894 extends Strategy 
{ 
  TermReference x_4795;

  TermReference y_4795;

  TermReference z_4795;

  TermReference a_4796;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24015:
    { 
      if(x_4795.value == null)
        break Fail24015;
      term = declare_bodies_top_0_0.instance.invoke(context, x_4795.value);
      if(term == null)
        break Fail24015;
      if(y_4795.value == null)
        y_4795.value = term;
      else
        if(y_4795.value != term && !y_4795.value.match(term))
          break Fail24015;
      if(z_4795.value == null)
        break Fail24015;
      term = declare_bodies_top_0_0.instance.invoke(context, z_4795.value);
      if(term == null)
        break Fail24015;
      if(a_4796.value == null)
        a_4796.value = term;
      else
        if(a_4796.value != term && !a_4796.value.match(term))
          break Fail24015;
      if(true)
        return term;
    }
    return null;
  }
}