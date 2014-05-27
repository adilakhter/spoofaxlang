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

@SuppressWarnings("all") public class create_main_language_constructs_0_0 extends Strategy 
{ 
  public static create_main_language_constructs_0_0 instance = new create_main_language_constructs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_main_language_constructs_0_0");
    Fail26385:
    { 
      IStrategoTerm e_4336 = null;
      IStrategoTerm f_4336 = null;
      IStrategoTerm u_4337 = null;
      IStrategoTerm y_4337 = null;
      IStrategoTerm k_4336 = null;
      IStrategoTerm m_4336 = null;
      IStrategoTerm n_4336 = null;
      IStrategoTerm v_4337 = null;
      IStrategoTerm u_4336 = null;
      IStrategoTerm w_4336 = null;
      IStrategoTerm x_4336 = null;
      IStrategoTerm w_4337 = null;
      IStrategoTerm c_4337 = null;
      IStrategoTerm e_4337 = null;
      IStrategoTerm f_4337 = null;
      IStrategoTerm k_4337 = null;
      IStrategoTerm m_4337 = null;
      IStrategoTerm n_4337 = null;
      f_4336 = term;
      IStrategoTerm term10722 = term;
      Success10622:
      { 
        Fail26386:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26386;
          if(true)
            break Success10622;
        }
        term = default_package_name_0_0.instance.invoke(context, term10722);
        if(term == null)
          break Fail26385;
      }
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26385;
      e_4336 = term;
      term = f_4336;
      y_4337 = term;
      term = e_4336;
      IStrategoTerm term10723 = term;
      Success10623:
      { 
        Fail26387:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26387;
          if(true)
            break Success10623;
        }
        term = term10723;
        IStrategoTerm term10724 = term;
        Success10624:
        { 
          Fail26388:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26388;
            if(true)
              break Success10624;
          }
          term = term10724;
          IStrategoTerm term10725 = term;
          Success10625:
          { 
            Fail26389:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26389;
              if(true)
                break Success10625;
            }
            term = term10725;
            IStrategoTerm term10726 = term;
            Success10626:
            { 
              Fail26390:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26390;
                if(true)
                  break Success10626;
              }
              term = term10726;
              IStrategoTerm g_4336 = null;
              IStrategoTerm h_4336 = null;
              IStrategoTerm j_4336 = null;
              g_4336 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26385;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26385;
              h_4336 = ((IStrategoList)term).tail();
              j_4336 = h_4336;
              term = report_failure_0_2.instance.invoke(context, j_4336, generator.const7513, g_4336);
              if(term == null)
                break Fail26385;
            }
          }
        }
      }
      m_4336 = term;
      k_4336 = generator.const7143;
      n_4336 = m_4336;
      term = string_replace_0_2.instance.invoke(context, n_4336, k_4336, generator.const7514);
      if(term == null)
        break Fail26385;
      u_4337 = term;
      term = y_4337;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26385;
      IStrategoTerm term10727 = term;
      Success10627:
      { 
        Fail26391:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26391;
          if(true)
            break Success10627;
        }
        term = term10727;
        IStrategoTerm term10728 = term;
        Success10628:
        { 
          Fail26392:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26392;
            if(true)
              break Success10628;
          }
          term = term10728;
          IStrategoTerm term10729 = term;
          Success10629:
          { 
            Fail26393:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26393;
              if(true)
                break Success10629;
            }
            term = term10729;
            IStrategoTerm term10730 = term;
            Success10630:
            { 
              Fail26394:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26394;
                if(true)
                  break Success10630;
              }
              term = term10730;
              IStrategoTerm q_4336 = null;
              IStrategoTerm r_4336 = null;
              IStrategoTerm t_4336 = null;
              q_4336 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26385;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26385;
              r_4336 = ((IStrategoList)term).tail();
              t_4336 = r_4336;
              term = report_failure_0_2.instance.invoke(context, t_4336, generator.const7513, q_4336);
              if(term == null)
                break Fail26385;
            }
          }
        }
      }
      w_4336 = term;
      u_4336 = generator.const7143;
      x_4336 = w_4336;
      term = string_replace_0_2.instance.invoke(context, x_4336, u_4336, generator.const7515);
      if(term == null)
        break Fail26385;
      v_4337 = term;
      term = e_4336;
      IStrategoTerm term10731 = term;
      Success10631:
      { 
        Fail26395:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26395;
          if(true)
            break Success10631;
        }
        term = term10731;
        IStrategoTerm term10732 = term;
        Success10632:
        { 
          Fail26396:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26396;
            if(true)
              break Success10632;
          }
          term = term10732;
          IStrategoTerm term10733 = term;
          Success10633:
          { 
            Fail26397:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26397;
              if(true)
                break Success10633;
            }
            term = term10733;
            IStrategoTerm term10734 = term;
            Success10634:
            { 
              Fail26398:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26398;
                if(true)
                  break Success10634;
              }
              term = term10734;
              IStrategoTerm y_4336 = null;
              IStrategoTerm z_4336 = null;
              IStrategoTerm b_4337 = null;
              y_4336 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26385;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26385;
              z_4336 = ((IStrategoList)term).tail();
              b_4337 = z_4336;
              term = report_failure_0_2.instance.invoke(context, b_4337, generator.const7513, y_4336);
              if(term == null)
                break Fail26385;
            }
          }
        }
      }
      e_4337 = term;
      c_4337 = generator.const7143;
      f_4337 = e_4337;
      term = string_replace_0_2.instance.invoke(context, f_4337, c_4337, generator.const7516);
      if(term == null)
        break Fail26385;
      w_4337 = term;
      term = e_4336;
      IStrategoTerm term10735 = term;
      Success10635:
      { 
        Fail26399:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26399;
          if(true)
            break Success10635;
        }
        term = term10735;
        IStrategoTerm term10736 = term;
        Success10636:
        { 
          Fail26400:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26400;
            if(true)
              break Success10636;
          }
          term = term10736;
          IStrategoTerm term10737 = term;
          Success10637:
          { 
            Fail26401:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26401;
              if(true)
                break Success10637;
            }
            term = term10737;
            IStrategoTerm term10738 = term;
            Success10638:
            { 
              Fail26402:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26402;
                if(true)
                  break Success10638;
              }
              term = term10738;
              IStrategoTerm g_4337 = null;
              IStrategoTerm h_4337 = null;
              IStrategoTerm j_4337 = null;
              g_4337 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26385;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26385;
              h_4337 = ((IStrategoList)term).tail();
              j_4337 = h_4337;
              term = report_failure_0_2.instance.invoke(context, j_4337, generator.const7513, g_4337);
              if(term == null)
                break Fail26385;
            }
          }
        }
      }
      m_4337 = term;
      k_4337 = generator.const7143;
      n_4337 = m_4337;
      term = string_replace_0_2.instance.invoke(context, n_4337, k_4337, generator.const7517);
      if(term == null)
        break Fail26385;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7548, termFactory.makeListCons(u_4337, termFactory.makeListCons(generator.const7547, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7546, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7545, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7544, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7543, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7542, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7541, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7540, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7539, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7538, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7537, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7536, termFactory.makeListCons(v_4337, termFactory.makeListCons(generator.const7535, termFactory.makeListCons(w_4337, termFactory.makeListCons(generator.const7534, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7533, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7532, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7531, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7530, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7529, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7528, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7527, termFactory.makeListCons(generator.const7179, termFactory.makeListCons(generator.const7526, termFactory.makeListCons(generator.const7180, termFactory.makeListCons(generator.const7525, termFactory.makeListCons(term, (IStrategoList)generator.constCons4949))))))))))))))))))))))))))))))))))))))))))))))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26385;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}