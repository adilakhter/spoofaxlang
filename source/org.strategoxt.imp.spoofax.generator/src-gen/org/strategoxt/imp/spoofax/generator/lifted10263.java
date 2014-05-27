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

@SuppressWarnings("all") final class lifted10263 extends Strategy 
{ 
  TermReference p_4535;

  TermReference q_4535;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27779:
    { 
      term = aux_$Main$Descriptor$Name_0_1.instance.invoke(context, term, p_4535.value);
      if(term == null)
        break Fail27779;
      if(q_4535.value == null)
        q_4535.value = term;
      else
        if(q_4535.value != term && !q_4535.value.match(term))
          break Fail27779;
      if(true)
        return term;
    }
    return null;
  }
}