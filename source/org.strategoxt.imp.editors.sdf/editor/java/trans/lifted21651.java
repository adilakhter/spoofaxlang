package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21651 extends Strategy 
{ 
  public static final lifted21651 instance = new lifted21651();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76328:
    { 
      IStrategoTerm g_92108 = null;
      IStrategoTerm p_92108 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76328;
      p_92108 = term.getSubterm(0);
      IStrategoTerm arg26228 = term.getSubterm(1);
      g_92108 = arg26228;
      term = aux_$Usage_0_2.instance.invoke(context, p_92108, arg26228, g_92108);
      if(term == null)
        break Fail76328;
      if(true)
        return term;
    }
    return null;
  }
}