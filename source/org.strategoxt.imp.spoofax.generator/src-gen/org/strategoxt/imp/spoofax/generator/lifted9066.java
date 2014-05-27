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

@SuppressWarnings("all") final class lifted9066 extends Strategy 
{ 
  public static final lifted9066 instance = new lifted9066();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28968:
    { 
      IStrategoTerm term10080 = term;
      Success11411:
      { 
        Fail28969:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"-I".equals(((IStrategoString)term).stringValue()))
            break Fail28969;
          if(true)
            break Success11411;
        }
        term = term10080;
        if(term.getTermType() != IStrategoTerm.STRING || !"--Include".equals(((IStrategoString)term).stringValue()))
          break Fail28968;
      }
      if(true)
        return term;
    }
    return null;
  }
}