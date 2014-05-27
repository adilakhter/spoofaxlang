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

@SuppressWarnings("all") final class lifted10078 extends Strategy 
{ 
  public static final lifted10078 instance = new lifted10078();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27964:
    { 
      IStrategoTerm s_4445 = null;
      IStrategoTerm b_4446 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27964;
      b_4446 = term.getSubterm(0);
      IStrategoTerm arg6564 = term.getSubterm(1);
      s_4445 = arg6564;
      term = aux_$Is$Reserved$Class$Name_0_2.instance.invoke(context, b_4446, arg6564, s_4445);
      if(term == null)
        break Fail27964;
      if(true)
        return term;
    }
    return null;
  }
}