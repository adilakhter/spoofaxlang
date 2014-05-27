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

@SuppressWarnings("all") final class lifted9311 extends Strategy 
{ 
  public static final lifted9311 instance = new lifted9311();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28739:
    { 
      IStrategoTerm term10356 = term;
      Success11358:
      { 
        Fail28740:
        { 
          term = $Arg_1_0.instance.invoke(context, term, lifted9312.instance);
          if(term == null)
            break Fail28740;
          { 
            if(true)
              break Fail28739;
            if(true)
              break Success11358;
          }
        }
        term = term10356;
      }
      if(true)
        return term;
    }
    return null;
  }
}