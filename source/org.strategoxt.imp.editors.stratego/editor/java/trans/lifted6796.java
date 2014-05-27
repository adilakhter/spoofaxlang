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

@SuppressWarnings("all") final class lifted6796 extends Strategy 
{ 
  public static final lifted6796 instance = new lifted6796();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22358:
    { 
      IStrategoTerm r_4324 = null;
      IStrategoTerm a_4325 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22358;
      a_4325 = term.getSubterm(0);
      IStrategoTerm arg7970 = term.getSubterm(1);
      r_4324 = arg7970;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, a_4325, arg7970, r_4324);
      if(term == null)
        break Fail22358;
      if(true)
        return term;
    }
    return null;
  }
}