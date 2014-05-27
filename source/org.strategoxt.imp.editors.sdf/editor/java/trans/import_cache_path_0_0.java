package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail75663:
    { 
      IStrategoTerm w_92018 = null;
      IStrategoTerm x_92018 = null;
      IStrategoTerm y_92018 = null;
      IStrategoTerm z_92018 = null;
      IStrategoTerm a_92019 = null;
      IStrategoTerm b_92020 = null;
      x_92018 = term;
      b_92020 = term;
      IStrategoTerm term41445 = term;
      Success41435:
      { 
        Fail75664:
        { 
          IStrategoTerm f_92019 = null;
          IStrategoTerm h_92019 = null;
          IStrategoTerm i_92019 = null;
          IStrategoTerm i_92020 = null;
          IStrategoTerm k_92020 = null;
          IStrategoTerm l_92020 = null;
          IStrategoTerm m_92020 = null;
          IStrategoTerm o_92020 = null;
          IStrategoTerm p_92020 = null;
          IStrategoTerm q_92020 = null;
          IStrategoTerm s_92020 = null;
          IStrategoTerm t_92020 = null;
          IStrategoTerm w_92020 = null;
          IStrategoTerm n_92019 = null;
          IStrategoTerm p_92019 = null;
          IStrategoTerm q_92019 = null;
          IStrategoTerm v_92019 = null;
          IStrategoTerm x_92019 = null;
          IStrategoTerm y_92019 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75664;
          w_92018 = term;
          term = w_92018;
          IStrategoTerm term41446 = term;
          Success41436:
          { 
            Fail75665:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75665;
              if(true)
                break Success41436;
            }
            term = term41446;
            IStrategoTerm term41447 = term;
            Success41437:
            { 
              Fail75666:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75666;
                if(true)
                  break Success41437;
              }
              term = term41447;
              IStrategoTerm term41448 = term;
              Success41438:
              { 
                Fail75667:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75667;
                  if(true)
                    break Success41438;
                }
                term = term41448;
                IStrategoTerm term41449 = term;
                Success41439:
                { 
                  Fail75668:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75668;
                    if(true)
                      break Success41439;
                  }
                  term = term41449;
                  IStrategoTerm b_92019 = null;
                  IStrategoTerm c_92019 = null;
                  IStrategoTerm e_92019 = null;
                  b_92019 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75664;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75664;
                  c_92019 = ((IStrategoList)term).tail();
                  e_92019 = c_92019;
                  term = report_failure_0_2.instance.invoke(context, e_92019, trans.const15456, b_92019);
                  if(term == null)
                    break Fail75664;
                }
              }
            }
          }
          h_92019 = term;
          f_92019 = trans.const15453;
          i_92019 = h_92019;
          term = string_replace_0_2.instance.invoke(context, i_92019, f_92019, trans.const15453);
          if(term == null)
            break Fail75664;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons7206);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75664;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
          IStrategoTerm term41450 = term;
          Success41440:
          { 
            Fail75669:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75669;
              if(true)
                break Success41440;
            }
            term = mkdir_0_0.instance.invoke(context, term41450);
            if(term == null)
              break Fail75664;
          }
          y_92018 = term;
          k_92020 = x_92018;
          i_92020 = trans.const15455;
          l_92020 = k_92020;
          term = string_replace_0_2.instance.invoke(context, l_92020, i_92020, trans.const15458);
          if(term == null)
            break Fail75664;
          o_92020 = term;
          m_92020 = trans.const15459;
          p_92020 = o_92020;
          term = string_replace_0_2.instance.invoke(context, p_92020, m_92020, trans.const15458);
          if(term == null)
            break Fail75664;
          s_92020 = term;
          q_92020 = trans.const15460;
          t_92020 = s_92020;
          term = string_replace_0_2.instance.invoke(context, t_92020, q_92020, trans.const15458);
          if(term == null)
            break Fail75664;
          z_92018 = term;
          term = y_92018;
          IStrategoTerm term41451 = term;
          Success41441:
          { 
            Fail75670:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75670;
              if(true)
                break Success41441;
            }
            term = term41451;
            IStrategoTerm term41452 = term;
            Success41442:
            { 
              Fail75671:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75671;
                if(true)
                  break Success41442;
              }
              term = term41452;
              IStrategoTerm term41453 = term;
              Success41443:
              { 
                Fail75672:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75672;
                  if(true)
                    break Success41443;
                }
                term = term41453;
                IStrategoTerm term41454 = term;
                Success41444:
                { 
                  Fail75673:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75673;
                    if(true)
                      break Success41444;
                  }
                  term = term41454;
                  IStrategoTerm j_92019 = null;
                  IStrategoTerm k_92019 = null;
                  IStrategoTerm m_92019 = null;
                  j_92019 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75664;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75664;
                  k_92019 = ((IStrategoList)term).tail();
                  m_92019 = k_92019;
                  term = report_failure_0_2.instance.invoke(context, m_92019, trans.const15456, j_92019);
                  if(term == null)
                    break Fail75664;
                }
              }
            }
          }
          p_92019 = term;
          n_92019 = trans.const15453;
          q_92019 = p_92019;
          term = string_replace_0_2.instance.invoke(context, q_92019, n_92019, trans.const15453);
          if(term == null)
            break Fail75664;
          w_92020 = term;
          term = z_92018;
          IStrategoTerm term41455 = term;
          Success41445:
          { 
            Fail75674:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75674;
              if(true)
                break Success41445;
            }
            term = term41455;
            IStrategoTerm term41456 = term;
            Success41446:
            { 
              Fail75675:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75675;
                if(true)
                  break Success41446;
              }
              term = term41456;
              IStrategoTerm term41457 = term;
              Success41447:
              { 
                Fail75676:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75676;
                  if(true)
                    break Success41447;
                }
                term = term41457;
                IStrategoTerm term41458 = term;
                Success41448:
                { 
                  Fail75677:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75677;
                    if(true)
                      break Success41448;
                  }
                  term = term41458;
                  IStrategoTerm r_92019 = null;
                  IStrategoTerm s_92019 = null;
                  IStrategoTerm u_92019 = null;
                  r_92019 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75664;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75664;
                  s_92019 = ((IStrategoList)term).tail();
                  u_92019 = s_92019;
                  term = report_failure_0_2.instance.invoke(context, u_92019, trans.const15456, r_92019);
                  if(term == null)
                    break Fail75664;
                }
              }
            }
          }
          x_92019 = term;
          v_92019 = trans.const15453;
          y_92019 = x_92019;
          term = string_replace_0_2.instance.invoke(context, y_92019, v_92019, trans.const15461);
          if(term == null)
            break Fail75664;
          term = (IStrategoTerm)termFactory.makeListCons(w_92020, termFactory.makeListCons(trans.const15455, termFactory.makeListCons(term, (IStrategoList)trans.constCons7207)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75664;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
          a_92019 = term;
          if(true)
            break Success41435;
        }
        term = term41445;
        IStrategoTerm z_92019 = null;
        IStrategoTerm a_92020 = null;
        IStrategoTerm b_92021 = null;
        z_92019 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail75663;
        a_92020 = term;
        b_92021 = z_92019;
        term = report_with_failure_0_2.instance.invoke(context, b_92021, trans.const15463, a_92020);
        if(term == null)
          break Fail75663;
      }
      term = b_92020;
      if(a_92019 == null)
        break Fail75663;
      term = a_92019;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}