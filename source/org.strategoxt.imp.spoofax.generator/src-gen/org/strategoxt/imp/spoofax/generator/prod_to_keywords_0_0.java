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

@SuppressWarnings("all") public class prod_to_keywords_0_0 extends Strategy 
{ 
  public static prod_to_keywords_0_0 instance = new prod_to_keywords_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("prod_to_keywords_0_0");
    Fail26190:
    { 
      IStrategoTerm l_4311 = null;
      IStrategoTerm m_4311 = null;
      IStrategoTerm n_4311 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26190;
      l_4311 = term.getSubterm(0);
      n_4311 = term.getSubterm(2);
      term = pattern_to_keywords_0_0.instance.invoke(context, l_4311);
      if(term == null)
        break Fail26190;
      m_4311 = term;
      IStrategoTerm term10563 = term;
      Success10484:
      { 
        Fail26191:
        { 
          IStrategoTerm p_4311 = null;
          term = n_4311;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)term).getConstructor())
            break Fail26191;
          p_4311 = term.getSubterm(0);
          term = SRTS_one.instance.invoke(context, p_4311, lifted9393.instance);
          if(term == null)
            break Fail26191;
          { 
            if(true)
              break Fail26190;
            if(true)
              break Success10484;
          }
        }
        term = term10563;
      }
      term = m_4311;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}