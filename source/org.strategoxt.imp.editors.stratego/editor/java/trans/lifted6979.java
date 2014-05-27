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

@SuppressWarnings("all") final class lifted6979 extends Strategy 
{ 
  public static final lifted6979 instance = new lifted6979();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23922:
    { 
      IStrategoTerm y_4835 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23922;
      y_4835 = term.getSubterm(0);
      IStrategoTerm arg8365 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, y_4835, arg8365);
      if(term == null)
        break Fail23922;
      if(true)
        return term;
    }
    return null;
  }
}