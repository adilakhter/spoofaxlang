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

@SuppressWarnings("all") final class lifted10123 extends Strategy 
{ 
  public static final lifted10123 instance = new lifted10123();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27919:
    { 
      IStrategoTerm x_4466 = null;
      IStrategoTerm i_4467 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27919;
      i_4467 = term.getSubterm(0);
      IStrategoTerm arg6589 = term.getSubterm(1);
      x_4466 = arg6589;
      term = aux_$No$Existing$Descriptor_0_2.instance.invoke(context, i_4467, arg6589, x_4466);
      if(term == null)
        break Fail27919;
      if(true)
        return term;
    }
    return null;
  }
}