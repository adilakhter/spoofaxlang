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

@SuppressWarnings("all") final class lifted6969 extends Strategy 
{ 
  public static final lifted6969 instance = new lifted6969();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23932:
    { 
      IStrategoTerm g_4831 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23932;
      g_4831 = term.getSubterm(0);
      IStrategoTerm arg8359 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, g_4831, arg8359);
      if(term == null)
        break Fail23932;
      if(true)
        return term;
    }
    return null;
  }
}