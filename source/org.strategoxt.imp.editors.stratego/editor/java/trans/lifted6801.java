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

@SuppressWarnings("all") final class lifted6801 extends Strategy 
{ 
  TermReference q_5053;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24112:
    { 
      IStrategoTerm w_5053 = null;
      IStrategoTerm z_5053 = null;
      IStrategoTerm x_5053 = null;
      z_5053 = term;
      if(q_5053.value == null)
        break Fail24112;
      w_5053 = q_5053.value;
      x_5053 = z_5053;
      term = termFactory.makeTuple(x_5053, w_5053);
      term = elem_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24112;
      term = x_5053;
      if(true)
        return term;
    }
    return null;
  }
}