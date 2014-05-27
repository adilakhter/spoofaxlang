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

@SuppressWarnings("all") final class lifted21598 extends Strategy 
{ 
  public static final lifted21598 instance = new lifted21598();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76381:
    { 
      IStrategoTerm x_92082 = null;
      IStrategoTerm f_92083 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76381;
      f_92083 = term.getSubterm(0);
      IStrategoTerm arg26199 = term.getSubterm(1);
      x_92082 = arg26199;
      term = aux_$Is$Imported_0_2.instance.invoke(context, f_92083, arg26199, x_92082);
      if(term == null)
        break Fail76381;
      if(true)
        return term;
    }
    return null;
  }
}