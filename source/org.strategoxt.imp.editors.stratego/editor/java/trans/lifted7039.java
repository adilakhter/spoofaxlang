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

@SuppressWarnings("all") final class lifted7039 extends Strategy 
{ 
  public static final lifted7039 instance = new lifted7039();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23862:
    { 
      IStrategoTerm a_4865 = null;
      IStrategoTerm j_4865 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23862;
      j_4865 = term.getSubterm(0);
      IStrategoTerm arg8395 = term.getSubterm(1);
      a_4865 = arg8395;
      term = aux_$Declaration_0_2.instance.invoke(context, j_4865, arg8395, a_4865);
      if(term == null)
        break Fail23862;
      if(true)
        return term;
    }
    return null;
  }
}