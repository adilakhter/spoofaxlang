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

@SuppressWarnings("all") final class lifted7048 extends Strategy 
{ 
  public static final lifted7048 instance = new lifted7048();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23853:
    { 
      IStrategoTerm j_4870 = null;
      IStrategoTerm s_4870 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23853;
      s_4870 = term.getSubterm(0);
      IStrategoTerm arg8400 = term.getSubterm(1);
      j_4870 = arg8400;
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, s_4870, arg8400, j_4870);
      if(term == null)
        break Fail23853;
      if(true)
        return term;
    }
    return null;
  }
}