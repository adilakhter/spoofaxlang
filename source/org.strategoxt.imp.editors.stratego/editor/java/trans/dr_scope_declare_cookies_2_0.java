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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4793, Strategy o_4793)
  { 
    context.push("dr_scope_declare_cookies_2_0");
    Fail23159:
    { 
      IStrategoTerm d_4793 = null;
      IStrategoTerm e_4793 = null;
      IStrategoTerm f_4793 = null;
      IStrategoTerm p_4793 = null;
      d_4793 = term;
      p_4793 = term;
      IStrategoTerm term12486 = term;
      Success12393:
      { 
        Fail23160:
        { 
          term = n_4793.invoke(context, term);
          if(term == null)
            break Fail23160;
          term = map_1_0.instance.invoke(context, term, lifted6875.instance);
          if(term == null)
            break Fail23160;
          f_4793 = term;
          term = o_4793.invoke(context, d_4793);
          if(term == null)
            break Fail23160;
          e_4793 = term;
          term = list_loop_1_0.instance.invoke(context, f_4793, lifted6876.instance);
          if(term == null)
            break Fail23160;
          if(true)
            break Success12393;
        }
        term = term12486;
        IStrategoTerm l_4793 = null;
        IStrategoTerm m_4793 = null;
        IStrategoTerm f_4794 = null;
        l_4793 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23159;
        m_4793 = term;
        f_4794 = l_4793;
        term = report_with_failure_0_2.instance.invoke(context, f_4794, trans.const4601, m_4793);
        if(term == null)
          break Fail23159;
      }
      term = p_4793;
      if(e_4793 == null)
        break Fail23159;
      term = e_4793;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}