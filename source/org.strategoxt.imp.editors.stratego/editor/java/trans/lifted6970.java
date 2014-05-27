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

@SuppressWarnings("all") final class lifted6970 extends Strategy 
{ 
  public static final lifted6970 instance = new lifted6970();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23931:
    { 
      IStrategoTerm r_4831 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23931;
      r_4831 = term.getSubterm(0);
      IStrategoTerm arg8360 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, r_4831, arg8360);
      if(term == null)
        break Fail23931;
      if(true)
        return term;
    }
    return null;
  }
}