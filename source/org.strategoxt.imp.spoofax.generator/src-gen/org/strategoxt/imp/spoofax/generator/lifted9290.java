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

@SuppressWarnings("all") final class lifted9290 extends Strategy 
{ 
  TermReference f_4274;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28760:
    { 
      lifted9291 lifted92910 = new lifted9291();
      lifted92910.f_4274 = f_4274;
      term = try_1_0.instance.invoke(context, term, lifted92910);
      if(term == null)
        break Fail28760;
      if(true)
        return term;
    }
    return null;
  }
}