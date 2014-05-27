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

@SuppressWarnings("all") final class lifted9185 extends Strategy 
{ 
  public static final lifted9185 instance = new lifted9185();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28876:
    { 
      IStrategoTerm term10180 = term;
      IStrategoConstructor cons358 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11396:
      { 
        if(cons358 == SpoofaxGenerator._consdefault_1)
        { 
          Fail28877:
          { 
            IStrategoTerm o_4245 = null;
            IStrategoTerm arg6103 = term.getSubterm(0);
            if(arg6103.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consterm_1 != ((IStrategoAppl)arg6103).getConstructor())
              break Fail28877;
            IStrategoTerm arg6104 = arg6103.getSubterm(0);
            if(arg6104.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscons_1 != ((IStrategoAppl)arg6104).getConstructor())
              break Fail28877;
            o_4245 = arg6104.getSubterm(0);
            term = o_4245;
            if(true)
              break Success11396;
          }
          term = term10180;
        }
        if(cons358 == SpoofaxGenerator._consterm_1)
        { 
          IStrategoTerm p_4245 = null;
          IStrategoTerm arg6105 = term.getSubterm(0);
          if(arg6105.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscons_1 != ((IStrategoAppl)arg6105).getConstructor())
            break Fail28876;
          p_4245 = arg6105.getSubterm(0);
          term = p_4245;
        }
        else
        { 
          break Fail28876;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}