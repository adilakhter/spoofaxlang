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

@SuppressWarnings("all") final class z_4240 extends Strategy 
{ 
  public static final z_4240 instance = new z_4240();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28891:
    { 
      IStrategoTerm term10129 = term;
      Success11399:
      { 
        Fail28892:
        { 
          term = lit_1_0.instance.invoke(context, term, _Id.instance);
          if(term == null)
            break Fail28892;
          if(true)
            break Success11399;
        }
        term = alt_2_0.instance.invoke(context, term10129, this, this);
        if(term == null)
          break Fail28891;
      }
      if(true)
        return term;
    }
    return null;
  }
}