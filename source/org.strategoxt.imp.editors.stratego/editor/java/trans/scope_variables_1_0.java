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

@SuppressWarnings("all") public class scope_variables_1_0 extends Strategy 
{ 
  public static scope_variables_1_0 instance = new scope_variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4249)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("scope_variables_1_0");
    Fail21721:
    { 
      TermReference e_4249 = new TermReference();
      TermReference f_4249 = new TermReference();
      TermReference g_4249 = new TermReference();
      TermReference h_4249 = new TermReference();
      IStrategoTerm s_4249 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21721;
      if(g_4249.value == null)
        g_4249.value = term.getSubterm(0);
      else
        if(g_4249.value != term.getSubterm(0) && !g_4249.value.match(term.getSubterm(0)))
          break Fail21721;
      if(e_4249.value == null)
        e_4249.value = term.getSubterm(1);
      else
        if(e_4249.value != term.getSubterm(1) && !e_4249.value.match(term.getSubterm(1)))
          break Fail21721;
      s_4249 = term;
      IStrategoTerm term11817 = term;
      Success11718:
      { 
        Fail21722:
        { 
          IStrategoTerm t_4249 = null;
          IStrategoTerm u_4249 = null;
          u_4249 = term;
          t_4249 = trans.const4394;
          term = u_4249;
          lifted6632 lifted66320 = new lifted6632();
          lifted66320.e_4249 = e_4249;
          lifted66320.f_4249 = f_4249;
          lifted66320.g_4249 = g_4249;
          lifted66320.h_4249 = h_4249;
          term = dr_scope_1_1.instance.invoke(context, term, lifted66320, t_4249);
          if(term == null)
            break Fail21722;
          if(true)
            break Success11718;
        }
        term = term11817;
        IStrategoTerm p_4249 = null;
        IStrategoTerm q_4249 = null;
        IStrategoTerm n_4250 = null;
        p_4249 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21721;
        q_4249 = term;
        n_4250 = p_4249;
        term = report_with_failure_0_2.instance.invoke(context, n_4250, trans.const4396, q_4249);
        if(term == null)
          break Fail21721;
      }
      term = s_4249;
      if(h_4249.value == null || f_4249.value == null)
        break Fail21721;
      term = termFactory.makeTuple(h_4249.value, f_4249.value);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}