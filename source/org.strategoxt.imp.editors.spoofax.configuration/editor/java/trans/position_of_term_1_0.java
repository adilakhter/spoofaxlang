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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4646)
  { 
    context.push("position_of_term_1_0");
    Fail22888:
    { 
      IStrategoTerm term12219 = term;
      Success12196:
      { 
        Fail22889:
        { 
          term = j_4646.invoke(context, term);
          if(term == null)
            break Fail22889;
          term = trans.constNil4;
          if(true)
            break Success12196;
        }
        term = term12219;
        IStrategoTerm y_4627 = null;
        IStrategoTerm args23 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        y_4627 = args23;
        term = position_of_term_1_1.instance.invoke(context, y_4627, j_4646, trans.const4499);
        if(term == null)
          break Fail22888;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}