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

@SuppressWarnings("all") final class lifted9091 extends Strategy 
{ 
  TermReference l_4236;

  TermReference m_4236;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28942:
    { 
      IStrategoTerm term10096 = term;
      Success11409:
      { 
        Fail28943:
        { 
          term = length_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28943;
          if(term.getTermType() != IStrategoTerm.INT || 4 != ((IStrategoInt)term).intValue())
            break Fail28943;
          if(l_4236.value == null)
            l_4236.value = term;
          else
            if(l_4236.value != term && !l_4236.value.match(term))
              break Fail28943;
          if(true)
            break Success11409;
        }
        term = term10096;
        term = length_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28942;
        term = termFactory.makeTuple(term, generator.const7070);
        term = gt_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28942;
        if(m_4236.value == null)
          m_4236.value = term;
        else
          if(m_4236.value != term && !m_4236.value.match(term))
            break Fail28942;
      }
      if(true)
        return term;
    }
    return null;
  }
}