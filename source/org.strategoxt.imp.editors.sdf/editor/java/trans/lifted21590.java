package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21590 extends Strategy 
{ 
  public static final lifted21590 instance = new lifted21590();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76389:
    { 
      IStrategoTerm j_92079 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76389;
      j_92079 = term.getSubterm(0);
      IStrategoTerm arg26195 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, j_92079, arg26195);
      if(term == null)
        break Fail76389;
      if(true)
        return term;
    }
    return null;
  }
}