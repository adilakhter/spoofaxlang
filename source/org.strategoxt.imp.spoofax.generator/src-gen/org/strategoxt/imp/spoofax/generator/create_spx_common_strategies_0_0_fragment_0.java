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

@SuppressWarnings("all") final class create_spx_common_strategies_0_0_fragment_0 extends Strategy 
{ 
  TermReference b_4344;

  TermReference c_4344;

  TermReference z_4343;

  TermReference a_4344;

  TermReference q_4348;

  TermReference w_4340;

  TermReference j_4344;

  TermReference k_4344;

  TermReference h_4344;

  TermReference i_4344;

  TermReference r_4348;

  TermReference r_4344;

  TermReference s_4344;

  TermReference p_4344;

  TermReference q_4344;

  TermReference s_4348;

  TermReference z_4344;

  TermReference a_4345;

  TermReference x_4344;

  TermReference y_4344;

  TermReference t_4348;

  TermReference h_4345;

  TermReference i_4345;

  TermReference f_4345;

  TermReference g_4345;

  TermReference u_4348;

  TermReference p_4345;

  TermReference q_4345;

  TermReference n_4345;

  TermReference o_4345;

  TermReference v_4348;

  TermReference y_4348;

  TermReference x_4348;

  TermReference x_4345;

  TermReference y_4345;

  TermReference v_4345;

  TermReference w_4345;

  TermReference w_4348;

  TermReference f_4346;

  TermReference g_4346;

  TermReference d_4346;

  TermReference e_4346;

  TermReference z_4348;

  TermReference x_4340;

  TermReference n_4346;

  TermReference o_4346;

  TermReference l_4346;

  TermReference m_4346;

  TermReference a_4349;

  TermReference p_4347;

  TermReference q_4347;

  TermReference r_4347;

  TermReference s_4347;

  TermReference t_4347;

  TermReference u_4347;

  TermReference v_4347;

  TermReference w_4347;

  TermReference x_4347;

  TermReference y_4347;

  TermReference z_4347;

  TermReference a_4348;

  TermReference b_4348;

  TermReference c_4348;

  TermReference d_4348;

  TermReference e_4348;

  TermReference f_4348;

  TermReference g_4348;

  TermReference o_4347;

  TermReference n_4347;

  TermReference y_4340;

  TermReference d_4349;

  TermReference z_4340;

  TermReference v_4346;

  TermReference w_4346;

  TermReference t_4346;

  TermReference u_4346;

  TermReference j_4349;

  TermReference a_4341;

  TermReference d_4347;

  TermReference e_4347;

  TermReference b_4347;

  TermReference c_4347;

  TermReference k_4349;

  TermReference h_4349;

  TermReference i_4349;

  TermReference g_4349;

  TermReference f_4349;

  TermReference e_4349;

  TermReference b_4349;

