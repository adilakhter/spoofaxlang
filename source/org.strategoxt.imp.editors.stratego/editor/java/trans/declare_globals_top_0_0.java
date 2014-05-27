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
    Fail21602:
    { 
      IStrategoTerm term11694 = term;
      Success11618:
      { 
        Fail21603:
        { 
          IStrategoTerm h_4223 = null;
          h_4223 = term;
          IStrategoTerm term11695 = term;
          Success11619:
          { 
            Fail21604:
            { 
              term = $No$Analysis_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21604;
              { 
                if(true)
                  break Fail21603;
                if(true)
                  break Success11619;
              }
            }
            term = term11695;
          }
          term = h_4223;
          { 
            IStrategoTerm i_4223 = null;
            i_4223 = term;
            IStrategoTerm term11696 = term;
            Success11620:
            { 
              Fail21605:
              { 
                term = declare_globals_0_0.instance.invoke(context, trans.constImport0);
                if(term == null)
                  break Fail21605;
                if(true)
                  break Success11620;
              }
              term = term11696;
              TermReference j_4223 = new TermReference();
              if(j_4223.value == null)
                j_4223.value = term;
              else
                if(j_4223.value != term && !j_4223.value.match(term))
                  break Fail21602;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21602;
              lifted6578 lifted65780 = new lifted6578();
              lifted65780.j_4223 = j_4223;
              term = report_failure_1_0.instance.invoke(context, term, lifted65780);
              if(term == null)
                break Fail21602;
            }
            term = alltd_1_0.instance.invoke(context, i_4223, lifted6579.instance);
            if(term == null)
              break Fail21602;
            if(true)
              break Success11618;
          }
        }
        term = term11694;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}