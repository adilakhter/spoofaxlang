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

@SuppressWarnings("all") final class lifted7023 extends Strategy 
{ 
  public static final lifted7023 instance = new lifted7023();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23878:
    { 
      IStrategoTerm b_4857 = null;
      IStrategoTerm l_4857 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23878;
      l_4857 = term.getSubterm(0);
      IStrategoTerm arg8388 = term.getSubterm(1);
      b_4857 = arg8388;
      term = aux_$No$Analysis_0_2.instance.invoke(context, l_4857, arg8388, b_4857);
      if(term == null)
        break Fail23878;
      if(true)
        return term;
    }
    return null;
  }
}