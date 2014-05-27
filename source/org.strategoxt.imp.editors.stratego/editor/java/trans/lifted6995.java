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

@SuppressWarnings("all") final class lifted6995 extends Strategy 
{ 
  public static final lifted6995 instance = new lifted6995();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23906:
    { 
      IStrategoTerm m_4843 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23906;
      m_4843 = term.getSubterm(0);
      IStrategoTerm arg8373 = term.getSubterm(1);
      term = aux_$Source$Dir_0_1.instance.invoke(context, m_4843, arg8373);
      if(term == null)
        break Fail23906;
      if(true)
        return term;
    }
    return null;
  }
}