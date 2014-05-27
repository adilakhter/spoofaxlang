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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4803)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("scope_variables_1_0");
    Fail23197:
    { 
      TermReference w_4802 = new TermReference();
      TermReference x_4802 = new TermReference();
      TermReference y_4802 = new TermReference();
      TermReference z_4802 = new TermReference();
      IStrategoTerm k_4803 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23197;
      if(y_4802.value == null)
        y_4802.value = term.getSubterm(0);
      else
        if(y_4802.value != term.getSubterm(0) && !y_4802.value.match(term.getSubterm(0)))
          break Fail23197;
      if(w_4802.value == null)
        w_4802.value = term.getSubterm(1);
      else
        if(w_4802.value != term.getSubterm(1) && !w_4802.value.match(term.getSubterm(1)))
          break Fail23197;
      k_4803 = term;
      IStrategoTerm term12526 = term;
      Success12427:
      { 
        Fail23198:
        { 
          IStrategoTerm l_4803 = null;
          IStrategoTerm m_4803 = null;
          m_4803 = term;
          l_4803 = trans.const4604;
          term = m_4803;
          lifted6903 lifted69030 = new lifted6903();
          lifted69030.w_4802 = w_4802;
          lifted69030.x_4802 = x_4802;
          lifted69030.y_4802 = y_4802;
          lifted69030.z_4802 = z_4802;
          term = dr_scope_1_1.instance.invoke(context, term, lifted69030, l_4803);
          if(term == null)
            break Fail23198;
          if(true)
            break Success12427;
        }
        term = term12526;
        IStrategoTerm h_4803 = null;
        IStrategoTerm i_4803 = null;
        IStrategoTerm f_4804 = null;
        h_4803 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23197;
        i_4803 = term;
        f_4804 = h_4803;
        term = report_with_failure_0_2.instance.invoke(context, f_4804, trans.const4606, i_4803);
        if(term == null)
          break Fail23197;
      }
      term = k_4803;
      if(z_4802.value == null || x_4802.value == null)
        break Fail23197;
      term = termFactory.makeTuple(z_4802.value, x_4802.value);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}