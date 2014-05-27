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

@SuppressWarnings("all") final class lifted6705 extends Strategy 
{ 
  public static final lifted6705 instance = new lifted6705();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22449:
    { 
      IStrategoTerm y_4280 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22449;
      y_4280 = term.getSubterm(0);
      IStrategoTerm arg7895 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, y_4280, arg7895);
      if(term == null)
        break Fail22449;
      if(true)
        return term;
    }
    return null;
  }
}