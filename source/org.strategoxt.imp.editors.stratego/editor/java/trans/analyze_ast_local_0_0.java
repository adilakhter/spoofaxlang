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
    Fail23041:
    { 
      IStrategoTerm term12376 = term;
      Success12301:
      { 
        Fail23042:
        { 
          IStrategoTerm f_4771 = null;
          f_4771 = term;
          IStrategoTerm term12377 = term;
          Success12302:
          { 
            Fail23043:
            { 
              term = bagof_$Declaration_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23043;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail23043;
              { 
                if(true)
                  break Fail23042;
                if(true)
                  break Success12302;
              }
            }
            term = term12377;
          }
          term = f_4771;
          { 
            term = declare_globals_top_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23041;
            if(true)
              break Success12301;
          }
        }
        term = term12376;
      }
      term = declare_bodies_top_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23041;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}