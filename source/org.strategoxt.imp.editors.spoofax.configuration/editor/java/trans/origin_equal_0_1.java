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

@SuppressWarnings("all") public class origin_equal_0_1 extends Strategy 
{ 
  public static origin_equal_0_1 instance = new origin_equal_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4626)
  { 
    Fail22880:
    { 
      IStrategoTerm g_4626 = null;
      g_4626 = term;
      term = context.invokePrimitive("SSL_EXT_origin_equal", g_4626, NO_STRATEGIES, new IStrategoTerm[]{term, e_4626});
      if(term == null)
        break Fail22880;
      if(true)
        return term;
    }
    context.push("origin_equal_0_1");
    context.popOnFailure();
    return null;
  }
}