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

@SuppressWarnings("all") public class create_spx_outliner_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_outliner_descriptor_0_0 instance = new create_spx_outliner_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_outliner_descriptor_0_0");
    Fail26100:
    { 
      IStrategoTerm l_4300 = null;
      IStrategoTerm m_4300 = null;
      IStrategoTerm h_4301 = null;
      IStrategoTerm j_4301 = null;
      IStrategoTerm r_4300 = null;
      IStrategoTerm t_4300 = null;
      IStrategoTerm u_4300 = null;
      IStrategoTerm b_4301 = null;
      IStrategoTerm d_4301 = null;
      IStrategoTerm e_4301 = null;
      IStrategoTerm u_4687 = null;
      m_4300 = term;
      l_4300 = generator.const7241;
      term = m_4300;
      j_4301 = term;
      term = l_4300;
      IStrategoTerm term10495 = term;
      Success10418:
      { 
        Fail26101:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26101;
          if(true)
            break Success10418;
        }
        term = term10495;
        IStrategoTerm term10496 = term;
        Success10419:
        { 
          Fail26102:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26102;
            if(true)
              break Success10419;
          }
          term = term10496;
          IStrategoTerm term10497 = term;
          Success10420:
          { 
            Fail26103:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26103;
              if(true)
                break Success10420;
            }
            term = term10497;
            IStrategoTerm term10498 = term;
            Success10421:
            { 
              Fail26104:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26104;
                if(true)
                  break Success10421;
              }
              term = term10498;
              IStrategoTerm n_4300 = null;
              IStrategoTerm o_4300 = null;
              IStrategoTerm q_4300 = null;
              n_4300 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26100;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26100;
              o_4300 = ((IStrategoList)term).tail();
              q_4300 = o_4300;
              term = report_failure_0_2.instance.invoke(context, q_4300, generator.const7242, n_4300);
              if(term == null)
                break Fail26100;
            }
          }
        }
      }
      t_4300 = term;
      r_4300 = generator.const7143;
      u_4300 = t_4300;
      term = string_replace_0_2.instance.invoke(context, u_4300, r_4300, generator.const7159);
      if(term == null)
        break Fail26100;
      h_4301 = term;
      term = j_4301;
      term = build_outliner_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26100;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26100;
      u_4687 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, u_4687);
      if(term == null)
        break Fail26100;
      IStrategoTerm term10499 = term;
      Success10422:
      { 
        Fail26105:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26105;
          if(true)
            break Success10422;
        }
        term = term10499;
        IStrategoTerm term10500 = term;
        Success10423:
        { 
          Fail26106:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26106;
            if(true)
              break Success10423;
          }
          term = term10500;
          IStrategoTerm term10501 = term;
          Success10424:
          { 
            Fail26107:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26107;
              if(true)
                break Success10424;
            }
            term = term10501;
            IStrategoTerm term10502 = term;
            Success10425:
            { 
              Fail26108:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26108;
                if(true)
                  break Success10425;
              }
              term = term10502;
              IStrategoTerm x_4300 = null;
              IStrategoTerm y_4300 = null;
              IStrategoTerm a_4301 = null;
              x_4300 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26100;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26100;
              y_4300 = ((IStrategoList)term).tail();
              a_4301 = y_4300;
              term = report_failure_0_2.instance.invoke(context, a_4301, generator.const7242, x_4300);
              if(term == null)
                break Fail26100;
            }
          }
        }
      }
      d_4301 = term;
      b_4301 = generator.const7143;
      e_4301 = d_4301;
      term = string_replace_0_2.instance.invoke(context, e_4301, b_4301, generator.const7143);
      if(term == null)
        break Fail26100;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(h_4301, termFactory.makeListCons(generator.const7244, termFactory.makeListCons(term, (IStrategoList)generator.constCons4689))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26100;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}