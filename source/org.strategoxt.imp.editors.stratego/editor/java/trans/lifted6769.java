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

@SuppressWarnings("all") final class lifted6769 extends Strategy 
{ 
  public static final lifted6769 instance = new lifted6769();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22385:
    { 
      IStrategoTerm u_4311 = null;
      IStrategoTerm d_4312 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22385;
      d_4312 = term.getSubterm(0);
      IStrategoTerm arg7929 = term.getSubterm(1);
      u_4311 = arg7929;
      term = aux_$Declaration_0_2.instance.invoke(context, d_4312, arg7929, u_4311);
      if(term == null)
        break Fail22385;
      if(true)
        return term;
    }
    return null;
  }
}