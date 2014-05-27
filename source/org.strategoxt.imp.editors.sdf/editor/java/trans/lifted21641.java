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

@SuppressWarnings("all") final class lifted21641 extends Strategy 
{ 
  public static final lifted21641 instance = new lifted21641();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76338:
    { 
      IStrategoTerm n_92103 = null;
      IStrategoTerm w_92103 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76338;
      w_92103 = term.getSubterm(0);
      IStrategoTerm arg26221 = term.getSubterm(1);
      n_92103 = arg26221;
      term = aux_$Declaration_0_2.instance.invoke(context, w_92103, arg26221, n_92103);
      if(term == null)
        break Fail76338;
      if(true)
        return term;
    }
    return null;
  }
}