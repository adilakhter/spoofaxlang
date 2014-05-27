package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigbagof_$Usage_0_0 extends Strategy 
{ 
  public static bigbagof_$Usage_0_0 instance = new bigbagof_$Usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Usage_0_0");
    Fail76312:
    { 
      TermReference m_92109 = new TermReference();
      TermReference n_92109 = new TermReference();
      if(n_92109.value == null)
        n_92109.value = term;
      else
        if(n_92109.value != term && !n_92109.value.match(term))
          break Fail76312;
      if(m_92109.value == null)
        m_92109.value = term;
      else
        if(m_92109.value != term && !m_92109.value.match(term))
          break Fail76312;
      Success41860:
      { 
        Fail76313:
        { 
          IStrategoTerm r_92109 = null;
          r_92109 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_92109, trans.const15535, n_92109.value);
          if(term == null)
            break Fail76313;
          if(true)
            break Success41860;
        }
        term = trans.constNil11;
      }
      lifted21654 lifted216540 = new lifted21654();
      lifted216540.m_92109 = m_92109;
      lifted216540.n_92109 = n_92109;
      term = filter_1_0.instance.invoke(context, term, lifted216540);
      if(term == null)
        break Fail76312;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}