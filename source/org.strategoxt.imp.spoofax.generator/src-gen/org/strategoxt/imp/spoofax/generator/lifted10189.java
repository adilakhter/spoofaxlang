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

@SuppressWarnings("all") final class lifted10189 extends Strategy 
{ 
  public static final lifted10189 instance = new lifted10189();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27853:
    { 
      IStrategoTerm p_4499 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27853;
      p_4499 = term.getSubterm(0);
      IStrategoTerm arg6625 = term.getSubterm(1);
      term = aux_$Input$File_0_1.instance.invoke(context, p_4499, arg6625);
      if(term == null)
        break Fail27853;
      if(true)
        return term;
    }
    return null;
  }
}