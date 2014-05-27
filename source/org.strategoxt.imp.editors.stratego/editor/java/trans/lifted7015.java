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

@SuppressWarnings("all") final class lifted7015 extends Strategy 
{ 
  public static final lifted7015 instance = new lifted7015();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23886:
    { 
      IStrategoTerm u_4852 = null;
      IStrategoTerm e_4853 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23886;
      e_4853 = term.getSubterm(0);
      IStrategoTerm arg8385 = term.getSubterm(1);
      u_4852 = arg8385;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, e_4853, arg8385, u_4852);
      if(term == null)
        break Fail23886;
      if(true)
        return term;
    }
    return null;
  }
}