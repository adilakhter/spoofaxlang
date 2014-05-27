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

@SuppressWarnings("all") final class lifted10126 extends Strategy 
{ 
  public static final lifted10126 instance = new lifted10126();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27916:
    { 
      IStrategoTerm m_4468 = null;
      IStrategoTerm w_4468 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27916;
      w_4468 = term.getSubterm(0);
      IStrategoTerm arg6592 = term.getSubterm(1);
      m_4468 = arg6592;
      term = aux_$No$Existing$Descriptor_0_2.instance.invoke(context, w_4468, arg6592, m_4468);
      if(term == null)
        break Fail27916;
      if(true)
        return term;
    }
    return null;
  }
}