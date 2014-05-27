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

@SuppressWarnings("all") final class lifted9089 extends Strategy 
{ 
  Strategy h_4235;

  Strategy i_4235;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28945:
    { 
      IStrategoTerm j_4235 = null;
      IStrategoTerm l_4235 = null;
      l_4235 = term;
      term = as_string_1_0.instance.invoke(context, term, h_4235);
      if(term == null)
        break Fail28945;
      j_4235 = term;
      term = l_4235;
      term = as_string_1_0.instance.invoke(context, term, i_4235);
      if(term == null)
        break Fail28945;
      term = termFactory.makeTuple(j_4235, generator.const7064, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28945;
      if(true)
        return term;
    }
    return null;
  }
}