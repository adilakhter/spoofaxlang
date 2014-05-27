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

@SuppressWarnings("all") public class create_spx_contentfolding_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_contentfolding_descriptor_0_0 instance = new create_spx_contentfolding_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_contentfolding_descriptor_0_0");
    Fail26136:
    { 
      IStrategoTerm d_4306 = null;
      IStrategoTerm e_4306 = null;
      IStrategoTerm z_4306 = null;
      IStrategoTerm b_4307 = null;
      IStrategoTerm j_4306 = null;
      IStrategoTerm l_4306 = null;
      IStrategoTerm m_4306 = null;
      IStrategoTerm t_4306 = null;
      IStrategoTerm v_4306 = null;
      IStrategoTerm w_4306 = null;
      IStrategoTerm e_4688 = null;
      e_4306 = term;
      d_4306 = generator.const7277;
      term = e_4306;
      b_4307 = term;
      term = d_4306;
      IStrategoTerm term10523 = term;
      Success10444:
      { 
        Fail26137:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26137;
          if(true)
            break Success10444;
        }
        term = term10523;
        IStrategoTerm term10524 = term;
        Success10445:
        { 
          Fail26138:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26138;
            if(true)
              break Success10445;
          }
          term = term10524;
          IStrategoTerm term10525 = term;
          Success10446:
          { 
            Fail26139:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26139;
              if(true)
                break Success10446;
            }
            term = term10525;
            IStrategoTerm term10526 = term;
            Success10447:
            { 
              Fail26140:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26140;
                if(true)
                  break Success10447;
              }
              term = term10526;
              IStrategoTerm f_4306 = null;
              IStrategoTerm g_4306 = null;
              IStrategoTerm i_4306 = null;
              f_4306 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26136;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26136;
              g_4306 = ((IStrategoList)term).tail();
              i_4306 = g_4306;
              term = report_failure_0_2.instance.invoke(context, i_4306, generator.const7278, f_4306);
              if(term == null)
                break Fail26136;
            }
          }
        }
      }
      l_4306 = term;
      j_4306 = generator.const7143;
      m_4306 = l_4306;
      term = string_replace_0_2.instance.invoke(context, m_4306, j_4306, generator.const7159);
      if(term == null)
        break Fail26136;
      z_4306 = term;
      term = b_4307;
      term = build_folding_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26136;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26136;
      e_4688 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, e_4688);
      if(term == null)
        break Fail26136;
      IStrategoTerm term10527 = term;
      Success10448:
      { 
        Fail26141:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26141;
          if(true)
            break Success10448;
        }
        term = term10527;
        IStrategoTerm term10528 = term;
        Success10449:
        { 
          Fail26142:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26142;
            if(true)
              break Success10449;
          }
          term = term10528;
          IStrategoTerm term10529 = term;
          Success10450:
          { 
            Fail26143:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26143;
              if(true)
                break Success10450;
            }
            term = term10529;
            IStrategoTerm term10530 = term;
            Success10451:
            { 
              Fail26144:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26144;
                if(true)
                  break Success10451;
              }
              term = term10530;
              IStrategoTerm p_4306 = null;
              IStrategoTerm q_4306 = null;
              IStrategoTerm s_4306 = null;
              p_4306 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26136;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26136;
              q_4306 = ((IStrategoList)term).tail();
              s_4306 = q_4306;
              term = report_failure_0_2.instance.invoke(context, s_4306, generator.const7278, p_4306);
              if(term == null)
                break Fail26136;
            }
          }
        }
      }
      v_4306 = term;
      t_4306 = generator.const7143;
      w_4306 = v_4306;
      term = string_replace_0_2.instance.invoke(context, w_4306, t_4306, generator.const7143);
      if(term == null)
        break Fail26136;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(z_4306, termFactory.makeListCons(generator.const7244, termFactory.makeListCons(term, (IStrategoList)generator.constCons4689))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26136;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}