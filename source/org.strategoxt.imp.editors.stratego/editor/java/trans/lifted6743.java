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

@SuppressWarnings("all") final class lifted6743 extends Strategy 
{ 
  public static final lifted6743 instance = new lifted6743();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22411:
    { 
      IStrategoTerm p_4298 = null;
      IStrategoTerm z_4298 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22411;
      z_4298 = term.getSubterm(0);
      IStrategoTerm arg7917 = term.getSubterm(1);
      p_4298 = arg7917;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, z_4298, arg7917, p_4298);
      if(term == null)
        break Fail22411;
      if(true)
        return term;
    }
    return null;
  }
}