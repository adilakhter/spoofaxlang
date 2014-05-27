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

@SuppressWarnings("all") public class process_refactoring_result_0_0 extends Strategy 
{ 
  public static process_refactoring_result_0_0 instance = new process_refactoring_result_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("process_refactoring_result_0_0");
    Fail22801:
    { 
      IStrategoTerm q_4729 = null;
      IStrategoTerm r_4729 = null;
      IStrategoTerm s_4729 = null;
      IStrategoTerm t_4729 = null;
      IStrategoTerm u_4729 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
        break Fail22801;
      r_4729 = term.getSubterm(0);
      s_4729 = term.getSubterm(1);
      t_4729 = term.getSubterm(2);
      u_4729 = term.getSubterm(3);
      term = $Hd_0_0.instance.invoke(context, r_4729);
      if(term == null)
        break Fail22801;
      term = $Snd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22801;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22801;
      q_4729 = term;
      term = length_0_0.instance.invoke(context, r_4729);
      if(term == null)
        break Fail22801;
      term = debug_1_0.instance.invoke(context, term, lifted6743.instance);
      if(term == null)
        break Fail22801;
      term = debug_1_0.instance.invoke(context, s_4729, lifted6744.instance);
      if(term == null)
        break Fail22801;
      term = debug_1_0.instance.invoke(context, t_4729, lifted6745.instance);
      if(term == null)
        break Fail22801;
      term = debug_1_0.instance.invoke(context, u_4729, lifted6746.instance);
      if(term == null)
        break Fail22801;
      term = q_4729;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}