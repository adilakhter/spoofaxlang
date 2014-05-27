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

@SuppressWarnings("all") final class lifted6988 extends Strategy 
{ 
  public static final lifted6988 instance = new lifted6988();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23913:
    { 
      IStrategoTerm x_4839 = null;
      IStrategoTerm f_4840 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23913;
      f_4840 = term.getSubterm(0);
      IStrategoTerm arg8370 = term.getSubterm(1);
      x_4839 = arg8370;
      term = aux_$Is$Imported_0_2.instance.invoke(context, f_4840, arg8370, x_4839);
      if(term == null)
        break Fail23913;
      if(true)
        return term;
    }
    return null;
  }
}