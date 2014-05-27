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

@SuppressWarnings("all") public class find_def_file_0_0 extends Strategy 
{ 
  public static find_def_file_0_0 instance = new find_def_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_def_file_0_0");
    Fail26744:
    { 
      IStrategoTerm d_4395 = null;
      IStrategoTerm e_4395 = null;
      IStrategoTerm i_4396 = null;
      IStrategoTerm j_4396 = null;
      IStrategoTerm l_4396 = null;
      IStrategoTerm m_4396 = null;
      IStrategoTerm n_4396 = null;
      IStrategoTerm g_4395 = null;
      IStrategoTerm h_4395 = null;
      IStrategoTerm q_4396 = null;
      IStrategoTerm r_4396 = null;
      IStrategoTerm t_4396 = null;
      IStrategoTerm u_4396 = null;
      IStrategoTerm v_4396 = null;
      IStrategoTerm j_4395 = null;
      IStrategoTerm d_4397 = null;
      term = remove_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26744;
      d_4395 = term;
      term = base_filename_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26744;
      e_4395 = term;
      l_4396 = term;
      i_4396 = generator.const7897;
      m_4396 = l_4396;
      j_4396 = generator.constCons4561;
      n_4396 = m_4396;
      term = termFactory.makeTuple(generator.const7898, e_4395);
      term = dr_set_rule_0_3.instance.invoke(context, n_4396, i_4396, j_4396, term);
      if(term == null)
        break Fail26744;
      term = d_4395;
      g_4395 = d_4395;
      term = base_filename_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26744;
      term = remove_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26744;
      h_4395 = term;
      t_4396 = term;
      q_4396 = generator.const7899;
      u_4396 = t_4396;
      r_4396 = generator.constCons4561;
      v_4396 = u_4396;
      term = termFactory.makeTuple(generator.const7900, h_4395);
      term = dr_set_rule_0_3.instance.invoke(context, v_4396, q_4396, r_4396, term);
      if(term == null)
        break Fail26744;
      term = g_4395;
      j_4395 = g_4395;
      IStrategoTerm term11153 = term;
      Success10916:
      { 
        Fail26745:
        { 
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26745;
          term = chdir_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26745;
          term = chdir_0_0.instance.invoke(context, generator.const7902);
          if(term == null)
            break Fail26745;
          if(true)
            break Success10916;
        }
        term = term11153;
        TermReference k_4395 = new TermReference();
        if(k_4395.value == null)
          k_4395.value = term;
        else
          if(k_4395.value != term && !k_4395.value.match(term))
            break Fail26744;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26744;
        lifted9533 lifted95330 = new lifted9533();
        lifted95330.k_4395 = k_4395;
        term = report_failure_1_0.instance.invoke(context, term, lifted95330);
        if(term == null)
          break Fail26744;
      }
      d_4397 = j_4395;
      term = guarantee_extension_0_1.instance.invoke(context, d_4397, generator.const7904);
      if(term == null)
        break Fail26744;
      term = base_filename_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26744;
      IStrategoTerm term11154 = term;
      Success10917:
      { 
        Fail26746:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26746;
          if(true)
            break Success10917;
        }
        term = term11154;
        IStrategoTerm r_4395 = null;
        IStrategoTerm t_4395 = null;
        IStrategoTerm u_4395 = null;
        IStrategoTerm term11155 = term;
        Success10918:
        { 
          Fail26747:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26747;
            if(true)
              break Success10918;
          }
          term = term11155;
          IStrategoTerm term11156 = term;
          Success10919:
          { 
            Fail26748:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26748;
              if(true)
                break Success10919;
            }
            term = term11156;
            IStrategoTerm term11157 = term;
            Success10920:
            { 
              Fail26749:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26749;
                if(true)
                  break Success10920;
              }
              term = term11157;
              IStrategoTerm term11158 = term;
              Success10921:
              { 
                Fail26750:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26750;
                  if(true)
                    break Success10921;
                }
                term = term11158;
                IStrategoTerm n_4395 = null;
                IStrategoTerm o_4395 = null;
                IStrategoTerm q_4395 = null;
                n_4395 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26744;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26744;
                o_4395 = ((IStrategoList)term).tail();
                q_4395 = o_4395;
                term = report_failure_0_2.instance.invoke(context, q_4395, generator.const7905, n_4395);
                if(term == null)
                  break Fail26744;
              }
            }
          }
        }
        t_4395 = term;
        r_4395 = generator.const7143;
        u_4395 = t_4395;
        term = string_replace_0_2.instance.invoke(context, u_4395, r_4395, generator.const7162);
        if(term == null)
          break Fail26744;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7420, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26744;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      }
      IStrategoTerm term11159 = term;
      Success10922:
      { 
        Fail26751:
        { 
          IStrategoTerm v_4395 = null;
          v_4395 = term;
          IStrategoTerm term11160 = term;
          Success10923:
          { 
            Fail26752:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26752;
              { 
                if(true)
                  break Fail26751;
                if(true)
                  break Success10923;
              }
            }
            term = term11160;
          }
          term = v_4395;
          { 
            IStrategoTerm j_4397 = null;
            IStrategoTerm c_4396 = null;
            IStrategoTerm e_4396 = null;
            IStrategoTerm f_4396 = null;
            j_4397 = term;
            IStrategoTerm term11161 = term;
            Success10924:
            { 
              Fail26753:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26753;
                if(true)
                  break Success10924;
              }
              term = term11161;
              IStrategoTerm term11162 = term;
              Success10925:
              { 
                Fail26754:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26754;
                  if(true)
                    break Success10925;
                }
                term = term11162;
                IStrategoTerm term11163 = term;
                Success10926:
                { 
                  Fail26755:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26755;
                    if(true)
                      break Success10926;
                  }
                  term = term11163;
                  IStrategoTerm term11164 = term;
                  Success10927:
                  { 
                    Fail26756:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26756;
                      if(true)
                        break Success10927;
                    }
                    term = term11164;
                    IStrategoTerm y_4395 = null;
                    IStrategoTerm z_4395 = null;
                    IStrategoTerm b_4396 = null;
                    y_4395 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26744;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26744;
                    z_4395 = ((IStrategoList)term).tail();
                    b_4396 = z_4395;
                    term = report_failure_0_2.instance.invoke(context, b_4396, generator.const7905, y_4395);
                    if(term == null)
                      break Fail26744;
                  }
                }
              }
            }
            e_4396 = term;
            c_4396 = generator.const7143;
            f_4396 = e_4396;
            term = string_replace_0_2.instance.invoke(context, f_4396, c_4396, generator.const7906);
            if(term == null)
              break Fail26744;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7908, termFactory.makeListCons(term, (IStrategoList)generator.constCons5156));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26744;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = fatal_err_msg_0_1.instance.invoke(context, j_4397, term);
            if(term == null)
              break Fail26744;
            if(true)
              break Success10922;
          }
        }
        term = term11159;
      }
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9534.instance, _Id.instance);
      if(term == null)
        break Fail26744;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}