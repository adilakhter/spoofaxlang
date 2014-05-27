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

@SuppressWarnings("all") final class lifted9050 extends Strategy 
{ 
  public static final lifted9050 instance = new lifted9050();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28987:
    { 
      IStrategoTerm term10075 = term;
      Success11414:
      { 
        Fail28988:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"-of".equals(((IStrategoString)term).stringValue()))
            break Fail28988;
          if(true)
            break Success11414;
        }
        term = term10075;
        if(term.getTermType() != IStrategoTerm.STRING || !"--output-format".equals(((IStrategoString)term).stringValue()))
          break Fail28987;
      }
      if(true)
        return term;
    }
    return null;
  }
}