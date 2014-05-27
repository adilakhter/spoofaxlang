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

@SuppressWarnings("all") final class lifted21642 extends Strategy 
{ 
  public static final lifted21642 instance = new lifted21642();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76337:
    { 
      IStrategoTerm z_92103 = null;
      IStrategoTerm i_92104 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76337;
      i_92104 = term.getSubterm(0);
      IStrategoTerm arg26222 = term.getSubterm(1);
      z_92103 = arg26222;
      term = aux_$Declaration_0_2.instance.invoke(context, i_92104, arg26222, z_92103);
      if(term == null)
        break Fail76337;
      if(true)
        return term;
    }
    return null;
  }
}