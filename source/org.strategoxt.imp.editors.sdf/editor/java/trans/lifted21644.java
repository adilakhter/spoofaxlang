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

@SuppressWarnings("all") final class lifted21644 extends Strategy 
{ 
  public static final lifted21644 instance = new lifted21644();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76335:
    { 
      IStrategoTerm w_92104 = null;
      IStrategoTerm e_92105 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76335;
      e_92105 = term.getSubterm(0);
      IStrategoTerm arg26224 = term.getSubterm(1);
      w_92104 = arg26224;
      term = aux_$Declaration_0_2.instance.invoke(context, e_92105, arg26224, w_92104);
      if(term == null)
        break Fail76335;
      if(true)
        return term;
    }
    return null;
  }
}