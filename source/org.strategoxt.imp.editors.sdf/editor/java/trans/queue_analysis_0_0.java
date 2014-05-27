package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail75709:
    { 
      IStrategoTerm term41467 = term;
      Success41453:
      { 
        Fail75710:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75710;
          term = list_loop_1_0.instance.invoke(context, term, queue_analysis_0_0.instance);
          if(term == null)
            break Fail75710;
          if(true)
            break Success41453;
        }
        term = context.invokePrimitive("SSL_EXT_queue_analysis", term41467, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail75709;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}