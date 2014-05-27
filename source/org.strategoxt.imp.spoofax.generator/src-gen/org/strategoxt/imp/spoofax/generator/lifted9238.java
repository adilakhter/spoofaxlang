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

@SuppressWarnings("all") final class lifted9238 extends Strategy 
{ 
  public static final lifted9238 instance = new lifted9238();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28819:
    { 
      IStrategoTerm term10236 = term;
      Success11378:
      { 
        Fail28820:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail28820;
          term = generator.const6989;
          if(true)
            break Success11378;
        }
        term = term10236;
        if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
          break Fail28819;
        term = tabsize_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28819;
      }
      if(true)
        return term;
    }
    return null;
  }
}