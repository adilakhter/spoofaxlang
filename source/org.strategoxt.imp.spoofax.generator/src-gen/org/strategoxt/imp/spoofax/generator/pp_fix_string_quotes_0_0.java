package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class pp_fix_string_quotes_0_0 extends Strategy 
{ 
  public static pp_fix_string_quotes_0_0 instance = new pp_fix_string_quotes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_fix_string_quotes_0_0");
    Fail25716:
    { 
      IStrategoTerm term10213 = term;
      IStrategoConstructor cons339 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10164:
      { 
        if(cons339 == SpoofaxGenerator._consString_1)
        { 
          Fail25717:
          { 
            IStrategoTerm k_4252 = null;
            IStrategoTerm l_4252 = null;
            IStrategoTerm o_4252 = null;
            IStrategoTerm r_4252 = null;
            k_4252 = term.getSubterm(0);
            o_4252 = term;
            term = k_4252;
            IStrategoTerm term10214 = term;
            Success10165:
            { 
              Fail25718:
              { 
                IStrategoTerm q_4252 = null;
                q_4252 = term;
                term = string_starts_with_0_1.instance.invoke(context, q_4252, generator.const6955);
                if(term == null)
                  break Fail25718;
                { 
                  if(true)
                    break Fail25717;
                  if(true)
                    break Success10165;
                }
              }
              term = term10214;
            }
            term = o_4252;
            r_4252 = o_4252;
            IStrategoTerm term10215 = term;
            Success10166:
            { 
              Fail25719:
              { 
                term = termFactory.makeTuple(generator.const6955, k_4252, generator.const6955);
                term = conc_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25719;
                l_4252 = term;
                if(true)
                  break Success10166;
              }
              term = term10215;
              IStrategoTerm m_4252 = null;
              IStrategoTerm n_4252 = null;
              IStrategoTerm t_4252 = null;
              m_4252 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail25717;
              n_4252 = term;
              t_4252 = m_4252;
              term = report_with_failure_0_2.instance.invoke(context, t_4252, generator.const7126, n_4252);
              if(term == null)
                break Fail25717;
            }
            term = r_4252;
            if(l_4252 == null)
              break Fail25717;
            term = termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{l_4252});
            if(true)
              break Success10164;
          }
          term = term10213;
        }
        if(cons339 == SpoofaxGenerator._consPlaceholder_1)
        { 
          IStrategoTerm y_4251 = null;
          IStrategoTerm z_4251 = null;
          IStrategoTerm c_4252 = null;
          IStrategoTerm f_4252 = null;
          y_4251 = term.getSubterm(0);
          c_4252 = term;
          term = y_4251;
          IStrategoTerm term10216 = term;
          Success10167:
          { 
            Fail25720:
            { 
              IStrategoTerm e_4252 = null;
              e_4252 = term;
              term = string_starts_with_0_1.instance.invoke(context, e_4252, generator.const6962);
              if(term == null)
                break Fail25720;
              { 
                if(true)
                  break Fail25716;
                if(true)
                  break Success10167;
              }
            }
            term = term10216;
          }
          term = c_4252;
          f_4252 = c_4252;
          IStrategoTerm term10217 = term;
          Success10168:
          { 
            Fail25721:
            { 
              term = termFactory.makeTuple(generator.const6962, y_4251, generator.const6945);
              term = conc_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25721;
              z_4251 = term;
              if(true)
                break Success10168;
            }
            term = term10217;
            IStrategoTerm a_4252 = null;
            IStrategoTerm b_4252 = null;
            IStrategoTerm h_4252 = null;
            a_4252 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail25716;
            b_4252 = term;
            h_4252 = a_4252;
            term = report_with_failure_0_2.instance.invoke(context, h_4252, generator.const7126, b_4252);
            if(term == null)
              break Fail25716;
          }
          term = f_4252;
          if(z_4251 == null)
            break Fail25716;
          term = termFactory.makeAppl(SpoofaxGenerator._consPlaceholder_1, new IStrategoTerm[]{z_4251});
        }
        else
        { 
          break Fail25716;
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