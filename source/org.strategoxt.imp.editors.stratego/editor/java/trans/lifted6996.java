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

@SuppressWarnings("all") final class lifted6996 extends Strategy 
{ 
  public static final lifted6996 instance = new lifted6996();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23905:
    { 
      IStrategoTerm x_4843 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23905;
      x_4843 = term.getSubterm(0);
      IStrategoTerm arg8374 = term.getSubterm(1);
      term = aux_$Source$Dir_0_1.instance.invoke(context, x_4843, arg8374);
      if(term == null)
        break Fail23905;
      if(true)
        return term;
    }
    return null;
  }
}