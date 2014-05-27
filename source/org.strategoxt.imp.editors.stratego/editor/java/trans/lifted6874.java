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

@SuppressWarnings("all") final class lifted6874 extends Strategy 
{ 
  TermReference p_4789;

  TermReference q_4789;

  TermReference r_4789;

  TermReference s_4789;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24033:
    { 
      term = declare_dr_rule_0_4.instance.invoke(context, term, p_4789.value, q_4789.value, r_4789.value, s_4789.value);
      if(term == null)
        break Fail24033;
      if(true)
        return term;
    }
    return null;
  }
}