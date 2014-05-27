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

@SuppressWarnings("all") final class lifted7049 extends Strategy 
{ 
  public static final lifted7049 instance = new lifted7049();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23852:
    { 
      IStrategoTerm v_4869 = null;
      IStrategoTerm w_4869 = null;
      IStrategoTerm g_4870 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23852;
      g_4870 = term.getSubterm(0);
      IStrategoTerm arg8401 = term.getSubterm(1);
      v_4869 = arg8401;
      if(arg8401.getTermType() != IStrategoTerm.TUPLE || arg8401.getSubtermCount() != 3)
        break Fail23852;
      w_4869 = arg8401.getSubterm(0);
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, g_4870, w_4869, v_4869);
      if(term == null)
        break Fail23852;
      if(true)
        return term;
    }
    return null;
  }
}