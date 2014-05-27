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

@SuppressWarnings("all") public class origin_surrounding_comments_0_0 extends Strategy 
{ 
  public static origin_surrounding_comments_0_0 instance = new origin_surrounding_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail21473:
    { 
      IStrategoTerm e_4204 = null;
      IStrategoTerm g_4204 = null;
      IStrategoTerm h_4204 = null;
      g_4204 = term;
      e_4204 = trans.const4338;
      term = g_4204;
      h_4204 = g_4204;
      term = context.invokePrimitive("SSL_EXT_origin_surrounding_comments", h_4204, NO_STRATEGIES, new IStrategoTerm[]{e_4204, term});
      if(term == null)
        break Fail21473;
      if(true)
        return term;
    }
    context.push("origin_surrounding_comments_0_0");
    context.popOnFailure();
    return null;
  }
}