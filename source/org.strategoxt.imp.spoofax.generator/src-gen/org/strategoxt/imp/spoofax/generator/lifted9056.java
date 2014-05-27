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

@SuppressWarnings("all") final class lifted9056 extends Strategy 
{ 
  public static final lifted9056 instance = new lifted9056();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28979:
    { 
      IStrategoTerm term10078 = term;
      Success11412:
      { 
        Fail28980:
        { 
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDef_1 != ((IStrategoAppl)term).getConstructor())
            break Fail28980;
          { 
            term = process_$Idef_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28979;
            if(true)
              break Success11412;
          }
        }
        term = term10078;
      }
      if(true)
        return term;
    }
    return null;
  }
}