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

@SuppressWarnings("all") final class lifted7022 extends Strategy 
{ 
  public static final lifted7022 instance = new lifted7022();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23879:
    { 
      IStrategoTerm n_4856 = null;
      IStrategoTerm y_4856 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23879;
      y_4856 = term.getSubterm(0);
      IStrategoTerm arg8387 = term.getSubterm(1);
      n_4856 = arg8387;
      term = aux_$No$Analysis_0_2.instance.invoke(context, y_4856, arg8387, n_4856);
      if(term == null)
        break Fail23879;
      if(true)
        return term;
    }
    return null;
  }
}