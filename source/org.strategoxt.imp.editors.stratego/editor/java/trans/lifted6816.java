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

@SuppressWarnings("all") final class lifted6816 extends Strategy 
{ 
  public static final lifted6816 instance = new lifted6816();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22338:
    { 
      IStrategoTerm x_4333 = null;
      IStrategoTerm f_4334 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22338;
      f_4334 = term.getSubterm(0);
      IStrategoTerm arg7983 = term.getSubterm(1);
      x_4333 = arg7983;
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, f_4334, arg7983, x_4333);
      if(term == null)
        break Fail22338;
      if(true)
        return term;
    }
    return null;
  }
}