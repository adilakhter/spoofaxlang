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

@SuppressWarnings("all") final class lifted6987 extends Strategy 
{ 
  public static final lifted6987 instance = new lifted6987();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23914:
    { 
      IStrategoTerm m_4839 = null;
      IStrategoTerm u_4839 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23914;
      u_4839 = term.getSubterm(0);
      IStrategoTerm arg8369 = term.getSubterm(1);
      m_4839 = arg8369;
      term = aux_$Is$Imported_0_2.instance.invoke(context, u_4839, arg8369, m_4839);
      if(term == null)
        break Fail23914;
      if(true)
        return term;
    }
    return null;
  }
}