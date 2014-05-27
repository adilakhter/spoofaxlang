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

@SuppressWarnings("all") final class lifted9449 extends Strategy 
{ 
  Strategy b_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28630:
    { 
      c_4325 c_43250 = new c_4325();
      c_43250.b_4325 = b_4325;
      term = c_43250.invoke(context, term);
      if(term == null)
        break Fail28630;
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28630;
      if(true)
        return term;
    }
    return null;
  }
}