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
    Fail21325:
    { 
      IStrategoTerm y_4175 = null;
      IStrategoTerm z_4175 = null;
      IStrategoTerm a_4176 = null;
      IStrategoTerm b_4176 = null;
      IStrategoTerm c_4176 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
        break Fail21325;
      z_4175 = term.getSubterm(0);
      a_4176 = term.getSubterm(1);
      b_4176 = term.getSubterm(2);
      c_4176 = term.getSubterm(3);
      term = $Hd_0_0.instance.invoke(context, z_4175);
      if(term == null)
        break Fail21325;
      term = $Snd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21325;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21325;
      y_4175 = term;
      term = length_0_0.instance.invoke(context, z_4175);
      if(term == null)
        break Fail21325;
      term = debug_1_0.instance.invoke(context, term, lifted6472.instance);
      if(term == null)
        break Fail21325;
      term = debug_1_0.instance.invoke(context, a_4176, lifted6473.instance);
      if(term == null)
        break Fail21325;
      term = debug_1_0.instance.invoke(context, b_4176, lifted6474.instance);
      if(term == null)
        break Fail21325;
      term = debug_1_0.instance.invoke(context, c_4176, lifted6475.instance);
      if(term == null)
        break Fail21325;
      term = y_4175;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}