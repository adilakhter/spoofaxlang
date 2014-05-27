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

@SuppressWarnings("all") public class subterm_at_0_1 extends Strategy 
{ 
  public static subterm_at_0_1 instance = new subterm_at_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4629)
  { 
    context.push("subterm_at_0_1");
    Fail22895:
    { 
      IStrategoTerm e_4629 = null;
      IStrategoTerm args24 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      e_4629 = args24;
      term = inc_0_0.instance.invoke(context, b_4629);
      if(term == null)
        break Fail22895;
      term = index_0_1.instance.invoke(context, e_4629, term);
      if(term == null)
        break Fail22895;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}