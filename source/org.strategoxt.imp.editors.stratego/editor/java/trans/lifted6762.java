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

@SuppressWarnings("all") final class lifted6762 extends Strategy 
{ 
  public static final lifted6762 instance = new lifted6762();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22392:
    { 
      IStrategoTerm s_4308 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22392;
      s_4308 = term.getSubterm(0);
      IStrategoTerm arg7926 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, s_4308, arg7926);
      if(term == null)
        break Fail22392;
      if(true)
        return term;
    }
    return null;
  }
}