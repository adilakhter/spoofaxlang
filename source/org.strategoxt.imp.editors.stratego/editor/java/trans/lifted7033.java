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

@SuppressWarnings("all") final class lifted7033 extends Strategy 
{ 
  public static final lifted7033 instance = new lifted7033();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23868:
    { 
      IStrategoTerm k_4862 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23868;
      k_4862 = term.getSubterm(0);
      IStrategoTerm arg8393 = term.getSubterm(1);
      term = aux_$Current$Dir_0_1.instance.invoke(context, k_4862, arg8393);
      if(term == null)
        break Fail23868;
      if(true)
        return term;
    }
    return null;
  }
}