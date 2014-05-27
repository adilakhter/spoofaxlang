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

@SuppressWarnings("all") final class lifted6879 extends Strategy 
{ 
  TermReference n_4801;

  TermReference o_4801;

  TermReference p_4801;

  TermReference q_4801;

  TermReference r_4801;

  TermReference s_4801;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24022:
    { 
      if(n_4801.value == null)
        break Fail24022;
      term = map_1_0.instance.invoke(context, n_4801.value, declare_svar_0_0.instance);
      if(term == null)
        break Fail24022;
      if(o_4801.value == null)
        o_4801.value = term;
      else
        if(o_4801.value != term && !o_4801.value.match(term))
          break Fail24022;
      if(p_4801.value == null)
        break Fail24022;
      term = map_1_0.instance.invoke(context, p_4801.value, declare_tvar_0_0.instance);
      if(term == null)
        break Fail24022;
      if(q_4801.value == null)
        q_4801.value = term;
      else
        if(q_4801.value != term && !q_4801.value.match(term))
          break Fail24022;
      if(r_4801.value == null)
        break Fail24022;
      term = alltd_1_0.instance.invoke(context, r_4801.value, lifted6882.instance);
      if(term == null)
        break Fail24022;
      if(s_4801.value == null)
        s_4801.value = term;
      else
        if(s_4801.value != term && !s_4801.value.match(term))
          break Fail24022;
      if(true)
        return term;
    }
    return null;
  }
}