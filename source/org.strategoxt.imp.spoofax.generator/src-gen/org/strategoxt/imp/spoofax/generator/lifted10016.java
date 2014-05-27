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

@SuppressWarnings("all") final class lifted10016 extends Strategy 
{ 
  public static final lifted10016 instance = new lifted10016();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28026:
    { 
      IStrategoTerm t_4416 = null;
      IStrategoTerm c_4417 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28026;
      c_4417 = term.getSubterm(0);
      IStrategoTerm arg6530 = term.getSubterm(1);
      t_4416 = arg6530;
      term = aux_$Source$Path$Name_0_2.instance.invoke(context, c_4417, arg6530, t_4416);
      if(term == null)
        break Fail28026;
      if(true)
        return term;
    }
    return null;
  }
}