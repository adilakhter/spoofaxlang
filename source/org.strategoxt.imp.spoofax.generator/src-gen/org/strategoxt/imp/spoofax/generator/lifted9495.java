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

@SuppressWarnings("all") final class lifted9495 extends Strategy 
{ 
  public static final lifted9495 instance = new lifted9495();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28450:
    { 
      IStrategoTerm s_4388 = null;
      term = $Jar$Locations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28450;
      s_4388 = term;
      term = separate_by_0_1.instance.invoke(context, s_4388, generator.const7071);
      if(term == null)
        break Fail28450;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28450;
      if(true)
        return term;
    }
    return null;
  }
}