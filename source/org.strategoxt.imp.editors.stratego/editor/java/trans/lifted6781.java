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

@SuppressWarnings("all") final class lifted6781 extends Strategy 
{ 
  public static final lifted6781 instance = new lifted6781();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22373:
    { 
      IStrategoTerm q_4318 = null;
      IStrategoTerm y_4318 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22373;
      y_4318 = term.getSubterm(0);
      IStrategoTerm arg7945 = term.getSubterm(1);
      q_4318 = arg7945;
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, y_4318, arg7945, q_4318);
      if(term == null)
        break Fail22373;
      if(true)
        return term;
    }
    return null;
  }
}