package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_config_reference_0_0 extends Strategy 
{ 
  public static get_config_reference_0_0 instance = new get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_config_reference_0_0");
    Fail22974:
    { 
      TermReference l_4637 = new TermReference();
      TermReference m_4637 = new TermReference();
      IStrategoTerm p_4637 = null;
      IStrategoTerm r_4637 = null;
      IStrategoTerm s_4637 = null;
      if(m_4637.value == null)
        m_4637.value = term;
      else
        if(m_4637.value != term && !m_4637.value.match(term))
          break Fail22974;
      if(l_4637.value == null)
        l_4637.value = term;
      else
        if(l_4637.value != term && !l_4637.value.match(term))
          break Fail22974;
      r_4637 = term;
      p_4637 = trans.const4482;
      s_4637 = r_4637;
      term = dr_lookup_rule_0_2.instance.invoke(context, s_4637, p_4637, trans.constCons2047);
      if(term == null)
        break Fail22974;
      lifted6893 lifted68930 = new lifted6893();
      lifted68930.l_4637 = l_4637;
      lifted68930.m_4637 = m_4637;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68930);
      if(term == null)
        break Fail22974;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}