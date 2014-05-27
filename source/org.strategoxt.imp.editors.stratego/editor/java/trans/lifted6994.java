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

@SuppressWarnings("all") final class lifted6994 extends Strategy 
{ 
  public static final lifted6994 instance = new lifted6994();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23907:
    { 
      IStrategoTerm a_4843 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23907;
      a_4843 = term.getSubterm(0);
      IStrategoTerm arg8372 = term.getSubterm(1);
      term = aux_$Source$Dir_0_1.instance.invoke(context, a_4843, arg8372);
      if(term == null)
        break Fail23907;
      if(true)
        return term;
    }
    return null;
  }
}