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

@SuppressWarnings("all") final class lifted9019 extends Strategy 
{ 
  TermReference l_4222;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29022:
    { 
      IStrategoTerm term10052 = term;
      Success11423:
      { 
        Fail29023:
        { 
          term = include_from_dir_0_1.instance.invoke(context, term, l_4222.value);
          if(term == null)
            break Fail29023;
          if(true)
            break Success11423;
        }
        term = term10052;
        IStrategoTerm term10053 = term;
        Success11424:
        { 
          Fail29024:
          { 
            term = include_from_def_0_1.instance.invoke(context, term, l_4222.value);
            if(term == null)
              break Fail29024;
            if(true)
              break Success11424;
          }
          term = include_from_xtc_0_1.instance.invoke(context, term10053, l_4222.value);
          if(term == null)
            break Fail29022;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}