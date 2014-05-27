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

@SuppressWarnings("all") final class lifted7013 extends Strategy 
{ 
  public static final lifted7013 instance = new lifted7013();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23888:
    { 
      IStrategoTerm t_4851 = null;
      IStrategoTerm e_4852 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23888;
      e_4852 = term.getSubterm(0);
      IStrategoTerm arg8383 = term.getSubterm(1);
      t_4851 = arg8383;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, e_4852, arg8383, t_4851);
      if(term == null)
        break Fail23888;
      if(true)
        return term;
    }
    return null;
  }
}