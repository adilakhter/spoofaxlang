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

@SuppressWarnings("all") final class lifted10128 extends Strategy 
{ 
  TermReference g_4469;

  TermReference h_4469;

  TermReference i_4469;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27914:
    { 
      term = aux_$No$Existing$Descriptor_0_2.instance.invoke(context, term, g_4469.value, h_4469.value);
      if(term == null)
        break Fail27914;
      if(i_4469.value == null)
        i_4469.value = term;
      else
        if(i_4469.value != term && !i_4469.value.match(term))
          break Fail27914;
      if(true)
        return term;
    }
    return null;
  }
}