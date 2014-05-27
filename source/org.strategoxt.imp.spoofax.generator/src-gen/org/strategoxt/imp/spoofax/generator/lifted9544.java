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

@SuppressWarnings("all") final class lifted9544 extends Strategy 
{ 
  TermReference e_4399;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28399:
    { 
      IStrategoTerm a_4401 = null;
      a_4401 = term;
      term = has_extension_0_1.instance.invoke(context, a_4401, generator.const7127);
      if(term == null)
        break Fail28399;
      if(e_4399.value == null)
        e_4399.value = term;
      else
        if(e_4399.value != term && !e_4399.value.match(term))
          break Fail28399;
      if(true)
        return term;
    }
    return null;
  }
}