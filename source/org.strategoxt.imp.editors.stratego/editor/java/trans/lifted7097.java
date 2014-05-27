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

@SuppressWarnings("all") final class lifted7097 extends Strategy 
{ 
  public static final lifted7097 instance = new lifted7097();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23804:
    { 
      IStrategoTerm l_4892 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23804;
      l_4892 = term.getSubterm(0);
      IStrategoTerm arg8456 = term.getSubterm(1);
      term = aux_$Content$Proposals_0_1.instance.invoke(context, l_4892, arg8456);
      if(term == null)
        break Fail23804;
      if(true)
        return term;
    }
    return null;
  }
}