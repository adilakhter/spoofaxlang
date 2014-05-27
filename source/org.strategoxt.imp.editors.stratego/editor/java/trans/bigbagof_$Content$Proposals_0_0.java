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

@SuppressWarnings("all") public class bigbagof_$Content$Proposals_0_0 extends Strategy 
{ 
  public static bigbagof_$Content$Proposals_0_0 instance = new bigbagof_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ContentProposals_0_0");
    Fail23755:
    { 
      TermReference m_4892 = new TermReference();
      if(m_4892.value == null)
        m_4892.value = term;
      else
        if(m_4892.value != term && !m_4892.value.match(term))
          break Fail23755;
      Success12692:
      { 
        Fail23756:
        { 
          IStrategoTerm p_4892 = null;
          IStrategoTerm r_4892 = null;
          IStrategoTerm s_4892 = null;
          r_4892 = term;
          p_4892 = trans.const4611;
          s_4892 = r_4892;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, s_4892, p_4892, trans.constCons2047);
          if(term == null)
            break Fail23756;
          if(true)
            break Success12692;
        }
        term = trans.constNil4;
      }
      lifted7098 lifted70980 = new lifted7098();
      lifted70980.m_4892 = m_4892;
      term = filter_1_0.instance.invoke(context, term, lifted70980);
      if(term == null)
        break Fail23755;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}