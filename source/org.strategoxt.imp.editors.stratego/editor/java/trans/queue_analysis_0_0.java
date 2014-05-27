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

@SuppressWarnings("all") public class queue_analysis_0_0 extends Strategy 
{ 
  public static queue_analysis_0_0 instance = new queue_analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("queue_analysis_0_0");
    Fail21489:
    { 
      IStrategoTerm term11599 = term;
      Success11530:
      { 
        Fail21490:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21490;
          term = list_loop_1_0.instance.invoke(context, term, queue_analysis_0_0.instance);
          if(term == null)
            break Fail21490;
          if(true)
            break Success11530;
        }
        term = context.invokePrimitive("SSL_EXT_queue_analysis", term11599, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21489;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}