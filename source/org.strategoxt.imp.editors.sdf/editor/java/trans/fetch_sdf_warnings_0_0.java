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

@SuppressWarnings("all") public class fetch_sdf_warnings_0_0 extends Strategy 
{ 
  public static fetch_sdf_warnings_0_0 instance = new fetch_sdf_warnings_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("fetch_sdf_warnings_0_0");
    Fail75906:
    { 
      IStrategoTerm term41704 = term;
      IStrategoConstructor cons1785 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41628:
      { 
        if(cons1785 == Main._conscontext_free_syntax_1)
        { 
          Fail75907:
          { 
            IStrategoTerm z_92055 = null;
            z_92055 = term.getSubterm(0);
            term = collect_om_1_0.instance.invoke(context, z_92055, context_free_syntax_warning_0_0.instance);
            if(term == null)
              break Fail75907;
            if(true)
              break Success41628;
          }
          term = term41704;
        }
        if(cons1785 == Main._conslexical_syntax_1)
        { 
          IStrategoTerm a_92056 = null;
          a_92056 = term.getSubterm(0);
          term = collect_om_1_0.instance.invoke(context, a_92056, lexical_syntax_warning_0_0.instance);
          if(term == null)
            break Fail75906;
        }
        else
        { 
          break Fail75906;
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