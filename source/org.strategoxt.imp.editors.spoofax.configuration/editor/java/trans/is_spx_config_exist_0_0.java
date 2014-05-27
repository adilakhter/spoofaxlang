package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_spx_config_exist_0_0 extends Strategy 
{ 
  public static is_spx_config_exist_0_0 instance = new is_spx_config_exist_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_spx_config_exist_0_0");
    Fail87632:
    { 
      IStrategoTerm u_17561 = null;
      IStrategoTerm v_17561 = null;
      IStrategoTerm c_17562 = null;
      IStrategoTerm e_17562 = null;
      IStrategoTerm f_17562 = null;
      IStrategoTerm g_17562 = null;
      IStrategoTerm n_17562 = null;
      IStrategoTerm p_17562 = null;
      IStrategoTerm q_17562 = null;
      IStrategoTerm a_17563 = null;
      IStrategoTerm b_17563 = null;
      IStrategoTerm d_17563 = null;
      IStrategoTerm e_17563 = null;
      IStrategoTerm f_17563 = null;
      v_17561 = term;
      IStrategoTerm term47260 = term;
      Success47251:
      { 
        Fail87633:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87633;
          if(true)
            break Success47251;
        }
        term = term47260;
        IStrategoTerm term47261 = term;
        Success47252:
        { 
          Fail87634:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87634;
            if(true)
              break Success47252;
          }
          term = term47261;
          IStrategoTerm term47262 = term;
          Success47253:
          { 
            Fail87635:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87635;
              if(true)
                break Success47253;
            }
            term = term47262;
            IStrategoTerm term47263 = term;
            Success47254:
            { 
              Fail87636:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87636;
                if(true)
                  break Success47254;
              }
              term = term47263;
              IStrategoTerm y_17561 = null;
              IStrategoTerm z_17561 = null;
              IStrategoTerm b_17562 = null;
              y_17561 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail87632;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail87632;
              z_17561 = ((IStrategoList)term).tail();
              b_17562 = z_17561;
              term = report_failure_0_2.instance.invoke(context, b_17562, trans.const17868, y_17561);
              if(term == null)
                break Fail87632;
            }
          }
        }
      }
      e_17562 = term;
      c_17562 = trans.const17844;
      f_17562 = e_17562;
      term = string_replace_0_2.instance.invoke(context, f_17562, c_17562, trans.const17844);
      if(term == null)
        break Fail87632;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons8525);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87632;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
      term = file_exists_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87632;
      term = v_17561;
      g_17562 = v_17561;
      IStrategoTerm term47264 = term;
      Success47255:
      { 
        Fail87637:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87637;
          if(true)
            break Success47255;
        }
        term = term47264;
        IStrategoTerm term47265 = term;
        Success47256:
        { 
          Fail87638:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87638;
            if(true)
              break Success47256;
          }
          term = term47265;
          IStrategoTerm term47266 = term;
          Success47257:
          { 
            Fail87639:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87639;
              if(true)
                break Success47257;
            }
            term = term47266;
            IStrategoTerm term47267 = term;
            Success47258:
            { 
              Fail87640:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87640;
                if(true)
                  break Success47258;
              }
              term = term47267;
              IStrategoTerm j_17562 = null;
              IStrategoTerm k_17562 = null;
              IStrategoTerm m_17562 = null;
              j_17562 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail87632;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail87632;
              k_17562 = ((IStrategoList)term).tail();
              m_17562 = k_17562;
              term = report_failure_0_2.instance.invoke(context, m_17562, trans.const17868, j_17562);
              if(term == null)
                break Fail87632;
            }
          }
        }
      }
      p_17562 = term;
      n_17562 = trans.const17844;
      q_17562 = p_17562;
      term = string_replace_0_2.instance.invoke(context, q_17562, n_17562, trans.const17844);
      if(term == null)
        break Fail87632;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons8525);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87632;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
      u_17561 = term;
      d_17563 = term;
      a_17563 = trans.const17869;
      e_17563 = d_17563;
      b_17563 = trans.constCons8528;
      f_17563 = e_17563;
      term = termFactory.makeTuple(trans.const17870, u_17561);
      term = dr_add_rule_0_3.instance.invoke(context, f_17563, a_17563, b_17563, term);
      if(term == null)
        break Fail87632;
      term = g_17562;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}