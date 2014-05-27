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

@SuppressWarnings("all") final class lifted10021 extends Strategy 
{ 
  TermReference p_4418;

  TermReference q_4418;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28021:
    { 
      term = aux_$Source$Path$Name_0_2.instance.invoke(context, term, p_4418.value, q_4418.value);
      if(term == null)
        break Fail28021;
      if(true)
        return term;
    }
    return null;
  }
}