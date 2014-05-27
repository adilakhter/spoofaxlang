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

@SuppressWarnings("all") final class create_common_trans_0_0_fragment_0 extends Strategy 
{ 
  TermReference r_4378;

  TermReference s_4378;

  TermReference p_4378;

  TermReference q_4378;

  TermReference z_4382;

  TermReference z_4378;

  TermReference a_4379;

  TermReference x_4378;

  TermReference y_4378;

  TermReference a_4383;

  TermReference h_4379;

  TermReference i_4379;

  TermReference f_4379;

  TermReference g_4379;

  TermReference b_4383;

  TermReference p_4379;

  TermReference q_4379;

  TermReference n_4379;

  TermReference o_4379;

  TermReference c_4383;

  TermReference x_4379;

  TermReference y_4379;

  TermReference v_4379;

  TermReference w_4379;

  TermReference d_4383;

  TermReference f_4380;

  TermReference g_4380;

  TermReference d_4380;

  TermReference e_4380;

  TermReference e_4383;

  TermReference n_4380;

  TermReference o_4380;

  TermReference l_4380;

  TermReference m_4380;

  TermReference f_4383;

  TermReference i_4383;

  TermReference h_4383;

  TermReference v_4380;

  TermReference w_4380;

  TermReference t_4380;

  TermReference u_4380;

  TermReference g_4383;

  TermReference f_4376;

  TermReference d_4381;

  TermReference e_4381;

  TermReference b_4381;

  TermReference c_4381;

  TermReference j_4383;

  TermReference l_4381;

  TermReference m_4381;

  TermReference j_4381;

  TermReference k_4381;

  TermReference k_4383;

  TermReference b_4382;

  TermReference c_4382;

  TermReference d_4382;

  TermReference e_4382;

  TermReference f_4382;

  TermReference g_4382;

  TermReference h_4382;

  TermReference i_4382;

  TermReference j_4382;

  TermReference k_4382;

  TermReference l_4382;

  TermReference m_4382;

  TermReference n_4382;

  TermReference o_4382;

  TermReference p_4382;

  TermReference q_4382;

  TermReference r_4382;

  TermReference a_4382;

  TermReference z_4381;

  TermReference n_4383;

  TermReference o_4383;

  TermReference l_4383;

  TermReference m_4383;

  TermReference g_4376;

  TermReference t_4381;

  TermReference u_4381;

  TermReference r_4381;

  TermReference s_4381;

  TermReference s_4383;

  TermReference r_4383;

  TermReference q_4383;

  TermReference p_4383;

  TermReference v_4383;

  TermReference w_4383;

  TermReference t_4383;

