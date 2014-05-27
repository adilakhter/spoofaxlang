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

@SuppressWarnings("all") final class lifted10185 extends Strategy 
{ 
  TermReference q_4496;

  TermReference r_4496;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27857:
    { 
      term = aux_$Production$Visited_0_2.instance.invoke(context, term, q_4496.value, r_4496.value);
      if(term == null)
        break Fail27857;
      if(true)
        return term;
    }
    return null;
  }
}