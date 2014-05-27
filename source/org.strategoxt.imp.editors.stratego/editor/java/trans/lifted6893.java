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

@SuppressWarnings("all") final class lifted6893 extends Strategy 
{ 
  TermReference u_4797;

  TermReference v_4797;

  TermReference w_4797;

  TermReference x_4797;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24016:
    { 
      if(u_4797.value == null)
        break Fail24016;
      term = declare_bodies_top_0_0.instance.invoke(context, u_4797.value);
      if(term == null)
        break Fail24016;
      if(v_4797.value == null)
        v_4797.value = term;
      else
        if(v_4797.value != term && !v_4797.value.match(term))
          break Fail24016;
      if(w_4797.value == null)
        break Fail24016;
      term = declare_bodies_top_0_0.instance.invoke(context, w_4797.value);
      if(term == null)
        break Fail24016;
      if(x_4797.value == null)
        x_4797.value = term;
      else
        if(x_4797.value != term && !x_4797.value.match(term))
          break Fail24016;
      if(true)
        return term;
    }
    return null;
  }
}