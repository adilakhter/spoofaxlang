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

@SuppressWarnings("all") public class import_cache_path_0_0 extends Strategy 
{ 
  public static import_cache_path_0_0 instance = new import_cache_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_cache_path_0_0");
    Fail21443:
    { 
      IStrategoTerm l_4200 = null;
      IStrategoTerm m_4200 = null;
      IStrategoTerm n_4200 = null;
      IStrategoTerm o_4200 = null;
      IStrategoTerm p_4200 = null;
      IStrategoTerm q_4201 = null;
      m_4200 = term;
      q_4201 = term;
      IStrategoTerm term11577 = term;
      Success11512:
      { 
        Fail21444:
        { 
          IStrategoTerm u_4200 = null;
          IStrategoTerm w_4200 = null;
          IStrategoTerm x_4200 = null;
          IStrategoTerm x_4201 = null;
          IStrategoTerm z_4201 = null;
          IStrategoTerm a_4202 = null;
          IStrategoTerm b_4202 = null;
          IStrategoTerm d_4202 = null;
          IStrategoTerm e_4202 = null;
          IStrategoTerm f_4202 = null;
          IStrategoTerm h_4202 = null;
          IStrategoTerm i_4202 = null;
          IStrategoTerm l_4202 = null;
          IStrategoTerm c_4201 = null;
          IStrategoTerm e_4201 = null;
          IStrategoTerm f_4201 = null;
          IStrategoTerm k_4201 = null;
          IStrategoTerm m_4201 = null;
          IStrategoTerm n_4201 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21444;
          l_4200 = term;
          term = l_4200;
          IStrategoTerm term11578 = term;
          Success11513:
          { 
            Fail21445:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21445;
              if(true)
                break Success11513;
            }
            term = term11578;
            IStrategoTerm term11579 = term;
            Success11514:
            { 
              Fail21446:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21446;
                if(true)
                  break Success11514;
              }
              term = term11579;
              IStrategoTerm term11580 = term;
              Success11515:
              { 
                Fail21447:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21447;
                  if(true)
                    break Success11515;
                }
                term = term11580;
                IStrategoTerm term11581 = term;
                Success11516:
                { 
                  Fail21448:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21448;
                    if(true)
                      break Success11516;
                  }
                  term = term11581;
                  IStrategoTerm q_4200 = null;
                  IStrategoTerm r_4200 = null;
                  IStrategoTerm t_4200 = null;
                  q_4200 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21444;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21444;
                  r_4200 = ((IStrategoList)term).tail();
                  t_4200 = r_4200;
                  term = report_failure_0_2.instance.invoke(context, t_4200, trans.const4330, q_4200);
                  if(term == null)
                    break Fail21444;
                }
              }
            }
          }
          w_4200 = term;
          u_4200 = trans.const4230;
          x_4200 = w_4200;
          term = string_replace_0_2.instance.invoke(context, x_4200, u_4200, trans.const4230);
          if(term == null)
            break Fail21444;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2005);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21444;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          IStrategoTerm term11582 = term;
          Success11517:
          { 
            Fail21449:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21449;
              if(true)
                break Success11517;
            }
            term = mkdir_0_0.instance.invoke(context, term11582);
            if(term == null)
              break Fail21444;
          }
          n_4200 = term;
          z_4201 = m_4200;
          x_4201 = trans.const4270;
          a_4202 = z_4201;
          term = string_replace_0_2.instance.invoke(context, a_4202, x_4201, trans.const4332);
          if(term == null)
            break Fail21444;
          d_4202 = term;
          b_4202 = trans.const4333;
          e_4202 = d_4202;
          term = string_replace_0_2.instance.invoke(context, e_4202, b_4202, trans.const4332);
          if(term == null)
            break Fail21444;
          h_4202 = term;
          f_4202 = trans.const4334;
          i_4202 = h_4202;
          term = string_replace_0_2.instance.invoke(context, i_4202, f_4202, trans.const4332);
          if(term == null)
            break Fail21444;
          o_4200 = term;
          term = n_4200;
          IStrategoTerm term11583 = term;
          Success11518:
          { 
            Fail21450:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21450;
              if(true)
                break Success11518;
            }
            term = term11583;
            IStrategoTerm term11584 = term;
            Success11519:
            { 
              Fail21451:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21451;
                if(true)
                  break Success11519;
              }
              term = term11584;
              IStrategoTerm term11585 = term;
              Success11520:
              { 
                Fail21452:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21452;
                  if(true)
                    break Success11520;
                }
                term = term11585;
                IStrategoTerm term11586 = term;
                Success11521:
                { 
                  Fail21453:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21453;
                    if(true)
                      break Success11521;
                  }
                  term = term11586;
                  IStrategoTerm y_4200 = null;
                  IStrategoTerm z_4200 = null;
                  IStrategoTerm b_4201 = null;
                  y_4200 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21444;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21444;
                  z_4200 = ((IStrategoList)term).tail();
                  b_4201 = z_4200;
                  term = report_failure_0_2.instance.invoke(context, b_4201, trans.const4330, y_4200);
                  if(term == null)
                    break Fail21444;
                }
              }
            }
          }
          e_4201 = term;
          c_4201 = trans.const4230;
          f_4201 = e_4201;
          term = string_replace_0_2.instance.invoke(context, f_4201, c_4201, trans.const4230);
          if(term == null)
            break Fail21444;
          l_4202 = term;
          term = o_4200;
          IStrategoTerm term11587 = term;
          Success11522:
          { 
            Fail21454:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21454;
              if(true)
                break Success11522;
            }
            term = term11587;
            IStrategoTerm term11588 = term;
            Success11523:
            { 
              Fail21455:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21455;
                if(true)
                  break Success11523;
              }
              term = term11588;
              IStrategoTerm term11589 = term;
              Success11524:
              { 
                Fail21456:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21456;
                  if(true)
                    break Success11524;
                }
                term = term11589;
                IStrategoTerm term11590 = term;
                Success11525:
                { 
                  Fail21457:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21457;
                    if(true)
                      break Success11525;
                  }
                  term = term11590;
                  IStrategoTerm g_4201 = null;
                  IStrategoTerm h_4201 = null;
                  IStrategoTerm j_4201 = null;
                  g_4201 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21444;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21444;
                  h_4201 = ((IStrategoList)term).tail();
                  j_4201 = h_4201;
                  term = report_failure_0_2.instance.invoke(context, j_4201, trans.const4330, g_4201);
                  if(term == null)
                    break Fail21444;
                }
              }
            }
          }
          m_4201 = term;
          k_4201 = trans.const4230;
          n_4201 = m_4201;
          term = string_replace_0_2.instance.invoke(context, n_4201, k_4201, trans.const4335);
          if(term == null)
            break Fail21444;
          term = (IStrategoTerm)termFactory.makeListCons(l_4202, termFactory.makeListCons(trans.const4270, termFactory.makeListCons(term, (IStrategoList)trans.constCons2006)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21444;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          p_4200 = term;
          if(true)
            break Success11512;
        }
        term = term11577;
        IStrategoTerm o_4201 = null;
        IStrategoTerm p_4201 = null;
        IStrategoTerm q_4202 = null;
        o_4201 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21443;
        p_4201 = term;
        q_4202 = o_4201;
        term = report_with_failure_0_2.instance.invoke(context, q_4202, trans.const4337, p_4201);
        if(term == null)
          break Fail21443;
      }
      term = q_4201;
      if(p_4200 == null)
        break Fail21443;
      term = p_4200;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}