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

@SuppressWarnings("all") final class lifted10261 extends Strategy 
{ 
  public static final lifted10261 instance = new lifted10261();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27781:
    { 
      IStrategoTerm g_4535 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27781;
      g_4535 = term.getSubterm(0);
      IStrategoTerm arg6662 = term.getSubterm(1);
      term = aux_$Main$Descriptor$Name_0_1.instance.invoke(context, g_4535, arg6662);
      if(term == null)
        break Fail27781;
      if(true)
        return term;
    }
    return null;
  }
}