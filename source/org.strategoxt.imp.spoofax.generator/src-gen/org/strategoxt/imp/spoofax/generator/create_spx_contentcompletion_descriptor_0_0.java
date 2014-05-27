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

@SuppressWarnings("all") public class create_spx_contentcompletion_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_contentcompletion_descriptor_0_0 instance = new create_spx_contentcompletion_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_contentcompletion_descriptor_0_0");
    Fail26165:
    { 
      IStrategoTerm a_4309 = null;
      IStrategoTerm b_4309 = null;
      IStrategoTerm w_4309 = null;
      IStrategoTerm y_4309 = null;
      IStrategoTerm g_4309 = null;
      IStrategoTerm i_4309 = null;
      IStrategoTerm j_4309 = null;
      IStrategoTerm q_4309 = null;
      IStrategoTerm s_4309 = null;
      IStrategoTerm t_4309 = null;
      IStrategoTerm m_4688 = null;
      b_4309 = term;
      a_4309 = generator.const7322;
      term = b_4309;
      y_4309 = term;
      term = a_4309;
      IStrategoTerm term10544 = term;
      Success10465:
      { 
        Fail26166:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26166;
          if(true)
            break Success10465;
        }
        term = term10544;
        IStrategoTerm term10545 = term;
        Success10466:
        { 
          Fail26167:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26167;
            if(true)
              break Success10466;
          }
          term = term10545;
          IStrategoTerm term10546 = term;
          Success10467:
          { 
            Fail26168:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26168;
              if(true)
                break Success10467;
            }
            term = term10546;
            IStrategoTerm term10547 = term;
            Success10468:
            { 
              Fail26169:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26169;
                if(true)
                  break Success10468;
              }
              term = term10547;
              IStrategoTerm c_4309 = null;
              IStrategoTerm d_4309 = null;
              IStrategoTerm f_4309 = null;
              c_4309 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26165;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26165;
              d_4309 = ((IStrategoList)term).tail();
              f_4309 = d_4309;
              term = report_failure_0_2.instance.invoke(context, f_4309, generator.const7323, c_4309);
              if(term == null)
                break Fail26165;
            }
          }
        }
      }
      i_4309 = term;
      g_4309 = generator.const7143;
      j_4309 = i_4309;
      term = string_replace_0_2.instance.invoke(context, j_4309, g_4309, generator.const7159);
      if(term == null)
        break Fail26165;
      w_4309 = term;
      term = y_4309;
      term = build_contentcompletion_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26165;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26165;
      m_4688 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, m_4688);
      if(term == null)
        break Fail26165;
      IStrategoTerm term10548 = term;
      Success10469:
      { 
        Fail26170:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26170;
          if(true)
            break Success10469;
        }
        term = term10548;
        IStrategoTerm term10549 = term;
        Success10470:
        { 
          Fail26171:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26171;
            if(true)
              break Success10470;
          }
          term = term10549;
          IStrategoTerm term10550 = term;
          Success10471:
          { 
            Fail26172:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26172;
              if(true)
                break Success10471;
            }
            term = term10550;
            IStrategoTerm term10551 = term;
            Success10472:
            { 
              Fail26173:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26173;
                if(true)
                  break Success10472;
              }
              term = term10551;
              IStrategoTerm m_4309 = null;
              IStrategoTerm n_4309 = null;
              IStrategoTerm p_4309 = null;
              m_4309 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26165;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26165;
              n_4309 = ((IStrategoList)term).tail();
              p_4309 = n_4309;
              term = report_failure_0_2.instance.invoke(context, p_4309, generator.const7323, m_4309);
              if(term == null)
                break Fail26165;
            }
          }
        }
      }
      s_4309 = term;
      q_4309 = generator.const7143;
      t_4309 = s_4309;
      term = string_replace_0_2.instance.invoke(context, t_4309, q_4309, generator.const7143);
      if(term == null)
        break Fail26165;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(w_4309, termFactory.makeListCons(generator.const7247, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26165;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}