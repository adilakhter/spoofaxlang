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

@SuppressWarnings("all") public class conc_layout_0_0 extends Strategy 
{ 
  public static conc_layout_0_0 instance = new conc_layout_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("conc_layout_0_0");
    Fail25705:
    { 
      IStrategoTerm term10206 = term;
      Success10161:
      { 
        Fail25706:
        { 
          term = conc_layout1_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25706;
          if(true)
            break Success10161;
        }
        term = term10206;
        IStrategoTerm term10207 = term;
        Success10162:
        { 
          Fail25707:
          { 
            term = conc_layout2_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25707;
            if(true)
              break Success10162;
          }
          term = conc_layout3_0_0.instance.invoke(context, term10207);
          if(term == null)
            break Fail25705;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}