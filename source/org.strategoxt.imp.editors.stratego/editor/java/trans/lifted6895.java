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

@SuppressWarnings("all") final class lifted6895 extends Strategy 
{ 
  TermReference b_4796;

  TermReference c_4796;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24014:
    { 
      if(b_4796.value == null)
        break Fail24014;
      term = declare_bodies_top_0_0.instance.invoke(context, b_4796.value);
      if(term == null)
        break Fail24014;
      if(c_4796.value == null)
        c_4796.value = term;
      else
        if(c_4796.value != term && !c_4796.value.match(term))
          break Fail24014;
      if(true)
        return term;
    }
    return null;
  }
}