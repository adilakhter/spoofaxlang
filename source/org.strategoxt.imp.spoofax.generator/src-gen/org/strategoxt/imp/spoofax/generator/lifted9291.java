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

@SuppressWarnings("all") final class lifted9291 extends Strategy 
{ 
  TermReference f_4274;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28761:
    { 
      IStrategoTerm term10309 = term;
      IStrategoConstructor cons354 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11363:
      { 
        if(cons354 == SpoofaxGenerator._consINSERT_BEFORE_2)
        { 
          Fail28762:
          { 
            IStrategoTerm k_4274 = null;
            IStrategoTerm l_4274 = null;
            k_4274 = term.getSubterm(0);
            l_4274 = term.getSubterm(1);
            if(f_4274.value == null)
              break Fail28762;
            term = termFactory.makeAppl(SpoofaxGenerator._consINSERT_BEFORE_3, new IStrategoTerm[]{f_4274.value, k_4274, l_4274});
            if(true)
              break Success11363;
          }
          term = term10309;
        }
        Success11364:
        { 
          if(cons354 == SpoofaxGenerator._consINSERT_AT_END_2)
          { 
            Fail28763:
            { 
              IStrategoTerm m_4274 = null;
              IStrategoTerm n_4274 = null;
              m_4274 = term.getSubterm(0);
              n_4274 = term.getSubterm(1);
              if(f_4274.value == null)
                break Fail28763;
              term = termFactory.makeAppl(SpoofaxGenerator._consINSERT_AT_END_3, new IStrategoTerm[]{f_4274.value, m_4274, n_4274});
              if(true)
                break Success11364;
            }
            term = term10309;
          }
          if(cons354 == SpoofaxGenerator._consREPLACEMENT_2)
          { 
            IStrategoTerm o_4274 = null;
            IStrategoTerm p_4274 = null;
            o_4274 = term.getSubterm(0);
            p_4274 = term.getSubterm(1);
            if(f_4274.value == null)
              break Fail28761;
            term = termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_3, new IStrategoTerm[]{f_4274.value, o_4274, p_4274});
          }
          else
          { 
            break Fail28761;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}