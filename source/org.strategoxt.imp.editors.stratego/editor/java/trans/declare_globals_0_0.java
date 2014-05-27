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

@SuppressWarnings("all") public class declare_globals_0_0 extends Strategy 
{ 
  public static declare_globals_0_0 instance = new declare_globals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_globals_0_0");
    Fail23082:
    { 
      IStrategoTerm term12406 = term;
      IStrategoConstructor cons590 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12330:
      { 
        if(cons590 == Main._consSDefT_4)
        { 
          Fail23083:
          { 
            IStrategoTerm w_4781 = null;
            IStrategoTerm x_4781 = null;
            IStrategoTerm y_4781 = null;
            IStrategoTerm z_4781 = null;
            IStrategoTerm a_4782 = null;
            IStrategoTerm b_4782 = null;
            IStrategoTerm e_4782 = null;
            y_4781 = term.getSubterm(0);
            w_4781 = term.getSubterm(1);
            x_4781 = term.getSubterm(2);
            a_4782 = term.getSubterm(3);
            e_4782 = term;
            IStrategoTerm term12407 = term;
            Success12331:
            { 
              Fail23084:
              { 
                term = declare_definition_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23084;
                term = termFactory.annotateTerm(y_4781, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                z_4781 = term;
                term = topdown_1_0.instance.invoke(context, a_4782, lifted6852.instance);
                if(term == null)
                  break Fail23084;
                b_4782 = term;
                if(true)
                  break Success12331;
              }
              term = term12407;
              IStrategoTerm c_4782 = null;
              IStrategoTerm d_4782 = null;
              IStrategoTerm i_4782 = null;
              c_4782 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23083;
              d_4782 = term;
              i_4782 = c_4782;
              term = report_with_failure_0_2.instance.invoke(context, i_4782, trans.const4575, d_4782);
              if(term == null)
                break Fail23083;
            }
            term = e_4782;
            if(z_4781 == null || b_4782 == null)
              break Fail23083;
            term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{z_4781, w_4781, x_4781, b_4782});
            if(true)
              break Success12330;
          }
          term = term12406;
        }
        Success12332:
        { 
          if(cons590 == Main._consExtSDef_3)
          { 
            Fail23085:
            { 
              IStrategoTerm p_4781 = null;
              p_4781 = term;
              IStrategoTerm term12409 = term;
              Success12333:
              { 
                Fail23086:
                { 
                  term = redeclare_definition_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23086;
                  if(true)
                    break Success12333;
                }
                term = term12409;
                IStrategoTerm n_4781 = null;
                IStrategoTerm o_4781 = null;
                IStrategoTerm r_4781 = null;
                n_4781 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail23085;
                o_4781 = term;
                r_4781 = n_4781;
                term = report_with_failure_0_2.instance.invoke(context, r_4781, trans.const4575, o_4781);
                if(term == null)
                  break Fail23085;
              }
              term = p_4781;
              if(true)
                break Success12332;
            }
            term = term12406;
          }
          Success12334:
          { 
            if(cons590 == Main._consOpDecl_2)
            { 
              Fail23087:
              { 
                IStrategoTerm i_4780 = null;
                IStrategoTerm j_4780 = null;
                IStrategoTerm k_4780 = null;
                IStrategoTerm l_4780 = null;
                IStrategoTerm m_4780 = null;
                IStrategoTerm n_4780 = null;
                IStrategoTerm o_4780 = null;
                IStrategoTerm u_4780 = null;
                IStrategoTerm z_4780 = null;
                j_4780 = term.getSubterm(0);
                i_4780 = term.getSubterm(1);
                u_4780 = term;
                IStrategoTerm term12411 = term;
                Success12335:
                { 
                  Fail23088:
                  { 
                    IStrategoTerm v_4780 = null;
                    term = redeclare_definition_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23088;
                    v_4780 = term;
                    o_4780 = term;
                    term = termFactory.annotateTerm(j_4780, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(v_4780, (IStrategoList)trans.constNil4)));
                    k_4780 = term;
                    if(true)
                      break Success12335;
                  }
                  term = term12411;
                  IStrategoTerm p_4780 = null;
                  IStrategoTerm q_4780 = null;
                  IStrategoTerm y_4780 = null;
                  p_4780 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23087;
                  q_4780 = term;
                  y_4780 = p_4780;
                  term = report_with_failure_0_2.instance.invoke(context, y_4780, trans.const4575, q_4780);
                  if(term == null)
                    break Fail23087;
                }
                term = u_4780;
                z_4780 = u_4780;
                IStrategoTerm term12412 = term;
                Success12336:
                { 
                  Fail23089:
                  { 
                    IStrategoTerm r_4780 = null;
                    IStrategoTerm c_4781 = null;
                    IStrategoTerm e_4781 = null;
                    IStrategoTerm f_4781 = null;
                    term = signature_of_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23089;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                      break Fail23089;
                    l_4780 = term.getSubterm(0);
                    m_4780 = term.getSubterm(1);
                    term = termFactory.makeTuple(l_4780, m_4780, trans.const4437);
                    n_4780 = term;
                    r_4780 = term;
                    e_4781 = term;
                    c_4781 = trans.const4568;
                    term = e_4781;
                    f_4781 = e_4781;
                    if(o_4780 == null)
                      break Fail23089;
                    term = termFactory.makeTuple(trans.const4569, o_4780);
                    term = dr_set_rule_0_3.instance.invoke(context, f_4781, c_4781, n_4780, term);
                    if(term == null)
                      break Fail23089;
                    term = r_4780;
                    if(true)
                      break Success12336;
                  }
                  term = term12412;
                  IStrategoTerm s_4780 = null;
                  IStrategoTerm t_4780 = null;
                  IStrategoTerm h_4781 = null;
                  s_4780 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23087;
                  t_4780 = term;
                  h_4781 = s_4780;
                  term = report_with_failure_0_2.instance.invoke(context, h_4781, trans.const4575, t_4780);
                  if(term == null)
                    break Fail23087;
                }
                term = z_4780;
                if(k_4780 == null)
                  break Fail23087;
                term = termFactory.makeAppl(Main._consOpDecl_2, new IStrategoTerm[]{k_4780, i_4780});
                if(true)
                  break Success12334;
              }
              term = term12406;
            }
            Success12337:
            { 
              if(cons590 == Main._consExtOpDecl_2)
              { 
                Fail23090:
                { 
                  IStrategoTerm y_4779 = null;
                  y_4779 = term;
                  IStrategoTerm term12414 = term;
                  Success12338:
                  { 
                    Fail23091:
                    { 
                      term = redeclare_definition_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23091;
                      if(true)
                        break Success12338;
                    }
                    term = term12414;
                    IStrategoTerm w_4779 = null;
                    IStrategoTerm x_4779 = null;
                    IStrategoTerm a_4780 = null;
                    w_4779 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail23090;
                    x_4779 = term;
                    a_4780 = w_4779;
                    term = report_with_failure_0_2.instance.invoke(context, a_4780, trans.const4575, x_4779);
                    if(term == null)
                      break Fail23090;
                  }
                  term = y_4779;
                  if(true)
                    break Success12337;
                }
                term = term12406;
              }
              Success12339:
              { 
                if(cons590 == Main._consOverlay_3)
                { 
                  Fail23092:
                  { 
                    IStrategoTerm r_4778 = null;
                    IStrategoTerm s_4778 = null;
                    IStrategoTerm t_4778 = null;
                    IStrategoTerm u_4778 = null;
                    IStrategoTerm v_4778 = null;
                    IStrategoTerm w_4778 = null;
                    IStrategoTerm x_4778 = null;
                    IStrategoTerm y_4778 = null;
                    IStrategoTerm e_4779 = null;
                    IStrategoTerm j_4779 = null;
                    t_4778 = term.getSubterm(0);
                    r_4778 = term.getSubterm(1);
                    s_4778 = term.getSubterm(2);
                    e_4779 = term;
                    IStrategoTerm term12416 = term;
                    Success12340:
                    { 
                      Fail23093:
                      { 
                        IStrategoTerm f_4779 = null;
                        term = redeclare_definition_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23093;
                        f_4779 = term;
                        y_4778 = term;
                        term = termFactory.annotateTerm(t_4778, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(f_4779, (IStrategoList)trans.constNil4)));
                        u_4778 = term;
                        if(true)
                          break Success12340;
                      }
                      term = term12416;
                      IStrategoTerm z_4778 = null;
                      IStrategoTerm a_4779 = null;
                      IStrategoTerm i_4779 = null;
                      z_4778 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23092;
                      a_4779 = term;
                      i_4779 = z_4778;
                      term = report_with_failure_0_2.instance.invoke(context, i_4779, trans.const4575, a_4779);
                      if(term == null)
                        break Fail23092;
                    }
                    term = e_4779;
                    j_4779 = e_4779;
                    IStrategoTerm term12417 = term;
                    Success12341:
                    { 
                      Fail23094:
                      { 
                        IStrategoTerm b_4779 = null;
                        IStrategoTerm m_4779 = null;
                        IStrategoTerm o_4779 = null;
                        IStrategoTerm p_4779 = null;
                        term = signature_of_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23094;
                        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                          break Fail23094;
                        v_4778 = term.getSubterm(0);
                        w_4778 = term.getSubterm(1);
                        term = termFactory.makeTuple(v_4778, w_4778, trans.const4437);
                        x_4778 = term;
                        b_4779 = term;
                        o_4779 = term;
                        m_4779 = trans.const4568;
                        term = o_4779;
                        p_4779 = o_4779;
                        if(y_4778 == null)
                          break Fail23094;
                        term = termFactory.makeTuple(trans.const4569, y_4778);
                        term = dr_set_rule_0_3.instance.invoke(context, p_4779, m_4779, x_4778, term);
                        if(term == null)
                          break Fail23094;
                        term = b_4779;
                        if(true)
                          break Success12341;
                      }
                      term = term12417;
                      IStrategoTerm c_4779 = null;
                      IStrategoTerm d_4779 = null;
                      IStrategoTerm r_4779 = null;
                      c_4779 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23092;
                      d_4779 = term;
                      r_4779 = c_4779;
                      term = report_with_failure_0_2.instance.invoke(context, r_4779, trans.const4575, d_4779);
                      if(term == null)
                        break Fail23092;
                    }
                    term = j_4779;
                    if(u_4778 == null)
                      break Fail23092;
                    term = termFactory.makeAppl(Main._consOverlay_3, new IStrategoTerm[]{u_4778, r_4778, s_4778});
                    if(true)
                      break Success12339;
                  }
                  term = term12406;
                }
                Success12342:
                { 
                  if(cons590 == Main._consImport_1)
                  { 
                    Fail23095:
                    { 
                      IStrategoTerm b_4778 = null;
                      b_4778 = term.getSubterm(0);
                      IStrategoTerm term12419 = term;
                      Success12343:
                      { 
                        Fail23096:
                        { 
                          IStrategoTerm term12420 = term;
                          Success12344:
                          { 
                            Fail23097:
                            { 
                              term = open_import_3_0.instance.invoke(context, b_4778, resolve_import_decl_0_0.instance, read_stratego_signatures_0_0.instance, declare_globals_top_0_0.instance);
                              if(term == null)
                                break Fail23097;
                              if(true)
                                break Success12344;
                            }
                            term = term12420;
                            IStrategoTerm c_4778 = null;
                            IStrategoTerm g_4778 = null;
                            IStrategoTerm i_4778 = null;
                            IStrategoTerm j_4778 = null;
                            c_4778 = term;
                            i_4778 = term;
                            g_4778 = trans.const4576;
                            j_4778 = i_4778;
                            term = termFactory.makeTuple(trans.const4577, b_4778);
                            term = dr_set_rule_0_3.instance.invoke(context, j_4778, g_4778, b_4778, term);
                            if(term == null)
                              break Fail23096;
                            term = c_4778;
                          }
                          if(true)
                            break Success12343;
                        }
                        term = term12419;
                        IStrategoTerm d_4778 = null;
                        IStrategoTerm e_4778 = null;
                        IStrategoTerm l_4778 = null;
                        d_4778 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail23095;
                        e_4778 = term;
                        l_4778 = d_4778;
                        term = report_with_failure_0_2.instance.invoke(context, l_4778, trans.const4575, e_4778);
                        if(term == null)
                          break Fail23095;
                      }
                      term = termFactory.makeAppl(Main._consImport_1, new IStrategoTerm[]{b_4778});
                      if(true)
                        break Success12342;
                    }
                    term = term12406;
                  }
                  if(cons590 == Main._consImportWildcard_1)
                  { 
                    IStrategoTerm j_4777 = null;
                    j_4777 = term.getSubterm(0);
                    IStrategoTerm term12421 = term;
                    Success12345:
                    { 
                      Fail23098:
                      { 
                        IStrategoTerm term12422 = term;
                        Success12346:
                        { 
                          Fail23099:
                          { 
                            term = open_wildcard_import_4_0.instance.invoke(context, j_4777, resolve_import_path_0_0.instance, read_stratego_signatures_0_0.instance, declare_globals_top_0_0.instance, lifted6860.instance);
                            if(term == null)
                              break Fail23099;
                            if(true)
                              break Success12346;
                          }
                          term = term12422;
                          IStrategoTerm k_4777 = null;
                          IStrategoTerm s_4777 = null;
                          IStrategoTerm u_4777 = null;
                          IStrategoTerm v_4777 = null;
                          k_4777 = term;
                          u_4777 = term;
                          s_4777 = trans.const4576;
                          v_4777 = u_4777;
                          term = termFactory.makeTuple(trans.const4577, j_4777);
                          term = dr_set_rule_0_3.instance.invoke(context, v_4777, s_4777, j_4777, term);
                          if(term == null)
                            break Fail23098;
                          term = k_4777;
                        }
                        if(true)
                          break Success12345;
                      }
                      term = term12421;
                      IStrategoTerm l_4777 = null;
                      IStrategoTerm m_4777 = null;
                      IStrategoTerm x_4777 = null;
                      l_4777 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23082;
                      m_4777 = term;
                      x_4777 = l_4777;
                      term = report_with_failure_0_2.instance.invoke(context, x_4777, trans.const4575, m_4777);
                      if(term == null)
                        break Fail23082;
                    }
                    term = termFactory.makeAppl(Main._consImportWildcard_1, new IStrategoTerm[]{j_4777});
                  }
                  else
                  { 
                    break Fail23082;
                  }
                }
              }
            }
          }
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