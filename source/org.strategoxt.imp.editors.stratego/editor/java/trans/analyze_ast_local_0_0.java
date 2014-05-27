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

@SuppressWarnings("all") public class analyze_ast_local_0_0 extends Strategy 
{ 
  public static analyze_ast_local_0_0 instance = new analyze_ast_local_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analyze_ast_local_0_0");
    Fail21565:
    { 
      IStrategoTerm term11667 = term;
      Success11592:
      { 
        Fail21566:
        { 
          IStrategoTerm n_4217 = null;
          n_4217 = term;
          IStrategoTerm term11668 = term;
          Success11593:
          { 
            Fail21567:
            { 
              term = bagof_$Declaration_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21567;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21567;
              { 
                if(true)
                  break Fail21566;
                if(true)
                  break Success11593;
              }
            }
            term = term11668;
          }
          term = n_4217;
          { 
            term = declare_globals_top_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21565;
            if(true)
              break Success11592;
          }
        }
        term = term11667;
      }
      term = declare_bodies_top_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21565;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}