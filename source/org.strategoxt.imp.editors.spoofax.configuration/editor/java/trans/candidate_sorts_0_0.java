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

@SuppressWarnings("all") public class candidate_sorts_0_0 extends Strategy 
{ 
  public static candidate_sorts_0_0 instance = new candidate_sorts_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22868:
    { 
      term = context.invokePrimitive("SSL_EXT_candidatesorts", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail22868;
      if(true)
        return term;
    }
    context.push("candidate_sorts_0_0");
    context.popOnFailure();
    return null;
  }
}