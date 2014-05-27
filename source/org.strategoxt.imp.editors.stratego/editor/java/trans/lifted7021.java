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

@SuppressWarnings("all") final class lifted7021 extends Strategy 
{ 
  public static final lifted7021 instance = new lifted7021();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23880:
    { 
      IStrategoTerm z_4855 = null;
      IStrategoTerm k_4856 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23880;
      k_4856 = term.getSubterm(0);
      IStrategoTerm arg8386 = term.getSubterm(1);
      z_4855 = arg8386;
      term = aux_$No$Analysis_0_2.instance.invoke(context, k_4856, arg8386, z_4855);
      if(term == null)
        break Fail23880;
      if(true)
        return term;
    }
    return null;
  }
}