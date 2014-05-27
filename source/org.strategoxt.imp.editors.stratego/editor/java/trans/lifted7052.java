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

@SuppressWarnings("all") final class lifted7052 extends Strategy 
{ 
  public static final lifted7052 instance = new lifted7052();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23849:
    { 
      IStrategoTerm i_4872 = null;
      IStrategoTerm q_4872 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23849;
      q_4872 = term.getSubterm(0);
      IStrategoTerm arg8412 = term.getSubterm(1);
      i_4872 = arg8412;
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, q_4872, arg8412, i_4872);
      if(term == null)
        break Fail23849;
      if(true)
        return term;
    }
    return null;
  }
}