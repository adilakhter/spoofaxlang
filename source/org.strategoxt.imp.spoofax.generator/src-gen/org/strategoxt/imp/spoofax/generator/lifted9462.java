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

@SuppressWarnings("all") final class lifted9462 extends Strategy 
{ 
  TermReference e_4327;

  Strategy i_4327;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28614:
    { 
      term = bagof_$Productions_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28614;
      term = list_loop_1_0.instance.invoke(context, term, i_4327);
      if(term == null)
        break Fail28614;
      if(true)
        return term;
    }
    return null;
  }
}