package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class generate_aterm_0_0 extends Strategy 
{ 
  public static generate_aterm_0_0 instance = new generate_aterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_aterm_0_0");
    Fail22906:
    { 
      IStrategoTerm k_4630 = null;
      IStrategoTerm l_4630 = null;
      IStrategoTerm m_4630 = null;
      IStrategoTerm n_4630 = null;
      IStrategoTerm q_4630 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22906;
      m_4630 = term.getSubterm(0);
      k_4630 = term.getSubterm(3);
      q_4630 = term;
      IStrategoTerm term12224 = term;
      Success12201:
      { 
        Fail22907:
        { 
          IStrategoTerm s_4630 = null;
          s_4630 = k_4630;
          term = guarantee_extension_0_1.instance.invoke(context, s_4630, trans.const4503);
          if(term == null)
            break Fail22907;
          l_4630 = term;
          term = alltd_1_0.instance.invoke(context, m_4630, normalized_spxproject_reference_0_0.instance);
          if(term == null)
            break Fail22907;
          n_4630 = term;
          term = get_templatelang_options_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22907;
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22907;
          if(true)
            break Success12201;
        }
        term = term12224;
        IStrategoTerm o_4630 = null;
        IStrategoTerm p_4630 = null;
        IStrategoTerm u_4630 = null;
        o_4630 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail22906;
        p_4630 = term;
        u_4630 = o_4630;
        term = report_with_failure_0_2.instance.invoke(context, u_4630, trans.const4504, p_4630);
        if(term == null)
          break Fail22906;
      }
      term = q_4630;
      if(l_4630 == null || n_4630 == null)
        break Fail22906;
      term = termFactory.makeTuple(l_4630, n_4630);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}