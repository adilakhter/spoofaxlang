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

@SuppressWarnings("all") final class lifted6779 extends Strategy 
{ 
  public static final lifted6779 instance = new lifted6779();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22375:
    { 
      IStrategoTerm r_4317 = null;
      IStrategoTerm a_4318 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22375;
      a_4318 = term.getSubterm(0);
      IStrategoTerm arg7939 = term.getSubterm(1);
      r_4317 = arg7939;
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, a_4318, arg7939, r_4317);
      if(term == null)
        break Fail22375;
      if(true)
        return term;
    }
    return null;
  }
}