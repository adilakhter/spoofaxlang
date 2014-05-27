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

@SuppressWarnings("all") final class lifted7078 extends Strategy 
{ 
  public static final lifted7078 instance = new lifted7078();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23823:
    { 
      IStrategoTerm j_4883 = null;
      IStrategoTerm r_4883 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23823;
      r_4883 = term.getSubterm(0);
      IStrategoTerm arg8444 = term.getSubterm(1);
      j_4883 = arg8444;
      term = aux_$Memoize$Include$Properties_0_2.instance.invoke(context, r_4883, arg8444, j_4883);
      if(term == null)
        break Fail23823;
      if(true)
        return term;
    }
    return null;
  }
}