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

@SuppressWarnings("all") final class lifted10092 extends Strategy 
{ 
  TermReference v_4451;

  TermReference w_4451;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27950:
    { 
      term = aux_$Main$Descriptor_0_1.instance.invoke(context, term, v_4451.value);
      if(term == null)
        break Fail27950;
      if(w_4451.value == null)
        w_4451.value = term;
      else
        if(w_4451.value != term && !w_4451.value.match(term))
          break Fail27950;
      if(true)
        return term;
    }
    return null;
  }
}