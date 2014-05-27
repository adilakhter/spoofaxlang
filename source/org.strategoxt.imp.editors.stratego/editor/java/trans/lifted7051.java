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

@SuppressWarnings("all") final class lifted7051 extends Strategy 
{ 
  public static final lifted7051 instance = new lifted7051();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23850:
    { 
      IStrategoTerm v_4870 = null;
      IStrategoTerm w_4870 = null;
      IStrategoTerm g_4871 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23850;
      g_4871 = term.getSubterm(0);
      IStrategoTerm arg8407 = term.getSubterm(1);
      v_4870 = arg8407;
      if(arg8407.getTermType() != IStrategoTerm.TUPLE || arg8407.getSubtermCount() != 3)
        break Fail23850;
      w_4870 = arg8407.getSubterm(0);
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, g_4871, w_4870, v_4870);
      if(term == null)
        break Fail23850;
      if(true)
        return term;
    }
    return null;
  }
}