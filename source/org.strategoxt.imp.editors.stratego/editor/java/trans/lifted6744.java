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

@SuppressWarnings("all") final class lifted6744 extends Strategy 
{ 
  public static final lifted6744 instance = new lifted6744();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22410:
    { 
      IStrategoTerm c_4299 = null;
      IStrategoTerm m_4299 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22410;
      m_4299 = term.getSubterm(0);
      IStrategoTerm arg7918 = term.getSubterm(1);
      c_4299 = arg7918;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, m_4299, arg7918, c_4299);
      if(term == null)
        break Fail22410;
      if(true)
        return term;
    }
    return null;
  }
}