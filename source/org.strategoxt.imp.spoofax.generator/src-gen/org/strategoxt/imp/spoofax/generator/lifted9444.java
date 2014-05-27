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

@SuppressWarnings("all") final class lifted9444 extends Strategy 
{ 
  TermReference s_4324;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28636:
    { 
      IStrategoTerm term10636 = term;
      Success11345:
      { 
        Fail28637:
        { 
          if(s_4324.value == null)
            s_4324.value = term;
          else
            if(s_4324.value != term && !s_4324.value.match(term))
              break Fail28637;
          { 
            if(true)
              break Fail28636;
            if(true)
              break Success11345;
          }
        }
        term = term10636;
      }
      if(true)
        return term;
    }
    return null;
  }
}