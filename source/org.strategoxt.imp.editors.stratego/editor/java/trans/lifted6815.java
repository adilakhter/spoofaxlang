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

@SuppressWarnings("all") final class lifted6815 extends Strategy 
{ 
  public static final lifted6815 instance = new lifted6815();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22339:
    { 
      IStrategoTerm l_4333 = null;
      IStrategoTerm u_4333 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22339;
      u_4333 = term.getSubterm(0);
      IStrategoTerm arg7982 = term.getSubterm(1);
      l_4333 = arg7982;
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, u_4333, arg7982, l_4333);
      if(term == null)
        break Fail22339;
      if(true)
        return term;
    }
    return null;
  }
}