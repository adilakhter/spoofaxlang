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

@SuppressWarnings("all") final class lifted7095 extends Strategy 
{ 
  public static final lifted7095 instance = new lifted7095();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23806:
    { 
      IStrategoTerm p_4891 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23806;
      p_4891 = term.getSubterm(0);
      IStrategoTerm arg8454 = term.getSubterm(1);
      term = aux_$Content$Proposals_0_1.instance.invoke(context, p_4891, arg8454);
      if(term == null)
        break Fail23806;
      if(true)
        return term;
    }
    return null;
  }
}