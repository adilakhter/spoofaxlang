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

@SuppressWarnings("all") final class lifted7087 extends Strategy 
{ 
  public static final lifted7087 instance = new lifted7087();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23814:
    { 
      IStrategoTerm p_4887 = null;
      IStrategoTerm x_4887 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23814;
      x_4887 = term.getSubterm(0);
      IStrategoTerm arg8450 = term.getSubterm(1);
      p_4887 = arg8450;
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, x_4887, arg8450, p_4887);
      if(term == null)
        break Fail23814;
      if(true)
        return term;
    }
    return null;
  }
}