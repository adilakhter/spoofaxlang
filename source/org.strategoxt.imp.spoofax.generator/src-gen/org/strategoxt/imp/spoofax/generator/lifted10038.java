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

@SuppressWarnings("all") final class lifted10038 extends Strategy 
{ 
  TermReference q_4426;

  TermReference r_4426;

  TermReference s_4426;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28004:
    { 
      term = aux_$Imported$From_0_2.instance.invoke(context, term, q_4426.value, r_4426.value);
      if(term == null)
        break Fail28004;
      if(s_4426.value == null)
        s_4426.value = term;
      else
        if(s_4426.value != term && !s_4426.value.match(term))
          break Fail28004;
      if(true)
        return term;
    }
    return null;
  }
}