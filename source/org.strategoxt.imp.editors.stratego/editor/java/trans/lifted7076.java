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

@SuppressWarnings("all") final class lifted7076 extends Strategy 
{ 
  public static final lifted7076 instance = new lifted7076();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23825:
    { 
      IStrategoTerm m_4882 = null;
      IStrategoTerm v_4882 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23825;
      v_4882 = term.getSubterm(0);
      IStrategoTerm arg8442 = term.getSubterm(1);
      m_4882 = arg8442;
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, v_4882, arg8442, m_4882);
      if(term == null)
        break Fail23825;
      if(true)
        return term;
    }
    return null;
  }
}