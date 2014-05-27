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

@SuppressWarnings("all") final class lifted6724 extends Strategy 
{ 
  public static final lifted6724 instance = new lifted6724();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22430:
    { 
      IStrategoTerm u_4289 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22430;
      u_4289 = term.getSubterm(0);
      IStrategoTerm arg7906 = term.getSubterm(1);
      term = aux_$Source$Dir_0_1.instance.invoke(context, u_4289, arg7906);
      if(term == null)
        break Fail22430;
      if(true)
        return term;
    }
    return null;
  }
}