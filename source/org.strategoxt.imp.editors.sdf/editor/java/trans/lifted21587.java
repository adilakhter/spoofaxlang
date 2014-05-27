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

@SuppressWarnings("all") final class lifted21587 extends Strategy 
{ 
  public static final lifted21587 instance = new lifted21587();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76392:
    { 
      IStrategoTerm b_92078 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76392;
      b_92078 = term.getSubterm(0);
      IStrategoTerm arg26192 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, b_92078, arg26192);
      if(term == null)
        break Fail76392;
      if(true)
        return term;
    }
    return null;
  }
}