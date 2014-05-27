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

@SuppressWarnings("all") final class lifted6733 extends Strategy 
{ 
  public static final lifted6733 instance = new lifted6733();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22421:
    { 
      IStrategoTerm b_4294 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22421;
      b_4294 = term.getSubterm(0);
      IStrategoTerm arg7911 = term.getSubterm(1);
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, b_4294, arg7911);
      if(term == null)
        break Fail22421;
      if(true)
        return term;
    }
    return null;
  }
}