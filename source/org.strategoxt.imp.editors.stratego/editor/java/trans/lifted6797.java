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

@SuppressWarnings("all") final class lifted6797 extends Strategy 
{ 
  public static final lifted6797 instance = new lifted6797();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22357:
    { 
      IStrategoTerm d_4325 = null;
      IStrategoTerm l_4325 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22357;
      l_4325 = term.getSubterm(0);
      IStrategoTerm arg7971 = term.getSubterm(1);
      d_4325 = arg7971;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, l_4325, arg7971, d_4325);
      if(term == null)
        break Fail22357;
      if(true)
        return term;
    }
    return null;
  }
}