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

@SuppressWarnings("all") final class lifted6707 extends Strategy 
{ 
  public static final lifted6707 instance = new lifted6707();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22447:
    { 
      IStrategoTerm v_4281 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22447;
      v_4281 = term.getSubterm(0);
      IStrategoTerm arg7897 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, v_4281, arg7897);
      if(term == null)
        break Fail22447;
      if(true)
        return term;
    }
    return null;
  }
}