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

@SuppressWarnings("all") final class lifted10258 extends Strategy 
{ 
  public static final lifted10258 instance = new lifted10258();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27784:
    { 
      IStrategoTerm y_4533 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27784;
      y_4533 = term.getSubterm(0);
      IStrategoTerm arg6659 = term.getSubterm(1);
      term = aux_$Main$Descriptor$Name_0_1.instance.invoke(context, y_4533, arg6659);
      if(term == null)
        break Fail27784;
      if(true)
        return term;
    }
    return null;
  }
}