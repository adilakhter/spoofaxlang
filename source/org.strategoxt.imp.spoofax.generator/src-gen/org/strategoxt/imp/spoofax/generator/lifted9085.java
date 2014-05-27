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

@SuppressWarnings("all") final class lifted9085 extends Strategy 
{ 
  public static final lifted9085 instance = new lifted9085();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28948:
    { 
      IStrategoTerm p_4234 = null;
      term = map_1_0.instance.invoke(context, term, lifted9086.instance);
      if(term == null)
        break Fail28948;
      p_4234 = term;
      term = separate_by_0_1.instance.invoke(context, p_4234, generator.const7064);
      if(term == null)
        break Fail28948;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28948;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28948;
      if(true)
        return term;
    }
    return null;
  }
}