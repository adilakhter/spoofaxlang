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

@SuppressWarnings("all") final class lifted10040 extends Strategy 
{ 
  TermReference g_4427;

  TermReference h_4427;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28002:
    { 
      term = aux_$Imported$From_0_2.instance.invoke(context, term, g_4427.value, h_4427.value);
      if(term == null)
        break Fail28002;
      if(true)
        return term;
    }
    return null;
  }
}