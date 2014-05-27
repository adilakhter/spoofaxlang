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

@SuppressWarnings("all") final class lifted7054 extends Strategy 
{ 
  public static final lifted7054 instance = new lifted7054();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23847:
    { 
      IStrategoTerm g_4873 = null;
      IStrategoTerm o_4873 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23847;
      o_4873 = term.getSubterm(0);
      IStrategoTerm arg8418 = term.getSubterm(1);
      g_4873 = arg8418;
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, o_4873, arg8418, g_4873);
      if(term == null)
        break Fail23847;
      if(true)
        return term;
    }
    return null;
  }
}