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

@SuppressWarnings("all") final class lifted6985 extends Strategy 
{ 
  public static final lifted6985 instance = new lifted6985();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23916:
    { 
      IStrategoTerm o_4838 = null;
      IStrategoTerm x_4838 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23916;
      x_4838 = term.getSubterm(0);
      IStrategoTerm arg8367 = term.getSubterm(1);
      o_4838 = arg8367;
      term = aux_$Is$Imported_0_2.instance.invoke(context, x_4838, arg8367, o_4838);
      if(term == null)
        break Fail23916;
      if(true)
        return term;
    }
    return null;
  }
}