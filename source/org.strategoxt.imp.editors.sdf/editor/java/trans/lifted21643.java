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

@SuppressWarnings("all") final class lifted21643 extends Strategy 
{ 
  public static final lifted21643 instance = new lifted21643();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76336:
    { 
      IStrategoTerm l_92104 = null;
      IStrategoTerm t_92104 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76336;
      t_92104 = term.getSubterm(0);
      IStrategoTerm arg26223 = term.getSubterm(1);
      l_92104 = arg26223;
      term = aux_$Declaration_0_2.instance.invoke(context, t_92104, arg26223, l_92104);
      if(term == null)
        break Fail76336;
      if(true)
        return term;
    }
    return null;
  }
}