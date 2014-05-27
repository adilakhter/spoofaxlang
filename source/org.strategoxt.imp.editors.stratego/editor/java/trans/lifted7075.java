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

@SuppressWarnings("all") final class lifted7075 extends Strategy 
{ 
  public static final lifted7075 instance = new lifted7075();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23826:
    { 
      IStrategoTerm a_4882 = null;
      IStrategoTerm j_4882 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23826;
      j_4882 = term.getSubterm(0);
      IStrategoTerm arg8441 = term.getSubterm(1);
      a_4882 = arg8441;
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, j_4882, arg8441, a_4882);
      if(term == null)
        break Fail23826;
      if(true)
        return term;
    }
    return null;
  }
}