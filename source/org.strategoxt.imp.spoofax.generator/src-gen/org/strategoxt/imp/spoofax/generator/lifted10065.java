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

@SuppressWarnings("all") final class lifted10065 extends Strategy 
{ 
  TermReference h_4439;

  TermReference i_4439;

  TermReference j_4439;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27977:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, h_4439.value, i_4439.value);
      if(term == null)
        break Fail27977;
      if(j_4439.value == null)
        j_4439.value = term;
      else
        if(j_4439.value != term && !j_4439.value.match(term))
          break Fail27977;
      if(true)
        return term;
    }
    return null;
  }
}