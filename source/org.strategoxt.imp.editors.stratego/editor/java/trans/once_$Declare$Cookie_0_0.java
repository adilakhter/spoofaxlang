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
    Fail23645:
    { 
      IStrategoTerm term12788 = term;
      Success12658:
      { 
        Fail23646:
        { 
          IStrategoTerm p_4874 = null;
          TermReference q_4874 = new TermReference();
          TermReference r_4874 = new TermReference();
          TermReference s_4874 = new TermReference();
          IStrategoTerm t_4874 = null;
          IStrategoTerm u_4874 = null;
          IStrategoTerm w_4874 = null;
          IStrategoTerm y_4874 = null;
          if(r_4874.value == null)
            r_4874.value = term;
          else
            if(r_4874.value != term && !r_4874.value.match(term))
              break Fail23646;
          if(q_4874.value == null)
            q_4874.value = term;
          else
            if(q_4874.value != term && !q_4874.value.match(term))
              break Fail23646;
          w_4874 = term;
          y_4874 = term;
          term = dr_lookup_rule_pointer_0_2.instance.invoke(context, y_4874, trans.const4568, r_4874.value);
          if(term == null)
            break Fail23646;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail23646;
          p_4874 = term.getSubterm(0);
          u_4874 = term.getSubterm(1);
          t_4874 = term.getSubterm(2);
          term = p_4874;
          lifted7058 lifted70580 = new lifted7058();
          lifted70580.q_4874 = q_4874;
          lifted70580.r_4874 = r_4874;
          lifted70580.s_4874 = s_4874;
          term = split_fetch_1_0.instance.invoke(context, term, lifted70580);
          if(term == null)
            break Fail23646;
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23646;
          term = hashtable_put_0_2.instance.invoke(context, t_4874, u_4874, term);
          if(term == null)
            break Fail23646;
          term = w_4874;
          if(s_4874.value == null)
            break Fail23646;
          term = s_4874.value;
          if(true)
            break Success12658;
        }
        term = term12788;
        IStrategoTerm d_4874 = null;
        TermReference e_4874 = new TermReference();
        TermReference f_4874 = new TermReference();
        TermReference g_4874 = new TermReference();
        IStrategoTerm h_4874 = null;
        IStrategoTerm i_4874 = null;
        IStrategoTerm k_4874 = null;
        IStrategoTerm l_4874 = null;
        IStrategoTerm n_4874 = null;
        IStrategoTerm o_4874 = null;
        if(f_4874.value == null)
          f_4874.value = term;
        else
          if(f_4874.value != term && !f_4874.value.match(term))
            break Fail23645;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23645;
        if(e_4874.value == null)
          e_4874.value = term.getSubterm(0);
        else
          if(e_4874.value != term.getSubterm(0) && !e_4874.value.match(term.getSubterm(0)))
            break Fail23645;
        k_4874 = term;
        n_4874 = term;
        l_4874 = trans.const4568;
        term = n_4874;
        o_4874 = n_4874;
        if(e_4874.value == null)
          break Fail23645;
        term = termFactory.annotateTerm(termFactory.makeTuple(e_4874.value, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
        term = dr_lookup_rule_pointer_0_2.instance.invoke(context, o_4874, l_4874, term);
        if(term == null)
          break Fail23645;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23645;
        d_4874 = term.getSubterm(0);
        i_4874 = term.getSubterm(1);
        h_4874 = term.getSubterm(2);
        term = d_4874;
        lifted7059 lifted70590 = new lifted7059();
        lifted70590.e_4874 = e_4874;
        lifted70590.f_4874 = f_4874;
        lifted70590.g_4874 = g_4874;
        term = split_fetch_1_0.instance.invoke(context, term, lifted70590);
        if(term == null)
          break Fail23645;
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23645;
        term = hashtable_put_0_2.instance.invoke(context, h_4874, i_4874, term);
        if(term == null)
          break Fail23645;
        term = k_4874;
        if(g_4874.value == null)
          break Fail23645;
        term = g_4874.value;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}