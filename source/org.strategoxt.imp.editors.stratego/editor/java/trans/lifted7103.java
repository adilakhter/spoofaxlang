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

@SuppressWarnings("all") final class lifted7103 extends Strategy 
{ 
  public static final lifted7103 instance = new lifted7103();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23798:
    { 
      IStrategoTerm b_4895 = null;
      IStrategoTerm k_4895 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23798;
      k_4895 = term.getSubterm(0);
      IStrategoTerm arg8458 = term.getSubterm(1);
      b_4895 = arg8458;
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, k_4895, arg8458, b_4895);
      if(term == null)
        break Fail23798;
      if(true)
        return term;
    }
    return null;
  }
}