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

@SuppressWarnings("all") public class once_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static once_$Declare$Cookie_0_0 instance = new once_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("once_DeclareCookie_0_0");
    Fail22169:
    { 
      IStrategoTerm term12079 = term;
      Success11949:
      { 
        Fail22170:
        { 
          IStrategoTerm x_4320 = null;
          TermReference y_4320 = new TermReference();
          TermReference z_4320 = new TermReference();
          TermReference a_4321 = new TermReference();
          IStrategoTerm b_4321 = null;
          IStrategoTerm c_4321 = null;
          IStrategoTerm e_4321 = null;
          IStrategoTerm g_4321 = null;
          if(z_4320.value == null)
            z_4320.value = term;
          else
            if(z_4320.value != term && !z_4320.value.match(term))
              break Fail22170;
          if(y_4320.value == null)
            y_4320.value = term;
          else
            if(y_4320.value != term && !y_4320.value.match(term))
              break Fail22170;
          e_4321 = term;
          g_4321 = term;
          term = dr_lookup_rule_pointer_0_2.instance.invoke(context, g_4321, trans.const4358, z_4320.value);
          if(term == null)
            break Fail22170;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail22170;
          x_4320 = term.getSubterm(0);
          c_4321 = term.getSubterm(1);
          b_4321 = term.getSubterm(2);
          term = x_4320;
          lifted6787 lifted67870 = new lifted6787();
          lifted67870.y_4320 = y_4320;
          lifted67870.z_4320 = z_4320;
          lifted67870.a_4321 = a_4321;
          term = split_fetch_1_0.instance.invoke(context, term, lifted67870);
          if(term == null)
            break Fail22170;
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22170;
          term = hashtable_put_0_2.instance.invoke(context, b_4321, c_4321, term);
          if(term == null)
            break Fail22170;
          term = e_4321;
          if(a_4321.value == null)
            break Fail22170;
          term = a_4321.value;
          if(true)
            break Success11949;
        }
        term = term12079;
        IStrategoTerm l_4320 = null;
        TermReference m_4320 = new TermReference();
        TermReference n_4320 = new TermReference();
        TermReference o_4320 = new TermReference();
        IStrategoTerm p_4320 = null;
        IStrategoTerm q_4320 = null;
        IStrategoTerm s_4320 = null;
        IStrategoTerm t_4320 = null;
        IStrategoTerm v_4320 = null;
        IStrategoTerm w_4320 = null;
        if(n_4320.value == null)
          n_4320.value = term;
        else
          if(n_4320.value != term && !n_4320.value.match(term))
            break Fail22169;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22169;
        if(m_4320.value == null)
          m_4320.value = term.getSubterm(0);
        else
          if(m_4320.value != term.getSubterm(0) && !m_4320.value.match(term.getSubterm(0)))
            break Fail22169;
        s_4320 = term;
        v_4320 = term;
        t_4320 = trans.const4358;
        term = v_4320;
        w_4320 = v_4320;
        if(m_4320.value == null)
          break Fail22169;
        term = termFactory.annotateTerm(termFactory.makeTuple(m_4320.value, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
        term = dr_lookup_rule_pointer_0_2.instance.invoke(context, w_4320, t_4320, term);
        if(term == null)
          break Fail22169;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22169;
        l_4320 = term.getSubterm(0);
        q_4320 = term.getSubterm(1);
        p_4320 = term.getSubterm(2);
        term = l_4320;
        lifted6788 lifted67880 = new lifted6788();
        lifted67880.m_4320 = m_4320;
        lifted67880.n_4320 = n_4320;
        lifted67880.o_4320 = o_4320;
        term = split_fetch_1_0.instance.invoke(context, term, lifted67880);
        if(term == null)
          break Fail22169;
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22169;
        term = hashtable_put_0_2.instance.invoke(context, p_4320, q_4320, term);
        if(term == null)
          break Fail22169;
        term = s_4320;
        if(o_4320.value == null)
          break Fail22169;
        term = o_4320.value;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}