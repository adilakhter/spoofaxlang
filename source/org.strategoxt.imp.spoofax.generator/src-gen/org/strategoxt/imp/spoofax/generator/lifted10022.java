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

@SuppressWarnings("all") final class lifted10022 extends Strategy 
{ 
  TermReference w_4418;

  TermReference x_4418;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28020:
    { 
      term = aux_$Source$Path$Name_0_2.instance.invoke(context, term, w_4418.value, x_4418.value);
      if(term == null)
        break Fail28020;
      if(true)
        return term;
    }
    return null;
  }
}