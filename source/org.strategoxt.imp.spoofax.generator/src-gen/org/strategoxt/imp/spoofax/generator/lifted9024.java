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

@SuppressWarnings("all") final class lifted9024 extends Strategy 
{ 
  TermReference z_4222;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29016:
    { 
      lifted9025 lifted90250 = new lifted9025();
      lifted90250.z_4222 = z_4222;
      term = say_1_0.instance.invoke(context, term, lifted90250);
      if(term == null)
        break Fail29016;
      if(true)
        return term;
    }
    return null;
  }
}