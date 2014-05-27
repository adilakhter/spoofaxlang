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

@SuppressWarnings("all") final class lifted9205 extends Strategy 
{ 
  Strategy x_4252;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28843:
    { 
      IStrategoTerm a_4253 = null;
      IStrategoTerm term10219 = term;
      Success11381:
      { 
        Fail28844:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28844;
          { 
            if(true)
              break Fail28843;
            if(true)
              break Success11381;
          }
        }
        term = term10219;
      }
      a_4253 = term;
      term = x_4252.invoke(context, term);
      if(term == null)
        break Fail28843;
      term = is_descriptor_imported_0_1.instance.invoke(context, a_4253, term);
      if(term == null)
        break Fail28843;
      if(true)
        return term;
    }
    return null;
  }
}