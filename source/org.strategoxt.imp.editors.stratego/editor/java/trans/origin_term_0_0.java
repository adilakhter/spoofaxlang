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

@SuppressWarnings("all") public class origin_term_0_0 extends Strategy 
{ 
  public static origin_term_0_0 instance = new origin_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail21465:
    { 
      IStrategoTerm e_4203 = null;
      e_4203 = term;
      term = context.invokePrimitive("SSL_EXT_origin_term", e_4203, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail21465;
      if(true)
        return term;
    }
    context.push("origin_term_0_0");
    context.popOnFailure();
    return null;
  }
}