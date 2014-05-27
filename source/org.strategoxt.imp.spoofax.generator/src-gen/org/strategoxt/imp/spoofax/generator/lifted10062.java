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

@SuppressWarnings("all") final class lifted10062 extends Strategy 
{ 
  public static final lifted10062 instance = new lifted10062();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27980:
    { 
      IStrategoTerm g_4438 = null;
      IStrategoTerm o_4438 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27980;
      o_4438 = term.getSubterm(0);
      IStrategoTerm arg6556 = term.getSubterm(1);
      g_4438 = arg6556;
      term = aux_$Is$Imported_0_2.instance.invoke(context, o_4438, arg6556, g_4438);
      if(term == null)
        break Fail27980;
      if(true)
        return term;
    }
    return null;
  }
}