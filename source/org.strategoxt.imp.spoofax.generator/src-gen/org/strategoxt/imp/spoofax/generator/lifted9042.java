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

@SuppressWarnings("all") final class lifted9042 extends Strategy 
{ 
  Strategy v_4225;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28993:
    { 
      term = prod_3_0.instance.invoke(context, term, _Id.instance, lifted9044.instance, _Id.instance);
      if(term == null)
        break Fail28993;
      term = v_4225.invoke(context, term);
      if(term == null)
        break Fail28993;
      if(true)
        return term;
    }
    return null;
  }
}