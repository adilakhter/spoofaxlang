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

@SuppressWarnings("all") final class lifted6795 extends Strategy 
{ 
  public static final lifted6795 instance = new lifted6795();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22359:
    { 
      IStrategoTerm f_4324 = null;
      IStrategoTerm o_4324 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22359;
      o_4324 = term.getSubterm(0);
      IStrategoTerm arg7969 = term.getSubterm(1);
      f_4324 = arg7969;
      term = aux_$Is$Imported$Failed_0_2.instance.invoke(context, o_4324, arg7969, f_4324);
      if(term == null)
        break Fail22359;
      if(true)
        return term;
    }
    return null;
  }
}