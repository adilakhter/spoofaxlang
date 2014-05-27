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

@SuppressWarnings("all") final class lifted9273 extends Strategy 
{ 
  TermReference f_4270;

  Strategy l_4270;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28783:
    { 
      term = ast_change_to_text_change_1_1.instance.invoke(context, term, l_4270, f_4270.value);
      if(term == null)
        break Fail28783;
      if(true)
        return term;
    }
    return null;
  }
}