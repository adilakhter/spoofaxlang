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

@SuppressWarnings("all") final class lifted10034 extends Strategy 
{ 
  public static final lifted10034 instance = new lifted10034();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28008:
    { 
      IStrategoTerm d_4425 = null;
      IStrategoTerm m_4425 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28008;
      m_4425 = term.getSubterm(0);
      IStrategoTerm arg6540 = term.getSubterm(1);
      d_4425 = arg6540;
      term = aux_$Imported$From_0_2.instance.invoke(context, m_4425, arg6540, d_4425);
      if(term == null)
        break Fail28008;
      if(true)
        return term;
    }
    return null;
  }
}