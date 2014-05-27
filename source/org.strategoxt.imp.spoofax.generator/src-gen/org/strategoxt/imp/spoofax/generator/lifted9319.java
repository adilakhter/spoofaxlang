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

@SuppressWarnings("all") final class lifted9319 extends Strategy 
{ 
  public static final lifted9319 instance = new lifted9319();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28734:
    { 
      IStrategoTerm term10360 = term;
      Success11357:
      { 
        Fail28735:
        { 
          term = _2_0.instance.invoke(context, term, _Id.instance, $Is$Reserved$Class$Name_0_0.instance);
          if(term == null)
            break Fail28735;
          { 
            if(true)
              break Fail28734;
            if(true)
              break Success11357;
          }
        }
        term = term10360;
      }
      if(true)
        return term;
    }
    return null;
  }
}