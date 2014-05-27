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

@SuppressWarnings("all") final class lifted9460 extends Strategy 
{ 
  TermReference e_4327;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28609:
    { 
      i_4327 i_43271 = new i_4327();
      i_4327 i_43270 = new i_4327();
      i_43270.i_4327 = i_43271;
      i_43270.e_4327 = e_4327;
      i_43271.i_4327 = i_43271;
      i_43271.e_4327 = e_4327;
      term = i_43270.invoke(context, term);
      if(term == null)
        break Fail28609;
      if(true)
        return term;
    }
    return null;
  }
}