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

@SuppressWarnings("all") final class lifted6726 extends Strategy 
{ 
  public static final lifted6726 instance = new lifted6726();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22428:
    { 
      IStrategoTerm q_4290 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22428;
      q_4290 = term.getSubterm(0);
      IStrategoTerm arg7908 = term.getSubterm(1);
      term = aux_$Source$Dir_0_1.instance.invoke(context, q_4290, arg7908);
      if(term == null)
        break Fail22428;
      if(true)
        return term;
    }
    return null;
  }
}