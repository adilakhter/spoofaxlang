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

@SuppressWarnings("all") final class lifted6977 extends Strategy 
{ 
  public static final lifted6977 instance = new lifted6977();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23924:
    { 
      IStrategoTerm c_4835 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23924;
      c_4835 = term.getSubterm(0);
      IStrategoTerm arg8363 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, c_4835, arg8363);
      if(term == null)
        break Fail23924;
      if(true)
        return term;
    }
    return null;
  }
}