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

@SuppressWarnings("all") public class dr_scope_declare_cookies_2_0 extends Strategy 
{ 
  public static dr_scope_declare_cookies_2_0 instance = new dr_scope_declare_cookies_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4239, Strategy w_4239)
  { 
    context.push("dr_scope_declare_cookies_2_0");
    Fail21683:
    { 
      IStrategoTerm l_4239 = null;
      IStrategoTerm m_4239 = null;
      IStrategoTerm n_4239 = null;
      IStrategoTerm x_4239 = null;
      l_4239 = term;
      x_4239 = term;
      IStrategoTerm term11777 = term;
      Success11684:
      { 
        Fail21684:
        { 
          term = v_4239.invoke(context, term);
          if(term == null)
            break Fail21684;
          term = map_1_0.instance.invoke(context, term, lifted6604.instance);
          if(term == null)
            break Fail21684;
          n_4239 = term;
          term = w_4239.invoke(context, l_4239);
          if(term == null)
            break Fail21684;
          m_4239 = term;
          term = list_loop_1_0.instance.invoke(context, n_4239, lifted6605.instance);
          if(term == null)
            break Fail21684;
          if(true)
            break Success11684;
        }
        term = term11777;
        IStrategoTerm t_4239 = null;
        IStrategoTerm u_4239 = null;
        IStrategoTerm n_4240 = null;
        t_4239 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21683;
        u_4239 = term;
        n_4240 = t_4239;
        term = report_with_failure_0_2.instance.invoke(context, n_4240, trans.const4391, u_4239);
        if(term == null)
          break Fail21683;
      }
      term = x_4239;
      if(m_4239 == null)
        break Fail21683;
      term = m_4239;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}