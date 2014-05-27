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

@SuppressWarnings("all") public class dirs_with_generated_files_0_0 extends Strategy 
{ 
  public static dirs_with_generated_files_0_0 instance = new dirs_with_generated_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("dirs_with_generated_files_0_0");
    Fail21405:
    { 
      IStrategoTerm k_4196 = null;
      IStrategoTerm o_4196 = null;
      IStrategoTerm c_4195 = null;
      IStrategoTerm e_4195 = null;
      IStrategoTerm f_4195 = null;
      IStrategoTerm l_4196 = null;
      IStrategoTerm r_4196 = null;
      IStrategoTerm m_4195 = null;
      IStrategoTerm o_4195 = null;
      IStrategoTerm p_4195 = null;
      IStrategoTerm m_4196 = null;
      IStrategoTerm u_4196 = null;
      IStrategoTerm w_4195 = null;
      IStrategoTerm y_4195 = null;
      IStrategoTerm z_4195 = null;
      IStrategoTerm g_4196 = null;
      IStrategoTerm i_4196 = null;
      IStrategoTerm j_4196 = null;
      o_4196 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      IStrategoTerm term11540 = term;
      Success11485:
      { 
        Fail21406:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21406;
          if(true)
            break Success11485;
        }
        term = term11540;
        IStrategoTerm term11541 = term;
        Success11486:
        { 
          Fail21407:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21407;
            if(true)
              break Success11486;
          }
          term = term11541;
          IStrategoTerm term11542 = term;
          Success11487:
          { 
            Fail21408:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21408;
              if(true)
                break Success11487;
            }
            term = term11542;
            IStrategoTerm term11543 = term;
            Success11488:
            { 
              Fail21409:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21409;
                if(true)
                  break Success11488;
              }
              term = term11543;
              IStrategoTerm y_4194 = null;
              IStrategoTerm z_4194 = null;
              IStrategoTerm b_4195 = null;
              y_4194 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21405;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21405;
              z_4194 = ((IStrategoList)term).tail();
              b_4195 = z_4194;
              term = report_failure_0_2.instance.invoke(context, b_4195, trans.const4321, y_4194);
              if(term == null)
                break Fail21405;
            }
          }
        }
      }
      e_4195 = term;
      c_4195 = trans.const4230;
      f_4195 = e_4195;
      term = string_replace_0_2.instance.invoke(context, f_4195, c_4195, trans.const4230);
      if(term == null)
        break Fail21405;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      k_4196 = term;
      term = o_4196;
      r_4196 = o_4196;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      IStrategoTerm term11544 = term;
      Success11489:
      { 
        Fail21410:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21410;
          if(true)
            break Success11489;
        }
        term = term11544;
        IStrategoTerm term11545 = term;
        Success11490:
        { 
          Fail21411:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21411;
            if(true)
              break Success11490;
          }
          term = term11545;
          IStrategoTerm term11546 = term;
          Success11491:
          { 
            Fail21412:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21412;
              if(true)
                break Success11491;
            }
            term = term11546;
            IStrategoTerm term11547 = term;
            Success11492:
            { 
              Fail21413:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21413;
                if(true)
                  break Success11492;
              }
              term = term11547;
              IStrategoTerm i_4195 = null;
              IStrategoTerm j_4195 = null;
              IStrategoTerm l_4195 = null;
              i_4195 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21405;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21405;
              j_4195 = ((IStrategoList)term).tail();
              l_4195 = j_4195;
              term = report_failure_0_2.instance.invoke(context, l_4195, trans.const4321, i_4195);
              if(term == null)
                break Fail21405;
            }
          }
        }
      }
      o_4195 = term;
      m_4195 = trans.const4230;
      p_4195 = o_4195;
      term = string_replace_0_2.instance.invoke(context, p_4195, m_4195, trans.const4230);
      if(term == null)
        break Fail21405;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2002);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      l_4196 = term;
      term = r_4196;
      u_4196 = r_4196;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      IStrategoTerm term11548 = term;
      Success11493:
      { 
        Fail21414:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21414;
          if(true)
            break Success11493;
        }
        term = term11548;
        IStrategoTerm term11549 = term;
        Success11494:
        { 
          Fail21415:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21415;
            if(true)
              break Success11494;
          }
          term = term11549;
          IStrategoTerm term11550 = term;
          Success11495:
          { 
            Fail21416:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21416;
              if(true)
                break Success11495;
            }
            term = term11550;
            IStrategoTerm term11551 = term;
            Success11496:
            { 
              Fail21417:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21417;
                if(true)
                  break Success11496;
              }
              term = term11551;
              IStrategoTerm s_4195 = null;
              IStrategoTerm t_4195 = null;
              IStrategoTerm v_4195 = null;
              s_4195 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21405;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21405;
              t_4195 = ((IStrategoList)term).tail();
              v_4195 = t_4195;
              term = report_failure_0_2.instance.invoke(context, v_4195, trans.const4321, s_4195);
              if(term == null)
                break Fail21405;
            }
          }
        }
      }
      y_4195 = term;
      w_4195 = trans.const4230;
      z_4195 = y_4195;
      term = string_replace_0_2.instance.invoke(context, z_4195, w_4195, trans.const4230);
      if(term == null)
        break Fail21405;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2003);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      m_4196 = term;
      term = u_4196;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      IStrategoTerm term11552 = term;
      Success11497:
      { 
        Fail21418:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21418;
          if(true)
            break Success11497;
        }
        term = term11552;
        IStrategoTerm term11553 = term;
        Success11498:
        { 
          Fail21419:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21419;
            if(true)
              break Success11498;
          }
          term = term11553;
          IStrategoTerm term11554 = term;
          Success11499:
          { 
            Fail21420:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21420;
              if(true)
                break Success11499;
            }
            term = term11554;
            IStrategoTerm term11555 = term;
            Success11500:
            { 
              Fail21421:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21421;
                if(true)
                  break Success11500;
              }
              term = term11555;
              IStrategoTerm c_4196 = null;
              IStrategoTerm d_4196 = null;
              IStrategoTerm f_4196 = null;
              c_4196 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21405;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21405;
              d_4196 = ((IStrategoList)term).tail();
              f_4196 = d_4196;
              term = report_failure_0_2.instance.invoke(context, f_4196, trans.const4321, c_4196);
              if(term == null)
                break Fail21405;
            }
          }
        }
      }
      i_4196 = term;
      g_4196 = trans.const4230;
      j_4196 = i_4196;
      term = string_replace_0_2.instance.invoke(context, j_4196, g_4196, trans.const4230);
      if(term == null)
        break Fail21405;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2004);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21405;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.annotateTerm(k_4196, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(l_4196, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(m_4196, checkListAnnos(termFactory, trans.constNil3)), termFactory.makeListCons(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)), (IStrategoList)trans.constNil3))));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}