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

@SuppressWarnings("all") public class generate_aterm_0_0 extends Strategy 
{ 
  public static generate_aterm_0_0 instance = new generate_aterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_aterm_0_0");
    Fail23348:
    { 
      IStrategoTerm l_4826 = null;
      IStrategoTerm m_4826 = null;
      IStrategoTerm n_4826 = null;
      IStrategoTerm o_4826 = null;
      IStrategoTerm r_4826 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail23348;
      n_4826 = term.getSubterm(0);
      l_4826 = term.getSubterm(3);
      r_4826 = term;
      IStrategoTerm term12686 = term;
      Success12556:
      { 
        Fail23349:
        { 
          IStrategoTerm t_4826 = null;
          t_4826 = l_4826;
          term = guarantee_extension_0_1.instance.invoke(context, t_4826, trans.const4663);
          if(term == null)
            break Fail23349;
          m_4826 = term;
          term = n_4826;
          o_4826 = n_4826;
          if(true)
            break Success12556;
        }
        term = term12686;
        IStrategoTerm p_4826 = null;
        IStrategoTerm q_4826 = null;
        IStrategoTerm v_4826 = null;
        p_4826 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23348;
        q_4826 = term;
        v_4826 = p_4826;
        term = report_with_failure_0_2.instance.invoke(context, v_4826, trans.const4664, q_4826);
        if(term == null)
          break Fail23348;
      }
      term = r_4826;
      if(m_4826 == null || o_4826 == null)
        break Fail23348;
      term = termFactory.makeTuple(m_4826, o_4826);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}