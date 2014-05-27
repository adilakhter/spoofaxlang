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

@SuppressWarnings("all") final class lifted7068 extends Strategy 
{ 
  public static final lifted7068 instance = new lifted7068();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23833:
    { 
      IStrategoTerm v_4878 = null;
      IStrategoTerm d_4879 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23833;
      d_4879 = term.getSubterm(0);
      IStrategoTerm arg8438 = term.getSubterm(1);
      v_4878 = arg8438;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, d_4879, arg8438, v_4878);
      if(term == null)
        break Fail23833;
      if(true)
        return term;
    }
    return null;
  }
}