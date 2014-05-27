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

@SuppressWarnings("all") final class lifted6798 extends Strategy 
{ 
  public static final lifted6798 instance = new lifted6798();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22356:
    { 
      IStrategoTerm o_4325 = null;
      IStrategoTerm w_4325 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22356;
      w_4325 = term.getSubterm(0);
      IStrategoTerm arg7972 = term.getSubterm(1);
      o_4325 = arg7972;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, w_4325, arg7972, o_4325);
      if(term == null)
        break Fail22356;
      if(true)
        return term;
    }
    return null;
  }
}