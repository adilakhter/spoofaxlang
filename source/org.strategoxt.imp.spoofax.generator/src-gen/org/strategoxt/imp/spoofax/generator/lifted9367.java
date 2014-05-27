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

@SuppressWarnings("all") final class lifted9367 extends Strategy 
{ 
  public static final lifted9367 instance = new lifted9367();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28697:
    { 
      IStrategoTerm term10514 = term;
      Success11353:
      { 
        Fail28698:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28698;
          { 
            if(true)
              break Fail28697;
            if(true)
              break Success11353;
          }
        }
        term = term10514;
      }
      if(true)
        return term;
    }
    return null;
  }
}