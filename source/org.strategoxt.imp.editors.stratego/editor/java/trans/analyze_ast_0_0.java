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

@SuppressWarnings("all") public class analyze_ast_0_0 extends Strategy 
{ 
  public static analyze_ast_0_0 instance = new analyze_ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_ast_0_0");
    Fail23012:
    { 
      IStrategoTerm z_4765 = null;
      IStrategoTerm a_4766 = null;
      IStrategoTerm b_4766 = null;
      IStrategoTerm c_4766 = null;
      IStrategoTerm t_4768 = null;
      IStrategoTerm u_4770 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23012;
      b_4766 = term.getSubterm(0);
      z_4765 = term.getSubterm(1);
      a_4766 = term.getSubterm(2);
      t_4768 = term;
      IStrategoTerm term12348 = term;
      Success12273:
      { 
        Fail23013:
        { 
          IStrategoTerm d_4766 = null;
          IStrategoTerm e_4766 = null;
          IStrategoTerm w_4768 = null;
          IStrategoTerm j_4766 = null;
          IStrategoTerm l_4766 = null;
          IStrategoTerm m_4766 = null;
          IStrategoTerm r_4766 = null;
          IStrategoTerm t_4766 = null;
          IStrategoTerm u_4766 = null;
          IStrategoTerm a_4769 = null;
          IStrategoTerm b_4769 = null;
          IStrategoTerm d_4769 = null;
          IStrategoTerm e_4769 = null;
          IStrategoTerm f_4769 = null;
          IStrategoTerm w_4766 = null;
          IStrategoTerm x_4766 = null;
          IStrategoTerm i_4769 = null;
          IStrategoTerm c_4767 = null;
          IStrategoTerm e_4767 = null;
          IStrategoTerm f_4767 = null;
          IStrategoTerm k_4767 = null;
          IStrategoTerm m_4767 = null;
          IStrategoTerm n_4767 = null;
          IStrategoTerm m_4769 = null;
          IStrategoTerm n_4769 = null;
          IStrategoTerm p_4769 = null;
          IStrategoTerm q_4769 = null;
          IStrategoTerm r_4769 = null;
          IStrategoTerm p_4767 = null;
          IStrategoTerm q_4767 = null;
          IStrategoTerm s_4769 = null;
          IStrategoTerm t_4769 = null;
          IStrategoTerm v_4769 = null;
          IStrategoTerm w_4769 = null;
          IStrategoTerm x_4769 = null;
          d_4766 = term;
          term = a_4766;
          IStrategoTerm term12349 = term;
          Success12274:
          { 
            Fail23014:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23014;
              if(true)
                break Success12274;
            }
            term = term12349;
            IStrategoTerm term12350 = term;
            Success12275:
            { 
              Fail23015:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23015;
                if(true)
                  break Success12275;
              }
              term = term12350;
              IStrategoTerm term12351 = term;
              Success12276:
              { 
                Fail23016:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23016;
                  if(true)
                    break Success12276;
                }
                term = term12351;
                IStrategoTerm term12352 = term;
                Success12277:
                { 
                  Fail23017:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23017;
                    if(true)
                      break Success12277;
                  }
                  term = term12352;
                  IStrategoTerm f_4766 = null;
                  IStrategoTerm g_4766 = null;
                  IStrategoTerm i_4766 = null;
                  f_4766 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23013;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23013;
                  g_4766 = ((IStrategoList)term).tail();
                  i_4766 = g_4766;
                  term = report_failure_0_2.instance.invoke(context, i_4766, trans.const4554, f_4766);
                  if(term == null)
                    break Fail23013;
                }
              }
            }
          }
          l_4766 = term;
          j_4766 = trans.const4440;
          m_4766 = l_4766;
          term = string_replace_0_2.instance.invoke(context, m_4766, j_4766, trans.const4440);
          if(term == null)
            break Fail23013;
          w_4768 = term;
          term = z_4765;
          IStrategoTerm term12353 = term;
          Success12278:
          { 
            Fail23018:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23018;
              if(true)
                break Success12278;
            }
            term = term12353;
            IStrategoTerm term12354 = term;
            Success12279:
            { 
              Fail23019:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23019;
                if(true)
                  break Success12279;
              }
              term = term12354;
              IStrategoTerm term12355 = term;
              Success12280:
              { 
                Fail23020:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23020;
                  if(true)
                    break Success12280;
                }
                term = term12355;
                IStrategoTerm term12356 = term;
                Success12281:
                { 
                  Fail23021:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23021;
                    if(true)
                      break Success12281;
                  }
                  term = term12356;
                  IStrategoTerm n_4766 = null;
                  IStrategoTerm o_4766 = null;
                  IStrategoTerm q_4766 = null;
                  n_4766 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23013;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23013;
                  o_4766 = ((IStrategoList)term).tail();
                  q_4766 = o_4766;
                  term = report_failure_0_2.instance.invoke(context, q_4766, trans.const4554, n_4766);
                  if(term == null)
                    break Fail23013;
                }
              }
            }
          }
          t_4766 = term;
          r_4766 = trans.const4440;
          u_4766 = t_4766;
          term = string_replace_0_2.instance.invoke(context, u_4766, r_4766, trans.const4555);
          if(term == null)
            break Fail23013;
          term = (IStrategoTerm)termFactory.makeListCons(w_4768, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23013;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          e_4766 = term;
          d_4769 = term;
          a_4769 = trans.const4473;
          e_4769 = d_4769;
          b_4769 = trans.constCons2047;
          f_4769 = e_4769;
          term = termFactory.makeTuple(trans.const4474, e_4766);
          term = dr_set_rule_0_3.instance.invoke(context, f_4769, a_4769, b_4769, term);
          if(term == null)
            break Fail23013;
          w_4766 = d_4766;
          term = a_4766;
          IStrategoTerm term12357 = term;
          Success12282:
          { 
            Fail23022:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23022;
              if(true)
                break Success12282;
            }
            term = term12357;
            IStrategoTerm term12358 = term;
            Success12283:
            { 
              Fail23023:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23023;
                if(true)
                  break Success12283;
              }
              term = term12358;
              IStrategoTerm term12359 = term;
              Success12284:
              { 
                Fail23024:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23024;
                  if(true)
                    break Success12284;
                }
                term = term12359;
                IStrategoTerm term12360 = term;
                Success12285:
                { 
                  Fail23025:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23025;
                    if(true)
                      break Success12285;
                  }
                  term = term12360;
                  IStrategoTerm y_4766 = null;
                  IStrategoTerm z_4766 = null;
                  IStrategoTerm b_4767 = null;
                  y_4766 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23013;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23013;
                  z_4766 = ((IStrategoList)term).tail();
                  b_4767 = z_4766;
                  term = report_failure_0_2.instance.invoke(context, b_4767, trans.const4554, y_4766);
                  if(term == null)
                    break Fail23013;
                }
              }
            }
          }
          e_4767 = term;
          c_4767 = trans.const4440;
          f_4767 = e_4767;
          term = string_replace_0_2.instance.invoke(context, f_4767, c_4767, trans.const4440);
          if(term == null)
            break Fail23013;
          i_4769 = term;
          term = z_4765;
          IStrategoTerm term12361 = term;
          Success12286:
          { 
            Fail23026:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23026;
              if(true)
                break Success12286;
            }
            term = term12361;
            IStrategoTerm term12362 = term;
            Success12287:
            { 
              Fail23027:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23027;
                if(true)
                  break Success12287;
              }
              term = term12362;
              IStrategoTerm term12363 = term;
              Success12288:
              { 
                Fail23028:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23028;
                  if(true)
                    break Success12288;
                }
                term = term12363;
                IStrategoTerm term12364 = term;
                Success12289:
                { 
                  Fail23029:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23029;
                    if(true)
                      break Success12289;
                  }
                  term = term12364;
                  IStrategoTerm g_4767 = null;
                  IStrategoTerm h_4767 = null;
                  IStrategoTerm j_4767 = null;
                  g_4767 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23013;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23013;
                  h_4767 = ((IStrategoList)term).tail();
                  j_4767 = h_4767;
                  term = report_failure_0_2.instance.invoke(context, j_4767, trans.const4554, g_4767);
                  if(term == null)
                    break Fail23013;
                }
              }
            }
          }
          m_4767 = term;
          k_4767 = trans.const4440;
          n_4767 = m_4767;
          term = string_replace_0_2.instance.invoke(context, n_4767, k_4767, trans.const4555);
          if(term == null)
            break Fail23013;
          term = (IStrategoTerm)termFactory.makeListCons(i_4769, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23013;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23013;
          x_4766 = term;
          p_4769 = term;
          m_4769 = trans.const4556;
          q_4769 = p_4769;
          n_4769 = trans.constCons2047;
          r_4769 = q_4769;
          term = termFactory.makeTuple(trans.const4557, x_4766);
          term = dr_set_rule_0_3.instance.invoke(context, r_4769, m_4769, n_4769, term);
          if(term == null)
            break Fail23013;
          p_4767 = w_4766;
          term = a_4766;
          q_4767 = a_4766;
          v_4769 = term;
          s_4769 = trans.const4475;
          w_4769 = v_4769;
          t_4769 = trans.constCons2047;
          x_4769 = w_4769;
          term = termFactory.makeTuple(trans.const4476, q_4767);
          term = dr_set_rule_0_3.instance.invoke(context, x_4769, s_4769, t_4769, term);
          if(term == null)
            break Fail23013;
          term = try_1_0.instance.invoke(context, p_4767, get_source_base_dir_0_0.instance);
          if(term == null)
            break Fail23013;
          IStrategoTerm term12365 = term;
          Success12290:
          { 
            Fail23030:
            { 
              IStrategoTerm s_4767 = null;
              IStrategoTerm x_4767 = null;
              IStrategoTerm z_4767 = null;
              IStrategoTerm a_4768 = null;
              s_4767 = term;
              term = a_4766;
              IStrategoTerm term12366 = term;
              Success12291:
              { 
                Fail23031:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23031;
                  if(true)
                    break Success12291;
                }
                term = term12366;
                IStrategoTerm term12367 = term;
                Success12292:
                { 
                  Fail23032:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23032;
                    if(true)
                      break Success12292;
                  }
                  term = term12367;
                  IStrategoTerm term12368 = term;
                  Success12293:
                  { 
                    Fail23033:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23033;
                      if(true)
                        break Success12293;
                    }
                    term = term12368;
                    IStrategoTerm term12369 = term;
                    Success12294:
                    { 
                      Fail23034:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23034;
                        if(true)
                          break Success12294;
                      }
                      term = term12369;
                      IStrategoTerm t_4767 = null;
                      IStrategoTerm u_4767 = null;
                      IStrategoTerm w_4767 = null;
                      t_4767 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23030;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23030;
                      u_4767 = ((IStrategoList)term).tail();
                      w_4767 = u_4767;
                      term = report_failure_0_2.instance.invoke(context, w_4767, trans.const4554, t_4767);
                      if(term == null)
                        break Fail23030;
                    }
                  }
                }
              }
              z_4767 = term;
              x_4767 = trans.const4440;
              a_4768 = z_4767;
              term = string_replace_0_2.instance.invoke(context, a_4768, x_4767, trans.const4440);
              if(term == null)
                break Fail23030;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2089);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23030;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23030;
              term = s_4767;
              { 
                IStrategoTerm b_4768 = null;
                IStrategoTerm c_4770 = null;
                IStrategoTerm d_4770 = null;
                IStrategoTerm f_4770 = null;
                IStrategoTerm g_4770 = null;
                IStrategoTerm h_4770 = null;
                b_4768 = term;
                f_4770 = term;
                c_4770 = trans.const4559;
                g_4770 = f_4770;
                d_4770 = trans.constCons2047;
                h_4770 = g_4770;
                term = dr_set_rule_0_3.instance.invoke(context, h_4770, c_4770, d_4770, trans.const4560);
                if(term == null)
                  break Fail23013;
                term = b_4768;
                if(true)
                  break Success12290;
              }
            }
            term = term12365;
          }
          IStrategoTerm term12370 = term;
          Success12295:
          { 
            Fail23035:
            { 
              IStrategoTerm c_4768 = null;
              IStrategoTerm h_4768 = null;
              IStrategoTerm j_4768 = null;
              IStrategoTerm k_4768 = null;
              c_4768 = term;
              term = a_4766;
              IStrategoTerm term12371 = term;
              Success12296:
              { 
                Fail23036:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23036;
                  if(true)
                    break Success12296;
                }
                term = term12371;
                IStrategoTerm term12372 = term;
                Success12297:
                { 
                  Fail23037:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23037;
                    if(true)
                      break Success12297;
                  }
                  term = term12372;
                  IStrategoTerm term12373 = term;
                  Success12298:
                  { 
                    Fail23038:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23038;
                      if(true)
                        break Success12298;
                    }
                    term = term12373;
                    IStrategoTerm term12374 = term;
                    Success12299:
                    { 
                      Fail23039:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23039;
                        if(true)
                          break Success12299;
                      }
                      term = term12374;
                      IStrategoTerm d_4768 = null;
                      IStrategoTerm e_4768 = null;
                      IStrategoTerm g_4768 = null;
                      d_4768 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23035;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23035;
                      e_4768 = ((IStrategoList)term).tail();
                      g_4768 = e_4768;
                      term = report_failure_0_2.instance.invoke(context, g_4768, trans.const4554, d_4768);
                      if(term == null)
                        break Fail23035;
                    }
                  }
                }
              }
              j_4768 = term;
              h_4768 = trans.const4440;
              k_4768 = j_4768;
              term = string_replace_0_2.instance.invoke(context, k_4768, h_4768, trans.const4440);
              if(term == null)
                break Fail23035;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2090);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23035;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23035;
              term = c_4768;
              { 
                IStrategoTerm l_4768 = null;
                IStrategoTerm m_4770 = null;
                IStrategoTerm n_4770 = null;
                IStrategoTerm p_4770 = null;
                IStrategoTerm q_4770 = null;
                IStrategoTerm r_4770 = null;
                l_4768 = term;
                p_4770 = term;
                m_4770 = trans.const4562;
                q_4770 = p_4770;
                n_4770 = trans.constCons2047;
                r_4770 = q_4770;
                term = dr_set_rule_0_3.instance.invoke(context, r_4770, m_4770, n_4770, trans.const4563);
                if(term == null)
                  break Fail23013;
                term = l_4768;
                if(true)
                  break Success12295;
              }
            }
            term = term12370;
          }
          if(true)
            break Success12273;
        }
        term = term12348;
        IStrategoTerm m_4768 = null;
        IStrategoTerm n_4768 = null;
        IStrategoTerm t_4770 = null;
        m_4768 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23012;
        n_4768 = term;
        t_4770 = m_4768;
        term = report_with_failure_0_2.instance.invoke(context, t_4770, trans.const4564, n_4768);
        if(term == null)
          break Fail23012;
      }
      term = t_4768;
      u_4770 = t_4768;
      IStrategoTerm term12375 = term;
      Success12300:
      { 
        Fail23040:
        { 
          IStrategoTerm o_4768 = null;
          IStrategoTerm p_4768 = null;
          IStrategoTerm x_4770 = null;
          IStrategoTerm y_4770 = null;
          IStrategoTerm a_4771 = null;
          IStrategoTerm b_4771 = null;
          IStrategoTerm c_4771 = null;
          term = topdown_1_0.instance.invoke(context, b_4766, lifted6843.instance);
          if(term == null)
            break Fail23040;
          term = declare_globals_top_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23040;
          term = declare_bodies_top_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23040;
          c_4766 = term;
          o_4768 = term;
          term = c_4766;
          p_4768 = c_4766;
          a_4771 = term;
          x_4770 = trans.const4565;
          b_4771 = a_4771;
          y_4770 = trans.constCons2047;
          c_4771 = b_4771;
          term = termFactory.makeTuple(trans.const4566, p_4768);
          term = dr_set_rule_0_3.instance.invoke(context, c_4771, x_4770, y_4770, term);
          if(term == null)
            break Fail23040;
          term = o_4768;
          if(true)
            break Success12300;
        }
        term = term12375;
        IStrategoTerm r_4768 = null;
        IStrategoTerm s_4768 = null;
        IStrategoTerm e_4771 = null;
        r_4768 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23012;
        s_4768 = term;
        e_4771 = r_4768;
        term = report_with_failure_0_2.instance.invoke(context, e_4771, trans.const4564, s_4768);
        if(term == null)
          break Fail23012;
      }
      term = u_4770;
      if(c_4766 == null)
        break Fail23012;
      term = c_4766;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}