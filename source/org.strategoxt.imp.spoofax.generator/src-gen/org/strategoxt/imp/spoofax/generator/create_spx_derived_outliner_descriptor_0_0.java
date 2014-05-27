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

@SuppressWarnings("all") public class create_spx_derived_outliner_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_outliner_descriptor_0_0 instance = new create_spx_derived_outliner_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_outliner_descriptor_0_0");
    Fail26109:
    { 
      IStrategoTerm l_4301 = null;
      IStrategoTerm m_4301 = null;
      IStrategoTerm h_4302 = null;
      IStrategoTerm j_4302 = null;
      IStrategoTerm r_4301 = null;
      IStrategoTerm t_4301 = null;
      IStrategoTerm u_4301 = null;
      IStrategoTerm b_4302 = null;
      IStrategoTerm d_4302 = null;
      IStrategoTerm e_4302 = null;
      IStrategoTerm v_4687 = null;
      m_4301 = term;
      l_4301 = generator.const7241;
      term = m_4301;
      j_4302 = term;
      term = l_4301;
      IStrategoTerm term10503 = term;
      Success10426:
      { 
        Fail26110:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26110;
          if(true)
            break Success10426;
        }
        term = term10503;
        IStrategoTerm term10504 = term;
        Success10427:
        { 
          Fail26111:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26111;
            if(true)
              break Success10427;
          }
          term = term10504;
          IStrategoTerm term10505 = term;
          Success10428:
          { 
            Fail26112:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26112;
              if(true)
                break Success10428;
            }
            term = term10505;
            IStrategoTerm term10506 = term;
            Success10429:
            { 
              Fail26113:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26113;
                if(true)
                  break Success10429;
              }
              term = term10506;
              IStrategoTerm n_4301 = null;
              IStrategoTerm o_4301 = null;
              IStrategoTerm q_4301 = null;
              n_4301 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26109;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26109;
              o_4301 = ((IStrategoList)term).tail();
              q_4301 = o_4301;
              term = report_failure_0_2.instance.invoke(context, q_4301, generator.const7245, n_4301);
              if(term == null)
                break Fail26109;
            }
          }
        }
      }
      t_4301 = term;
      r_4301 = generator.const7143;
      u_4301 = t_4301;
      term = string_replace_0_2.instance.invoke(context, u_4301, r_4301, generator.const7159);
      if(term == null)
        break Fail26109;
      h_4302 = term;
      term = j_4302;
      term = build_derived_outliner_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26109;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26109;
      v_4687 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, v_4687);
      if(term == null)
        break Fail26109;
      IStrategoTerm term10507 = term;
      Success10430:
      { 
        Fail26114:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26114;
          if(true)
            break Success10430;
        }
        term = term10507;
        IStrategoTerm term10508 = term;
        Success10431:
        { 
          Fail26115:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26115;
            if(true)
              break Success10431;
          }
          term = term10508;
          IStrategoTerm term10509 = term;
          Success10432:
          { 
            Fail26116:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26116;
              if(true)
                break Success10432;
            }
            term = term10509;
            IStrategoTerm term10510 = term;
            Success10433:
            { 
              Fail26117:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26117;
                if(true)
                  break Success10433;
              }
              term = term10510;
              IStrategoTerm x_4301 = null;
              IStrategoTerm y_4301 = null;
              IStrategoTerm a_4302 = null;
              x_4301 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26109;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26109;
              y_4301 = ((IStrategoList)term).tail();
              a_4302 = y_4301;
              term = report_failure_0_2.instance.invoke(context, a_4302, generator.const7245, x_4301);
              if(term == null)
                break Fail26109;
            }
          }
        }
      }
      d_4302 = term;
      b_4302 = generator.const7143;
      e_4302 = d_4302;
      term = string_replace_0_2.instance.invoke(context, e_4302, b_4302, generator.const7143);
      if(term == null)
        break Fail26109;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(h_4302, termFactory.makeListCons(generator.const7247, termFactory.makeListCons(term, (IStrategoList)generator.constCons4690))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26109;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}