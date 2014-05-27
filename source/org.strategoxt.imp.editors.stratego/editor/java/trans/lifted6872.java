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

@SuppressWarnings("all") final class lifted6872 extends Strategy 
{ 
  TermReference s_4789;

  TermReference p_4789;

  TermReference q_4789;

  TermReference r_4789;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24032:
    { 
      IStrategoTerm h_4791 = null;
      h_4791 = term;
      if(s_4789.value == null)
        break Fail24032;
      term = inc_0_0.instance.invoke(context, s_4789.value);
      if(term == null)
        break Fail24032;
      term = declare_dr_rule_0_4.instance.invoke(context, h_4791, p_4789.value, q_4789.value, r_4789.value, term);
      if(term == null)
        break Fail24032;
      if(true)
        return term;
    }
    return null;
  }
}