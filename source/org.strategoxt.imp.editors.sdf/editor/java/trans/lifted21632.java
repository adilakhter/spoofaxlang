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

@SuppressWarnings("all") final class lifted21632 extends Strategy 
{ 
  public static final lifted21632 instance = new lifted21632();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76347:
    { 
      IStrategoTerm k_92099 = null;
      IStrategoTerm t_92099 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76347;
      t_92099 = term.getSubterm(0);
      IStrategoTerm arg26216 = term.getSubterm(1);
      k_92099 = arg26216;
      term = aux_$Declaration$File_0_2.instance.invoke(context, t_92099, arg26216, k_92099);
      if(term == null)
        break Fail76347;
      if(true)
        return term;
    }
    return null;
  }
}