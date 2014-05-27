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
    Fail87714:
    { 
      IStrategoTerm h_17574 = null;
      IStrategoTerm i_17574 = null;
      IStrategoTerm j_17574 = null;
      IStrategoTerm k_17574 = null;
      IStrategoTerm n_17574 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail87714;
      j_17574 = term.getSubterm(0);
      h_17574 = term.getSubterm(3);
      n_17574 = term;
      IStrategoTerm term47311 = term;
      Success47288:
      { 
        Fail87715:
        { 
          IStrategoTerm p_17574 = null;
          p_17574 = h_17574;
          term = guarantee_extension_0_1.instance.invoke(context, p_17574, trans.const17890);
          if(term == null)
            break Fail87715;
          i_17574 = term;
          term = alltd_1_0.instance.invoke(context, j_17574, normalized_spxproject_reference_0_0.instance);
          if(term == null)
            break Fail87715;
          k_17574 = term;
          term = get_templatelang_options_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87715;
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87715;
          if(true)
            break Success47288;
        }
        term = term47311;
        IStrategoTerm l_17574 = null;
        IStrategoTerm m_17574 = null;
        IStrategoTerm r_17574 = null;
        l_17574 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail87714;
        m_17574 = term;
        r_17574 = l_17574;
        term = report_with_failure_0_2.instance.invoke(context, r_17574, trans.const17891, m_17574);
        if(term == null)
          break Fail87714;
      }
      term = n_17574;
      if(i_17574 == null || k_17574 == null)
        break Fail87714;
      term = termFactory.makeTuple(i_17574, k_17574);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}