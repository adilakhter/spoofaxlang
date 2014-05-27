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

@SuppressWarnings("all") public class origin_surrounding_comments_0_0 extends Strategy 
{ 
  public static origin_surrounding_comments_0_0 instance = new origin_surrounding_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail75693:
    { 
      IStrategoTerm p_92022 = null;
      IStrategoTerm r_92022 = null;
      IStrategoTerm s_92022 = null;
      r_92022 = term;
      p_92022 = trans.const15464;
      term = r_92022;
      s_92022 = r_92022;
      term = context.invokePrimitive("SSL_EXT_origin_surrounding_comments", s_92022, NO_STRATEGIES, new IStrategoTerm[]{p_92022, term});
      if(term == null)
        break Fail75693;
      if(true)
        return term;
    }
    context.push("origin_surrounding_comments_0_0");
    context.popOnFailure();
    return null;
  }
}