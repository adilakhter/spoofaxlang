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

@SuppressWarnings("all") public class create_spx_derived_references_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_references_descriptor_0_0 instance = new create_spx_derived_references_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_references_descriptor_0_0");
    Fail26089:
    { 
      IStrategoTerm h_4299 = null;
      IStrategoTerm i_4299 = null;
      IStrategoTerm d_4300 = null;
      IStrategoTerm f_4300 = null;
      IStrategoTerm n_4299 = null;
      IStrategoTerm p_4299 = null;
      IStrategoTerm q_4299 = null;
      IStrategoTerm x_4299 = null;
      IStrategoTerm z_4299 = null;
      IStrategoTerm a_4300 = null;
      IStrategoTerm t_4687 = null;
      i_4299 = term;
      h_4299 = generator.const7230;
      term = i_4299;
      f_4300 = term;
      term = h_4299;
      IStrategoTerm term10487 = term;
      Success10410:
      { 
        Fail26090:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26090;
          if(true)
            break Success10410;
        }
        term = term10487;
        IStrategoTerm term10488 = term;
        Success10411:
        { 
          Fail26091:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26091;
            if(true)
              break Success10411;
          }
          term = term10488;
          IStrategoTerm term10489 = term;
          Success10412:
          { 
            Fail26092:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26092;
              if(true)
                break Success10412;
            }
            term = term10489;
            IStrategoTerm term10490 = term;
            Success10413:
            { 
              Fail26093:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26093;
                if(true)
                  break Success10413;
              }
              term = term10490;
              IStrategoTerm j_4299 = null;
              IStrategoTerm k_4299 = null;
              IStrategoTerm m_4299 = null;
              j_4299 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26089;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26089;
              k_4299 = ((IStrategoList)term).tail();
              m_4299 = k_4299;
              term = report_failure_0_2.instance.invoke(context, m_4299, generator.const7231, j_4299);
              if(term == null)
                break Fail26089;
            }
          }
        }
      }
      p_4299 = term;
      n_4299 = generator.const7143;
      q_4299 = p_4299;
      term = string_replace_0_2.instance.invoke(context, q_4299, n_4299, generator.const7159);
      if(term == null)
        break Fail26089;
      d_4300 = term;
      term = f_4300;
      term = build_derived_references_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26089;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26089;
      t_4687 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, t_4687);
      if(term == null)
        break Fail26089;
      IStrategoTerm term10491 = term;
      Success10414:
      { 
        Fail26094:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26094;
          if(true)
            break Success10414;
        }
        term = term10491;
        IStrategoTerm term10492 = term;
        Success10415:
        { 
          Fail26095:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26095;
            if(true)
              break Success10415;
          }
          term = term10492;
          IStrategoTerm term10493 = term;
          Success10416:
          { 
            Fail26096:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26096;
              if(true)
                break Success10416;
            }
            term = term10493;
            IStrategoTerm term10494 = term;
            Success10417:
            { 
              Fail26097:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26097;
                if(true)
                  break Success10417;
              }
              term = term10494;
              IStrategoTerm t_4299 = null;
              IStrategoTerm u_4299 = null;
              IStrategoTerm w_4299 = null;
              t_4299 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26089;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26089;
              u_4299 = ((IStrategoList)term).tail();
              w_4299 = u_4299;
              term = report_failure_0_2.instance.invoke(context, w_4299, generator.const7231, t_4299);
              if(term == null)
                break Fail26089;
            }
          }
        }
      }
      z_4299 = term;
      x_4299 = generator.const7143;
      a_4300 = z_4299;
      term = string_replace_0_2.instance.invoke(context, a_4300, x_4299, generator.const7143);
      if(term == null)
        break Fail26089;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(d_4300, termFactory.makeListCons(generator.const7190, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26089;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}