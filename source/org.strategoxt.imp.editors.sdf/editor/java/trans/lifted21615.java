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

@SuppressWarnings("all") final class lifted21615 extends Strategy 
{ 
  public static final lifted21615 instance = new lifted21615();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76364:
    { 
      IStrategoTerm e_92091 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76364;
      e_92091 = term.getSubterm(0);
      IStrategoTerm arg26208 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, e_92091, arg26208);
      if(term == null)
        break Fail76364;
      if(true)
        return term;
    }
    return null;
  }
}