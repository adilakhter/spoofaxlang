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

@SuppressWarnings("all") final class lifted9075 extends Strategy 
{ 
  TermReference z_4228;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28960:
    { 
      IStrategoTerm h_4229 = null;
      IStrategoTerm i_4229 = null;
      i_4229 = term;
      h_4229 = term;
      term = i_4229;
      if(z_4228.value == null)
        break Fail28960;
      term = termFactory.makeTuple(h_4229, z_4228.value);
      term = fputs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28960;
      if(true)
        return term;
    }
    return null;
  }
}