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

@SuppressWarnings("all") final class lifted6823 extends Strategy 
{ 
  public static final lifted6823 instance = new lifted6823();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22331:
    { 
      IStrategoTerm l_4337 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22331;
      l_4337 = term.getSubterm(0);
      IStrategoTerm arg7986 = term.getSubterm(1);
      term = aux_$Content$Proposals_0_1.instance.invoke(context, l_4337, arg7986);
      if(term == null)
        break Fail22331;
      if(true)
        return term;
    }
    return null;
  }
}