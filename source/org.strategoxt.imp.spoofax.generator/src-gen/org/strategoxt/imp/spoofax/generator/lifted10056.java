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

@SuppressWarnings("all") final class lifted10056 extends Strategy 
{ 
  TermReference b_4435;

  TermReference c_4435;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27986:
    { 
      term = aux_$Input$Dir$Prefix_0_1.instance.invoke(context, term, b_4435.value);
      if(term == null)
        break Fail27986;
      if(c_4435.value == null)
        c_4435.value = term;
      else
        if(c_4435.value != term && !c_4435.value.match(term))
          break Fail27986;
      if(true)
        return term;
    }
    return null;
  }
}