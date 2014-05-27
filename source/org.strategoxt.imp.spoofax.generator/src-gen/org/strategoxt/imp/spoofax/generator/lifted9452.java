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

@SuppressWarnings("all") final class lifted9452 extends Strategy 
{ 
  Strategy v_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28623:
    { 
      w_4325 w_43251 = new w_4325();
      w_43251.v_4325 = v_4325;
      term = w_43251.invoke(context, term);
      if(term == null)
        break Fail28623;
      if(true)
        return term;
    }
    return null;
  }
}