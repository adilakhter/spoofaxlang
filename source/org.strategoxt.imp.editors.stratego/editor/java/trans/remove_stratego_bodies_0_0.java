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

@SuppressWarnings("all") public class remove_stratego_bodies_0_0 extends Strategy 
{ 
  public static remove_stratego_bodies_0_0 instance = new remove_stratego_bodies_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_stratego_bodies_0_0");
    Fail21666:
    { 
      IStrategoTerm term11763 = term;
      IStrategoConstructor cons547 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11670:
      { 
        if(cons547 == Main._consSDefT_4)
        { 
          Fail21667:
          { 
            IStrategoTerm d_4235 = null;
            IStrategoTerm e_4235 = null;
            IStrategoTerm f_4235 = null;
            IStrategoTerm g_4235 = null;
            IStrategoTerm h_4235 = null;
            IStrategoTerm k_4235 = null;
            d_4235 = term.getSubterm(0);
            e_4235 = term.getSubterm(1);
            f_4235 = term.getSubterm(2);
            g_4235 = term.getSubterm(3);
            k_4235 = term;
            IStrategoTerm term11764 = term;
            Success11671:
            { 
              Fail21668:
              { 
                term = collect_all_1_0.instance.invoke(context, g_4235, lifted6600.instance);
                if(term == null)
                  break Fail21668;
                h_4235 = term;
                if(true)
                  break Success11671;
              }
              term = term11764;
              IStrategoTerm i_4235 = null;
              IStrategoTerm j_4235 = null;
              IStrategoTerm m_4235 = null;
              i_4235 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21667;
              j_4235 = term;
              m_4235 = i_4235;
              term = report_with_failure_0_2.instance.invoke(context, m_4235, trans.const4384, j_4235);
              if(term == null)
                break Fail21667;
            }
            term = k_4235;
            if(h_4235 == null)
              break Fail21667;
            term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{d_4235, e_4235, f_4235, h_4235});
            if(true)
              break Success11670;
          }
          term = term11763;
        }
        Success11672:
        { 
          if(cons547 == Main._consImport_1)
          { 
            Fail21669:
            { 
              term = trans.const4385;
              if(true)
                break Success11672;
            }
            term = term11763;
          }
          if(cons547 == Main._consImportWildcard_1)
          { 
            term = trans.const4385;
          }
          else
          { 
            break Fail21666;
          }
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