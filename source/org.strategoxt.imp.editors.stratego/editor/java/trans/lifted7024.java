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

@SuppressWarnings("all") final class lifted7024 extends Strategy 
{ 
  public static final lifted7024 instance = new lifted7024();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23877:
    { 
      IStrategoTerm o_4857 = null;
      IStrategoTerm y_4857 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23877;
      y_4857 = term.getSubterm(0);
      IStrategoTerm arg8389 = term.getSubterm(1);
      o_4857 = arg8389;
      term = aux_$No$Analysis_0_2.instance.invoke(context, y_4857, arg8389, o_4857);
      if(term == null)
        break Fail23877;
      if(true)
        return term;
    }
    return null;
  }
}