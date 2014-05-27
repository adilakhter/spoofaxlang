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

@SuppressWarnings("all") final class lifted7053 extends Strategy 
{ 
  public static final lifted7053 instance = new lifted7053();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23848:
    { 
      IStrategoTerm v_4871 = null;
      IStrategoTerm w_4871 = null;
      IStrategoTerm f_4872 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23848;
      f_4872 = term.getSubterm(0);
      IStrategoTerm arg8413 = term.getSubterm(1);
      v_4871 = arg8413;
      if(arg8413.getTermType() != IStrategoTerm.TUPLE || arg8413.getSubtermCount() != 3)
        break Fail23848;
      w_4871 = arg8413.getSubterm(0);
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, f_4872, w_4871, v_4871);
      if(term == null)
        break Fail23848;
      if(true)
        return term;
    }
    return null;
  }
}