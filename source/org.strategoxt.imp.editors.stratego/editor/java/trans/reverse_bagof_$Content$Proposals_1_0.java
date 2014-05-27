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

@SuppressWarnings("all") public class reverse_bagof_$Content$Proposals_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Content$Proposals_1_0 instance = new reverse_bagof_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4339)
  { 
    context.push("reverse_bagof_ContentProposals_1_0");
    Fail22282:
    { 
      TermReference m_4339 = new TermReference();
      if(m_4339.value == null)
        m_4339.value = term;
      else
        if(m_4339.value != term && !m_4339.value.match(term))
          break Fail22282;
      Success11984:
      { 
        Fail22283:
        { 
          IStrategoTerm q_4339 = null;
          IStrategoTerm s_4339 = null;
          IStrategoTerm t_4339 = null;
          s_4339 = term;
          q_4339 = trans.const4401;
          t_4339 = s_4339;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4339, q_4339, trans.constCons1966);
          if(term == null)
            break Fail22283;
          if(true)
            break Success11984;
        }
        term = trans.constNil3;
      }
      lifted6829 lifted68290 = new lifted6829();
      lifted68290.m_4339 = m_4339;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted68290, o_4339);
      if(term == null)
        break Fail22282;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}