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

@SuppressWarnings("all") final class lifted10245 extends Strategy 
{ 
  TermReference x_4526;

  TermReference y_4526;

  TermReference z_4526;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27797:
    { 
      term = aux_$Is$Launched$From$Eclipse_0_2.instance.invoke(context, term, x_4526.value, y_4526.value);
      if(term == null)
        break Fail27797;
      if(z_4526.value == null)
        z_4526.value = term;
      else
        if(z_4526.value != term && !z_4526.value.match(term))
          break Fail27797;
      if(true)
        return term;
    }
    return null;
  }
}