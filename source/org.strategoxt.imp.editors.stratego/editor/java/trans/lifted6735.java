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

@SuppressWarnings("all") final class lifted6735 extends Strategy 
{ 
  public static final lifted6735 instance = new lifted6735();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22419:
    { 
      IStrategoTerm x_4294 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22419;
      x_4294 = term.getSubterm(0);
      IStrategoTerm arg7913 = term.getSubterm(1);
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, x_4294, arg7913);
      if(term == null)
        break Fail22419;
      if(true)
        return term;
    }
    return null;
  }
}