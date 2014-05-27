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

@SuppressWarnings("all") final class lifted10039 extends Strategy 
{ 
  TermReference z_4426;

  TermReference a_4427;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28003:
    { 
      term = aux_$Imported$From_0_2.instance.invoke(context, term, z_4426.value, a_4427.value);
      if(term == null)
        break Fail28003;
      if(true)
        return term;
    }
    return null;
  }
}