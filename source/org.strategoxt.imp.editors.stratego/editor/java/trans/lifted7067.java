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

@SuppressWarnings("all") final class lifted7067 extends Strategy 
{ 
  public static final lifted7067 instance = new lifted7067();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23834:
    { 
      IStrategoTerm j_4878 = null;
      IStrategoTerm s_4878 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23834;
      s_4878 = term.getSubterm(0);
      IStrategoTerm arg8437 = term.getSubterm(1);
      j_4878 = arg8437;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, s_4878, arg8437, j_4878);
      if(term == null)
        break Fail23834;
      if(true)
        return term;
    }
    return null;
  }
}