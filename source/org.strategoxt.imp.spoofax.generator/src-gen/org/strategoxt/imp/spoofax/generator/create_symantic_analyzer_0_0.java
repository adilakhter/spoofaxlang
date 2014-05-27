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

@SuppressWarnings("all") public class create_symantic_analyzer_0_0 extends Strategy 
{ 
  public static create_symantic_analyzer_0_0 instance = new create_symantic_analyzer_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_symantic_analyzer_0_0");
    Fail26416:
    { 
      IStrategoTerm m_4339 = null;
      IStrategoTerm n_4339 = null;
      IStrategoTerm l_4340 = null;
      IStrategoTerm t_4339 = null;
      IStrategoTerm v_4339 = null;
      IStrategoTerm w_4339 = null;
      IStrategoTerm b_4340 = null;
      IStrategoTerm d_4340 = null;
      IStrategoTerm e_4340 = null;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26416;
      m_4339 = term;
      IStrategoTerm term10751 = term;
      Success10651:
      { 
        Fail26417:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26417;
          if(true)
            break Success10651;
        }
        term = default_package_name_0_0.instance.invoke(context, term10751);
        if(term == null)
          break Fail26416;
      }
      n_4339 = term;
      term = m_4339;
      IStrategoTerm term10752 = term;
      Success10652:
      { 
        Fail26418:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26418;
          if(true)
            break Success10652;
        }
        term = term10752;
        IStrategoTerm term10753 = term;
        Success10653:
        { 
          Fail26419:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26419;
            if(true)
              break Success10653;
          }
          term = term10753;
          IStrategoTerm term10754 = term;
          Success10654:
          { 
            Fail26420:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26420;
              if(true)
                break Success10654;
            }
            term = term10754;
            IStrategoTerm term10755 = term;
            Success10655:
            { 
              Fail26421:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26421;
                if(true)
                  break Success10655;
              }
              term = term10755;
              IStrategoTerm p_4339 = null;
              IStrategoTerm q_4339 = null;
              IStrategoTerm s_4339 = null;
              p_4339 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26416;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26416;
              q_4339 = ((IStrategoList)term).tail();
              s_4339 = q_4339;
              term = report_failure_0_2.instance.invoke(context, s_4339, generator.const7564, p_4339);
              if(term == null)
                break Fail26416;
            }
          }
        }
      }
      v_4339 = term;
      t_4339 = generator.const7143;
      w_4339 = v_4339;
      term = string_replace_0_2.instance.invoke(context, w_4339, t_4339, generator.const7565);
      if(term == null)
        break Fail26416;
      l_4340 = term;
      term = n_4339;
      IStrategoTerm term10756 = term;
      Success10656:
      { 
        Fail26422:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26422;
          if(true)
            break Success10656;
        }
        term = term10756;
        IStrategoTerm term10757 = term;
        Success10657:
        { 
          Fail26423:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26423;
            if(true)
              break Success10657;
          }
          term = term10757;
          IStrategoTerm term10758 = term;
          Success10658:
          { 
            Fail26424:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26424;
              if(true)
                break Success10658;
            }
            term = term10758;
            IStrategoTerm term10759 = term;
            Success10659:
            { 
              Fail26425:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26425;
                if(true)
                  break Success10659;
              }
              term = term10759;
              IStrategoTerm x_4339 = null;
              IStrategoTerm y_4339 = null;
              IStrategoTerm a_4340 = null;
              x_4339 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26416;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26416;
              y_4339 = ((IStrategoList)term).tail();
              a_4340 = y_4339;
              term = report_failure_0_2.instance.invoke(context, a_4340, generator.const7564, x_4339);
              if(term == null)
                break Fail26416;
            }
          }
        }
      }
      d_4340 = term;
      b_4340 = generator.const7143;
      e_4340 = d_4340;
      term = string_replace_0_2.instance.invoke(context, e_4340, b_4340, generator.const7162);
      if(term == null)
        break Fail26416;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7568, termFactory.makeListCons(l_4340, termFactory.makeListCons(generator.const7567, termFactory.makeListCons(term, (IStrategoList)generator.constCons4951))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26416;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}