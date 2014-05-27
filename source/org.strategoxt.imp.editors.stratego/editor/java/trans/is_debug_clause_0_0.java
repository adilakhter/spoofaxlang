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
    Fail22727:
    { 
      IStrategoTerm i_4718 = null;
      i_4718 = term;
      IStrategoTerm term12131 = term;
      IStrategoConstructor cons583 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12130:
      { 
        if(cons583 == Main._consWhereClause_1)
        { 
          Fail22728:
          { 
            IStrategoTerm j_4718 = null;
            j_4718 = term.getSubterm(0);
            term = is_debug_call_0_0.instance.invoke(context, j_4718);
            if(term == null)
              break Fail22728;
            if(true)
              break Success12130;
          }
          term = term12131;
        }
        if(cons583 == Main._consWithClause_1)
        { 
          IStrategoTerm k_4718 = null;
          k_4718 = term.getSubterm(0);
          term = is_debug_call_0_0.instance.invoke(context, k_4718);
          if(term == null)
            break Fail22727;
        }
        else
        { 
          break Fail22727;
        }
      }
      term = i_4718;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}