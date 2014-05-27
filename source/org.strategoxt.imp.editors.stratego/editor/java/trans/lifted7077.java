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

@SuppressWarnings("all") final class lifted7077 extends Strategy 
{ 
  public static final lifted7077 instance = new lifted7077();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23824:
    { 
      IStrategoTerm y_4882 = null;
      IStrategoTerm g_4883 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23824;
      g_4883 = term.getSubterm(0);
      IStrategoTerm arg8443 = term.getSubterm(1);
      y_4882 = arg8443;
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, g_4883, arg8443, y_4882);
      if(term == null)
        break Fail23824;
      if(true)
        return term;
    }
    return null;
  }
}