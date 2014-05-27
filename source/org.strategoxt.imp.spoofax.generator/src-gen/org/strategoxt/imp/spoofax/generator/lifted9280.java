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

@SuppressWarnings("all") final class lifted9280 extends Strategy 
{ 
  public static final lifted9280 instance = new lifted9280();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28774:
    { 
      IStrategoTerm term10290 = term;
      Success11367:
      { 
        Fail28775:
        { 
          term = is_whitespace_char_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28775;
          if(true)
            break Success11367;
        }
        term = term10290;
        if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
          break Fail28774;
      }
      if(true)
        return term;
    }
    return null;
  }
}