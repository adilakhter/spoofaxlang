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

@SuppressWarnings("all") final class lifted9516 extends Strategy 
{ 
  public static final lifted9516 instance = new lifted9516();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28430:
    { 
      IStrategoTerm term11142 = term;
      Success11199:
      { 
        Fail28431:
        { 
          IStrategoTerm k_4391 = null;
          k_4391 = term;
          IStrategoTerm term11143 = term;
          Success11200:
          { 
            Fail28432:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28432;
              { 
                if(true)
                  break Fail28431;
                if(true)
                  break Success11200;
              }
            }
            term = term11143;
          }
          term = k_4391;
          { 
            IStrategoTerm u_4391 = null;
            u_4391 = term;
            term = fatal_err_0_1.instance.invoke(context, u_4391, generator.const7879);
            if(term == null)
              break Fail28430;
            if(true)
              break Success11199;
          }
        }
        term = term11142;
      }
      if(true)
        return term;
    }
    return null;
  }
}