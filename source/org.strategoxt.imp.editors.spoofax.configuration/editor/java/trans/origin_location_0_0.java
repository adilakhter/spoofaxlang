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

@SuppressWarnings("all") public class origin_location_0_0 extends Strategy 
{ 
  public static origin_location_0_0 instance = new origin_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87684:
    { 
      IStrategoTerm s_17569 = null;
      s_17569 = term;
      term = context.invokePrimitive("SSL_EXT_origin_location", s_17569, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail87684;
      if(true)
        return term;
    }
    context.push("origin_location_0_0");
    context.popOnFailure();
    return null;
  }
}