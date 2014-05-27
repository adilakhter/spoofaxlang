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

@SuppressWarnings("all") public class generate_desugared_aterm_0_0 extends Strategy 
{ 
  public static generate_desugared_aterm_0_0 instance = new generate_desugared_aterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_desugared_aterm_0_0");
    Fail21874:
    { 
      IStrategoTerm j_4273 = null;
      IStrategoTerm k_4273 = null;
      IStrategoTerm l_4273 = null;
      IStrategoTerm m_4273 = null;
      IStrategoTerm p_4273 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21874;
      l_4273 = term.getSubterm(0);
      j_4273 = term.getSubterm(3);
      p_4273 = term;
      IStrategoTerm term11978 = term;
      Success11848:
      { 
        Fail21875:
        { 
          IStrategoTerm r_4273 = null;
          r_4273 = j_4273;
          term = guarantee_extension_0_1.instance.invoke(context, r_4273, trans.const4453);
          if(term == null)
            break Fail21875;
          k_4273 = term;
          term = topdown_1_0.instance.invoke(context, l_4273, lifted6693.instance);
          if(term == null)
            break Fail21875;
          m_4273 = term;
          if(true)
            break Success11848;
        }
        term = term11978;
        IStrategoTerm n_4273 = null;
        IStrategoTerm o_4273 = null;
        IStrategoTerm t_4273 = null;
        n_4273 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21874;
        o_4273 = term;
        t_4273 = n_4273;
        term = report_with_failure_0_2.instance.invoke(context, t_4273, trans.const4455, o_4273);
        if(term == null)
          break Fail21874;
      }
      term = p_4273;
      if(k_4273 == null || m_4273 == null)
        break Fail21874;
      term = termFactory.makeTuple(k_4273, m_4273);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}