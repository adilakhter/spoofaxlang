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

@SuppressWarnings("all") final class lifted9250 extends Strategy 
{ 
  public static final lifted9250 instance = new lifted9250();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28805:
    { 
      IStrategoTerm i_4264 = null;
      i_4264 = term;
      term = risky_1_1.instance.invoke(context, i_4264, lifted9251.instance, generator.const7152);
      if(term == null)
        break Fail28805;
      if(true)
        return term;
    }
    return null;
  }
}