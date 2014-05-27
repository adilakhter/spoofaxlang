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

@SuppressWarnings("all") final class lifted6968 extends Strategy 
{ 
  public static final lifted6968 instance = new lifted6968();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23933:
    { 
      IStrategoTerm v_4830 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23933;
      v_4830 = term.getSubterm(0);
      IStrategoTerm arg8358 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, v_4830, arg8358);
      if(term == null)
        break Fail23933;
      if(true)
        return term;
    }
    return null;
  }
}