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

@SuppressWarnings("all") final class lifted7040 extends Strategy 
{ 
  public static final lifted7040 instance = new lifted7040();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23861:
    { 
      IStrategoTerm m_4865 = null;
      IStrategoTerm v_4865 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23861;
      v_4865 = term.getSubterm(0);
      IStrategoTerm arg8396 = term.getSubterm(1);
      m_4865 = arg8396;
      term = aux_$Declaration_0_2.instance.invoke(context, v_4865, arg8396, m_4865);
      if(term == null)
        break Fail23861;
      if(true)
        return term;
    }
    return null;
  }
}