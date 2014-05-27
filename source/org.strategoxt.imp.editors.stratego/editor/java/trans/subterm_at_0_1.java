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

@SuppressWarnings("all") public class subterm_at_0_1 extends Strategy 
{ 
  public static subterm_at_0_1 instance = new subterm_at_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_4206)
  { 
    context.push("subterm_at_0_1");
    Fail21487:
    { 
      IStrategoTerm z_4206 = null;
      IStrategoTerm args21 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      z_4206 = args21;
      term = inc_0_0.instance.invoke(context, w_4206);
      if(term == null)
        break Fail21487;
      term = index_0_1.instance.invoke(context, z_4206, term);
      if(term == null)
        break Fail21487;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}