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

@SuppressWarnings("all") final class lifted21633 extends Strategy 
{ 
  public static final lifted21633 instance = new lifted21633();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76346:
    { 
      IStrategoTerm w_92099 = null;
      IStrategoTerm f_92100 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76346;
      f_92100 = term.getSubterm(0);
      IStrategoTerm arg26217 = term.getSubterm(1);
      w_92099 = arg26217;
      term = aux_$Declaration$File_0_2.instance.invoke(context, f_92100, arg26217, w_92099);
      if(term == null)
        break Fail76346;
      if(true)
        return term;
    }
    return null;
  }
}