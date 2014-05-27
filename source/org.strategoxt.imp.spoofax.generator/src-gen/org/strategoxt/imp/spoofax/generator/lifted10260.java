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

@SuppressWarnings("all") final class lifted10260 extends Strategy 
{ 
  public static final lifted10260 instance = new lifted10260();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27782:
    { 
      IStrategoTerm v_4534 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27782;
      v_4534 = term.getSubterm(0);
      IStrategoTerm arg6661 = term.getSubterm(1);
      term = aux_$Main$Descriptor$Name_0_1.instance.invoke(context, v_4534, arg6661);
      if(term == null)
        break Fail27782;
      if(true)
        return term;
    }
    return null;
  }
}