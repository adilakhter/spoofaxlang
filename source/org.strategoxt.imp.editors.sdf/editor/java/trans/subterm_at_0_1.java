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

@SuppressWarnings("all") public class subterm_at_0_1 extends Strategy 
{ 
  public static subterm_at_0_1 instance = new subterm_at_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_92025)
  { 
    context.push("subterm_at_0_1");
    Fail75707:
    { 
      IStrategoTerm k_92025 = null;
      IStrategoTerm args35 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      k_92025 = args35;
      term = inc_0_0.instance.invoke(context, h_92025);
      if(term == null)
        break Fail75707;
      term = index_0_1.instance.invoke(context, k_92025, term);
      if(term == null)
        break Fail75707;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}