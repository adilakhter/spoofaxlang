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

@SuppressWarnings("all") public class pattern_to_keywords_2_0_0 extends Strategy 
{ 
  public static pattern_to_keywords_2_0_0 instance = new pattern_to_keywords_2_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pattern_to_keywords_2_0_0");
    Fail26199:
    { 
      IStrategoTerm i_4312 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail26199;
      i_4312 = ((IStrategoList)term).tail();
      term = i_4312;
      IStrategoTerm term10570 = term;
      Success10490:
      { 
        Fail26200:
        { 
          term = pattern_to_keywords_1_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26200;
          if(true)
            break Success10490;
        }
        term = term10570;
        IStrategoTerm term10571 = term;
        Success10491:
        { 
          Fail26201:
          { 
            term = this.invoke(context, term);
            if(term == null)
              break Fail26201;
            if(true)
              break Success10491;
          }
          term = term10571;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail26199;
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