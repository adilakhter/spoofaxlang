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

@SuppressWarnings("all") final class lifted9142 extends Strategy 
{ 
  public static final lifted9142 instance = new lifted9142();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28904:
    { 
      IStrategoTerm term10109 = term;
      Success11407:
      { 
        Fail28905:
        { 
          IStrategoTerm x_4239 = null;
          term = start_prod2tree_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28905;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)term).getConstructor())
            break Fail28905;
          x_4239 = term.getSubterm(0);
          term = x_4239;
          if(true)
            break Success11407;
        }
        term = err_1_0.instance.invoke(context, term10109, lifted9143.instance);
        if(term == null)
          break Fail28904;
        if(true)
          break Fail28904;
      }
      if(true)
        return term;
    }
    return null;
  }
}