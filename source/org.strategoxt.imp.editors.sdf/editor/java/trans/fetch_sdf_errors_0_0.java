package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fetch_sdf_errors_0_0 extends Strategy 
{ 
  public static fetch_sdf_errors_0_0 instance = new fetch_sdf_errors_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("fetch_sdf_errors_0_0");
    Fail75904:
    { 
      IStrategoTerm term41703 = term;
      IStrategoConstructor cons1784 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41627:
      { 
        if(cons1784 == Main._conscontext_free_syntax_1)
        { 
          Fail75905:
          { 
            IStrategoTerm x_92055 = null;
            x_92055 = term.getSubterm(0);
            term = collect_om_1_0.instance.invoke(context, x_92055, context_free_syntax_error_0_0.instance);
            if(term == null)
              break Fail75905;
            if(true)
              break Success41627;
          }
          term = term41703;
        }
        if(cons1784 == Main._conslexical_syntax_1)
        { 
          IStrategoTerm y_92055 = null;
          y_92055 = term.getSubterm(0);
          term = collect_om_1_0.instance.invoke(context, y_92055, lexical_syntax_error_0_0.instance);
          if(term == null)
            break Fail75904;
        }
        else
        { 
          break Fail75904;
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