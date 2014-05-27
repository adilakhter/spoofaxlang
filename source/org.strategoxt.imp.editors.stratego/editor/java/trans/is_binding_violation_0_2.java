package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_binding_violation_0_2 extends Strategy 
{ 
  public static is_binding_violation_0_2 instance = new is_binding_violation_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4185, IStrategoTerm k_4185)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail21362:
    { 
      IStrategoTerm l_4185 = null;
      IStrategoTerm m_4185 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21362;
      l_4185 = term.getSubterm(0);
      m_4185 = term.getSubterm(1);
      term = termFactory.makeTuple(l_4185, m_4185);
      IStrategoTerm term11494 = term;
      Success11460:
      { 
        Fail21363:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21363;
          if(term.getSubterm(1) != k_4185 && !k_4185.match(term.getSubterm(1)))
            break Fail21363;
          if(true)
            break Success11460;
        }
        term = term11494;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21362;
        if(term.getSubterm(0) != j_4185 && !j_4185.match(term.getSubterm(0)))
          break Fail21362;
      }
      IStrategoTerm term11495 = term;
      Success11461:
      { 
        Fail21364:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21364;
          if(term.getSubterm(0) != j_4185 && !j_4185.match(term.getSubterm(0)))
            break Fail21364;
          if(term.getSubterm(1) != k_4185 && !k_4185.match(term.getSubterm(1)))
            break Fail21364;
          { 
            if(true)
              break Fail21362;
            if(true)
              break Success11461;
          }
        }
        term = term11495;
      }
      term = termFactory.makeTuple(l_4185, m_4185);
      if(true)
        return term;
    }
    context.push("is_binding_violation_0_2");
    context.popOnFailure();
    return null;
  }
}