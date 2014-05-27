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

@SuppressWarnings("all") public class create_spx_derived_contentcompletion_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_contentcompletion_descriptor_0_0 instance = new create_spx_derived_contentcompletion_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_contentcompletion_descriptor_0_0");
    Fail26174:
    { 
      IStrategoTerm a_4310 = null;
      IStrategoTerm b_4310 = null;
      IStrategoTerm w_4310 = null;
      IStrategoTerm y_4310 = null;
      IStrategoTerm g_4310 = null;
      IStrategoTerm i_4310 = null;
      IStrategoTerm j_4310 = null;
      IStrategoTerm q_4310 = null;
      IStrategoTerm s_4310 = null;
      IStrategoTerm t_4310 = null;
      IStrategoTerm n_4688 = null;
      b_4310 = term;
      a_4310 = generator.const7322;
      term = b_4310;
      y_4310 = term;
      term = a_4310;
      IStrategoTerm term10552 = term;
      Success10473:
      { 
        Fail26175:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26175;
          if(true)
            break Success10473;
        }
        term = term10552;
        IStrategoTerm term10553 = term;
        Success10474:
        { 
          Fail26176:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26176;
            if(true)
              break Success10474;
          }
          term = term10553;
          IStrategoTerm term10554 = term;
          Success10475:
          { 
            Fail26177:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26177;
              if(true)
                break Success10475;
            }
            term = term10554;
            IStrategoTerm term10555 = term;
            Success10476:
            { 
              Fail26178:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26178;
                if(true)
                  break Success10476;
              }
              term = term10555;
              IStrategoTerm c_4310 = null;
              IStrategoTerm d_4310 = null;
              IStrategoTerm f_4310 = null;
              c_4310 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26174;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26174;
              d_4310 = ((IStrategoList)term).tail();
              f_4310 = d_4310;
              term = report_failure_0_2.instance.invoke(context, f_4310, generator.const7324, c_4310);
              if(term == null)
                break Fail26174;
            }
          }
        }
      }
      i_4310 = term;
      g_4310 = generator.const7143;
      j_4310 = i_4310;
      term = string_replace_0_2.instance.invoke(context, j_4310, g_4310, generator.const7159);
      if(term == null)
        break Fail26174;
      w_4310 = term;
      term = y_4310;
      term = build_derived_contentcompletion_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26174;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26174;
      n_4688 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, n_4688);
      if(term == null)
        break Fail26174;
      IStrategoTerm term10556 = term;
      Success10477:
      { 
        Fail26179:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26179;
          if(true)
            break Success10477;
        }
        term = term10556;
        IStrategoTerm term10557 = term;
        Success10478:
        { 
          Fail26180:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26180;
            if(true)
              break Success10478;
          }
          term = term10557;
          IStrategoTerm term10558 = term;
          Success10479:
          { 
            Fail26181:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26181;
              if(true)
                break Success10479;
            }
            term = term10558;
            IStrategoTerm term10559 = term;
            Success10480:
            { 
              Fail26182:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26182;
                if(true)
                  break Success10480;
              }
              term = term10559;
              IStrategoTerm m_4310 = null;
              IStrategoTerm n_4310 = null;
              IStrategoTerm p_4310 = null;
              m_4310 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26174;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26174;
              n_4310 = ((IStrategoList)term).tail();
              p_4310 = n_4310;
              term = report_failure_0_2.instance.invoke(context, p_4310, generator.const7324, m_4310);
              if(term == null)
                break Fail26174;
            }
          }
        }
      }
      s_4310 = term;
      q_4310 = generator.const7143;
      t_4310 = s_4310;
      term = string_replace_0_2.instance.invoke(context, t_4310, q_4310, generator.const7143);
      if(term == null)
        break Fail26174;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(w_4310, termFactory.makeListCons(generator.const7247, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26174;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}