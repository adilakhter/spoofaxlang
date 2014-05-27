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
    Fail23350:
    { 
      IStrategoTerm b_4827 = null;
      IStrategoTerm c_4827 = null;
      IStrategoTerm d_4827 = null;
      IStrategoTerm e_4827 = null;
      IStrategoTerm h_4827 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail23350;
      d_4827 = term.getSubterm(0);
      b_4827 = term.getSubterm(3);
      h_4827 = term;
      IStrategoTerm term12687 = term;
      Success12557:
      { 
        Fail23351:
        { 
          IStrategoTerm j_4827 = null;
          j_4827 = b_4827;
          term = guarantee_extension_0_1.instance.invoke(context, j_4827, trans.const4663);
          if(term == null)
            break Fail23351;
          c_4827 = term;
          term = topdown_1_0.instance.invoke(context, d_4827, lifted6964.instance);
          if(term == null)
            break Fail23351;
          e_4827 = term;
          if(true)
            break Success12557;
        }
        term = term12687;
        IStrategoTerm f_4827 = null;
        IStrategoTerm g_4827 = null;
        IStrategoTerm l_4827 = null;
        f_4827 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23350;
        g_4827 = term;
        l_4827 = f_4827;
        term = report_with_failure_0_2.instance.invoke(context, l_4827, trans.const4665, g_4827);
        if(term == null)
          break Fail23350;
      }
      term = h_4827;
      if(c_4827 == null || e_4827 == null)
        break Fail23350;
      term = termFactory.makeTuple(c_4827, e_4827);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}