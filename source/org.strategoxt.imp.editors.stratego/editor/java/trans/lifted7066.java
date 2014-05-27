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

@SuppressWarnings("all") final class lifted7066 extends Strategy 
{ 
  public static final lifted7066 instance = new lifted7066();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23835:
    { 
      IStrategoTerm x_4877 = null;
      IStrategoTerm g_4878 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23835;
      g_4878 = term.getSubterm(0);
      IStrategoTerm arg8436 = term.getSubterm(1);
      x_4877 = arg8436;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, g_4878, arg8436, x_4877);
      if(term == null)
        break Fail23835;
      if(true)
        return term;
    }
    return null;
  }
}