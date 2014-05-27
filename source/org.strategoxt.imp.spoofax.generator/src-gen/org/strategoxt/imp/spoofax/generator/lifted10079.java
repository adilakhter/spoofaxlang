package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted10079 extends Strategy 
{ 
  public static final lifted10079 instance = new lifted10079();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27963:
    { 
      IStrategoTerm e_4446 = null;
      IStrategoTerm n_4446 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27963;
      n_4446 = term.getSubterm(0);
      IStrategoTerm arg6565 = term.getSubterm(1);
      e_4446 = arg6565;
      term = aux_$Is$Reserved$Class$Name_0_2.instance.invoke(context, n_4446, arg6565, e_4446);
      if(term == null)
        break Fail27963;
      if(true)
        return term;
    }
    return null;
  }
}