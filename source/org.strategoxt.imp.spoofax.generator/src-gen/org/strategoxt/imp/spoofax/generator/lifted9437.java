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

@SuppressWarnings("all") final class lifted9437 extends Strategy 
{ 
  TermReference y_4320;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28640:
    { 
      IStrategoTerm c_4321 = null;
      IStrategoTerm e_4321 = null;
      IStrategoTerm f_4321 = null;
      e_4321 = term;
      c_4321 = generator.constCritical0;
      f_4321 = e_4321;
      term = log_0_3.instance.invoke(context, f_4321, c_4321, generator.const7466, y_4320.value);
      if(term == null)
        break Fail28640;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28640;
      if(true)
        return term;
    }
    return null;
  }
}