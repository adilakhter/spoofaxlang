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

@SuppressWarnings("all") final class lifted10101 extends Strategy 
{ 
  TermReference c_4456;

  TermReference d_4456;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27941:
    { 
      term = aux_$Editor$Extensions_0_1.instance.invoke(context, term, c_4456.value);
      if(term == null)
        break Fail27941;
      if(d_4456.value == null)
        d_4456.value = term;
      else
        if(d_4456.value != term && !d_4456.value.match(term))
          break Fail27941;
      if(true)
        return term;
    }
    return null;
  }
}