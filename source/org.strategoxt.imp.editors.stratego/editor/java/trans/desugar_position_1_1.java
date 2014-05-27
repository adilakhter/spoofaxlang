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

@SuppressWarnings("all") public class desugar_position_1_1 extends Strategy 
{ 
  public static desugar_position_1_1 instance = new desugar_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4204, IStrategoTerm p_4204)
  { 
    context.push("desugar_position_1_1");
    Fail21477:
    { 
      IStrategoTerm q_4204 = null;
      q_4204 = term;
      term = at_position_1_1.instance.invoke(context, p_4204, lifted6545.instance, q_4204);
      if(term == null)
        break Fail21477;
      lifted6546 lifted65460 = new lifted6546();
      lifted65460.w_4204 = w_4204;
      term = topdown_1_0.instance.invoke(context, term, lifted65460);
      if(term == null)
        break Fail21477;
      term = position_of_term_1_0.instance.invoke(context, term, lifted6549.instance);
      if(term == null)
        break Fail21477;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}