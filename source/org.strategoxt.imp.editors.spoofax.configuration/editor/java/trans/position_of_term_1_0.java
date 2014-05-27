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

@SuppressWarnings("all") public class position_of_term_1_0 extends Strategy 
{ 
  public static position_of_term_1_0 instance = new position_of_term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_17590)
  { 
    context.push("position_of_term_1_0");
    Fail87696:
    { 
      IStrategoTerm term47306 = term;
      Success47283:
      { 
        Fail87697:
        { 
          term = g_17590.invoke(context, term);
          if(term == null)
            break Fail87697;
          term = trans.constNil14;
          if(true)
            break Success47283;
        }
        term = term47306;
        IStrategoTerm v_17571 = null;
        IStrategoTerm args56 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        v_17571 = args56;
        term = position_of_term_1_1.instance.invoke(context, v_17571, g_17590, trans.const17886);
        if(term == null)
          break Fail87696;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}