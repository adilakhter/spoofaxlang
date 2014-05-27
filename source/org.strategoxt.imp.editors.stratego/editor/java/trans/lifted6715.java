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

@SuppressWarnings("all") final class lifted6715 extends Strategy 
{ 
  public static final lifted6715 instance = new lifted6715();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22439:
    { 
      IStrategoTerm i_4285 = null;
      IStrategoTerm r_4285 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22439;
      r_4285 = term.getSubterm(0);
      IStrategoTerm arg7901 = term.getSubterm(1);
      i_4285 = arg7901;
      term = aux_$Is$Imported_0_2.instance.invoke(context, r_4285, arg7901, i_4285);
      if(term == null)
        break Fail22439;
      if(true)
        return term;
    }
    return null;
  }
}