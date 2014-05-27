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

@SuppressWarnings("all") final class lifted7012 extends Strategy 
{ 
  public static final lifted7012 instance = new lifted7012();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23889:
    { 
      IStrategoTerm f_4851 = null;
      IStrategoTerm q_4851 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23889;
      q_4851 = term.getSubterm(0);
      IStrategoTerm arg8382 = term.getSubterm(1);
      f_4851 = arg8382;
      term = aux_$Warn$Analysis_0_2.instance.invoke(context, q_4851, arg8382, f_4851);
      if(term == null)
        break Fail23889;
      if(true)
        return term;
    }
    return null;
  }
}