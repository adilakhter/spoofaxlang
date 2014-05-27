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

@SuppressWarnings("all") public class declare_let_definition_0_0 extends Strategy 
{ 
  public static declare_let_definition_0_0 instance = new declare_let_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_let_definition_0_0");
    Fail21719:
    { 
      TermReference k_4248 = new TermReference();
      TermReference l_4248 = new TermReference();
      TermReference m_4248 = new TermReference();
      TermReference n_4248 = new TermReference();
      TermReference o_4248 = new TermReference();
      TermReference p_4248 = new TermReference();
      TermReference q_4248 = new TermReference();
      TermReference r_4248 = new TermReference();
      IStrategoTerm u_4248 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail21719;
      if(k_4248.value == null)
        k_4248.value = term.getSubterm(0);
      else
        if(k_4248.value != term.getSubterm(0) && !k_4248.value.match(term.getSubterm(0)))
          break Fail21719;
      if(m_4248.value == null)
        m_4248.value = term.getSubterm(1);
      else
        if(m_4248.value != term.getSubterm(1) && !m_4248.value.match(term.getSubterm(1)))
          break Fail21719;
      if(o_4248.value == null)
        o_4248.value = term.getSubterm(2);
      else
        if(o_4248.value != term.getSubterm(2) && !o_4248.value.match(term.getSubterm(2)))
          break Fail21719;
      if(q_4248.value == null)
        q_4248.value = term.getSubterm(3);
      else
        if(q_4248.value != term.getSubterm(3) && !q_4248.value.match(term.getSubterm(3)))
          break Fail21719;
      u_4248 = term;
      IStrategoTerm term11815 = term;
      Success11717:
      { 
        Fail21720:
        { 
          lifted6627 lifted66270 = new lifted6627();
          lifted6626 lifted66260 = new lifted6626();
          lifted66270.k_4248 = k_4248;
          lifted66270.l_4248 = l_4248;
          lifted66270.m_4248 = m_4248;
          lifted66270.n_4248 = n_4248;
          lifted66270.o_4248 = o_4248;
          lifted66270.p_4248 = p_4248;
          lifted66270.q_4248 = q_4248;
          lifted66270.r_4248 = r_4248;
          lifted66260.m_4248 = m_4248;
          lifted66260.o_4248 = o_4248;
          term = dr_scope_declare_cookies_2_0.instance.invoke(context, term, lifted66260, lifted66270);
          if(term == null)
            break Fail21720;
          if(true)
            break Success11717;
        }
        term = term11815;
        IStrategoTerm s_4248 = null;
        IStrategoTerm t_4248 = null;
        IStrategoTerm y_4248 = null;
        s_4248 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21719;
        t_4248 = term;
        y_4248 = s_4248;
        term = report_with_failure_0_2.instance.invoke(context, y_4248, trans.const4393, t_4248);
        if(term == null)
          break Fail21719;
      }
      term = u_4248;
      if(l_4248.value == null || (n_4248.value == null || (p_4248.value == null || r_4248.value == null)))
        break Fail21719;
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{l_4248.value, n_4248.value, p_4248.value, r_4248.value});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}