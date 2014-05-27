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
    Fail23655:
    { 
      IStrategoTerm term12795 = term;
      Success12665:
      { 
        Fail23656:
        { 
          TermReference l_4876 = new TermReference();
          TermReference m_4876 = new TermReference();
          IStrategoTerm q_4876 = null;
          if(m_4876.value == null)
            m_4876.value = term;
          else
            if(m_4876.value != term && !m_4876.value.match(term))
              break Fail23656;
          if(l_4876.value == null)
            l_4876.value = term;
          else
            if(l_4876.value != term && !l_4876.value.match(term))
              break Fail23656;
          q_4876 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4876, trans.const4568, m_4876.value);
          if(term == null)
            break Fail23656;
          lifted7064 lifted70640 = new lifted7064();
          lifted70640.l_4876 = l_4876;
          lifted70640.m_4876 = m_4876;
          term = fetch_elem_1_0.instance.invoke(context, term, lifted70640);
          if(term == null)
            break Fail23656;
          if(true)
            break Success12665;
        }
        term = term12795;
        TermReference d_4876 = new TermReference();
        TermReference e_4876 = new TermReference();
        IStrategoTerm h_4876 = null;
        IStrategoTerm j_4876 = null;
        IStrategoTerm k_4876 = null;
        if(d_4876.value == null)
          d_4876.value = term;
        else
          if(d_4876.value != term && !d_4876.value.match(term))
            break Fail23655;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23655;
        if(e_4876.value == null)
          e_4876.value = term.getSubterm(0);
        else
          if(e_4876.value != term.getSubterm(0) && !e_4876.value.match(term.getSubterm(0)))
            break Fail23655;
        j_4876 = term;
        h_4876 = trans.const4568;
        term = j_4876;
        k_4876 = j_4876;
        if(e_4876.value == null)
          break Fail23655;
        term = termFactory.annotateTerm(termFactory.makeTuple(e_4876.value, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
        term = dr_lookup_rule_0_2.instance.invoke(context, k_4876, h_4876, term);
        if(term == null)
          break Fail23655;
        lifted7065 lifted70650 = new lifted7065();
        lifted70650.e_4876 = e_4876;
        lifted70650.d_4876 = d_4876;
        term = fetch_elem_1_0.instance.invoke(context, term, lifted70650);
        if(term == null)
          break Fail23655;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}