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

@SuppressWarnings("all") final class lifted10004 extends Strategy 
{ 
  public static final lifted10004 instance = new lifted10004();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28040:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"services".equals(((IStrategoString)term).stringValue()))
        break Fail28040;
      if(true)
        return term;
    }
    return null;
  }
}