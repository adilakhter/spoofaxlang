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

@SuppressWarnings("all") public class generate_aterm_0_0 extends Strategy 
{ 
  public static generate_aterm_0_0 instance = new generate_aterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_aterm_0_0");
    Fail76088:
    { 
      IStrategoTerm b_92075 = null;
      IStrategoTerm c_92075 = null;
      IStrategoTerm g_92075 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail76088;
      b_92075 = term.getSubterm(0);
      c_92075 = term.getSubterm(3);
      g_92075 = c_92075;
      term = guarantee_extension_0_1.instance.invoke(context, g_92075, trans.const15578);
      if(term == null)
        break Fail76088;
      term = termFactory.makeTuple(term, b_92075);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}