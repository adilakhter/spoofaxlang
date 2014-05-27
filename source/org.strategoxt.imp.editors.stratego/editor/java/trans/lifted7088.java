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

@SuppressWarnings("all") final class lifted7088 extends Strategy 
{ 
  public static final lifted7088 instance = new lifted7088();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23813:
    { 
      IStrategoTerm a_4888 = null;
      IStrategoTerm i_4888 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23813;
      i_4888 = term.getSubterm(0);
      IStrategoTerm arg8451 = term.getSubterm(1);
      a_4888 = arg8451;
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, i_4888, arg8451, a_4888);
      if(term == null)
        break Fail23813;
      if(true)
        return term;
    }
    return null;
  }
}