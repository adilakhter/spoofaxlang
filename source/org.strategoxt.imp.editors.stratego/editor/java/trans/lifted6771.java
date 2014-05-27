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

@SuppressWarnings("all") final class lifted6771 extends Strategy 
{ 
  public static final lifted6771 instance = new lifted6771();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22383:
    { 
      IStrategoTerm r_4312 = null;
      IStrategoTerm z_4312 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22383;
      z_4312 = term.getSubterm(0);
      IStrategoTerm arg7931 = term.getSubterm(1);
      r_4312 = arg7931;
      term = aux_$Declaration_0_2.instance.invoke(context, z_4312, arg7931, r_4312);
      if(term == null)
        break Fail22383;
      if(true)
        return term;
    }
    return null;
  }
}