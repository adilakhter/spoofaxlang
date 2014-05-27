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

@SuppressWarnings("all") final class lifted9522 extends Strategy 
{ 
  public static final lifted9522 instance = new lifted9522();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28421:
    { 
      IStrategoTerm term11145 = term;
      Success11197:
      { 
        Fail28422:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"-nproj".equals(((IStrategoString)term).stringValue()))
            break Fail28422;
          if(true)
            break Success11197;
        }
        term = term11145;
        if(term.getTermType() != IStrategoTerm.STRING || !"--newProject".equals(((IStrategoString)term).stringValue()))
          break Fail28421;
      }
      if(true)
        return term;
    }
    return null;
  }
}