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

@SuppressWarnings("all") final class lifted21625 extends Strategy 
{ 
  public static final lifted21625 instance = new lifted21625();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76354:
    { 
      IStrategoTerm s_92095 = null;
      IStrategoTerm c_92096 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76354;
      c_92096 = term.getSubterm(0);
      IStrategoTerm arg26214 = term.getSubterm(1);
      s_92095 = arg26214;
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, c_92096, arg26214, s_92095);
      if(term == null)
        break Fail76354;
      if(true)
        return term;
    }
    return null;
  }
}