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

@SuppressWarnings("all") final class lifted9286 extends Strategy 
{ 
  TermReference d_4273;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28765:
    { 
      lifted9287 lifted92870 = new lifted9287();
      lifted92870.d_4273 = d_4273;
      term = string_as_chars_1_0.instance.invoke(context, term, lifted92870);
      if(term == null)
        break Fail28765;
      if(true)
        return term;
    }
    return null;
  }
}