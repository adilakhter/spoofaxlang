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

@SuppressWarnings("all") public class resolve_external_sources_0_0 extends Strategy 
{ 
  public static resolve_external_sources_0_0 instance = new resolve_external_sources_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("resolve_external_sources_0_0");
    Fail87584:
    { 
      IStrategoTerm term47226 = term;
      Success47218:
      { 
        Fail87585:
        { 
          IStrategoTerm s_17557 = null;
          IStrategoTerm t_17557 = null;
          IStrategoTerm y_17557 = null;
          IStrategoTerm a_17558 = null;
          IStrategoTerm b_17558 = null;
          s_17557 = term;
          t_17557 = term;
          IStrategoTerm term47227 = term;
          Success47219:
          { 
            Fail87586:
            { 
              IStrategoTerm d_17558 = null;
              d_17558 = s_17557;
              term = string_starts_with_0_1.instance.invoke(context, d_17558, trans.const17849);
              if(term == null)
                break Fail87586;
              { 
                if(true)
                  break Fail87585;
                if(true)
                  break Success47219;
              }
            }
            term = term47227;
          }
          term = fail_if_no_directory_found_0_0.instance.invoke(context, t_17557);
          if(term == null)
            break Fail87585;
          term = fail_if_no_config_found_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87585;
          term = s_17557;
          IStrategoTerm term47228 = term;
          Success47220:
          { 
            Fail87587:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87587;
              if(true)
                break Success47220;
            }
            term = term47228;
            IStrategoTerm term47229 = term;
            Success47221:
            { 
              Fail87588:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87588;
                if(true)
                  break Success47221;
              }
              term = term47229;
              IStrategoTerm term47230 = term;
              Success47222:
              { 
                Fail87589:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87589;
                  if(true)
                    break Success47222;
                }
                term = term47230;
                IStrategoTerm term47231 = term;
                Success47223:
                { 
                  Fail87590:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87590;
                    if(true)
                      break Success47223;
                  }
                  term = term47231;
                  IStrategoTerm u_17557 = null;
                  IStrategoTerm v_17557 = null;
                  IStrategoTerm x_17557 = null;
                  u_17557 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail87585;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail87585;
                  v_17557 = ((IStrategoList)term).tail();
                  x_17557 = v_17557;
                  term = report_failure_0_2.instance.invoke(context, x_17557, trans.const17850, u_17557);
                  if(term == null)
                    break Fail87585;
                }
              }
            }
          }
          a_17558 = term;
          y_17557 = trans.const17844;
          b_17558 = a_17558;
          term = string_replace_0_2.instance.invoke(context, b_17558, y_17557, trans.const17844);
          if(term == null)
            break Fail87585;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons8525);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87585;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
          term = parse_spoofaxconfiguration_file_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87585;
          term = get_all_sources_0_1.instance.invoke(context, term, s_17557);
          if(term == null)
            break Fail87585;
          if(true)
            break Success47218;
        }
        term = term47226;
        IStrategoTerm d_17557 = null;
        IStrategoTerm e_17557 = null;
        IStrategoTerm f_17557 = null;
        IStrategoTerm g_17557 = null;
        IStrategoTerm j_17557 = null;
        IStrategoTerm h_17557 = null;
        d_17557 = term;
        g_17557 = term;
        j_17557 = d_17557;
        term = string_starts_with_0_1.instance.invoke(context, j_17557, trans.const17849);
        if(term == null)
          break Fail87584;
        term = g_17557;
        h_17557 = g_17557;
        term = getcwd_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87584;
        f_17557 = term;
        term = h_17557;
        Success47224:
        { 
          Fail87591:
          { 
            IStrategoTerm p_17557 = null;
            term = fail_if_no_directory_found_0_0.instance.invoke(context, d_17557);
            if(term == null)
              break Fail87591;
            term = chdir_0_0.instance.invoke(context, d_17557);
            if(term == null)
              break Fail87591;
            term = getcwd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87591;
            term = fail_if_no_config_found_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87591;
            term = parse_spoofaxconfiguration_file_0_0.instance.invoke(context, trans.const17852);
            if(term == null)
              break Fail87591;
            p_17557 = term;
            term = getcwd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87591;
            term = get_all_sources_0_1.instance.invoke(context, p_17557, term);
            if(term == null)
              break Fail87591;
            e_17557 = term;
            term = chdir_0_0.instance.invoke(context, f_17557);
            if(term == null)
              break Fail87591;
            term = e_17557;
            if(true)
              break Success47224;
          }
          term = chdir_0_0.instance.invoke(context, f_17557);
          if(term == null)
            break Fail87584;
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