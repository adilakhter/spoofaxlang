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

@SuppressWarnings("all") final class lifted10224 extends Strategy 
{ 
  public static final lifted10224 instance = new lifted10224();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27818:
    { 
      IStrategoTerm c_4516 = null;
      IStrategoTerm m_4516 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27818;
      m_4516 = term.getSubterm(0);
      IStrategoTerm arg6644 = term.getSubterm(1);
      c_4516 = arg6644;
      term = aux_$New$Project_0_2.instance.invoke(context, m_4516, arg6644, c_4516);
      if(term == null)
        break Fail27818;
      if(true)
        return term;
    }
    return null;
  }
}