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

@SuppressWarnings("all") public class $Outer$Cookie_0_0 extends Strategy 
{ 
  public static $Outer$Cookie_0_0 instance = new $Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("OuterCookie_0_0");
    Fail23736:
    { 
      TermReference m_4889 = new TermReference();
      TermReference n_4889 = new TermReference();
      IStrategoTerm r_4889 = null;
      if(n_4889.value == null)
        n_4889.value = term;
      else
        if(n_4889.value != term && !n_4889.value.match(term))
          break Fail23736;
      if(m_4889.value == null)
        m_4889.value = term;
      else
        if(m_4889.value != term && !m_4889.value.match(term))
          break Fail23736;
      r_4889 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, r_4889, trans.const4604, n_4889.value);
      if(term == null)
        break Fail23736;
      lifted7093 lifted70930 = new lifted7093();
      lifted70930.m_4889 = m_4889;
      lifted70930.n_4889 = n_4889;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70930);
      if(term == null)
        break Fail23736;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}