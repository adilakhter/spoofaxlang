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

@SuppressWarnings("all") final class lifted10066 extends Strategy 
{ 
  TermReference q_4439;

  TermReference r_4439;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27976:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, q_4439.value, r_4439.value);
      if(term == null)
        break Fail27976;
      if(true)
        return term;
    }
    return null;
  }
}