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

@SuppressWarnings("all") final class lifted10000 extends Strategy 
{ 
  public static final lifted10000 instance = new lifted10000();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28046:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"imp".equals(((IStrategoString)term).stringValue()))
        break Fail28046;
      if(true)
        return term;
    }
    return null;
  }
}