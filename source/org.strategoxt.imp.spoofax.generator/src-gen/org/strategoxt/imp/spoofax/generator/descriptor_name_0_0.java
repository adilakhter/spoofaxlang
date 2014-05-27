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

@SuppressWarnings("all") public class descriptor_name_0_0 extends Strategy 
{ 
  public static descriptor_name_0_0 instance = new descriptor_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("descriptor_name_0_0");
    Fail26252:
    { 
      IStrategoTerm g_4321 = null;
      IStrategoTerm h_4321 = null;
      IStrategoTerm d_4322 = null;
      IStrategoTerm m_4321 = null;
      IStrategoTerm o_4321 = null;
      IStrategoTerm p_4321 = null;
      IStrategoTerm u_4321 = null;
      IStrategoTerm w_4321 = null;
      IStrategoTerm x_4321 = null;
      g_4321 = term;
      IStrategoTerm term10612 = term;
      Success10526:
      { 
        Fail26253:
        { 
          term = $Descriptor$Name$Prefix_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26253;
          if(true)
            break Success10526;
        }
        term = get_sdf_main_module_0_0.instance.invoke(context, term10612);
        if(term == null)
          break Fail26252;
      }
      h_4321 = term;
      term = h_4321;
      IStrategoTerm term10613 = term;
      Success10527:
      { 
        Fail26254:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26254;
          if(true)
            break Success10527;
        }
        term = term10613;
        IStrategoTerm term10614 = term;
        Success10528:
        { 
          Fail26255:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26255;
            if(true)
              break Success10528;
          }
          term = term10614;
          IStrategoTerm term10615 = term;
          Success10529:
          { 
            Fail26256:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26256;
              if(true)
                break Success10529;
            }
            term = term10615;
            IStrategoTerm term10616 = term;
            Success10530:
            { 
              Fail26257:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26257;
                if(true)
                  break Success10530;
              }
              term = term10616;
              IStrategoTerm i_4321 = null;
              IStrategoTerm j_4321 = null;
              IStrategoTerm l_4321 = null;
              i_4321 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26252;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26252;
              j_4321 = ((IStrategoList)term).tail();
              l_4321 = j_4321;
              term = report_failure_0_2.instance.invoke(context, l_4321, generator.const7467, i_4321);
              if(term == null)
                break Fail26252;
            }
          }
        }
      }
      o_4321 = term;
      m_4321 = generator.const7143;
      p_4321 = o_4321;
      term = string_replace_0_2.instance.invoke(context, p_4321, m_4321, generator.const7143);
      if(term == null)
        break Fail26252;
      d_4322 = term;
      term = g_4321;
      IStrategoTerm term10617 = term;
      Success10531:
      { 
        Fail26258:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26258;
          if(true)
            break Success10531;
        }
        term = term10617;
        IStrategoTerm term10618 = term;
        Success10532:
        { 
          Fail26259:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26259;
            if(true)
              break Success10532;
          }
          term = term10618;
          IStrategoTerm term10619 = term;
          Success10533:
          { 
            Fail26260:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26260;
              if(true)
                break Success10533;
            }
            term = term10619;
            IStrategoTerm term10620 = term;
            Success10534:
            { 
              Fail26261:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26261;
                if(true)
                  break Success10534;
              }
              term = term10620;
              IStrategoTerm q_4321 = null;
              IStrategoTerm r_4321 = null;
              IStrategoTerm t_4321 = null;
              q_4321 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26252;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26252;
              r_4321 = ((IStrategoList)term).tail();
              t_4321 = r_4321;
              term = report_failure_0_2.instance.invoke(context, t_4321, generator.const7467, q_4321);
              if(term == null)
                break Fail26252;
            }
          }
        }
      }
      w_4321 = term;
      u_4321 = generator.const7143;
      x_4321 = w_4321;
      term = string_replace_0_2.instance.invoke(context, x_4321, u_4321, generator.const7162);
      if(term == null)
        break Fail26252;
      term = (IStrategoTerm)termFactory.makeListCons(d_4322, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26252;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}