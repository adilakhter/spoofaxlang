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

@SuppressWarnings("all") final class lifted21626 extends Strategy 
{ 
  public static final lifted21626 instance = new lifted21626();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76353:
    { 
      IStrategoTerm f_92096 = null;
      IStrategoTerm p_92096 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76353;
      p_92096 = term.getSubterm(0);
      IStrategoTerm arg26215 = term.getSubterm(1);
      f_92096 = arg26215;
      term = aux_$Is$Import$Failed_0_2.instance.invoke(context, p_92096, arg26215, f_92096);
      if(term == null)
        break Fail76353;
      if(true)
        return term;
    }
    return null;
  }
}