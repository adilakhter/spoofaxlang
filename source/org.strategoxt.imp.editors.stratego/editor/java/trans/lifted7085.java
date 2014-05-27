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

@SuppressWarnings("all") final class lifted7085 extends Strategy 
{ 
  public static final lifted7085 instance = new lifted7085();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23816:
    { 
      IStrategoTerm r_4886 = null;
      IStrategoTerm a_4887 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23816;
      a_4887 = term.getSubterm(0);
      IStrategoTerm arg8448 = term.getSubterm(1);
      r_4886 = arg8448;
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, a_4887, arg8448, r_4886);
      if(term == null)
        break Fail23816;
      if(true)
        return term;
    }
    return null;
  }
}