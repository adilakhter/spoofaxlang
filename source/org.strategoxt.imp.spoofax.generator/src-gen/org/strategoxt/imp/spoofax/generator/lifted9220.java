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

@SuppressWarnings("all") final class lifted9220 extends Strategy 
{ 
  public static final lifted9220 instance = new lifted9220();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28828:
    { 
      IStrategoTerm term10230 = term;
      Success11379:
      { 
        Fail28829:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28829;
          if(true)
            break Success11379;
        }
        term = term10230;
        IStrategoTerm w_4256 = null;
        w_4256 = term;
        term = mkdir_0_1.instance.invoke(context, w_4256, generator.const6986);
        if(term == null)
          break Fail28828;
      }
      term = chdir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28828;
      if(true)
        return term;
    }
    return null;
  }
}