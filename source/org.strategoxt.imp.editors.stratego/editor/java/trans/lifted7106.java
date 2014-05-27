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

@SuppressWarnings("all") final class lifted7106 extends Strategy 
{ 
  public static final lifted7106 instance = new lifted7106();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23795:
    { 
      IStrategoTerm k_4896 = null;
      IStrategoTerm s_4896 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23795;
      s_4896 = term.getSubterm(0);
      IStrategoTerm arg8461 = term.getSubterm(1);
      k_4896 = arg8461;
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, s_4896, arg8461, k_4896);
      if(term == null)
        break Fail23795;
      if(true)
        return term;
    }
    return null;
  }
}