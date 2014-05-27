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

@SuppressWarnings("all") final class lifted7055 extends Strategy 
{ 
  public static final lifted7055 instance = new lifted7055();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23846:
    { 
      IStrategoTerm t_4872 = null;
      IStrategoTerm u_4872 = null;
      IStrategoTerm d_4873 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23846;
      d_4873 = term.getSubterm(0);
      IStrategoTerm arg8419 = term.getSubterm(1);
      t_4872 = arg8419;
      if(arg8419.getTermType() != IStrategoTerm.TUPLE || arg8419.getSubtermCount() != 3)
        break Fail23846;
      u_4872 = arg8419.getSubterm(0);
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, d_4873, u_4872, t_4872);
      if(term == null)
        break Fail23846;
      if(true)
        return term;
    }
    return null;
  }
}