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

@SuppressWarnings("all") final class lifted10251 extends Strategy 
{ 
  public static final lifted10251 instance = new lifted10251();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27791:
    { 
      IStrategoTerm o_4530 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27791;
      o_4530 = term.getSubterm(0);
      IStrategoTerm arg6656 = term.getSubterm(1);
      term = aux_$Descriptor$Name$Prefix_0_1.instance.invoke(context, o_4530, arg6656);
      if(term == null)
        break Fail27791;
      if(true)
        return term;
    }
    return null;
  }
}