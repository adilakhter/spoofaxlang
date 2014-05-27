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

@SuppressWarnings("all") public class desugar_position_1_1 extends Strategy 
{ 
  public static desugar_position_1_1 instance = new desugar_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4627, IStrategoTerm u_4626)
  { 
    context.push("desugar_position_1_1");
    Fail22885:
    { 
      IStrategoTerm v_4626 = null;
      v_4626 = term;
      term = at_position_1_1.instance.invoke(context, u_4626, lifted6869.instance, v_4626);
      if(term == null)
        break Fail22885;
      lifted6870 lifted68700 = new lifted6870();
      lifted68700.b_4627 = b_4627;
      term = topdown_1_0.instance.invoke(context, term, lifted68700);
      if(term == null)
        break Fail22885;
      term = position_of_term_1_0.instance.invoke(context, term, lifted6873.instance);
      if(term == null)
        break Fail22885;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}