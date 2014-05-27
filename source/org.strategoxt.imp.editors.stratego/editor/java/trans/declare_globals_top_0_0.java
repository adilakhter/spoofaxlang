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

@SuppressWarnings("all") public class declare_globals_top_0_0 extends Strategy 
{ 
  public static declare_globals_top_0_0 instance = new declare_globals_top_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("declare_globals_top_0_0");
    Fail23078:
    { 
      IStrategoTerm term12403 = term;
      Success12327:
      { 
        Fail23079:
        { 
          IStrategoTerm z_4776 = null;
          z_4776 = term;
          IStrategoTerm term12404 = term;
          Success12328:
          { 
            Fail23080:
            { 
              term = $No$Analysis_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23080;
              { 
                if(true)
                  break Fail23079;
                if(true)
                  break Success12328;
              }
            }
            term = term12404;
          }
          term = z_4776;
          { 
            IStrategoTerm a_4777 = null;
            a_4777 = term;
            IStrategoTerm term12405 = term;
            Success12329:
            { 
              Fail23081:
              { 
                term = declare_globals_0_0.instance.invoke(context, trans.constImport0);
                if(term == null)
                  break Fail23081;
                if(true)
                  break Success12329;
              }
              term = term12405;
              TermReference b_4777 = new TermReference();
              if(b_4777.value == null)
                b_4777.value = term;
              else
                if(b_4777.value != term && !b_4777.value.match(term))
                  break Fail23078;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23078;
              lifted6849 lifted68490 = new lifted6849();
              lifted68490.b_4777 = b_4777;
              term = report_failure_1_0.instance.invoke(context, term, lifted68490);
              if(term == null)
                break Fail23078;
            }
            term = alltd_1_0.instance.invoke(context, a_4777, lifted6850.instance);
            if(term == null)
              break Fail23078;
            if(true)
              break Success12327;
          }
        }
        term = term12403;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}