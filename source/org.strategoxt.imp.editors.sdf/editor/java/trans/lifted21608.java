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

@SuppressWarnings("all") final class lifted21608 extends Strategy 
{ 
  public static final lifted21608 instance = new lifted21608();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76371:
    { 
      IStrategoTerm t_92087 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76371;
      t_92087 = term.getSubterm(0);
      IStrategoTerm arg26205 = term.getSubterm(1);
      term = aux_$Project$Dir_0_1.instance.invoke(context, t_92087, arg26205);
      if(term == null)
        break Fail76371;
      if(true)
        return term;
    }
    return null;
  }
}