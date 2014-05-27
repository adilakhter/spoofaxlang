package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6976 extends Strategy 
{ 
  public static final lifted6976 instance = new lifted6976();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23925:
    { 
      IStrategoTerm q_4834 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23925;
      q_4834 = term.getSubterm(0);
      IStrategoTerm arg8362 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, q_4834, arg8362);
      if(term == null)
        break Fail23925;
      if(true)
        return term;
    }
    return null;
  }
}