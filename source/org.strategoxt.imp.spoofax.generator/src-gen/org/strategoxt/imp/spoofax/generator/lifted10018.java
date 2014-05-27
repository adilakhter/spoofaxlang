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

@SuppressWarnings("all") final class lifted10018 extends Strategy 
{ 
  public static final lifted10018 instance = new lifted10018();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28024:
    { 
      IStrategoTerm q_4417 = null;
      IStrategoTerm y_4417 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28024;
      y_4417 = term.getSubterm(0);
      IStrategoTerm arg6532 = term.getSubterm(1);
      q_4417 = arg6532;
      term = aux_$Source$Path$Name_0_2.instance.invoke(context, y_4417, arg6532, q_4417);
      if(term == null)
        break Fail28024;
      if(true)
        return term;
    }
    return null;
  }
}