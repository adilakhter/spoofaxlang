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

@SuppressWarnings("all") final class lifted9271 extends Strategy 
{ 
  TermReference o_4541;

  Strategy n_4541;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28785:
    { 
      term = construct_textual_change_1_1.instance.invoke(context, term, n_4541, o_4541.value);
      if(term == null)
        break Fail28785;
      if(true)
        return term;
    }
    return null;
  }
}