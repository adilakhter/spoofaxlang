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

@SuppressWarnings("all") public class is_debug_clause_0_0 extends Strategy 
{ 
  public static is_debug_clause_0_0 instance = new is_debug_clause_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_debug_clause_0_0");
    Fail21251:
    { 
      IStrategoTerm q_4164 = null;
      q_4164 = term;
      IStrategoTerm term11422 = term;
      IStrategoConstructor cons539 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11421:
      { 
        if(cons539 == Main._consWhereClause_1)
        { 
          Fail21252:
          { 
            IStrategoTerm r_4164 = null;
            r_4164 = term.getSubterm(0);
            term = is_debug_call_0_0.instance.invoke(context, r_4164);
            if(term == null)
              break Fail21252;
            if(true)
              break Success11421;
          }
          term = term11422;
        }
        if(cons539 == Main._consWithClause_1)
        { 
          IStrategoTerm s_4164 = null;
          s_4164 = term.getSubterm(0);
          term = is_debug_call_0_0.instance.invoke(context, s_4164);
          if(term == null)
            break Fail21251;
        }
        else
        { 
          break Fail21251;
        }
      }
      term = q_4164;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}