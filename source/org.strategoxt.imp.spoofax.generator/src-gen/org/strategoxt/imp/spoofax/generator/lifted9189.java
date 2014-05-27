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

@SuppressWarnings("all") final class lifted9189 extends Strategy 
{ 
  Strategy r_4245;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28872:
    { 
      lifted9190 lifted91900 = new lifted9190();
      lifted91900.r_4245 = r_4245;
      term = rtg_1_0.instance.invoke(context, term, lifted91900);
      if(term == null)
        break Fail28872;
      if(true)
        return term;
    }
    return null;
  }
}