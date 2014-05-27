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

@SuppressWarnings("all") public class create_spx_common_strategies_0_0 extends Strategy 
{ 
  public static create_spx_common_strategies_0_0 instance = new create_spx_common_strategies_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_spx_common_strategies_0_0");
    Fail26428:
    { 
      IStrategoTerm v_4340 = null;
      TermReference w_4340 = new TermReference();
      TermReference x_4340 = new TermReference();
      TermReference y_4340 = new TermReference();
      TermReference z_4340 = new TermReference();
      TermReference a_4341 = new TermReference();
      TermReference n_4347 = new TermReference();
      TermReference o_4347 = new TermReference();
      TermReference p_4347 = new TermReference();
      IStrategoTerm h_4348 = null;
      IStrategoTerm f_4341 = null;
      IStrategoTerm h_4341 = null;
      IStrategoTerm i_4341 = null;
      TermReference q_4347 = new TermReference();
      IStrategoTerm i_4348 = null;
      IStrategoTerm n_4341 = null;
      IStrategoTerm p_4341 = null;
      IStrategoTerm q_4341 = null;
      TermReference r_4347 = new TermReference();
      IStrategoTerm j_4348 = null;
      IStrategoTerm v_4341 = null;
      IStrategoTerm x_4341 = null;
      IStrategoTerm y_4341 = null;
      TermReference s_4347 = new TermReference();
      IStrategoTerm k_4348 = null;
      IStrategoTerm d_4342 = null;
      IStrategoTerm f_4342 = null;
      IStrategoTerm g_4342 = null;
      TermReference t_4347 = new TermReference();
      IStrategoTerm l_4348 = null;
      IStrategoTerm l_4342 = null;
      IStrategoTerm n_4342 = null;
      IStrategoTerm o_4342 = null;
      TermReference u_4347 = new TermReference();
      IStrategoTerm m_4348 = null;
      IStrategoTerm t_4342 = null;
      IStrategoTerm v_4342 = null;
      IStrategoTerm w_4342 = null;
      TermReference v_4347 = new TermReference();
      IStrategoTerm n_4348 = null;
      IStrategoTerm b_4343 = null;
      IStrategoTerm d_4343 = null;
      IStrategoTerm e_4343 = null;
      TermReference w_4347 = new TermReference();
      IStrategoTerm o_4348 = null;
      IStrategoTerm j_4343 = null;
      IStrategoTerm l_4343 = null;
      IStrategoTerm m_4343 = null;
      TermReference x_4347 = new TermReference();
      IStrategoTerm p_4348 = null;
      IStrategoTerm r_4343 = null;
      IStrategoTerm t_4343 = null;
      IStrategoTerm u_4343 = null;
      TermReference y_4347 = new TermReference();
      TermReference q_4348 = new TermReference();
      TermReference z_4343 = new TermReference();
      TermReference a_4344 = new TermReference();
      TermReference b_4344 = new TermReference();
      TermReference c_4344 = new TermReference();
      TermReference z_4347 = new TermReference();
      TermReference r_4348 = new TermReference();
      TermReference h_4344 = new TermReference();
      TermReference i_4344 = new TermReference();
      TermReference j_4344 = new TermReference();
      TermReference k_4344 = new TermReference();
      TermReference a_4348 = new TermReference();
      TermReference s_4348 = new TermReference();
      TermReference p_4344 = new TermReference();
      TermReference q_4344 = new TermReference();
      TermReference r_4344 = new TermReference();
      TermReference s_4344 = new TermReference();
      TermReference b_4348 = new TermReference();
      TermReference t_4348 = new TermReference();
      TermReference x_4344 = new TermReference();
      TermReference y_4344 = new TermReference();
      TermReference z_4344 = new TermReference();
      TermReference a_4345 = new TermReference();
      TermReference c_4348 = new TermReference();
      TermReference u_4348 = new TermReference();
      TermReference f_4345 = new TermReference();
      TermReference g_4345 = new TermReference();
      TermReference h_4345 = new TermReference();
      TermReference i_4345 = new TermReference();
      TermReference d_4348 = new TermReference();
      TermReference v_4348 = new TermReference();
      TermReference n_4345 = new TermReference();
      TermReference o_4345 = new TermReference();
      TermReference p_4345 = new TermReference();
      TermReference q_4345 = new TermReference();
      TermReference e_4348 = new TermReference();
      TermReference w_4348 = new TermReference();
      TermReference x_4348 = new TermReference();
      TermReference y_4348 = new TermReference();
      TermReference v_4345 = new TermReference();
      TermReference w_4345 = new TermReference();
      TermReference x_4345 = new TermReference();
      TermReference y_4345 = new TermReference();
      TermReference f_4348 = new TermReference();
      TermReference z_4348 = new TermReference();
      TermReference d_4346 = new TermReference();
      TermReference e_4346 = new TermReference();
      TermReference f_4346 = new TermReference();
      TermReference g_4346 = new TermReference();
      TermReference g_4348 = new TermReference();
      TermReference a_4349 = new TermReference();
      TermReference l_4346 = new TermReference();
      TermReference m_4346 = new TermReference();
      TermReference n_4346 = new TermReference();
      TermReference o_4346 = new TermReference();
      TermReference b_4349 = new TermReference();
      TermReference c_4349 = new TermReference();
      TermReference d_4349 = new TermReference();
      TermReference e_4349 = new TermReference();
      TermReference f_4349 = new TermReference();
      TermReference g_4349 = new TermReference();
      TermReference h_4349 = new TermReference();
      TermReference j_4349 = new TermReference();
      TermReference t_4346 = new TermReference();
      TermReference u_4346 = new TermReference();
      TermReference v_4346 = new TermReference();
      TermReference w_4346 = new TermReference();
      TermReference i_4349 = new TermReference();
      TermReference k_4349 = new TermReference();
      TermReference b_4347 = new TermReference();
      TermReference c_4347 = new TermReference();
      TermReference d_4347 = new TermReference();
      TermReference e_4347 = new TermReference();
      term = trans_module_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26428;
      if(w_4340.value == null)
        w_4340.value = term;
      else
        if(w_4340.value != term && !w_4340.value.match(term))
          break Fail26428;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26428;
      if(x_4340.value == null)
        x_4340.value = term;
      else
        if(x_4340.value != term && !x_4340.value.match(term))
          break Fail26428;
      IStrategoTerm term10805 = term;
      Success10661:
      { 
        Fail26429:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26429;
          if(true)
            break Success10661;
        }
        term = default_package_name_0_0.instance.invoke(context, term10805);
        if(term == null)
          break Fail26428;
      }
      v_4340 = term;
      term = generator.const7608;
      if(z_4340.value == null)
        z_4340.value = term;
      else
        if(z_4340.value != term && !z_4340.value.match(term))
          break Fail26428;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26428;
      if(y_4340.value == null)
        y_4340.value = term;
      else
        if(y_4340.value != term && !y_4340.value.match(term))
          break Fail26428;
      term = generator.const7196;
      if(a_4341.value == null)
        a_4341.value = term;
      else
        if(a_4341.value != term && !a_4341.value.match(term))
          break Fail26428;
      if(o_4347.value == null)
        o_4347.value = term;
      else
        if(o_4347.value != term && !o_4347.value.match(term))
          break Fail26428;
      h_4348 = term;
      term = v_4340;
      IStrategoTerm term10806 = term;
      Success10662:
      { 
        Fail26430:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26430;
          if(true)
            break Success10662;
        }
        term = term10806;
        IStrategoTerm term10807 = term;
        Success10663:
        { 
          Fail26431:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26431;
            if(true)
              break Success10663;
          }
          term = term10807;
          IStrategoTerm term10808 = term;
          Success10664:
          { 
            Fail26432:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26432;
              if(true)
                break Success10664;
            }
            term = term10808;
            IStrategoTerm term10809 = term;
            Success10665:
            { 
              Fail26433:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26433;
                if(true)
                  break Success10665;
              }
              term = term10809;
              IStrategoTerm b_4341 = null;
              IStrategoTerm c_4341 = null;
              IStrategoTerm e_4341 = null;
              b_4341 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              c_4341 = ((IStrategoList)term).tail();
              e_4341 = c_4341;
              term = report_failure_0_2.instance.invoke(context, e_4341, generator.const7571, b_4341);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      h_4341 = term;
      f_4341 = generator.const7143;
      i_4341 = h_4341;
      term = string_replace_0_2.instance.invoke(context, i_4341, f_4341, generator.const7162);
      if(term == null)
        break Fail26428;
      if(p_4347.value == null)
        p_4347.value = term;
      else
        if(p_4347.value != term && !p_4347.value.match(term))
          break Fail26428;
      term = h_4348;
      i_4348 = h_4348;
      if(w_4340.value == null)
        break Fail26428;
      term = w_4340.value;
      IStrategoTerm term10810 = term;
      Success10666:
      { 
        Fail26434:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26434;
          if(true)
            break Success10666;
        }
        term = term10810;
        IStrategoTerm term10811 = term;
        Success10667:
        { 
          Fail26435:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26435;
            if(true)
              break Success10667;
          }
          term = term10811;
          IStrategoTerm term10812 = term;
          Success10668:
          { 
            Fail26436:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26436;
              if(true)
                break Success10668;
            }
            term = term10812;
            IStrategoTerm term10813 = term;
            Success10669:
            { 
              Fail26437:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26437;
                if(true)
                  break Success10669;
              }
              term = term10813;
              IStrategoTerm j_4341 = null;
              IStrategoTerm k_4341 = null;
              IStrategoTerm m_4341 = null;
              j_4341 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              k_4341 = ((IStrategoList)term).tail();
              m_4341 = k_4341;
              term = report_failure_0_2.instance.invoke(context, m_4341, generator.const7571, j_4341);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      p_4341 = term;
      n_4341 = generator.const7143;
      q_4341 = p_4341;
      term = string_replace_0_2.instance.invoke(context, q_4341, n_4341, generator.const7609);
      if(term == null)
        break Fail26428;
      if(q_4347.value == null)
        q_4347.value = term;
      else
        if(q_4347.value != term && !q_4347.value.match(term))
          break Fail26428;
      term = i_4348;
      j_4348 = i_4348;
      if(w_4340.value == null)
        break Fail26428;
      term = w_4340.value;
      IStrategoTerm term10814 = term;
      Success10670:
      { 
        Fail26438:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26438;
          if(true)
            break Success10670;
        }
        term = term10814;
        IStrategoTerm term10815 = term;
        Success10671:
        { 
          Fail26439:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26439;
            if(true)
              break Success10671;
          }
          term = term10815;
          IStrategoTerm term10816 = term;
          Success10672:
          { 
            Fail26440:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26440;
              if(true)
                break Success10672;
            }
            term = term10816;
            IStrategoTerm term10817 = term;
            Success10673:
            { 
              Fail26441:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26441;
                if(true)
                  break Success10673;
              }
              term = term10817;
              IStrategoTerm r_4341 = null;
              IStrategoTerm s_4341 = null;
              IStrategoTerm u_4341 = null;
              r_4341 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              s_4341 = ((IStrategoList)term).tail();
              u_4341 = s_4341;
              term = report_failure_0_2.instance.invoke(context, u_4341, generator.const7571, r_4341);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      x_4341 = term;
      v_4341 = generator.const7143;
      y_4341 = x_4341;
      term = string_replace_0_2.instance.invoke(context, y_4341, v_4341, generator.const7162);
      if(term == null)
        break Fail26428;
      if(r_4347.value == null)
        r_4347.value = term;
      else
        if(r_4347.value != term && !r_4347.value.match(term))
          break Fail26428;
      term = j_4348;
      k_4348 = j_4348;
      if(x_4340.value == null)
        break Fail26428;
      term = x_4340.value;
      IStrategoTerm term10818 = term;
      Success10674:
      { 
        Fail26442:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26442;
          if(true)
            break Success10674;
        }
        term = term10818;
        IStrategoTerm term10819 = term;
        Success10675:
        { 
          Fail26443:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26443;
            if(true)
              break Success10675;
          }
          term = term10819;
          IStrategoTerm term10820 = term;
          Success10676:
          { 
            Fail26444:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26444;
              if(true)
                break Success10676;
            }
            term = term10820;
            IStrategoTerm term10821 = term;
            Success10677:
            { 
              Fail26445:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26445;
                if(true)
                  break Success10677;
              }
              term = term10821;
              IStrategoTerm z_4341 = null;
              IStrategoTerm a_4342 = null;
              IStrategoTerm c_4342 = null;
              z_4341 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              a_4342 = ((IStrategoList)term).tail();
              c_4342 = a_4342;
              term = report_failure_0_2.instance.invoke(context, c_4342, generator.const7571, z_4341);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      f_4342 = term;
      d_4342 = generator.const7143;
      g_4342 = f_4342;
      term = string_replace_0_2.instance.invoke(context, g_4342, d_4342, generator.const7572);
      if(term == null)
        break Fail26428;
      if(s_4347.value == null)
        s_4347.value = term;
      else
        if(s_4347.value != term && !s_4347.value.match(term))
          break Fail26428;
      term = k_4348;
      l_4348 = k_4348;
      if(w_4340.value == null)
        break Fail26428;
      term = w_4340.value;
      IStrategoTerm term10822 = term;
      Success10678:
      { 
        Fail26446:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26446;
          if(true)
            break Success10678;
        }
        term = term10822;
        IStrategoTerm term10823 = term;
        Success10679:
        { 
          Fail26447:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26447;
            if(true)
              break Success10679;
          }
          term = term10823;
          IStrategoTerm term10824 = term;
          Success10680:
          { 
            Fail26448:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26448;
              if(true)
                break Success10680;
            }
            term = term10824;
            IStrategoTerm term10825 = term;
            Success10681:
            { 
              Fail26449:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26449;
                if(true)
                  break Success10681;
              }
              term = term10825;
              IStrategoTerm h_4342 = null;
              IStrategoTerm i_4342 = null;
              IStrategoTerm k_4342 = null;
              h_4342 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              i_4342 = ((IStrategoList)term).tail();
              k_4342 = i_4342;
              term = report_failure_0_2.instance.invoke(context, k_4342, generator.const7571, h_4342);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      n_4342 = term;
      l_4342 = generator.const7143;
      o_4342 = n_4342;
      term = string_replace_0_2.instance.invoke(context, o_4342, l_4342, generator.const7610);
      if(term == null)
        break Fail26428;
      if(t_4347.value == null)
        t_4347.value = term;
      else
        if(t_4347.value != term && !t_4347.value.match(term))
          break Fail26428;
      term = l_4348;
      m_4348 = l_4348;
      if(w_4340.value == null)
        break Fail26428;
      term = w_4340.value;
      IStrategoTerm term10826 = term;
      Success10682:
      { 
        Fail26450:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26450;
          if(true)
            break Success10682;
        }
        term = term10826;
        IStrategoTerm term10827 = term;
        Success10683:
        { 
          Fail26451:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26451;
            if(true)
              break Success10683;
          }
          term = term10827;
          IStrategoTerm term10828 = term;
          Success10684:
          { 
            Fail26452:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26452;
              if(true)
                break Success10684;
            }
            term = term10828;
            IStrategoTerm term10829 = term;
            Success10685:
            { 
              Fail26453:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26453;
                if(true)
                  break Success10685;
              }
              term = term10829;
              IStrategoTerm p_4342 = null;
              IStrategoTerm q_4342 = null;
              IStrategoTerm s_4342 = null;
              p_4342 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              q_4342 = ((IStrategoList)term).tail();
              s_4342 = q_4342;
              term = report_failure_0_2.instance.invoke(context, s_4342, generator.const7571, p_4342);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      v_4342 = term;
      t_4342 = generator.const7143;
      w_4342 = v_4342;
      term = string_replace_0_2.instance.invoke(context, w_4342, t_4342, generator.const7162);
      if(term == null)
        break Fail26428;
      if(u_4347.value == null)
        u_4347.value = term;
      else
        if(u_4347.value != term && !u_4347.value.match(term))
          break Fail26428;
      term = m_4348;
      n_4348 = m_4348;
      if(x_4340.value == null)
        break Fail26428;
      term = x_4340.value;
      IStrategoTerm term10830 = term;
      Success10686:
      { 
        Fail26454:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26454;
          if(true)
            break Success10686;
        }
        term = term10830;
        IStrategoTerm term10831 = term;
        Success10687:
        { 
          Fail26455:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26455;
            if(true)
              break Success10687;
          }
          term = term10831;
          IStrategoTerm term10832 = term;
          Success10688:
          { 
            Fail26456:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26456;
              if(true)
                break Success10688;
            }
            term = term10832;
            IStrategoTerm term10833 = term;
            Success10689:
            { 
              Fail26457:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26457;
                if(true)
                  break Success10689;
              }
              term = term10833;
              IStrategoTerm x_4342 = null;
              IStrategoTerm y_4342 = null;
              IStrategoTerm a_4343 = null;
              x_4342 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              y_4342 = ((IStrategoList)term).tail();
              a_4343 = y_4342;
              term = report_failure_0_2.instance.invoke(context, a_4343, generator.const7571, x_4342);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      d_4343 = term;
      b_4343 = generator.const7143;
      e_4343 = d_4343;
      term = string_replace_0_2.instance.invoke(context, e_4343, b_4343, generator.const7572);
      if(term == null)
        break Fail26428;
      if(v_4347.value == null)
        v_4347.value = term;
      else
        if(v_4347.value != term && !v_4347.value.match(term))
          break Fail26428;
      term = n_4348;
      o_4348 = n_4348;
      if(w_4340.value == null)
        break Fail26428;
      term = w_4340.value;
      IStrategoTerm term10834 = term;
      Success10690:
      { 
        Fail26458:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26458;
          if(true)
            break Success10690;
        }
        term = term10834;
        IStrategoTerm term10835 = term;
        Success10691:
        { 
          Fail26459:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26459;
            if(true)
              break Success10691;
          }
          term = term10835;
          IStrategoTerm term10836 = term;
          Success10692:
          { 
            Fail26460:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26460;
              if(true)
                break Success10692;
            }
            term = term10836;
            IStrategoTerm term10837 = term;
            Success10693:
            { 
              Fail26461:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26461;
                if(true)
                  break Success10693;
              }
              term = term10837;
              IStrategoTerm f_4343 = null;
              IStrategoTerm g_4343 = null;
              IStrategoTerm i_4343 = null;
              f_4343 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              g_4343 = ((IStrategoList)term).tail();
              i_4343 = g_4343;
              term = report_failure_0_2.instance.invoke(context, i_4343, generator.const7571, f_4343);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      l_4343 = term;
      j_4343 = generator.const7143;
      m_4343 = l_4343;
      term = string_replace_0_2.instance.invoke(context, m_4343, j_4343, generator.const7610);
      if(term == null)
        break Fail26428;
      if(w_4347.value == null)
        w_4347.value = term;
      else
        if(w_4347.value != term && !w_4347.value.match(term))
          break Fail26428;
      term = o_4348;
      p_4348 = o_4348;
      if(w_4340.value == null)
        break Fail26428;
      term = w_4340.value;
      IStrategoTerm term10838 = term;
      Success10694:
      { 
        Fail26462:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26462;
          if(true)
            break Success10694;
        }
        term = term10838;
        IStrategoTerm term10839 = term;
        Success10695:
        { 
          Fail26463:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26463;
            if(true)
              break Success10695;
          }
          term = term10839;
          IStrategoTerm term10840 = term;
          Success10696:
          { 
            Fail26464:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26464;
              if(true)
                break Success10696;
            }
            term = term10840;
            IStrategoTerm term10841 = term;
            Success10697:
            { 
              Fail26465:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26465;
                if(true)
                  break Success10697;
              }
              term = term10841;
              IStrategoTerm n_4343 = null;
              IStrategoTerm o_4343 = null;
              IStrategoTerm q_4343 = null;
              n_4343 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26428;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26428;
              o_4343 = ((IStrategoList)term).tail();
              q_4343 = o_4343;
              term = report_failure_0_2.instance.invoke(context, q_4343, generator.const7571, n_4343);
              if(term == null)
                break Fail26428;
            }
          }
        }
      }
      t_4343 = term;
      r_4343 = generator.const7143;
      u_4343 = t_4343;
      term = string_replace_0_2.instance.invoke(context, u_4343, r_4343, generator.const7162);
      if(term == null)
        break Fail26428;
      if(x_4347.value == null)
        x_4347.value = term;
      else
        if(x_4347.value != term && !x_4347.value.match(term))
          break Fail26428;
      term = p_4348;
      if(q_4348.value == null)
        q_4348.value = term;
      else
        if(q_4348.value != term && !q_4348.value.match(term))
          break Fail26428;
      if(x_4340.value == null)
        break Fail26428;
      term = x_4340.value;
      create_spx_common_strategies_0_0_fragment_0 create_spx_common_strategies_0_0_fragment_00 = new create_spx_common_strategies_0_0_fragment_0();
      create_spx_common_strategies_0_0_fragment_00.b_4344 = b_4344;
      create_spx_common_strategies_0_0_fragment_00.c_4344 = c_4344;
      create_spx_common_strategies_0_0_fragment_00.z_4343 = z_4343;
      create_spx_common_strategies_0_0_fragment_00.a_4344 = a_4344;
      create_spx_common_strategies_0_0_fragment_00.q_4348 = q_4348;
      create_spx_common_strategies_0_0_fragment_00.w_4340 = w_4340;
      create_spx_common_strategies_0_0_fragment_00.j_4344 = j_4344;
      create_spx_common_strategies_0_0_fragment_00.k_4344 = k_4344;
      create_spx_common_strategies_0_0_fragment_00.h_4344 = h_4344;
      create_spx_common_strategies_0_0_fragment_00.i_4344 = i_4344;
      create_spx_common_strategies_0_0_fragment_00.r_4348 = r_4348;
      create_spx_common_strategies_0_0_fragment_00.r_4344 = r_4344;
      create_spx_common_strategies_0_0_fragment_00.s_4344 = s_4344;
      create_spx_common_strategies_0_0_fragment_00.p_4344 = p_4344;
      create_spx_common_strategies_0_0_fragment_00.q_4344 = q_4344;
      create_spx_common_strategies_0_0_fragment_00.s_4348 = s_4348;
      create_spx_common_strategies_0_0_fragment_00.z_4344 = z_4344;
      create_spx_common_strategies_0_0_fragment_00.a_4345 = a_4345;
      create_spx_common_strategies_0_0_fragment_00.x_4344 = x_4344;
      create_spx_common_strategies_0_0_fragment_00.y_4344 = y_4344;
      create_spx_common_strategies_0_0_fragment_00.t_4348 = t_4348;
      create_spx_common_strategies_0_0_fragment_00.h_4345 = h_4345;
      create_spx_common_strategies_0_0_fragment_00.i_4345 = i_4345;
      create_spx_common_strategies_0_0_fragment_00.f_4345 = f_4345;
      create_spx_common_strategies_0_0_fragment_00.g_4345 = g_4345;
      create_spx_common_strategies_0_0_fragment_00.u_4348 = u_4348;
      create_spx_common_strategies_0_0_fragment_00.p_4345 = p_4345;
      create_spx_common_strategies_0_0_fragment_00.q_4345 = q_4345;
      create_spx_common_strategies_0_0_fragment_00.n_4345 = n_4345;
      create_spx_common_strategies_0_0_fragment_00.o_4345 = o_4345;
      create_spx_common_strategies_0_0_fragment_00.v_4348 = v_4348;
      create_spx_common_strategies_0_0_fragment_00.y_4348 = y_4348;
      create_spx_common_strategies_0_0_fragment_00.x_4348 = x_4348;
      create_spx_common_strategies_0_0_fragment_00.x_4345 = x_4345;
      create_spx_common_strategies_0_0_fragment_00.y_4345 = y_4345;
      create_spx_common_strategies_0_0_fragment_00.v_4345 = v_4345;
      create_spx_common_strategies_0_0_fragment_00.w_4345 = w_4345;
      create_spx_common_strategies_0_0_fragment_00.w_4348 = w_4348;
      create_spx_common_strategies_0_0_fragment_00.f_4346 = f_4346;
      create_spx_common_strategies_0_0_fragment_00.g_4346 = g_4346;
      create_spx_common_strategies_0_0_fragment_00.d_4346 = d_4346;
      create_spx_common_strategies_0_0_fragment_00.e_4346 = e_4346;
      create_spx_common_strategies_0_0_fragment_00.z_4348 = z_4348;
      create_spx_common_strategies_0_0_fragment_00.x_4340 = x_4340;
      create_spx_common_strategies_0_0_fragment_00.n_4346 = n_4346;
      create_spx_common_strategies_0_0_fragment_00.o_4346 = o_4346;
      create_spx_common_strategies_0_0_fragment_00.l_4346 = l_4346;
      create_spx_common_strategies_0_0_fragment_00.m_4346 = m_4346;
      create_spx_common_strategies_0_0_fragment_00.a_4349 = a_4349;
      create_spx_common_strategies_0_0_fragment_00.p_4347 = p_4347;
      create_spx_common_strategies_0_0_fragment_00.q_4347 = q_4347;
      create_spx_common_strategies_0_0_fragment_00.r_4347 = r_4347;
      create_spx_common_strategies_0_0_fragment_00.s_4347 = s_4347;
      create_spx_common_strategies_0_0_fragment_00.t_4347 = t_4347;
      create_spx_common_strategies_0_0_fragment_00.u_4347 = u_4347;
      create_spx_common_strategies_0_0_fragment_00.v_4347 = v_4347;
      create_spx_common_strategies_0_0_fragment_00.w_4347 = w_4347;
      create_spx_common_strategies_0_0_fragment_00.x_4347 = x_4347;
      create_spx_common_strategies_0_0_fragment_00.y_4347 = y_4347;
      create_spx_common_strategies_0_0_fragment_00.z_4347 = z_4347;
      create_spx_common_strategies_0_0_fragment_00.a_4348 = a_4348;
      create_spx_common_strategies_0_0_fragment_00.b_4348 = b_4348;
      create_spx_common_strategies_0_0_fragment_00.c_4348 = c_4348;
      create_spx_common_strategies_0_0_fragment_00.d_4348 = d_4348;
      create_spx_common_strategies_0_0_fragment_00.e_4348 = e_4348;
      create_spx_common_strategies_0_0_fragment_00.f_4348 = f_4348;
      create_spx_common_strategies_0_0_fragment_00.g_4348 = g_4348;
      create_spx_common_strategies_0_0_fragment_00.o_4347 = o_4347;
      create_spx_common_strategies_0_0_fragment_00.n_4347 = n_4347;
      create_spx_common_strategies_0_0_fragment_00.y_4340 = y_4340;
      create_spx_common_strategies_0_0_fragment_00.d_4349 = d_4349;
      create_spx_common_strategies_0_0_fragment_00.z_4340 = z_4340;
      create_spx_common_strategies_0_0_fragment_00.v_4346 = v_4346;
      create_spx_common_strategies_0_0_fragment_00.w_4346 = w_4346;
      create_spx_common_strategies_0_0_fragment_00.t_4346 = t_4346;
      create_spx_common_strategies_0_0_fragment_00.u_4346 = u_4346;
      create_spx_common_strategies_0_0_fragment_00.j_4349 = j_4349;
      create_spx_common_strategies_0_0_fragment_00.a_4341 = a_4341;
      create_spx_common_strategies_0_0_fragment_00.d_4347 = d_4347;
      create_spx_common_strategies_0_0_fragment_00.e_4347 = e_4347;
      create_spx_common_strategies_0_0_fragment_00.b_4347 = b_4347;
      create_spx_common_strategies_0_0_fragment_00.c_4347 = c_4347;
      create_spx_common_strategies_0_0_fragment_00.k_4349 = k_4349;
      create_spx_common_strategies_0_0_fragment_00.h_4349 = h_4349;
      create_spx_common_strategies_0_0_fragment_00.i_4349 = i_4349;
      create_spx_common_strategies_0_0_fragment_00.g_4349 = g_4349;
      create_spx_common_strategies_0_0_fragment_00.f_4349 = f_4349;
      create_spx_common_strategies_0_0_fragment_00.e_4349 = e_4349;
      create_spx_common_strategies_0_0_fragment_00.b_4349 = b_4349;
      create_spx_common_strategies_0_0_fragment_00.c_4349 = c_4349;
      term = create_spx_common_strategies_0_0_fragment_00.invoke(context, term);
      if(term == null)
        break Fail26428;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}