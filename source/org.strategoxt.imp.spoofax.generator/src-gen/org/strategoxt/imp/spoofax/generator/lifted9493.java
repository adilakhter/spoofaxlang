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

@SuppressWarnings("all") final class lifted9493 extends Strategy 
{ 
  TermReference o_4375;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28498:
    { 
      IStrategoTerm x_4375 = null;
      IStrategoTerm z_4375 = null;
      IStrategoTerm a_4376 = null;
      z_4375 = term;
      x_4375 = generator.constCritical0;
      a_4376 = z_4375;
      term = log_0_3.instance.invoke(context, a_4376, x_4375, generator.const7797, o_4375.value);
      if(term == null)
        break Fail28498;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28498;
      if(true)
        return term;
    }
    return null;
  }
}