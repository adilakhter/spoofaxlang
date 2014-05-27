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

@SuppressWarnings("all") final class lifted7041 extends Strategy 
{ 
  public static final lifted7041 instance = new lifted7041();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23860:
    { 
      IStrategoTerm y_4865 = null;
      IStrategoTerm g_4866 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23860;
      g_4866 = term.getSubterm(0);
      IStrategoTerm arg8397 = term.getSubterm(1);
      y_4865 = arg8397;
      term = aux_$Declaration_0_2.instance.invoke(context, g_4866, arg8397, y_4865);
      if(term == null)
        break Fail23860;
      if(true)
        return term;
    }
    return null;
  }
}