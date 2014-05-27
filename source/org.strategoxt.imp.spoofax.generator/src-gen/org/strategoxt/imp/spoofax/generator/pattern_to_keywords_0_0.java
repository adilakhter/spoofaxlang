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

@SuppressWarnings("all") public class pattern_to_keywords_0_0 extends Strategy 
{ 
  public static pattern_to_keywords_0_0 instance = new pattern_to_keywords_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pattern_to_keywords_0_0");
    Fail26192:
    { 
      IStrategoTerm term10565 = term;
      Success10485:
      { 
        Fail26193:
        { 
          term = pattern_to_keywords_1_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26193;
          if(true)
            break Success10485;
        }
        term = term10565;
        IStrategoTerm term10566 = term;
        Success10486:
        { 
          Fail26194:
          { 
            term = pattern_to_keywords_2_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26194;
            if(true)
              break Success10486;
          }
          term = term10566;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail26192;
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