  TermReference u_4383;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28453:
    { 
      IStrategoTerm term11024 = term;
      Success11201:
      { 
        Fail28454:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28454;
          if(true)
            break Success11201;
        }
        term = term11024;
        IStrategoTerm term11025 = term;
        Success11202:
        { 
          Fail28455:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28455;
            if(true)
              break Success11202;
          }
          term = term11025;
          IStrategoTerm term11026 = term;
          Success11203:
          { 
            Fail28456:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28456;
              if(true)
                break Success11203;
            }
            term = term11026;
            IStrategoTerm term11027 = term;
            Success11204:
            { 
              Fail28457:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28457;
                if(true)
                  break Success11204;
              }
              term = term11027;
              IStrategoTerm l_4378 = null;
              IStrategoTerm m_4378 = null;
              IStrategoTerm o_4378 = null;
              l_4378 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              m_4378 = ((IStrategoList)term).tail();
              o_4378 = m_4378;
              term = report_failure_0_2.instance.invoke(context, o_4378, generator.const7803, l_4378);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(r_4378.value == null)
        r_4378.value = term;
      else
        if(r_4378.value != term && !r_4378.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(p_4378.value == null)
        p_4378.value = term;
      else
        if(p_4378.value != term && !p_4378.value.match(term))
          break Fail28453;
      if(r_4378.value == null)
        break Fail28453;
      term = r_4378.value;
      if(s_4378.value == null)
        s_4378.value = term;
      else
        if(s_4378.value != term && !s_4378.value.match(term))
          break Fail28453;
      term = generator.const7162;
      if(q_4378.value == null)
        q_4378.value = term;
      else
        if(q_4378.value != term && !q_4378.value.match(term))
          break Fail28453;
      if(s_4378.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, s_4378.value, p_4378.value, q_4378.value);
      if(term == null)
        break Fail28453;
      if(i_4382.value == null)
        i_4382.value = term;
      else
        if(i_4382.value != term && !i_4382.value.match(term))
          break Fail28453;
      if(z_4382.value == null)
        break Fail28453;
      term = z_4382.value;
      if(a_4383.value == null)
        a_4383.value = term;
      else
        if(a_4383.value != term && !a_4383.value.match(term))
          break Fail28453;
      if(g_4376.value == null)
        break Fail28453;
      term = g_4376.value;
      IStrategoTerm term11028 = term;
      Success11205:
      { 
        Fail28458:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28458;
          if(true)
            break Success11205;
        }
        term = term11028;
        IStrategoTerm term11029 = term;
        Success11206:
        { 
          Fail28459:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28459;
            if(true)
              break Success11206;
          }
          term = term11029;
          IStrategoTerm term11030 = term;
          Success11207:
          { 
            Fail28460:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28460;
              if(true)
                break Success11207;
            }
            term = term11030;
            IStrategoTerm term11031 = term;
            Success11208:
            { 
              Fail28461:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28461;
                if(true)
                  break Success11208;
              }
              term = term11031;
              IStrategoTerm t_4378 = null;
              IStrategoTerm u_4378 = null;
              IStrategoTerm w_4378 = null;
              t_4378 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              u_4378 = ((IStrategoList)term).tail();
              w_4378 = u_4378;
              term = report_failure_0_2.instance.invoke(context, w_4378, generator.const7803, t_4378);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(z_4378.value == null)
        z_4378.value = term;
      else
        if(z_4378.value != term && !z_4378.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(x_4378.value == null)
        x_4378.value = term;
      else
        if(x_4378.value != term && !x_4378.value.match(term))
          break Fail28453;
      if(z_4378.value == null)
        break Fail28453;
      term = z_4378.value;
      if(a_4379.value == null)
        a_4379.value = term;
      else
        if(a_4379.value != term && !a_4379.value.match(term))
          break Fail28453;
      term = generator.const7572;
      if(y_4378.value == null)
        y_4378.value = term;
      else
        if(y_4378.value != term && !y_4378.value.match(term))
          break Fail28453;
      if(a_4379.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, a_4379.value, x_4378.value, y_4378.value);
      if(term == null)
        break Fail28453;
      if(j_4382.value == null)
        j_4382.value = term;
      else
        if(j_4382.value != term && !j_4382.value.match(term))
          break Fail28453;
      if(a_4383.value == null)
        break Fail28453;
      term = a_4383.value;
      if(b_4383.value == null)
        b_4383.value = term;
      else
        if(b_4383.value != term && !b_4383.value.match(term))
          break Fail28453;
      if(f_4376.value == null)
        break Fail28453;
      term = f_4376.value;
      IStrategoTerm term11032 = term;
      Success11209:
      { 
        Fail28462:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28462;
          if(true)
            break Success11209;
        }
        term = term11032;
        IStrategoTerm term11033 = term;
        Success11210:
        { 
          Fail28463:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28463;
            if(true)
              break Success11210;
          }
          term = term11033;
          IStrategoTerm term11034 = term;
          Success11211:
          { 
            Fail28464:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28464;
              if(true)
                break Success11211;
            }
            term = term11034;
            IStrategoTerm term11035 = term;
            Success11212:
            { 
              Fail28465:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28465;
                if(true)
                  break Success11212;
              }
              term = term11035;
              IStrategoTerm b_4379 = null;
              IStrategoTerm c_4379 = null;
              IStrategoTerm e_4379 = null;
              b_4379 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              c_4379 = ((IStrategoList)term).tail();
              e_4379 = c_4379;
              term = report_failure_0_2.instance.invoke(context, e_4379, generator.const7803, b_4379);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(h_4379.value == null)
        h_4379.value = term;
      else
        if(h_4379.value != term && !h_4379.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(f_4379.value == null)
        f_4379.value = term;
      else
        if(f_4379.value != term && !f_4379.value.match(term))
          break Fail28453;
      if(h_4379.value == null)
        break Fail28453;
      term = h_4379.value;
      if(i_4379.value == null)
        i_4379.value = term;
      else
        if(i_4379.value != term && !i_4379.value.match(term))
          break Fail28453;
      term = generator.const7573;
      if(g_4379.value == null)
        g_4379.value = term;
      else
        if(g_4379.value != term && !g_4379.value.match(term))
          break Fail28453;
      if(i_4379.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, i_4379.value, f_4379.value, g_4379.value);
      if(term == null)
        break Fail28453;
      if(k_4382.value == null)
        k_4382.value = term;
      else
        if(k_4382.value != term && !k_4382.value.match(term))
          break Fail28453;
      if(b_4383.value == null)
        break Fail28453;
      term = b_4383.value;
      if(c_4383.value == null)
        c_4383.value = term;
      else
        if(c_4383.value != term && !c_4383.value.match(term))
          break Fail28453;
      if(g_4376.value == null)
        break Fail28453;
      term = g_4376.value;
      IStrategoTerm term11036 = term;
      Success11213:
      { 
        Fail28466:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28466;
          if(true)
            break Success11213;
        }
        term = term11036;
        IStrategoTerm term11037 = term;
        Success11214:
        { 
          Fail28467:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28467;
            if(true)
              break Success11214;
          }
          term = term11037;
          IStrategoTerm term11038 = term;
          Success11215:
          { 
            Fail28468:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28468;
              if(true)
                break Success11215;
            }
            term = term11038;
            IStrategoTerm term11039 = term;
            Success11216:
            { 
              Fail28469:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28469;
                if(true)
                  break Success11216;
              }
              term = term11039;
              IStrategoTerm j_4379 = null;
              IStrategoTerm k_4379 = null;
              IStrategoTerm m_4379 = null;
              j_4379 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              k_4379 = ((IStrategoList)term).tail();
              m_4379 = k_4379;
              term = report_failure_0_2.instance.invoke(context, m_4379, generator.const7803, j_4379);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(p_4379.value == null)
        p_4379.value = term;
      else
        if(p_4379.value != term && !p_4379.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(n_4379.value == null)
        n_4379.value = term;
      else
        if(n_4379.value != term && !n_4379.value.match(term))
          break Fail28453;
      if(p_4379.value == null)
        break Fail28453;
      term = p_4379.value;
      if(q_4379.value == null)
        q_4379.value = term;
      else
        if(q_4379.value != term && !q_4379.value.match(term))
          break Fail28453;
      term = generator.const7574;
      if(o_4379.value == null)
        o_4379.value = term;
      else
        if(o_4379.value != term && !o_4379.value.match(term))
          break Fail28453;
      if(q_4379.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, q_4379.value, n_4379.value, o_4379.value);
      if(term == null)
        break Fail28453;
      if(l_4382.value == null)
        l_4382.value = term;
      else
        if(l_4382.value != term && !l_4382.value.match(term))
          break Fail28453;
      if(c_4383.value == null)
        break Fail28453;
      term = c_4383.value;
      if(d_4383.value == null)
        d_4383.value = term;
      else
        if(d_4383.value != term && !d_4383.value.match(term))
          break Fail28453;
      if(g_4376.value == null)
        break Fail28453;
      term = g_4376.value;
      IStrategoTerm term11040 = term;
      Success11217:
      { 
        Fail28470:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28470;
          if(true)
            break Success11217;
        }
        term = term11040;
        IStrategoTerm term11041 = term;
        Success11218:
        { 
          Fail28471:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28471;
            if(true)
              break Success11218;
          }
          term = term11041;
          IStrategoTerm term11042 = term;
          Success11219:
          { 
            Fail28472:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28472;
              if(true)
                break Success11219;
            }
            term = term11042;
            IStrategoTerm term11043 = term;
            Success11220:
            { 
              Fail28473:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28473;
                if(true)
                  break Success11220;
              }
              term = term11043;
              IStrategoTerm r_4379 = null;
              IStrategoTerm s_4379 = null;
              IStrategoTerm u_4379 = null;
              r_4379 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              s_4379 = ((IStrategoList)term).tail();
              u_4379 = s_4379;
              term = report_failure_0_2.instance.invoke(context, u_4379, generator.const7803, r_4379);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(x_4379.value == null)
        x_4379.value = term;
      else
        if(x_4379.value != term && !x_4379.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(v_4379.value == null)
        v_4379.value = term;
      else
        if(v_4379.value != term && !v_4379.value.match(term))
          break Fail28453;
      if(x_4379.value == null)
        break Fail28453;
      term = x_4379.value;
      if(y_4379.value == null)
        y_4379.value = term;
      else
        if(y_4379.value != term && !y_4379.value.match(term))
          break Fail28453;
      term = generator.const7574;
      if(w_4379.value == null)
        w_4379.value = term;
      else
        if(w_4379.value != term && !w_4379.value.match(term))
          break Fail28453;
      if(y_4379.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, y_4379.value, v_4379.value, w_4379.value);
      if(term == null)
        break Fail28453;
      if(m_4382.value == null)
        m_4382.value = term;
      else
        if(m_4382.value != term && !m_4382.value.match(term))
          break Fail28453;
      if(d_4383.value == null)
        break Fail28453;
      term = d_4383.value;
      if(e_4383.value == null)
        e_4383.value = term;
      else
        if(e_4383.value != term && !e_4383.value.match(term))
          break Fail28453;
      term = generator.const7575;
      IStrategoTerm term11044 = term;
      Success11221:
      { 
        Fail28474:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28474;
          if(true)
            break Success11221;
        }
        term = term11044;
        IStrategoTerm term11045 = term;
        Success11222:
        { 
          Fail28475:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28475;
            if(true)
              break Success11222;
          }
          term = term11045;
          IStrategoTerm term11046 = term;
          Success11223:
          { 
            Fail28476:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28476;
              if(true)
                break Success11223;
            }
            term = term11046;
            IStrategoTerm term11047 = term;
            Success11224:
            { 
              Fail28477:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28477;
                if(true)
                  break Success11224;
              }
              term = term11047;
              IStrategoTerm z_4379 = null;
              IStrategoTerm a_4380 = null;
              IStrategoTerm c_4380 = null;
              z_4379 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              a_4380 = ((IStrategoList)term).tail();
              c_4380 = a_4380;
              term = report_failure_0_2.instance.invoke(context, c_4380, generator.const7803, z_4379);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(f_4380.value == null)
        f_4380.value = term;
      else
        if(f_4380.value != term && !f_4380.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(d_4380.value == null)
        d_4380.value = term;
      else
        if(d_4380.value != term && !d_4380.value.match(term))
          break Fail28453;
      if(f_4380.value == null)
        break Fail28453;
      term = f_4380.value;
      if(g_4380.value == null)
        g_4380.value = term;
      else
        if(g_4380.value != term && !g_4380.value.match(term))
          break Fail28453;
      term = generator.const7576;
      if(e_4380.value == null)
        e_4380.value = term;
      else
        if(e_4380.value != term && !e_4380.value.match(term))
          break Fail28453;
      if(g_4380.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, g_4380.value, d_4380.value, e_4380.value);
      if(term == null)
        break Fail28453;
      if(n_4382.value == null)
        n_4382.value = term;
      else
        if(n_4382.value != term && !n_4382.value.match(term))
          break Fail28453;
      if(e_4383.value == null)
        break Fail28453;
      term = e_4383.value;
      if(f_4383.value == null)
        f_4383.value = term;
      else
        if(f_4383.value != term && !f_4383.value.match(term))
          break Fail28453;
      if(g_4376.value == null)
        break Fail28453;
      term = g_4376.value;
      IStrategoTerm term11048 = term;
      Success11225:
      { 
        Fail28478:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28478;
          if(true)
            break Success11225;
        }
        term = term11048;
        IStrategoTerm term11049 = term;
        Success11226:
        { 
          Fail28479:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28479;
            if(true)
              break Success11226;
          }
          term = term11049;
          IStrategoTerm term11050 = term;
          Success11227:
          { 
            Fail28480:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28480;
              if(true)
                break Success11227;
            }
            term = term11050;
            IStrategoTerm term11051 = term;
            Success11228:
            { 
              Fail28481:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28481;
                if(true)
                  break Success11228;
              }
              term = term11051;
              IStrategoTerm h_4380 = null;
              IStrategoTerm i_4380 = null;
              IStrategoTerm k_4380 = null;
              h_4380 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              i_4380 = ((IStrategoList)term).tail();
              k_4380 = i_4380;
              term = report_failure_0_2.instance.invoke(context, k_4380, generator.const7803, h_4380);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(n_4380.value == null)
        n_4380.value = term;
      else
        if(n_4380.value != term && !n_4380.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(l_4380.value == null)
        l_4380.value = term;
      else
        if(l_4380.value != term && !l_4380.value.match(term))
          break Fail28453;
      if(n_4380.value == null)
        break Fail28453;
      term = n_4380.value;
      if(o_4380.value == null)
        o_4380.value = term;
      else
        if(o_4380.value != term && !o_4380.value.match(term))
          break Fail28453;
      term = generator.const7577;
      if(m_4380.value == null)
        m_4380.value = term;
      else
        if(m_4380.value != term && !m_4380.value.match(term))
          break Fail28453;
      if(o_4380.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, o_4380.value, l_4380.value, m_4380.value);
      if(term == null)
        break Fail28453;
      if(o_4382.value == null)
        o_4382.value = term;
      else
        if(o_4382.value != term && !o_4382.value.match(term))
          break Fail28453;
      if(f_4383.value == null)
        break Fail28453;
      term = f_4383.value;
      if(g_4383.value == null)
        g_4383.value = term;
      else
        if(g_4383.value != term && !g_4383.value.match(term))
          break Fail28453;
      if(i_4383.value == null)
        i_4383.value = term;
      else
        if(i_4383.value != term && !i_4383.value.match(term))
          break Fail28453;
      term = concat_strings_0_0.instance.invoke(context, generator.constCons4953);
      if(term == null)
        break Fail28453;
      if(h_4383.value == null)
        h_4383.value = term;
      else
        if(h_4383.value != term && !h_4383.value.match(term))
          break Fail28453;
      if(i_4383.value == null)
        break Fail28453;
      term = i_4383.value;
      if(h_4383.value == null)
        break Fail28453;
      term = termFactory.annotateTerm(h_4383.value, checkListAnnos(termFactory, generator.constNil7));
      IStrategoTerm term11052 = term;
      Success11229:
      { 
        Fail28482:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28482;
          if(true)
            break Success11229;
        }
        term = term11052;
        IStrategoTerm term11053 = term;
        Success11230:
        { 
          Fail28483:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28483;
            if(true)
              break Success11230;
          }
          term = term11053;
          IStrategoTerm term11054 = term;
          Success11231:
          { 
            Fail28484:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28484;
              if(true)
                break Success11231;
            }
            term = term11054;
            IStrategoTerm term11055 = term;
            Success11232:
            { 
              Fail28485:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28485;
                if(true)
                  break Success11232;
              }
              term = term11055;
              IStrategoTerm p_4380 = null;
              IStrategoTerm q_4380 = null;
              IStrategoTerm s_4380 = null;
              p_4380 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              q_4380 = ((IStrategoList)term).tail();
              s_4380 = q_4380;
              term = report_failure_0_2.instance.invoke(context, s_4380, generator.const7803, p_4380);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(v_4380.value == null)
        v_4380.value = term;
      else
        if(v_4380.value != term && !v_4380.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(t_4380.value == null)
        t_4380.value = term;
      else
        if(t_4380.value != term && !t_4380.value.match(term))
          break Fail28453;
      if(v_4380.value == null)
        break Fail28453;
      term = v_4380.value;
      if(w_4380.value == null)
        w_4380.value = term;
      else
        if(w_4380.value != term && !w_4380.value.match(term))
          break Fail28453;
      term = generator.const7579;
      if(u_4380.value == null)
        u_4380.value = term;
      else
        if(u_4380.value != term && !u_4380.value.match(term))
          break Fail28453;
      if(w_4380.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, w_4380.value, t_4380.value, u_4380.value);
      if(term == null)
        break Fail28453;
      if(p_4382.value == null)
        p_4382.value = term;
      else
        if(p_4382.value != term && !p_4382.value.match(term))
          break Fail28453;
      if(g_4383.value == null)
        break Fail28453;
      term = g_4383.value;
      if(j_4383.value == null)
        j_4383.value = term;
      else
        if(j_4383.value != term && !j_4383.value.match(term))
          break Fail28453;
      if(f_4376.value == null)
        break Fail28453;
      term = f_4376.value;
      IStrategoTerm term11056 = term;
      Success11233:
      { 
        Fail28486:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28486;
          if(true)
            break Success11233;
        }
        term = term11056;
        IStrategoTerm term11057 = term;
        Success11234:
        { 
          Fail28487:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28487;
            if(true)
              break Success11234;
          }
          term = term11057;
          IStrategoTerm term11058 = term;
          Success11235:
          { 
            Fail28488:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28488;
              if(true)
                break Success11235;
            }
            term = term11058;
            IStrategoTerm term11059 = term;
            Success11236:
            { 
              Fail28489:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28489;
                if(true)
                  break Success11236;
              }
              term = term11059;
              IStrategoTerm x_4380 = null;
              IStrategoTerm y_4380 = null;
              IStrategoTerm a_4381 = null;
              x_4380 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              y_4380 = ((IStrategoList)term).tail();
              a_4381 = y_4380;
              term = report_failure_0_2.instance.invoke(context, a_4381, generator.const7803, x_4380);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(d_4381.value == null)
        d_4381.value = term;
      else
        if(d_4381.value != term && !d_4381.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(b_4381.value == null)
        b_4381.value = term;
      else
        if(b_4381.value != term && !b_4381.value.match(term))
          break Fail28453;
      if(d_4381.value == null)
        break Fail28453;
      term = d_4381.value;
      if(e_4381.value == null)
        e_4381.value = term;
      else
        if(e_4381.value != term && !e_4381.value.match(term))
          break Fail28453;
      term = generator.const7207;
      if(c_4381.value == null)
        c_4381.value = term;
      else
        if(c_4381.value != term && !c_4381.value.match(term))
          break Fail28453;
      if(e_4381.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, e_4381.value, b_4381.value, c_4381.value);
      if(term == null)
        break Fail28453;
      if(q_4382.value == null)
        q_4382.value = term;
      else
        if(q_4382.value != term && !q_4382.value.match(term))
          break Fail28453;
      if(j_4383.value == null)
        break Fail28453;
      term = j_4383.value;
      if(k_4383.value == null)
        k_4383.value = term;
      else
        if(k_4383.value != term && !k_4383.value.match(term))
          break Fail28453;
      if(g_4376.value == null)
        break Fail28453;
      term = g_4376.value;
      IStrategoTerm term11060 = term;
      Success11237:
      { 
        Fail28490:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28490;
          if(true)
            break Success11237;
        }
        term = term11060;
        IStrategoTerm term11061 = term;
        Success11238:
        { 
          Fail28491:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28491;
            if(true)
              break Success11238;
          }
          term = term11061;
          IStrategoTerm term11062 = term;
          Success11239:
          { 
            Fail28492:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28492;
              if(true)
                break Success11239;
            }
            term = term11062;
            IStrategoTerm term11063 = term;
            Success11240:
            { 
              Fail28493:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28493;
                if(true)
                  break Success11240;
              }
              term = term11063;
              IStrategoTerm f_4381 = null;
              IStrategoTerm g_4381 = null;
              IStrategoTerm i_4381 = null;
              f_4381 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              g_4381 = ((IStrategoList)term).tail();
              i_4381 = g_4381;
              term = report_failure_0_2.instance.invoke(context, i_4381, generator.const7803, f_4381);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(l_4381.value == null)
        l_4381.value = term;
      else
        if(l_4381.value != term && !l_4381.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(j_4381.value == null)
        j_4381.value = term;
      else
        if(j_4381.value != term && !j_4381.value.match(term))
          break Fail28453;
      if(l_4381.value == null)
        break Fail28453;
      term = l_4381.value;
      if(m_4381.value == null)
        m_4381.value = term;
      else
        if(m_4381.value != term && !m_4381.value.match(term))
          break Fail28453;
      term = generator.const7580;
      if(k_4381.value == null)
        k_4381.value = term;
      else
        if(k_4381.value != term && !k_4381.value.match(term))
          break Fail28453;
      if(m_4381.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, m_4381.value, j_4381.value, k_4381.value);
      if(term == null)
        break Fail28453;
      if(r_4382.value == null)
        r_4382.value = term;
      else
        if(r_4382.value != term && !r_4382.value.match(term))
          break Fail28453;
      if(k_4383.value == null)
        break Fail28453;
      term = k_4383.value;
      if(b_4382.value == null || (c_4382.value == null || (d_4382.value == null || (e_4382.value == null || (f_4382.value == null || (g_4382.value == null || (h_4382.value == null || (i_4382.value == null || (j_4382.value == null || (k_4382.value == null || (l_4382.value == null || (m_4382.value == null || (n_4382.value == null || (o_4382.value == null || (p_4382.value == null || (q_4382.value == null || r_4382.value == null))))))))))))))))
        break Fail28453;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7810, termFactory.makeListCons(b_4382.value, termFactory.makeListCons(generator.const7606, termFactory.makeListCons(c_4382.value, termFactory.makeListCons(generator.const7605, termFactory.makeListCons(d_4382.value, termFactory.makeListCons(generator.const7604, termFactory.makeListCons(e_4382.value, termFactory.makeListCons(generator.const7809, termFactory.makeListCons(f_4382.value, termFactory.makeListCons(generator.const7808, termFactory.makeListCons(g_4382.value, termFactory.makeListCons(generator.const7601, termFactory.makeListCons(h_4382.value, termFactory.makeListCons(generator.const7600, termFactory.makeListCons(i_4382.value, termFactory.makeListCons(generator.const7599, termFactory.makeListCons(j_4382.value, termFactory.makeListCons(generator.const7598, termFactory.makeListCons(k_4382.value, termFactory.makeListCons(generator.const7597, termFactory.makeListCons(l_4382.value, termFactory.makeListCons(generator.const7596, termFactory.makeListCons(m_4382.value, termFactory.makeListCons(generator.const7807, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7594, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7593, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7592, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7591, termFactory.makeListCons(n_4382.value, termFactory.makeListCons(generator.const7590, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7589, termFactory.makeListCons(o_4382.value, termFactory.makeListCons(generator.const7588, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7587, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7586, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7585, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7584, termFactory.makeListCons(p_4382.value, termFactory.makeListCons(generator.const7806, termFactory.makeListCons(q_4382.value, termFactory.makeListCons(generator.const7805, termFactory.makeListCons(r_4382.value, (IStrategoList)generator.constCons5107))))))))))))))))))))))))))))))))))))))))))))))))))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28453;
      if(z_4381.value == null)
        z_4381.value = term;
      else
        if(z_4381.value != term && !z_4381.value.match(term))
          break Fail28453;
      if(a_4382.value == null)
        break Fail28453;
      term = a_4382.value;
      if(z_4381.value == null)
        break Fail28453;
      term = termFactory.annotateTerm(z_4381.value, checkListAnnos(termFactory, generator.constNil7));
      if(n_4383.value == null)
        n_4383.value = term;
      else
        if(n_4383.value != term && !n_4383.value.match(term))
          break Fail28453;
      term = generator.constCons5109;
      if(l_4383.value == null)
        l_4383.value = term;
      else
        if(l_4383.value != term && !l_4383.value.match(term))
          break Fail28453;
      if(n_4383.value == null)
        break Fail28453;
      term = n_4383.value;
      if(o_4383.value == null)
        o_4383.value = term;
      else
        if(o_4383.value != term && !o_4383.value.match(term))
          break Fail28453;
      term = generator.const7812;
      if(m_4383.value == null)
        m_4383.value = term;
      else
        if(m_4383.value != term && !m_4383.value.match(term))
          break Fail28453;
      if(o_4383.value == null)
        break Fail28453;
      term = output_text_file_0_2.instance.invoke(context, o_4383.value, l_4383.value, m_4383.value);
      if(term == null)
        break Fail28453;
      if(q_4383.value == null)
        q_4383.value = term;
      else
        if(q_4383.value != term && !q_4383.value.match(term))
          break Fail28453;
      if(s_4383.value == null)
        s_4383.value = term;
      else
        if(s_4383.value != term && !s_4383.value.match(term))
          break Fail28453;
      if(g_4376.value == null)
        break Fail28453;
      term = g_4376.value;
      IStrategoTerm term11064 = term;
      Success11241:
      { 
        Fail28494:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28494;
          if(true)
            break Success11241;
        }
        term = term11064;
        IStrategoTerm term11065 = term;
        Success11242:
        { 
          Fail28495:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28495;
            if(true)
              break Success11242;
          }
          term = term11065;
          IStrategoTerm term11066 = term;
          Success11243:
          { 
            Fail28496:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28496;
              if(true)
                break Success11243;
            }
            term = term11066;
            IStrategoTerm term11067 = term;
            Success11244:
            { 
              Fail28497:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28497;
                if(true)
                  break Success11244;
              }
              term = term11067;
              IStrategoTerm n_4381 = null;
              IStrategoTerm o_4381 = null;
              IStrategoTerm q_4381 = null;
              n_4381 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail28453;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28453;
              o_4381 = ((IStrategoList)term).tail();
              q_4381 = o_4381;
              term = report_failure_0_2.instance.invoke(context, q_4381, generator.const7803, n_4381);
              if(term == null)
                break Fail28453;
            }
          }
        }
      }
      if(t_4381.value == null)
        t_4381.value = term;
      else
        if(t_4381.value != term && !t_4381.value.match(term))
          break Fail28453;
      term = generator.const7143;
      if(r_4381.value == null)
        r_4381.value = term;
      else
        if(r_4381.value != term && !r_4381.value.match(term))
          break Fail28453;
      if(t_4381.value == null)
        break Fail28453;
      term = t_4381.value;
      if(u_4381.value == null)
        u_4381.value = term;
      else
        if(u_4381.value != term && !u_4381.value.match(term))
          break Fail28453;
      term = generator.const7641;
      if(s_4381.value == null)
        s_4381.value = term;
      else
        if(s_4381.value != term && !s_4381.value.match(term))
          break Fail28453;
      if(u_4381.value == null)
        break Fail28453;
      term = string_replace_0_2.instance.invoke(context, u_4381.value, r_4381.value, s_4381.value);
      if(term == null)
        break Fail28453;
      if(r_4383.value == null)
        r_4383.value = term;
      else
        if(r_4383.value != term && !r_4383.value.match(term))
          break Fail28453;
      if(s_4383.value == null)
        break Fail28453;
      term = s_4383.value;
      if(r_4383.value == null)
        break Fail28453;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7814, termFactory.makeListCons(r_4383.value, (IStrategoList)generator.constCons5110));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28453;
      if(p_4383.value == null)
        p_4383.value = term;
      else
        if(p_4383.value != term && !p_4383.value.match(term))
          break Fail28453;
      if(q_4383.value == null)
        break Fail28453;
      term = q_4383.value;
      if(p_4383.value == null)
        break Fail28453;
      term = termFactory.annotateTerm(p_4383.value, checkListAnnos(termFactory, generator.constNil7));
      if(v_4383.value == null)
        v_4383.value = term;
      else
        if(v_4383.value != term && !v_4383.value.match(term))
          break Fail28453;
      term = generator.constCons5108;
      if(t_4383.value == null)
        t_4383.value = term;
      else
        if(t_4383.value != term && !t_4383.value.match(term))
          break Fail28453;
      if(v_4383.value == null)
        break Fail28453;
      term = v_4383.value;
      if(w_4383.value == null)
        w_4383.value = term;
      else
        if(w_4383.value != term && !w_4383.value.match(term))
          break Fail28453;
      term = generator.const7815;
      if(u_4383.value == null)
        u_4383.value = term;
      else
        if(u_4383.value != term && !u_4383.value.match(term))
          break Fail28453;
      if(w_4383.value == null)
        break Fail28453;
      term = output_text_file_0_2.instance.invoke(context, w_4383.value, t_4383.value, u_4383.value);
      if(term == null)
        break Fail28453;
      if(true)
        return term;
    }
    return null;
  }
}