  TermReference c_4349;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28554:
    { 
      IStrategoTerm term10761 = term;
      Success11288:
      { 
        Fail28555:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28555;
          if(true)
            break Success11288;
        }
        term = term10761;
        IStrategoTerm term10762 = term;
        Success11289:
        { 
          Fail28556:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28556;
            if(true)
              break Success11289;
          }
          term = term10762;
          IStrategoTerm term10763 = term;
          Success11290:
          { 
            Fail28557:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28557;
              if(true)
                break Success11290;
            }
            term = term10763;
            IStrategoTerm term10764 = term;
            Success11291:
            { 
              Fail28558:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28558;
                if(true)
                  break Success11291;
              }
              term = term10764;
              IStrategoTerm v_4343 = null;
              IStrategoTerm w_4343 = null;
              IStrategoTerm y_4343 = null;
              v_4343 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              w_4343 = ((IStrategoList)term).tail();
              y_4343 = w_4343;
              term = report_failure_0_2.instance.invoke(context, y_4343, generator.const7571, v_4343);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(b_4344.value == null)
        b_4344.value = term;
      else
        if(b_4344.value != term && !b_4344.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(z_4343.value == null)
        z_4343.value = term;
      else
        if(z_4343.value != term && !z_4343.value.match(term))
          break Fail28554;
      if(b_4344.value == null)
        break Fail28554;
      term = b_4344.value;
      if(c_4344.value == null)
        c_4344.value = term;
      else
        if(c_4344.value != term && !c_4344.value.match(term))
          break Fail28554;
      term = generator.const7572;
      if(a_4344.value == null)
        a_4344.value = term;
      else
        if(a_4344.value != term && !a_4344.value.match(term))
          break Fail28554;
      if(c_4344.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, c_4344.value, z_4343.value, a_4344.value);
      if(term == null)
        break Fail28554;
      if(y_4347.value == null)
        y_4347.value = term;
      else
        if(y_4347.value != term && !y_4347.value.match(term))
          break Fail28554;
      if(q_4348.value == null)
        break Fail28554;
      term = q_4348.value;
      if(r_4348.value == null)
        r_4348.value = term;
      else
        if(r_4348.value != term && !r_4348.value.match(term))
          break Fail28554;
      if(w_4340.value == null)
        break Fail28554;
      term = w_4340.value;
      IStrategoTerm term10765 = term;
      Success11292:
      { 
        Fail28559:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28559;
          if(true)
            break Success11292;
        }
        term = term10765;
        IStrategoTerm term10766 = term;
        Success11293:
        { 
          Fail28560:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28560;
            if(true)
              break Success11293;
          }
          term = term10766;
          IStrategoTerm term10767 = term;
          Success11294:
          { 
            Fail28561:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28561;
              if(true)
                break Success11294;
            }
            term = term10767;
            IStrategoTerm term10768 = term;
            Success11295:
            { 
              Fail28562:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28562;
                if(true)
                  break Success11295;
              }
              term = term10768;
              IStrategoTerm d_4344 = null;
              IStrategoTerm e_4344 = null;
              IStrategoTerm g_4344 = null;
              d_4344 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              e_4344 = ((IStrategoList)term).tail();
              g_4344 = e_4344;
              term = report_failure_0_2.instance.invoke(context, g_4344, generator.const7571, d_4344);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(j_4344.value == null)
        j_4344.value = term;
      else
        if(j_4344.value != term && !j_4344.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(h_4344.value == null)
        h_4344.value = term;
      else
        if(h_4344.value != term && !h_4344.value.match(term))
          break Fail28554;
      if(j_4344.value == null)
        break Fail28554;
      term = j_4344.value;
      if(k_4344.value == null)
        k_4344.value = term;
      else
        if(k_4344.value != term && !k_4344.value.match(term))
          break Fail28554;
      term = generator.const7573;
      if(i_4344.value == null)
        i_4344.value = term;
      else
        if(i_4344.value != term && !i_4344.value.match(term))
          break Fail28554;
      if(k_4344.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, k_4344.value, h_4344.value, i_4344.value);
      if(term == null)
        break Fail28554;
      if(z_4347.value == null)
        z_4347.value = term;
      else
        if(z_4347.value != term && !z_4347.value.match(term))
          break Fail28554;
      if(r_4348.value == null)
        break Fail28554;
      term = r_4348.value;
      if(s_4348.value == null)
        s_4348.value = term;
      else
        if(s_4348.value != term && !s_4348.value.match(term))
          break Fail28554;
      if(x_4340.value == null)
        break Fail28554;
      term = x_4340.value;
      IStrategoTerm term10769 = term;
      Success11296:
      { 
        Fail28563:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28563;
          if(true)
            break Success11296;
        }
        term = term10769;
        IStrategoTerm term10770 = term;
        Success11297:
        { 
          Fail28564:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28564;
            if(true)
              break Success11297;
          }
          term = term10770;
          IStrategoTerm term10771 = term;
          Success11298:
          { 
            Fail28565:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28565;
              if(true)
                break Success11298;
            }
            term = term10771;
            IStrategoTerm term10772 = term;
            Success11299:
            { 
              Fail28566:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28566;
                if(true)
                  break Success11299;
              }
              term = term10772;
              IStrategoTerm l_4344 = null;
              IStrategoTerm m_4344 = null;
              IStrategoTerm o_4344 = null;
              l_4344 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              m_4344 = ((IStrategoList)term).tail();
              o_4344 = m_4344;
              term = report_failure_0_2.instance.invoke(context, o_4344, generator.const7571, l_4344);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(r_4344.value == null)
        r_4344.value = term;
      else
        if(r_4344.value != term && !r_4344.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(p_4344.value == null)
        p_4344.value = term;
      else
        if(p_4344.value != term && !p_4344.value.match(term))
          break Fail28554;
      if(r_4344.value == null)
        break Fail28554;
      term = r_4344.value;
      if(s_4344.value == null)
        s_4344.value = term;
      else
        if(s_4344.value != term && !s_4344.value.match(term))
          break Fail28554;
      term = generator.const7574;
      if(q_4344.value == null)
        q_4344.value = term;
      else
        if(q_4344.value != term && !q_4344.value.match(term))
          break Fail28554;
      if(s_4344.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, s_4344.value, p_4344.value, q_4344.value);
      if(term == null)
        break Fail28554;
      if(a_4348.value == null)
        a_4348.value = term;
      else
        if(a_4348.value != term && !a_4348.value.match(term))
          break Fail28554;
      if(s_4348.value == null)
        break Fail28554;
      term = s_4348.value;
      if(t_4348.value == null)
        t_4348.value = term;
      else
        if(t_4348.value != term && !t_4348.value.match(term))
          break Fail28554;
      if(x_4340.value == null)
        break Fail28554;
      term = x_4340.value;
      IStrategoTerm term10773 = term;
      Success11300:
      { 
        Fail28567:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28567;
          if(true)
            break Success11300;
        }
        term = term10773;
        IStrategoTerm term10774 = term;
        Success11301:
        { 
          Fail28568:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28568;
            if(true)
              break Success11301;
          }
          term = term10774;
          IStrategoTerm term10775 = term;
          Success11302:
          { 
            Fail28569:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28569;
              if(true)
                break Success11302;
            }
            term = term10775;
            IStrategoTerm term10776 = term;
            Success11303:
            { 
              Fail28570:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28570;
                if(true)
                  break Success11303;
              }
              term = term10776;
              IStrategoTerm t_4344 = null;
              IStrategoTerm u_4344 = null;
              IStrategoTerm w_4344 = null;
              t_4344 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              u_4344 = ((IStrategoList)term).tail();
              w_4344 = u_4344;
              term = report_failure_0_2.instance.invoke(context, w_4344, generator.const7571, t_4344);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(z_4344.value == null)
        z_4344.value = term;
      else
        if(z_4344.value != term && !z_4344.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(x_4344.value == null)
        x_4344.value = term;
      else
        if(x_4344.value != term && !x_4344.value.match(term))
          break Fail28554;
      if(z_4344.value == null)
        break Fail28554;
      term = z_4344.value;
      if(a_4345.value == null)
        a_4345.value = term;
      else
        if(a_4345.value != term && !a_4345.value.match(term))
          break Fail28554;
      term = generator.const7574;
      if(y_4344.value == null)
        y_4344.value = term;
      else
        if(y_4344.value != term && !y_4344.value.match(term))
          break Fail28554;
      if(a_4345.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, a_4345.value, x_4344.value, y_4344.value);
      if(term == null)
        break Fail28554;
      if(b_4348.value == null)
        b_4348.value = term;
      else
        if(b_4348.value != term && !b_4348.value.match(term))
          break Fail28554;
      if(t_4348.value == null)
        break Fail28554;
      term = t_4348.value;
      if(u_4348.value == null)
        u_4348.value = term;
      else
        if(u_4348.value != term && !u_4348.value.match(term))
          break Fail28554;
      term = generator.const7575;
      IStrategoTerm term10777 = term;
      Success11304:
      { 
        Fail28571:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28571;
          if(true)
            break Success11304;
        }
        term = term10777;
        IStrategoTerm term10778 = term;
        Success11305:
        { 
          Fail28572:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28572;
            if(true)
              break Success11305;
          }
          term = term10778;
          IStrategoTerm term10779 = term;
          Success11306:
          { 
            Fail28573:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28573;
              if(true)
                break Success11306;
            }
            term = term10779;
            IStrategoTerm term10780 = term;
            Success11307:
            { 
              Fail28574:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28574;
                if(true)
                  break Success11307;
              }
              term = term10780;
              IStrategoTerm b_4345 = null;
              IStrategoTerm c_4345 = null;
              IStrategoTerm e_4345 = null;
              b_4345 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              c_4345 = ((IStrategoList)term).tail();
              e_4345 = c_4345;
              term = report_failure_0_2.instance.invoke(context, e_4345, generator.const7571, b_4345);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(h_4345.value == null)
        h_4345.value = term;
      else
        if(h_4345.value != term && !h_4345.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(f_4345.value == null)
        f_4345.value = term;
      else
        if(f_4345.value != term && !f_4345.value.match(term))
          break Fail28554;
      if(h_4345.value == null)
        break Fail28554;
      term = h_4345.value;
      if(i_4345.value == null)
        i_4345.value = term;
      else
        if(i_4345.value != term && !i_4345.value.match(term))
          break Fail28554;
      term = generator.const7576;
      if(g_4345.value == null)
        g_4345.value = term;
      else
        if(g_4345.value != term && !g_4345.value.match(term))
          break Fail28554;
      if(i_4345.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, i_4345.value, f_4345.value, g_4345.value);
      if(term == null)
        break Fail28554;
      if(c_4348.value == null)
        c_4348.value = term;
      else
        if(c_4348.value != term && !c_4348.value.match(term))
          break Fail28554;
      if(u_4348.value == null)
        break Fail28554;
      term = u_4348.value;
      if(v_4348.value == null)
        v_4348.value = term;
      else
        if(v_4348.value != term && !v_4348.value.match(term))
          break Fail28554;
      if(x_4340.value == null)
        break Fail28554;
      term = x_4340.value;
      IStrategoTerm term10781 = term;
      Success11308:
      { 
        Fail28575:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28575;
          if(true)
            break Success11308;
        }
        term = term10781;
        IStrategoTerm term10782 = term;
        Success11309:
        { 
          Fail28576:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28576;
            if(true)
              break Success11309;
          }
          term = term10782;
          IStrategoTerm term10783 = term;
          Success11310:
          { 
            Fail28577:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28577;
              if(true)
                break Success11310;
            }
            term = term10783;
            IStrategoTerm term10784 = term;
            Success11311:
            { 
              Fail28578:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28578;
                if(true)
                  break Success11311;
              }
              term = term10784;
              IStrategoTerm j_4345 = null;
              IStrategoTerm k_4345 = null;
              IStrategoTerm m_4345 = null;
              j_4345 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              k_4345 = ((IStrategoList)term).tail();
              m_4345 = k_4345;
              term = report_failure_0_2.instance.invoke(context, m_4345, generator.const7571, j_4345);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(p_4345.value == null)
        p_4345.value = term;
      else
        if(p_4345.value != term && !p_4345.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(n_4345.value == null)
        n_4345.value = term;
      else
        if(n_4345.value != term && !n_4345.value.match(term))
          break Fail28554;
      if(p_4345.value == null)
        break Fail28554;
      term = p_4345.value;
      if(q_4345.value == null)
        q_4345.value = term;
      else
        if(q_4345.value != term && !q_4345.value.match(term))
          break Fail28554;
      term = generator.const7577;
      if(o_4345.value == null)
        o_4345.value = term;
      else
        if(o_4345.value != term && !o_4345.value.match(term))
          break Fail28554;
      if(q_4345.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, q_4345.value, n_4345.value, o_4345.value);
      if(term == null)
        break Fail28554;
      if(d_4348.value == null)
        d_4348.value = term;
      else
        if(d_4348.value != term && !d_4348.value.match(term))
          break Fail28554;
      if(v_4348.value == null)
        break Fail28554;
      term = v_4348.value;
      if(w_4348.value == null)
        w_4348.value = term;
      else
        if(w_4348.value != term && !w_4348.value.match(term))
          break Fail28554;
      if(y_4348.value == null)
        y_4348.value = term;
      else
        if(y_4348.value != term && !y_4348.value.match(term))
          break Fail28554;
      term = concat_strings_0_0.instance.invoke(context, generator.constCons4953);
      if(term == null)
        break Fail28554;
      if(x_4348.value == null)
        x_4348.value = term;
      else
        if(x_4348.value != term && !x_4348.value.match(term))
          break Fail28554;
      if(y_4348.value == null)
        break Fail28554;
      term = y_4348.value;
      if(x_4348.value == null)
        break Fail28554;
      term = termFactory.annotateTerm(x_4348.value, checkListAnnos(termFactory, generator.constNil7));
      IStrategoTerm term10785 = term;
      Success11312:
      { 
        Fail28579:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28579;
          if(true)
            break Success11312;
        }
        term = term10785;
        IStrategoTerm term10786 = term;
        Success11313:
        { 
          Fail28580:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28580;
            if(true)
              break Success11313;
          }
          term = term10786;
          IStrategoTerm term10787 = term;
          Success11314:
          { 
            Fail28581:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28581;
              if(true)
                break Success11314;
            }
            term = term10787;
            IStrategoTerm term10788 = term;
            Success11315:
            { 
              Fail28582:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28582;
                if(true)
                  break Success11315;
              }
              term = term10788;
              IStrategoTerm r_4345 = null;
              IStrategoTerm s_4345 = null;
              IStrategoTerm u_4345 = null;
              r_4345 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              s_4345 = ((IStrategoList)term).tail();
              u_4345 = s_4345;
              term = report_failure_0_2.instance.invoke(context, u_4345, generator.const7571, r_4345);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(x_4345.value == null)
        x_4345.value = term;
      else
        if(x_4345.value != term && !x_4345.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(v_4345.value == null)
        v_4345.value = term;
      else
        if(v_4345.value != term && !v_4345.value.match(term))
          break Fail28554;
      if(x_4345.value == null)
        break Fail28554;
      term = x_4345.value;
      if(y_4345.value == null)
        y_4345.value = term;
      else
        if(y_4345.value != term && !y_4345.value.match(term))
          break Fail28554;
      term = generator.const7579;
      if(w_4345.value == null)
        w_4345.value = term;
      else
        if(w_4345.value != term && !w_4345.value.match(term))
          break Fail28554;
      if(y_4345.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, y_4345.value, v_4345.value, w_4345.value);
      if(term == null)
        break Fail28554;
      if(e_4348.value == null)
        e_4348.value = term;
      else
        if(e_4348.value != term && !e_4348.value.match(term))
          break Fail28554;
      if(w_4348.value == null)
        break Fail28554;
      term = w_4348.value;
      if(z_4348.value == null)
        z_4348.value = term;
      else
        if(z_4348.value != term && !z_4348.value.match(term))
          break Fail28554;
      if(x_4340.value == null)
        break Fail28554;
      term = x_4340.value;
      IStrategoTerm term10789 = term;
      Success11316:
      { 
        Fail28583:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28583;
          if(true)
            break Success11316;
        }
        term = term10789;
        IStrategoTerm term10790 = term;
        Success11317:
        { 
          Fail28584:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28584;
            if(true)
              break Success11317;
          }
          term = term10790;
          IStrategoTerm term10791 = term;
          Success11318:
          { 
            Fail28585:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28585;
              if(true)
                break Success11318;
            }
            term = term10791;
            IStrategoTerm term10792 = term;
            Success11319:
            { 
              Fail28586:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28586;
                if(true)
                  break Success11319;
              }
              term = term10792;
              IStrategoTerm z_4345 = null;
              IStrategoTerm a_4346 = null;
              IStrategoTerm c_4346 = null;
              z_4345 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              a_4346 = ((IStrategoList)term).tail();
              c_4346 = a_4346;
              term = report_failure_0_2.instance.invoke(context, c_4346, generator.const7571, z_4345);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(f_4346.value == null)
        f_4346.value = term;
      else
        if(f_4346.value != term && !f_4346.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(d_4346.value == null)
        d_4346.value = term;
      else
        if(d_4346.value != term && !d_4346.value.match(term))
          break Fail28554;
      if(f_4346.value == null)
        break Fail28554;
      term = f_4346.value;
      if(g_4346.value == null)
        g_4346.value = term;
      else
        if(g_4346.value != term && !g_4346.value.match(term))
          break Fail28554;
      term = generator.const7573;
      if(e_4346.value == null)
        e_4346.value = term;
      else
        if(e_4346.value != term && !e_4346.value.match(term))
          break Fail28554;
      if(g_4346.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, g_4346.value, d_4346.value, e_4346.value);
      if(term == null)
        break Fail28554;
      if(f_4348.value == null)
        f_4348.value = term;
      else
        if(f_4348.value != term && !f_4348.value.match(term))
          break Fail28554;
      if(z_4348.value == null)
        break Fail28554;
      term = z_4348.value;
      if(a_4349.value == null)
        a_4349.value = term;
      else
        if(a_4349.value != term && !a_4349.value.match(term))
          break Fail28554;
      if(x_4340.value == null)
        break Fail28554;
      term = x_4340.value;
      IStrategoTerm term10793 = term;
      Success11320:
      { 
        Fail28587:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28587;
          if(true)
            break Success11320;
        }
        term = term10793;
        IStrategoTerm term10794 = term;
        Success11321:
        { 
          Fail28588:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28588;
            if(true)
              break Success11321;
          }
          term = term10794;
          IStrategoTerm term10795 = term;
          Success11322:
          { 
            Fail28589:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28589;
              if(true)
                break Success11322;
            }
            term = term10795;
            IStrategoTerm term10796 = term;
            Success11323:
            { 
              Fail28590:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28590;
                if(true)
                  break Success11323;
              }
              term = term10796;
              IStrategoTerm h_4346 = null;
              IStrategoTerm i_4346 = null;
              IStrategoTerm k_4346 = null;
              h_4346 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              i_4346 = ((IStrategoList)term).tail();
              k_4346 = i_4346;
              term = report_failure_0_2.instance.invoke(context, k_4346, generator.const7571, h_4346);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(n_4346.value == null)
        n_4346.value = term;
      else
        if(n_4346.value != term && !n_4346.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(l_4346.value == null)
        l_4346.value = term;
      else
        if(l_4346.value != term && !l_4346.value.match(term))
          break Fail28554;
      if(n_4346.value == null)
        break Fail28554;
      term = n_4346.value;
      if(o_4346.value == null)
        o_4346.value = term;
      else
        if(o_4346.value != term && !o_4346.value.match(term))
          break Fail28554;
      term = generator.const7580;
      if(m_4346.value == null)
        m_4346.value = term;
      else
        if(m_4346.value != term && !m_4346.value.match(term))
          break Fail28554;
      if(o_4346.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, o_4346.value, l_4346.value, m_4346.value);
      if(term == null)
        break Fail28554;
      if(g_4348.value == null)
        g_4348.value = term;
      else
        if(g_4348.value != term && !g_4348.value.match(term))
          break Fail28554;
      if(a_4349.value == null)
        break Fail28554;
      term = a_4349.value;
      if(p_4347.value == null || (q_4347.value == null || (r_4347.value == null || (s_4347.value == null || (t_4347.value == null || (u_4347.value == null || (v_4347.value == null || (w_4347.value == null || (x_4347.value == null || (y_4347.value == null || (z_4347.value == null || (a_4348.value == null || (b_4348.value == null || (c_4348.value == null || (d_4348.value == null || (e_4348.value == null || (f_4348.value == null || g_4348.value == null)))))))))))))))))
        break Fail28554;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(p_4347.value, termFactory.makeListCons(generator.const7607, termFactory.makeListCons(q_4347.value, termFactory.makeListCons(generator.const7606, termFactory.makeListCons(r_4347.value, termFactory.makeListCons(generator.const7605, termFactory.makeListCons(s_4347.value, termFactory.makeListCons(generator.const7604, termFactory.makeListCons(t_4347.value, termFactory.makeListCons(generator.const7603, termFactory.makeListCons(u_4347.value, termFactory.makeListCons(generator.const7602, termFactory.makeListCons(v_4347.value, termFactory.makeListCons(generator.const7601, termFactory.makeListCons(w_4347.value, termFactory.makeListCons(generator.const7600, termFactory.makeListCons(x_4347.value, termFactory.makeListCons(generator.const7599, termFactory.makeListCons(y_4347.value, termFactory.makeListCons(generator.const7598, termFactory.makeListCons(z_4347.value, termFactory.makeListCons(generator.const7597, termFactory.makeListCons(a_4348.value, termFactory.makeListCons(generator.const7596, termFactory.makeListCons(b_4348.value, termFactory.makeListCons(generator.const7595, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7594, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7593, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7592, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7591, termFactory.makeListCons(c_4348.value, termFactory.makeListCons(generator.const7590, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7589, termFactory.makeListCons(d_4348.value, termFactory.makeListCons(generator.const7588, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7587, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7586, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7585, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7584, termFactory.makeListCons(e_4348.value, termFactory.makeListCons(generator.const7583, termFactory.makeListCons(f_4348.value, termFactory.makeListCons(generator.const7582, termFactory.makeListCons(g_4348.value, (IStrategoList)generator.constCons4954))))))))))))))))))))))))))))))))))))))))))))))))))))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28554;
      if(n_4347.value == null)
        n_4347.value = term;
      else
        if(n_4347.value != term && !n_4347.value.match(term))
          break Fail28554;
      if(o_4347.value == null)
        break Fail28554;
      term = o_4347.value;
      if(n_4347.value == null)
        break Fail28554;
      term = termFactory.annotateTerm(n_4347.value, checkListAnnos(termFactory, generator.constNil7));
      if(d_4349.value == null)
        d_4349.value = term;
      else
        if(d_4349.value != term && !d_4349.value.match(term))
          break Fail28554;
      if(y_4340.value == null)
        break Fail28554;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(y_4340.value, (IStrategoList)generator.constNil7));
      if(b_4349.value == null)
        b_4349.value = term;
      else
        if(b_4349.value != term && !b_4349.value.match(term))
          break Fail28554;
      if(d_4349.value == null)
        break Fail28554;
      term = d_4349.value;
      if(e_4349.value == null)
        e_4349.value = term;
      else
        if(e_4349.value != term && !e_4349.value.match(term))
          break Fail28554;
      if(g_4349.value == null)
        g_4349.value = term;
      else
        if(g_4349.value != term && !g_4349.value.match(term))
          break Fail28554;
      if(j_4349.value == null)
        j_4349.value = term;
      else
        if(j_4349.value != term && !j_4349.value.match(term))
          break Fail28554;
      if(z_4340.value == null)
        break Fail28554;
      term = z_4340.value;
      IStrategoTerm term10797 = term;
      Success11324:
      { 
        Fail28591:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28591;
          if(true)
            break Success11324;
        }
        term = term10797;
        IStrategoTerm term10798 = term;
        Success11325:
        { 
          Fail28592:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28592;
            if(true)
              break Success11325;
          }
          term = term10798;
          IStrategoTerm term10799 = term;
          Success11326:
          { 
            Fail28593:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28593;
              if(true)
                break Success11326;
            }
            term = term10799;
            IStrategoTerm term10800 = term;
            Success11327:
            { 
              Fail28594:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28594;
                if(true)
                  break Success11327;
              }
              term = term10800;
              IStrategoTerm p_4346 = null;
              IStrategoTerm q_4346 = null;
              IStrategoTerm s_4346 = null;
              p_4346 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              q_4346 = ((IStrategoList)term).tail();
              s_4346 = q_4346;
              term = report_failure_0_2.instance.invoke(context, s_4346, generator.const7571, p_4346);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(v_4346.value == null)
        v_4346.value = term;
      else
        if(v_4346.value != term && !v_4346.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(t_4346.value == null)
        t_4346.value = term;
      else
        if(t_4346.value != term && !t_4346.value.match(term))
          break Fail28554;
      if(v_4346.value == null)
        break Fail28554;
      term = v_4346.value;
      if(w_4346.value == null)
        w_4346.value = term;
      else
        if(w_4346.value != term && !w_4346.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(u_4346.value == null)
        u_4346.value = term;
      else
        if(u_4346.value != term && !u_4346.value.match(term))
          break Fail28554;
      if(w_4346.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, w_4346.value, t_4346.value, u_4346.value);
      if(term == null)
        break Fail28554;
      if(h_4349.value == null)
        h_4349.value = term;
      else
        if(h_4349.value != term && !h_4349.value.match(term))
          break Fail28554;
      if(j_4349.value == null)
        break Fail28554;
      term = j_4349.value;
      if(k_4349.value == null)
        k_4349.value = term;
      else
        if(k_4349.value != term && !k_4349.value.match(term))
          break Fail28554;
      if(a_4341.value == null)
        break Fail28554;
      term = a_4341.value;
      IStrategoTerm term10801 = term;
      Success11328:
      { 
        Fail28595:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28595;
          if(true)
            break Success11328;
        }
        term = term10801;
        IStrategoTerm term10802 = term;
        Success11329:
        { 
          Fail28596:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28596;
            if(true)
              break Success11329;
          }
          term = term10802;
          IStrategoTerm term10803 = term;
          Success11330:
          { 
            Fail28597:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28597;
              if(true)
                break Success11330;
            }
            term = term10803;
            IStrategoTerm term10804 = term;
            Success11331:
            { 
              Fail28598:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28598;
                if(true)
                  break Success11331;
              }
              term = term10804;
              IStrategoTerm x_4346 = null;
              IStrategoTerm y_4346 = null;
              IStrategoTerm a_4347 = null;
              x_4346 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28554;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28554;
              y_4346 = ((IStrategoList)term).tail();
              a_4347 = y_4346;
              term = report_failure_0_2.instance.invoke(context, a_4347, generator.const7571, x_4346);
              if(term == null)
                break Fail28554;
            }
          }
        }
      }
      if(d_4347.value == null)
        d_4347.value = term;
      else
        if(d_4347.value != term && !d_4347.value.match(term))
          break Fail28554;
      term = generator.const7143;
      if(b_4347.value == null)
        b_4347.value = term;
      else
        if(b_4347.value != term && !b_4347.value.match(term))
          break Fail28554;
      if(d_4347.value == null)
        break Fail28554;
      term = d_4347.value;
      if(e_4347.value == null)
        e_4347.value = term;
      else
        if(e_4347.value != term && !e_4347.value.match(term))
          break Fail28554;
      term = generator.const7207;
      if(c_4347.value == null)
        c_4347.value = term;
      else
        if(c_4347.value != term && !c_4347.value.match(term))
          break Fail28554;
      if(e_4347.value == null)
        break Fail28554;
      term = string_replace_0_2.instance.invoke(context, e_4347.value, b_4347.value, c_4347.value);
      if(term == null)
        break Fail28554;
      if(i_4349.value == null)
        i_4349.value = term;
      else
        if(i_4349.value != term && !i_4349.value.match(term))
          break Fail28554;
      if(k_4349.value == null)
        break Fail28554;
      term = k_4349.value;
      if(h_4349.value == null || i_4349.value == null)
        break Fail28554;
      term = (IStrategoTerm)termFactory.makeListCons(h_4349.value, termFactory.makeListCons(i_4349.value, (IStrategoList)generator.constNil7));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28554;
      if(f_4349.value == null)
        f_4349.value = term;
      else
        if(f_4349.value != term && !f_4349.value.match(term))
          break Fail28554;
      if(g_4349.value == null)
        break Fail28554;
      term = g_4349.value;
      if(f_4349.value == null)
        break Fail28554;
      term = termFactory.annotateTerm(f_4349.value, checkListAnnos(termFactory, generator.constNil7));
      if(c_4349.value == null)
        c_4349.value = term;
      else
        if(c_4349.value != term && !c_4349.value.match(term))
          break Fail28554;
      if(e_4349.value == null)
        break Fail28554;
      term = output_text_file_0_2.instance.invoke(context, e_4349.value, b_4349.value, c_4349.value);
      if(term == null)
        break Fail28554;
      if(true)
        return term;
    }
    return null;
  }
}