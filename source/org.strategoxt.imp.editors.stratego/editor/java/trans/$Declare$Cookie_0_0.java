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

@SuppressWarnings("all") public class $Declare$Cookie_0_0 extends Strategy 
{ 
  public static $Declare$Cookie_0_0 instance = new $Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeclareCookie_0_0");
    Fail22179:
    { 
      IStrategoTerm term12086 = term;
      Success11956:
      { 
        Fail22180:
        { 
          TermReference t_4322 = new TermReference();
          TermReference u_4322 = new TermReference();
          IStrategoTerm y_4322 = null;
          if(u_4322.value == null)
            u_4322.value = term;
          else
            if(u_4322.value != term && !u_4322.value.match(term))
              break Fail22180;
          if(t_4322.value == null)
            t_4322.value = term;
          else
            if(t_4322.value != term && !t_4322.value.match(term))
              break Fail22180;
          y_4322 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4322, trans.const4358, u_4322.value);
          if(term == null)
            break Fail22180;
          lifted6793 lifted67930 = new lifted6793();
          lifted67930.t_4322 = t_4322;
          lifted67930.u_4322 = u_4322;
          term = fetch_elem_1_0.instance.invoke(context, term, lifted67930);
          if(term == null)
            break Fail22180;
          if(true)
            break Success11956;
        }
        term = term12086;
        TermReference l_4322 = new TermReference();
        TermReference m_4322 = new TermReference();
        IStrategoTerm p_4322 = null;
        IStrategoTerm r_4322 = null;
        IStrategoTerm s_4322 = null;
        if(l_4322.value == null)
          l_4322.value = term;
        else
          if(l_4322.value != term && !l_4322.value.match(term))
            break Fail22179;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22179;
        if(m_4322.value == null)
          m_4322.value = term.getSubterm(0);
        else
          if(m_4322.value != term.getSubterm(0) && !m_4322.value.match(term.getSubterm(0)))
            break Fail22179;
        r_4322 = term;
        p_4322 = trans.const4358;
        term = r_4322;
        s_4322 = r_4322;
        if(m_4322.value == null)
          break Fail22179;
        term = termFactory.annotateTerm(termFactory.makeTuple(m_4322.value, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
        term = dr_lookup_rule_0_2.instance.invoke(context, s_4322, p_4322, term);
        if(term == null)
          break Fail22179;
        lifted6794 lifted67940 = new lifted6794();
        lifted67940.m_4322 = m_4322;
        lifted67940.l_4322 = l_4322;
        term = fetch_elem_1_0.instance.invoke(context, term, lifted67940);
        if(term == null)
          break Fail22179;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}