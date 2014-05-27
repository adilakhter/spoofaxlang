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

@SuppressWarnings("all") final class lifted21614 extends Strategy 
{ 
  public static final lifted21614 instance = new lifted21614();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76365:
    { 
      IStrategoTerm s_92090 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76365;
      s_92090 = term.getSubterm(0);
      IStrategoTerm arg26207 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, s_92090, arg26207);
      if(term == null)
        break Fail76365;
      if(true)
        return term;
    }
    return null;
  }
}