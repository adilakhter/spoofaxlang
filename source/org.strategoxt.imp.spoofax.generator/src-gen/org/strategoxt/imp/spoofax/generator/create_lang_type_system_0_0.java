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

@SuppressWarnings("all") public class create_lang_type_system_0_0 extends Strategy 
{ 
  public static create_lang_type_system_0_0 instance = new create_lang_type_system_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_lang_type_system_0_0");
    Fail26403:
    { 
      IStrategoTerm c_4338 = null;
      IStrategoTerm g_4339 = null;
      IStrategoTerm i_4338 = null;
      IStrategoTerm k_4338 = null;
      IStrategoTerm l_4338 = null;
      IStrategoTerm h_4339 = null;
      IStrategoTerm q_4338 = null;
      IStrategoTerm s_4338 = null;
      IStrategoTerm t_4338 = null;
      IStrategoTerm y_4338 = null;
      IStrategoTerm a_4339 = null;
      IStrategoTerm b_4339 = null;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26403;
      c_4338 = term;
      term = c_4338;
      IStrategoTerm term10739 = term;
      Success10639:
      { 
        Fail26404:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26404;
          if(true)
            break Success10639;
        }
        term = term10739;
        IStrategoTerm term10740 = term;
        Success10640:
        { 
          Fail26405:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26405;
            if(true)
              break Success10640;
          }
          term = term10740;
          IStrategoTerm term10741 = term;
          Success10641:
          { 
            Fail26406:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26406;
              if(true)
                break Success10641;
            }
            term = term10741;
            IStrategoTerm term10742 = term;
            Success10642:
            { 
              Fail26407:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26407;
                if(true)
                  break Success10642;
              }
              term = term10742;
              IStrategoTerm e_4338 = null;
              IStrategoTerm f_4338 = null;
              IStrategoTerm h_4338 = null;
              e_4338 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26403;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26403;
              f_4338 = ((IStrategoList)term).tail();
              h_4338 = f_4338;
              term = report_failure_0_2.instance.invoke(context, h_4338, generator.const7549, e_4338);
              if(term == null)
                break Fail26403;
            }
          }
        }
      }
      k_4338 = term;
      i_4338 = generator.const7143;
      l_4338 = k_4338;
      term = string_replace_0_2.instance.invoke(context, l_4338, i_4338, generator.const7550);
      if(term == null)
        break Fail26403;
      g_4339 = term;
      term = c_4338;
      IStrategoTerm term10743 = term;
      Success10643:
      { 
        Fail26408:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26408;
          if(true)
            break Success10643;
        }
        term = term10743;
        IStrategoTerm term10744 = term;
        Success10644:
        { 
          Fail26409:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26409;
            if(true)
              break Success10644;
          }
          term = term10744;
          IStrategoTerm term10745 = term;
          Success10645:
          { 
            Fail26410:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26410;
              if(true)
                break Success10645;
            }
            term = term10745;
            IStrategoTerm term10746 = term;
            Success10646:
            { 
              Fail26411:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26411;
                if(true)
                  break Success10646;
              }
              term = term10746;
              IStrategoTerm m_4338 = null;
              IStrategoTerm n_4338 = null;
              IStrategoTerm p_4338 = null;
              m_4338 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26403;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26403;
              n_4338 = ((IStrategoList)term).tail();
              p_4338 = n_4338;
              term = report_failure_0_2.instance.invoke(context, p_4338, generator.const7549, m_4338);
              if(term == null)
                break Fail26403;
            }
          }
        }
      }
      s_4338 = term;
      q_4338 = generator.const7143;
      t_4338 = s_4338;
      term = string_replace_0_2.instance.invoke(context, t_4338, q_4338, generator.const7551);
      if(term == null)
        break Fail26403;
      h_4339 = term;
      term = c_4338;
      IStrategoTerm term10747 = term;
      Success10647:
      { 
        Fail26412:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26412;
          if(true)
            break Success10647;
        }
        term = term10747;
        IStrategoTerm term10748 = term;
        Success10648:
        { 
          Fail26413:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26413;
            if(true)
              break Success10648;
          }
          term = term10748;
          IStrategoTerm term10749 = term;
          Success10649:
          { 
            Fail26414:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26414;
              if(true)
                break Success10649;
            }
            term = term10749;
            IStrategoTerm term10750 = term;
            Success10650:
            { 
              Fail26415:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26415;
                if(true)
                  break Success10650;
              }
              term = term10750;
              IStrategoTerm u_4338 = null;
              IStrategoTerm v_4338 = null;
              IStrategoTerm x_4338 = null;
              u_4338 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26403;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26403;
              v_4338 = ((IStrategoList)term).tail();
              x_4338 = v_4338;
              term = report_failure_0_2.instance.invoke(context, x_4338, generator.const7549, u_4338);
              if(term == null)
                break Fail26403;
            }
          }
        }
      }
      a_4339 = term;
      y_4338 = generator.const7143;
      b_4339 = a_4339;
      term = string_replace_0_2.instance.invoke(context, b_4339, y_4338, generator.const7552);
      if(term == null)
        break Fail26403;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7563, termFactory.makeListCons(g_4339, termFactory.makeListCons(generator.const7562, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7561, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7560, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7559, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7558, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7557, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7556, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7555, termFactory.makeListCons(h_4339, termFactory.makeListCons(generator.const7554, termFactory.makeListCons(term, (IStrategoList)generator.constCons4950))))))))))))))))))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26403;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}