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

@SuppressWarnings("all") final class lifted10098 extends Strategy 
{ 
  public static final lifted10098 instance = new lifted10098();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27944:
    { 
      IStrategoTerm i_4455 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27944;
      i_4455 = term.getSubterm(0);
      IStrategoTerm arg6576 = term.getSubterm(1);
      term = aux_$Editor$Extensions_0_1.instance.invoke(context, i_4455, arg6576);
      if(term == null)
        break Fail27944;
      if(true)
        return term;
    }
    return null;
  }
}