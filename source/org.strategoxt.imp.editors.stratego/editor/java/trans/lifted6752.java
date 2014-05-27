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

@SuppressWarnings("all") final class lifted6752 extends Strategy 
{ 
  public static final lifted6752 instance = new lifted6752();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22402:
    { 
      IStrategoTerm j_4303 = null;
      IStrategoTerm t_4303 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22402;
      t_4303 = term.getSubterm(0);
      IStrategoTerm arg7921 = term.getSubterm(1);
      j_4303 = arg7921;
      term = aux_$No$Analysis_0_2.instance.invoke(context, t_4303, arg7921, j_4303);
      if(term == null)
        break Fail22402;
      if(true)
        return term;
    }
    return null;
  }
}