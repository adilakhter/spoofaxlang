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

@SuppressWarnings("all") final class lifted6723 extends Strategy 
{ 
  public static final lifted6723 instance = new lifted6723();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22431:
    { 
      IStrategoTerm i_4289 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22431;
      i_4289 = term.getSubterm(0);
      IStrategoTerm arg7905 = term.getSubterm(1);
      term = aux_$Source$Dir_0_1.instance.invoke(context, i_4289, arg7905);
      if(term == null)
        break Fail22431;
      if(true)
        return term;
    }
    return null;
  }
}