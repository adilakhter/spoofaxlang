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

@SuppressWarnings("all") final class lifted10028 extends Strategy 
{ 
  TermReference c_4422;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28014:
    { 
      term = aux_$Pack$S$D$F$Table_0_1.instance.invoke(context, term, c_4422.value);
      if(term == null)
        break Fail28014;
      if(true)
        return term;
    }
    return null;
  }
}