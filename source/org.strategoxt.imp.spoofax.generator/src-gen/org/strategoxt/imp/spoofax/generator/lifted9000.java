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

@SuppressWarnings("all") final class lifted9000 extends Strategy 
{ 
  public static final lifted9000 instance = new lifted9000();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29039:
    { 
      IStrategoTerm term10035 = term;
      Success11430:
      { 
        Fail29040:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"-m".equals(((IStrategoString)term).stringValue()))
            break Fail29040;
          if(true)
            break Success11430;
        }
        term = term10035;
        if(term.getTermType() != IStrategoTerm.STRING || !"--main".equals(((IStrategoString)term).stringValue()))
          break Fail29039;
      }
      if(true)
        return term;
    }
    return null;
  }
}