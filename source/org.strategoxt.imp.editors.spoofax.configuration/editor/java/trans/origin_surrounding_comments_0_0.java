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

@SuppressWarnings("all") public class origin_surrounding_comments_0_0 extends Strategy 
{ 
  public static origin_surrounding_comments_0_0 instance = new origin_surrounding_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22881:
    { 
      IStrategoTerm j_4626 = null;
      IStrategoTerm l_4626 = null;
      IStrategoTerm m_4626 = null;
      l_4626 = term;
      j_4626 = trans.const4498;
      term = l_4626;
      m_4626 = l_4626;
      term = context.invokePrimitive("SSL_EXT_origin_surrounding_comments", m_4626, NO_STRATEGIES, new IStrategoTerm[]{j_4626, term});
      if(term == null)
        break Fail22881;
      if(true)
        return term;
    }
    context.push("origin_surrounding_comments_0_0");
    context.popOnFailure();
    return null;
  }
}