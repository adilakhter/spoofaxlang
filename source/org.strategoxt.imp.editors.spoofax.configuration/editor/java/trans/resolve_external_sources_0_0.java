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
    Fail22776:
    { 
      IStrategoTerm term12139 = term;
      Success12131:
      { 
        Fail22777:
        { 
          IStrategoTerm v_4613 = null;
          IStrategoTerm w_4613 = null;
          IStrategoTerm b_4614 = null;
          IStrategoTerm d_4614 = null;
          IStrategoTerm e_4614 = null;
          v_4613 = term;
          w_4613 = term;
          IStrategoTerm term12140 = term;
          Success12132:
          { 
            Fail22778:
            { 
              IStrategoTerm g_4614 = null;
              g_4614 = v_4613;
              term = string_starts_with_0_1.instance.invoke(context, g_4614, trans.const4462);
              if(term == null)
                break Fail22778;
              { 
                if(true)
                  break Fail22777;
                if(true)
                  break Success12132;
              }
            }
            term = term12140;
          }
          term = fail_if_no_directory_found_0_0.instance.invoke(context, w_4613);
          if(term == null)
            break Fail22777;
          term = fail_if_no_config_found_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22777;
          term = v_4613;
          IStrategoTerm term12141 = term;
          Success12133:
          { 
            Fail22779:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22779;
              if(true)
                break Success12133;
            }
            term = term12141;
            IStrategoTerm term12142 = term;
            Success12134:
            { 
              Fail22780:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22780;
                if(true)
                  break Success12134;
              }
              term = term12142;
              IStrategoTerm term12143 = term;
              Success12135:
              { 
                Fail22781:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22781;
                  if(true)
                    break Success12135;
                }
                term = term12143;
                IStrategoTerm term12144 = term;
                Success12136:
                { 
                  Fail22782:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22782;
                    if(true)
                      break Success12136;
                  }
                  term = term12144;
                  IStrategoTerm x_4613 = null;
                  IStrategoTerm y_4613 = null;
                  IStrategoTerm a_4614 = null;
                  x_4613 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22777;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22777;
                  y_4613 = ((IStrategoList)term).tail();
                  a_4614 = y_4613;
                  term = report_failure_0_2.instance.invoke(context, a_4614, trans.const4463, x_4613);
                  if(term == null)
                    break Fail22777;
                }
              }
            }
          }
          d_4614 = term;
          b_4614 = trans.const4457;
          e_4614 = d_4614;
          term = string_replace_0_2.instance.invoke(context, e_4614, b_4614, trans.const4457);
          if(term == null)
            break Fail22777;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2044);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22777;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          term = parse_spoofaxconfiguration_file_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22777;
          term = get_all_sources_0_1.instance.invoke(context, term, v_4613);
          if(term == null)
            break Fail22777;
          if(true)
            break Success12131;
        }
        term = term12139;
        IStrategoTerm g_4613 = null;
        IStrategoTerm h_4613 = null;
        IStrategoTerm i_4613 = null;
        IStrategoTerm j_4613 = null;
        IStrategoTerm m_4613 = null;
        IStrategoTerm k_4613 = null;
        g_4613 = term;
        j_4613 = term;
        m_4613 = g_4613;
        term = string_starts_with_0_1.instance.invoke(context, m_4613, trans.const4462);
        if(term == null)
          break Fail22776;
        term = j_4613;
        k_4613 = j_4613;
        term = getcwd_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22776;
        i_4613 = term;
        term = k_4613;
        Success12137:
        { 
          Fail22783:
          { 
            IStrategoTerm s_4613 = null;
            term = fail_if_no_directory_found_0_0.instance.invoke(context, g_4613);
            if(term == null)
              break Fail22783;
            term = chdir_0_0.instance.invoke(context, g_4613);
            if(term == null)
              break Fail22783;
            term = getcwd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22783;
            term = fail_if_no_config_found_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22783;
            term = parse_spoofaxconfiguration_file_0_0.instance.invoke(context, trans.const4465);
            if(term == null)
              break Fail22783;
            s_4613 = term;
            term = getcwd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22783;
            term = get_all_sources_0_1.instance.invoke(context, s_4613, term);
            if(term == null)
              break Fail22783;
            h_4613 = term;
            term = chdir_0_0.instance.invoke(context, i_4613);
            if(term == null)
              break Fail22783;
            term = h_4613;
            if(true)
              break Success12137;
          }
          term = chdir_0_0.instance.invoke(context, i_4613);
          if(term == null)
            break Fail22776;
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