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

@SuppressWarnings("all") final class lifted9555 extends Strategy 
{ 
  Strategy v_4411;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28392:
    { 
      term = $Q$Name_2_0.instance.invoke(context, term, $None_0_0.instance, v_4411);
      if(term == null)
        break Fail28392;
      if(true)
        return term;
    }
    return null;
  }
}