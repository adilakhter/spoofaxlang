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

@SuppressWarnings("all") final class lifted6780 extends Strategy 
{ 
  public static final lifted6780 instance = new lifted6780();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22374:
    { 
      IStrategoTerm d_4317 = null;
      IStrategoTerm e_4317 = null;
      IStrategoTerm o_4317 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22374;
      o_4317 = term.getSubterm(0);
      IStrategoTerm arg7940 = term.getSubterm(1);
      d_4317 = arg7940;
      if(arg7940.getTermType() != IStrategoTerm.TUPLE || arg7940.getSubtermCount() != 3)
        break Fail22374;
      e_4317 = arg7940.getSubterm(0);
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, o_4317, e_4317, d_4317);
      if(term == null)
        break Fail22374;
      if(true)
        return term;
    }
    return null;
  }
}