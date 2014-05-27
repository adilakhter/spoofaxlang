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

@SuppressWarnings("all") final class lifted6742 extends Strategy 
{ 
  public static final lifted6742 instance = new lifted6742();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22412:
    { 
      IStrategoTerm b_4298 = null;
      IStrategoTerm m_4298 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22412;
      m_4298 = term.getSubterm(0);
      IStrategoTerm arg7916 = term.getSubterm(1);
      b_4298 = arg7916;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, m_4298, arg7916, b_4298);
      if(term == null)
        break Fail22412;
      if(true)
        return term;
    }
    return null;
  }
}