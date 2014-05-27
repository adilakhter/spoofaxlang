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

@SuppressWarnings("all") public class create_common_trans_0_0 extends Strategy 
{ 
  public static create_common_trans_0_0 instance = new create_common_trans_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_common_trans_0_0");
    Fail26637:
    { 
      TermReference f_4376 = new TermReference();
      TermReference g_4376 = new TermReference();
      TermReference z_4381 = new TermReference();
      TermReference a_4382 = new TermReference();
      TermReference b_4382 = new TermReference();
      IStrategoTerm s_4382 = null;
      IStrategoTerm l_4376 = null;
      IStrategoTerm n_4376 = null;
      IStrategoTerm o_4376 = null;
      TermReference c_4382 = new TermReference();
      IStrategoTerm t_4382 = null;
      IStrategoTerm t_4376 = null;
      IStrategoTerm v_4376 = null;
      IStrategoTerm w_4376 = null;
      TermReference d_4382 = new TermReference();
      IStrategoTerm u_4382 = null;
      IStrategoTerm b_4377 = null;
      IStrategoTerm d_4377 = null;
      IStrategoTerm e_4377 = null;
      TermReference e_4382 = new TermReference();
      IStrategoTerm v_4382 = null;
      IStrategoTerm j_4377 = null;
      IStrategoTerm l_4377 = null;
      IStrategoTerm m_4377 = null;
      TermReference f_4382 = new TermReference();
      IStrategoTerm w_4382 = null;
      IStrategoTerm r_4377 = null;
      IStrategoTerm t_4377 = null;
      IStrategoTerm u_4377 = null;
      TermReference g_4382 = new TermReference();
      IStrategoTerm x_4382 = null;
      IStrategoTerm z_4377 = null;
      IStrategoTerm b_4378 = null;
      IStrategoTerm c_4378 = null;
      TermReference h_4382 = new TermReference();
      IStrategoTerm y_4382 = null;
      IStrategoTerm h_4378 = null;
      IStrategoTerm j_4378 = null;
      IStrategoTerm k_4378 = null;
      TermReference i_4382 = new TermReference();
      TermReference z_4382 = new TermReference();
      TermReference p_4378 = new TermReference();
      TermReference q_4378 = new TermReference();
      TermReference r_4378 = new TermReference();
      TermReference s_4378 = new TermReference();
      TermReference j_4382 = new TermReference();
      TermReference a_4383 = new TermReference();
      TermReference x_4378 = new TermReference();
      TermReference y_4378 = new TermReference();
      TermReference z_4378 = new TermReference();
      TermReference a_4379 = new TermReference();
      TermReference k_4382 = new TermReference();
      TermReference b_4383 = new TermReference();
      TermReference f_4379 = new TermReference();
      TermReference g_4379 = new TermReference();
      TermReference h_4379 = new TermReference();
      TermReference i_4379 = new TermReference();
      TermReference l_4382 = new TermReference();
      TermReference c_4383 = new TermReference();
      TermReference n_4379 = new TermReference();
      TermReference o_4379 = new TermReference();
      TermReference p_4379 = new TermReference();
      TermReference q_4379 = new TermReference();
      TermReference m_4382 = new TermReference();
      TermReference d_4383 = new TermReference();
      TermReference v_4379 = new TermReference();
      TermReference w_4379 = new TermReference();
      TermReference x_4379 = new TermReference();
      TermReference y_4379 = new TermReference();
      TermReference n_4382 = new TermReference();
      TermReference e_4383 = new TermReference();
      TermReference d_4380 = new TermReference();
      TermReference e_4380 = new TermReference();
      TermReference f_4380 = new TermReference();
      TermReference g_4380 = new TermReference();
      TermReference o_4382 = new TermReference();
      TermReference f_4383 = new TermReference();
      TermReference l_4380 = new TermReference();
      TermReference m_4380 = new TermReference();
      TermReference n_4380 = new TermReference();
      TermReference o_4380 = new TermReference();
      TermReference p_4382 = new TermReference();
      TermReference g_4383 = new TermReference();
      TermReference h_4383 = new TermReference();
      TermReference i_4383 = new TermReference();
      TermReference t_4380 = new TermReference();
      TermReference u_4380 = new TermReference();
      TermReference v_4380 = new TermReference();
      TermReference w_4380 = new TermReference();
      TermReference q_4382 = new TermReference();
      TermReference j_4383 = new TermReference();
      TermReference b_4381 = new TermReference();
      TermReference c_4381 = new TermReference();
      TermReference d_4381 = new TermReference();
      TermReference e_4381 = new TermReference();
      TermReference r_4382 = new TermReference();
      TermReference k_4383 = new TermReference();
      TermReference j_4381 = new TermReference();
      TermReference k_4381 = new TermReference();
      TermReference l_4381 = new TermReference();
      TermReference m_4381 = new TermReference();
      TermReference l_4383 = new TermReference();
      TermReference m_4383 = new TermReference();
      TermReference n_4383 = new TermReference();
      TermReference o_4383 = new TermReference();
      TermReference p_4383 = new TermReference();
      TermReference q_4383 = new TermReference();
      TermReference r_4383 = new TermReference();
      TermReference s_4383 = new TermReference();
      TermReference r_4381 = new TermReference();
      TermReference s_4381 = new TermReference();
      TermReference t_4381 = new TermReference();
      TermReference u_4381 = new TermReference();
      TermReference t_4383 = new TermReference();
      TermReference u_4383 = new TermReference();
      TermReference v_4383 = new TermReference();
      TermReference w_4383 = new TermReference();
      term = trans_module_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26637;
      if(f_4376.value == null)
        f_4376.value = term;
      else
        if(f_4376.value != term && !f_4376.value.match(term))
          break Fail26637;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26637;
      if(g_4376.value == null)
        g_4376.value = term;
      else
        if(g_4376.value != term && !g_4376.value.match(term))
          break Fail26637;
      if(a_4382.value == null)
        a_4382.value = term;
      else
        if(a_4382.value != term && !a_4382.value.match(term))
          break Fail26637;
      s_4382 = term;
      if(f_4376.value == null)
        break Fail26637;
      term = f_4376.value;
      IStrategoTerm term11068 = term;
      Success10837:
      { 
        Fail26638:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26638;
          if(true)
            break Success10837;
        }
        term = term11068;
        IStrategoTerm term11069 = term;
        Success10838:
        { 
          Fail26639:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26639;
            if(true)
              break Success10838;
          }
          term = term11069;
          IStrategoTerm term11070 = term;
          Success10839:
          { 
            Fail26640:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26640;
              if(true)
                break Success10839;
            }
            term = term11070;
            IStrategoTerm term11071 = term;
            Success10840:
            { 
              Fail26641:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26641;
                if(true)
                  break Success10840;
              }
              term = term11071;
              IStrategoTerm h_4376 = null;
              IStrategoTerm i_4376 = null;
              IStrategoTerm k_4376 = null;
              h_4376 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              i_4376 = ((IStrategoList)term).tail();
              k_4376 = i_4376;
              term = report_failure_0_2.instance.invoke(context, k_4376, generator.const7803, h_4376);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      n_4376 = term;
      l_4376 = generator.const7143;
      o_4376 = n_4376;
      term = string_replace_0_2.instance.invoke(context, o_4376, l_4376, generator.const7609);
      if(term == null)
        break Fail26637;
      if(b_4382.value == null)
        b_4382.value = term;
      else
        if(b_4382.value != term && !b_4382.value.match(term))
          break Fail26637;
      term = s_4382;
      t_4382 = s_4382;
      if(f_4376.value == null)
        break Fail26637;
      term = f_4376.value;
      IStrategoTerm term11072 = term;
      Success10841:
      { 
        Fail26642:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26642;
          if(true)
            break Success10841;
        }
        term = term11072;
        IStrategoTerm term11073 = term;
        Success10842:
        { 
          Fail26643:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26643;
            if(true)
              break Success10842;
          }
          term = term11073;
          IStrategoTerm term11074 = term;
          Success10843:
          { 
            Fail26644:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26644;
              if(true)
                break Success10843;
            }
            term = term11074;
            IStrategoTerm term11075 = term;
            Success10844:
            { 
              Fail26645:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26645;
                if(true)
                  break Success10844;
              }
              term = term11075;
              IStrategoTerm p_4376 = null;
              IStrategoTerm q_4376 = null;
              IStrategoTerm s_4376 = null;
              p_4376 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              q_4376 = ((IStrategoList)term).tail();
              s_4376 = q_4376;
              term = report_failure_0_2.instance.invoke(context, s_4376, generator.const7803, p_4376);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      v_4376 = term;
      t_4376 = generator.const7143;
      w_4376 = v_4376;
      term = string_replace_0_2.instance.invoke(context, w_4376, t_4376, generator.const7162);
      if(term == null)
        break Fail26637;
      if(c_4382.value == null)
        c_4382.value = term;
      else
        if(c_4382.value != term && !c_4382.value.match(term))
          break Fail26637;
      term = t_4382;
      u_4382 = t_4382;
      if(g_4376.value == null)
        break Fail26637;
      term = g_4376.value;
      IStrategoTerm term11076 = term;
      Success10845:
      { 
        Fail26646:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26646;
          if(true)
            break Success10845;
        }
        term = term11076;
        IStrategoTerm term11077 = term;
        Success10846:
        { 
          Fail26647:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26647;
            if(true)
              break Success10846;
          }
          term = term11077;
          IStrategoTerm term11078 = term;
          Success10847:
          { 
            Fail26648:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26648;
              if(true)
                break Success10847;
            }
            term = term11078;
            IStrategoTerm term11079 = term;
            Success10848:
            { 
              Fail26649:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26649;
                if(true)
                  break Success10848;
              }
              term = term11079;
              IStrategoTerm x_4376 = null;
              IStrategoTerm y_4376 = null;
              IStrategoTerm a_4377 = null;
              x_4376 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              y_4376 = ((IStrategoList)term).tail();
              a_4377 = y_4376;
              term = report_failure_0_2.instance.invoke(context, a_4377, generator.const7803, x_4376);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      d_4377 = term;
      b_4377 = generator.const7143;
      e_4377 = d_4377;
      term = string_replace_0_2.instance.invoke(context, e_4377, b_4377, generator.const7572);
      if(term == null)
        break Fail26637;
      if(d_4382.value == null)
        d_4382.value = term;
      else
        if(d_4382.value != term && !d_4382.value.match(term))
          break Fail26637;
      term = u_4382;
      v_4382 = u_4382;
      if(f_4376.value == null)
        break Fail26637;
      term = f_4376.value;
      IStrategoTerm term11080 = term;
      Success10849:
      { 
        Fail26650:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26650;
          if(true)
            break Success10849;
        }
        term = term11080;
        IStrategoTerm term11081 = term;
        Success10850:
        { 
          Fail26651:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26651;
            if(true)
              break Success10850;
          }
          term = term11081;
          IStrategoTerm term11082 = term;
          Success10851:
          { 
            Fail26652:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26652;
              if(true)
                break Success10851;
            }
            term = term11082;
            IStrategoTerm term11083 = term;
            Success10852:
            { 
              Fail26653:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26653;
                if(true)
                  break Success10852;
              }
              term = term11083;
              IStrategoTerm f_4377 = null;
              IStrategoTerm g_4377 = null;
              IStrategoTerm i_4377 = null;
              f_4377 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              g_4377 = ((IStrategoList)term).tail();
              i_4377 = g_4377;
              term = report_failure_0_2.instance.invoke(context, i_4377, generator.const7803, f_4377);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      l_4377 = term;
      j_4377 = generator.const7143;
      m_4377 = l_4377;
      term = string_replace_0_2.instance.invoke(context, m_4377, j_4377, generator.const7610);
      if(term == null)
        break Fail26637;
      if(e_4382.value == null)
        e_4382.value = term;
      else
        if(e_4382.value != term && !e_4382.value.match(term))
          break Fail26637;
      term = v_4382;
      w_4382 = v_4382;
      if(f_4376.value == null)
        break Fail26637;
      term = f_4376.value;
      IStrategoTerm term11084 = term;
      Success10853:
      { 
        Fail26654:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26654;
          if(true)
            break Success10853;
        }
        term = term11084;
        IStrategoTerm term11085 = term;
        Success10854:
        { 
          Fail26655:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26655;
            if(true)
              break Success10854;
          }
          term = term11085;
          IStrategoTerm term11086 = term;
          Success10855:
          { 
            Fail26656:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26656;
              if(true)
                break Success10855;
            }
            term = term11086;
            IStrategoTerm term11087 = term;
            Success10856:
            { 
              Fail26657:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26657;
                if(true)
                  break Success10856;
              }
              term = term11087;
              IStrategoTerm n_4377 = null;
              IStrategoTerm o_4377 = null;
              IStrategoTerm q_4377 = null;
              n_4377 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              o_4377 = ((IStrategoList)term).tail();
              q_4377 = o_4377;
              term = report_failure_0_2.instance.invoke(context, q_4377, generator.const7803, n_4377);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      t_4377 = term;
      r_4377 = generator.const7143;
      u_4377 = t_4377;
      term = string_replace_0_2.instance.invoke(context, u_4377, r_4377, generator.const7162);
      if(term == null)
        break Fail26637;
      if(f_4382.value == null)
        f_4382.value = term;
      else
        if(f_4382.value != term && !f_4382.value.match(term))
          break Fail26637;
      term = w_4382;
      x_4382 = w_4382;
      if(g_4376.value == null)
        break Fail26637;
      term = g_4376.value;
      IStrategoTerm term11088 = term;
      Success10857:
      { 
        Fail26658:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26658;
          if(true)
            break Success10857;
        }
        term = term11088;
        IStrategoTerm term11089 = term;
        Success10858:
        { 
          Fail26659:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26659;
            if(true)
              break Success10858;
          }
          term = term11089;
          IStrategoTerm term11090 = term;
          Success10859:
          { 
            Fail26660:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26660;
              if(true)
                break Success10859;
            }
            term = term11090;
            IStrategoTerm term11091 = term;
            Success10860:
            { 
              Fail26661:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26661;
                if(true)
                  break Success10860;
              }
              term = term11091;
              IStrategoTerm v_4377 = null;
              IStrategoTerm w_4377 = null;
              IStrategoTerm y_4377 = null;
              v_4377 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              w_4377 = ((IStrategoList)term).tail();
              y_4377 = w_4377;
              term = report_failure_0_2.instance.invoke(context, y_4377, generator.const7803, v_4377);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      b_4378 = term;
      z_4377 = generator.const7143;
      c_4378 = b_4378;
      term = string_replace_0_2.instance.invoke(context, c_4378, z_4377, generator.const7572);
      if(term == null)
        break Fail26637;
      if(g_4382.value == null)
        g_4382.value = term;
      else
        if(g_4382.value != term && !g_4382.value.match(term))
          break Fail26637;
      term = x_4382;
      y_4382 = x_4382;
      if(f_4376.value == null)
        break Fail26637;
      term = f_4376.value;
      IStrategoTerm term11092 = term;
      Success10861:
      { 
        Fail26662:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26662;
          if(true)
            break Success10861;
        }
        term = term11092;
        IStrategoTerm term11093 = term;
        Success10862:
        { 
          Fail26663:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26663;
            if(true)
              break Success10862;
          }
          term = term11093;
          IStrategoTerm term11094 = term;
          Success10863:
          { 
            Fail26664:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26664;
              if(true)
                break Success10863;
            }
            term = term11094;
            IStrategoTerm term11095 = term;
            Success10864:
            { 
              Fail26665:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26665;
                if(true)
                  break Success10864;
              }
              term = term11095;
              IStrategoTerm d_4378 = null;
              IStrategoTerm e_4378 = null;
              IStrategoTerm g_4378 = null;
              d_4378 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26637;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26637;
              e_4378 = ((IStrategoList)term).tail();
              g_4378 = e_4378;
              term = report_failure_0_2.instance.invoke(context, g_4378, generator.const7803, d_4378);
              if(term == null)
                break Fail26637;
            }
          }
        }
      }
      j_4378 = term;
      h_4378 = generator.const7143;
      k_4378 = j_4378;
      term = string_replace_0_2.instance.invoke(context, k_4378, h_4378, generator.const7610);
      if(term == null)
        break Fail26637;
      if(h_4382.value == null)
        h_4382.value = term;
      else
        if(h_4382.value != term && !h_4382.value.match(term))
          break Fail26637;
      term = y_4382;
      if(z_4382.value == null)
        z_4382.value = term;
      else
        if(z_4382.value != term && !z_4382.value.match(term))
          break Fail26637;
      if(f_4376.value == null)
        break Fail26637;
      term = f_4376.value;
      create_common_trans_0_0_fragment_0 create_common_trans_0_0_fragment_00 = new create_common_trans_0_0_fragment_0();
      create_common_trans_0_0_fragment_00.r_4378 = r_4378;
      create_common_trans_0_0_fragment_00.s_4378 = s_4378;
      create_common_trans_0_0_fragment_00.p_4378 = p_4378;
      create_common_trans_0_0_fragment_00.q_4378 = q_4378;
      create_common_trans_0_0_fragment_00.z_4382 = z_4382;
      create_common_trans_0_0_fragment_00.z_4378 = z_4378;
      create_common_trans_0_0_fragment_00.a_4379 = a_4379;
      create_common_trans_0_0_fragment_00.x_4378 = x_4378;
      create_common_trans_0_0_fragment_00.y_4378 = y_4378;
      create_common_trans_0_0_fragment_00.a_4383 = a_4383;
      create_common_trans_0_0_fragment_00.h_4379 = h_4379;
      create_common_trans_0_0_fragment_00.i_4379 = i_4379;
      create_common_trans_0_0_fragment_00.f_4379 = f_4379;
      create_common_trans_0_0_fragment_00.g_4379 = g_4379;
      create_common_trans_0_0_fragment_00.b_4383 = b_4383;
      create_common_trans_0_0_fragment_00.p_4379 = p_4379;
      create_common_trans_0_0_fragment_00.q_4379 = q_4379;
      create_common_trans_0_0_fragment_00.n_4379 = n_4379;
      create_common_trans_0_0_fragment_00.o_4379 = o_4379;
      create_common_trans_0_0_fragment_00.c_4383 = c_4383;
      create_common_trans_0_0_fragment_00.x_4379 = x_4379;
      create_common_trans_0_0_fragment_00.y_4379 = y_4379;
      create_common_trans_0_0_fragment_00.v_4379 = v_4379;
      create_common_trans_0_0_fragment_00.w_4379 = w_4379;
      create_common_trans_0_0_fragment_00.d_4383 = d_4383;
      create_common_trans_0_0_fragment_00.f_4380 = f_4380;
      create_common_trans_0_0_fragment_00.g_4380 = g_4380;
      create_common_trans_0_0_fragment_00.d_4380 = d_4380;
      create_common_trans_0_0_fragment_00.e_4380 = e_4380;
      create_common_trans_0_0_fragment_00.e_4383 = e_4383;
      create_common_trans_0_0_fragment_00.n_4380 = n_4380;
      create_common_trans_0_0_fragment_00.o_4380 = o_4380;
      create_common_trans_0_0_fragment_00.l_4380 = l_4380;
      create_common_trans_0_0_fragment_00.m_4380 = m_4380;
      create_common_trans_0_0_fragment_00.f_4383 = f_4383;
      create_common_trans_0_0_fragment_00.i_4383 = i_4383;
      create_common_trans_0_0_fragment_00.h_4383 = h_4383;
      create_common_trans_0_0_fragment_00.v_4380 = v_4380;
      create_common_trans_0_0_fragment_00.w_4380 = w_4380;
      create_common_trans_0_0_fragment_00.t_4380 = t_4380;
      create_common_trans_0_0_fragment_00.u_4380 = u_4380;
      create_common_trans_0_0_fragment_00.g_4383 = g_4383;
      create_common_trans_0_0_fragment_00.f_4376 = f_4376;
      create_common_trans_0_0_fragment_00.d_4381 = d_4381;
      create_common_trans_0_0_fragment_00.e_4381 = e_4381;
      create_common_trans_0_0_fragment_00.b_4381 = b_4381;
      create_common_trans_0_0_fragment_00.c_4381 = c_4381;
      create_common_trans_0_0_fragment_00.j_4383 = j_4383;
      create_common_trans_0_0_fragment_00.l_4381 = l_4381;
      create_common_trans_0_0_fragment_00.m_4381 = m_4381;
      create_common_trans_0_0_fragment_00.j_4381 = j_4381;
      create_common_trans_0_0_fragment_00.k_4381 = k_4381;
      create_common_trans_0_0_fragment_00.k_4383 = k_4383;
      create_common_trans_0_0_fragment_00.b_4382 = b_4382;
      create_common_trans_0_0_fragment_00.c_4382 = c_4382;
      create_common_trans_0_0_fragment_00.d_4382 = d_4382;
      create_common_trans_0_0_fragment_00.e_4382 = e_4382;
      create_common_trans_0_0_fragment_00.f_4382 = f_4382;
      create_common_trans_0_0_fragment_00.g_4382 = g_4382;
      create_common_trans_0_0_fragment_00.h_4382 = h_4382;
      create_common_trans_0_0_fragment_00.i_4382 = i_4382;
      create_common_trans_0_0_fragment_00.j_4382 = j_4382;
      create_common_trans_0_0_fragment_00.k_4382 = k_4382;
      create_common_trans_0_0_fragment_00.l_4382 = l_4382;
      create_common_trans_0_0_fragment_00.m_4382 = m_4382;
      create_common_trans_0_0_fragment_00.n_4382 = n_4382;
      create_common_trans_0_0_fragment_00.o_4382 = o_4382;
      create_common_trans_0_0_fragment_00.p_4382 = p_4382;
      create_common_trans_0_0_fragment_00.q_4382 = q_4382;
      create_common_trans_0_0_fragment_00.r_4382 = r_4382;
      create_common_trans_0_0_fragment_00.a_4382 = a_4382;
      create_common_trans_0_0_fragment_00.z_4381 = z_4381;
      create_common_trans_0_0_fragment_00.n_4383 = n_4383;
      create_common_trans_0_0_fragment_00.o_4383 = o_4383;
      create_common_trans_0_0_fragment_00.l_4383 = l_4383;
      create_common_trans_0_0_fragment_00.m_4383 = m_4383;
      create_common_trans_0_0_fragment_00.g_4376 = g_4376;
      create_common_trans_0_0_fragment_00.t_4381 = t_4381;
      create_common_trans_0_0_fragment_00.u_4381 = u_4381;
      create_common_trans_0_0_fragment_00.r_4381 = r_4381;
      create_common_trans_0_0_fragment_00.s_4381 = s_4381;
      create_common_trans_0_0_fragment_00.s_4383 = s_4383;
      create_common_trans_0_0_fragment_00.r_4383 = r_4383;
      create_common_trans_0_0_fragment_00.q_4383 = q_4383;
      create_common_trans_0_0_fragment_00.p_4383 = p_4383;
      create_common_trans_0_0_fragment_00.v_4383 = v_4383;
      create_common_trans_0_0_fragment_00.w_4383 = w_4383;
      create_common_trans_0_0_fragment_00.t_4383 = t_4383;
      create_common_trans_0_0_fragment_00.u_4383 = u_4383;
      term = create_common_trans_0_0_fragment_00.invoke(context, term);
      if(term == null)
        break Fail26637;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}