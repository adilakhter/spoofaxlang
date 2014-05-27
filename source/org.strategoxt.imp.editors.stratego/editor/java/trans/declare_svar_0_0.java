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

@SuppressWarnings("all") public class declare_svar_0_0 extends Strategy 
{ 
  public static declare_svar_0_0 instance = new declare_svar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_svar_0_0");
    Fail23200:
    { 
      IStrategoTerm k_4804 = null;
      IStrategoTerm l_4804 = null;
      IStrategoTerm m_4804 = null;
      TermReference n_4804 = new TermReference();
      TermReference o_4804 = new TermReference();
      IStrategoTerm t_4804 = null;
      m_4804 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23200;
      if(o_4804.value == null)
        o_4804.value = term.getSubterm(0);
      else
        if(o_4804.value != term.getSubterm(0) && !o_4804.value.match(term.getSubterm(0)))
          break Fail23200;
      k_4804 = term.getSubterm(1);
      t_4804 = term;
      IStrategoTerm term12531 = term;
      Success12428:
      { 
        Fail23201:
        { 
          IStrategoTerm p_4804 = null;
          IStrategoTerm w_4804 = null;
          IStrategoTerm x_4804 = null;
          IStrategoTerm z_4804 = null;
          IStrategoTerm a_4805 = null;
          IStrategoTerm b_4805 = null;
          IStrategoTerm q_4804 = null;
          IStrategoTerm c_4805 = null;
          IStrategoTerm e_4805 = null;
          IStrategoTerm f_4805 = null;
          term = newterm_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23201;
          if(n_4804.value == null)
            n_4804.value = term;
          else
            if(n_4804.value != term && !n_4804.value.match(term))
              break Fail23201;
          if(o_4804.value == null || n_4804.value == null)
            break Fail23201;
          term = termFactory.annotateTerm(o_4804.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(n_4804.value, (IStrategoList)trans.constNil4)));
          l_4804 = term;
          p_4804 = term;
          z_4804 = term;
          w_4804 = trans.const4568;
          term = z_4804;
          a_4805 = z_4804;
          if(o_4804.value == null)
            break Fail23201;
          term = termFactory.annotateTerm(termFactory.makeTuple(o_4804.value, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
          x_4804 = term;
          term = a_4805;
          b_4805 = a_4805;
          if(n_4804.value == null)
            break Fail23201;
          term = termFactory.makeTuple(trans.const4607, n_4804.value);
          term = dr_set_rule_0_3.instance.invoke(context, b_4805, w_4804, x_4804, term);
          if(term == null)
            break Fail23201;
          term = p_4804;
          q_4804 = p_4804;
          e_4805 = term;
          c_4805 = trans.const4570;
          f_4805 = e_4805;
          term = termFactory.makeTuple(trans.const4571, m_4804);
          term = dr_set_rule_0_3.instance.invoke(context, f_4805, c_4805, n_4804.value, term);
          if(term == null)
            break Fail23201;
          term = all_keys_$Declare$Cookie_0_0.instance.invoke(context, q_4804);
          if(term == null)
            break Fail23201;
          lifted6914 lifted69140 = new lifted6914();
          lifted69140.n_4804 = n_4804;
          lifted69140.o_4804 = o_4804;
          term = filter_1_0.instance.invoke(context, term, lifted69140);
          if(term == null)
            break Fail23201;
          if(true)
            break Success12428;
        }
        term = term12531;
        IStrategoTerm r_4804 = null;
        IStrategoTerm s_4804 = null;
        IStrategoTerm h_4805 = null;
        r_4804 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23200;
        s_4804 = term;
        h_4805 = r_4804;
        term = report_with_failure_0_2.instance.invoke(context, h_4805, trans.const4608, s_4804);
        if(term == null)
          break Fail23200;
      }
      term = t_4804;
      if(l_4804 == null)
        break Fail23200;
      term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{l_4804, k_4804});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}