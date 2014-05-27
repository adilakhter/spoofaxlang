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

@SuppressWarnings("all") public class create_spx_derived_builders_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_builders_descriptor_0_0 instance = new create_spx_derived_builders_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_builders_descriptor_0_0");
    Fail26228:
    { 
      IStrategoTerm h_4315 = null;
      IStrategoTerm i_4315 = null;
      IStrategoTerm d_4316 = null;
      IStrategoTerm f_4316 = null;
      IStrategoTerm n_4315 = null;
      IStrategoTerm p_4315 = null;
      IStrategoTerm q_4315 = null;
      IStrategoTerm x_4315 = null;
      IStrategoTerm z_4315 = null;
      IStrategoTerm a_4316 = null;
      IStrategoTerm a_4689 = null;
      i_4315 = term;
      h_4315 = generator.const7434;
      term = i_4315;
      f_4316 = term;
      term = h_4315;
      IStrategoTerm term10591 = term;
      Success10510:
      { 
        Fail26229:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26229;
          if(true)
            break Success10510;
        }
        term = term10591;
        IStrategoTerm term10592 = term;
        Success10511:
        { 
          Fail26230:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26230;
            if(true)
              break Success10511;
          }
          term = term10592;
          IStrategoTerm term10593 = term;
          Success10512:
          { 
            Fail26231:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26231;
              if(true)
                break Success10512;
            }
            term = term10593;
            IStrategoTerm term10594 = term;
            Success10513:
            { 
              Fail26232:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26232;
                if(true)
                  break Success10513;
              }
              term = term10594;
              IStrategoTerm j_4315 = null;
              IStrategoTerm k_4315 = null;
              IStrategoTerm m_4315 = null;
              j_4315 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26228;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26228;
              k_4315 = ((IStrategoList)term).tail();
              m_4315 = k_4315;
              term = report_failure_0_2.instance.invoke(context, m_4315, generator.const7435, j_4315);
              if(term == null)
                break Fail26228;
            }
          }
        }
      }
      p_4315 = term;
      n_4315 = generator.const7143;
      q_4315 = p_4315;
      term = string_replace_0_2.instance.invoke(context, q_4315, n_4315, generator.const7159);
      if(term == null)
        break Fail26228;
      d_4316 = term;
      term = f_4316;
      term = build_derived_builders_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26228;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26228;
      a_4689 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, a_4689);
      if(term == null)
        break Fail26228;
      IStrategoTerm term10595 = term;
      Success10514:
      { 
        Fail26233:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26233;
          if(true)
            break Success10514;
        }
        term = term10595;
        IStrategoTerm term10596 = term;
        Success10515:
        { 
          Fail26234:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26234;
            if(true)
              break Success10515;
          }
          term = term10596;
          IStrategoTerm term10597 = term;
          Success10516:
          { 
            Fail26235:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26235;
              if(true)
                break Success10516;
            }
            term = term10597;
            IStrategoTerm term10598 = term;
            Success10517:
            { 
              Fail26236:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26236;
                if(true)
                  break Success10517;
              }
              term = term10598;
              IStrategoTerm t_4315 = null;
              IStrategoTerm u_4315 = null;
              IStrategoTerm w_4315 = null;
              t_4315 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26228;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26228;
              u_4315 = ((IStrategoList)term).tail();
              w_4315 = u_4315;
              term = report_failure_0_2.instance.invoke(context, w_4315, generator.const7435, t_4315);
              if(term == null)
                break Fail26228;
            }
          }
        }
      }
      z_4315 = term;
      x_4315 = generator.const7143;
      a_4316 = z_4315;
      term = string_replace_0_2.instance.invoke(context, a_4316, x_4315, generator.const7143);
      if(term == null)
        break Fail26228;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(d_4316, termFactory.makeListCons(generator.const7246, termFactory.makeListCons(term, (IStrategoList)generator.constCons4851))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26228;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}