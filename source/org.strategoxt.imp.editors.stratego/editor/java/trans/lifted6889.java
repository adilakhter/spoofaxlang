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

@SuppressWarnings("all") final class lifted6889 extends Strategy 
{ 
  TermReference a_4800;

  TermReference b_4800;

  TermReference c_4800;

  TermReference d_4800;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24017:
    { 
      if(a_4800.value == null)
        break Fail24017;
      term = map_1_0.instance.invoke(context, a_4800.value, declare_tvar_0_0.instance);
      if(term == null)
        break Fail24017;
      if(b_4800.value == null)
        b_4800.value = term;
      else
        if(b_4800.value != term && !b_4800.value.match(term))
          break Fail24017;
      if(c_4800.value == null)
        break Fail24017;
      term = declare_bodies_top_0_0.instance.invoke(context, c_4800.value);
      if(term == null)
        break Fail24017;
      if(d_4800.value == null)
        d_4800.value = term;
      else
        if(d_4800.value != term && !d_4800.value.match(term))
          break Fail24017;
      if(true)
        return term;
    }
    return null;
  }
}