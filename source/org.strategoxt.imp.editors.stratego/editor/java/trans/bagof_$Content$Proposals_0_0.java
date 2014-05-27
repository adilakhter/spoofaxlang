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

@SuppressWarnings("all") public class bagof_$Content$Proposals_0_0 extends Strategy 
{ 
  public static bagof_$Content$Proposals_0_0 instance = new bagof_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ContentProposals_0_0");
    Fail23760:
    { 
      TermReference m_4893 = new TermReference();
      if(m_4893.value == null)
        m_4893.value = term;
      else
        if(m_4893.value != term && !m_4893.value.match(term))
          break Fail23760;
      Success12694:
      { 
        Fail23761:
        { 
          IStrategoTerm p_4893 = null;
          IStrategoTerm r_4893 = null;
          IStrategoTerm s_4893 = null;
          r_4893 = term;
          p_4893 = trans.const4611;
          s_4893 = r_4893;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_4893, p_4893, trans.constCons2047);
          if(term == null)
            break Fail23761;
          if(true)
            break Success12694;
        }
        term = trans.constNil4;
      }
      lifted7101 lifted71010 = new lifted7101();
      lifted71010.m_4893 = m_4893;
      term = filter_1_0.instance.invoke(context, term, lifted71010);
      if(term == null)
        break Fail23760;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}