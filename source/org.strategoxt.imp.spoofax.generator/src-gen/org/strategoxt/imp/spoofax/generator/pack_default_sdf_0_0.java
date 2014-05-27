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

@SuppressWarnings("all") public class pack_default_sdf_0_0 extends Strategy 
{ 
  public static pack_default_sdf_0_0 instance = new pack_default_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pack_default_sdf_0_0");
    Fail26787:
    { 
      IStrategoTerm f_4403 = null;
      IStrategoTerm g_4403 = null;
      IStrategoTerm h_4403 = null;
      IStrategoTerm i_4403 = null;
      IStrategoTerm v_4403 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26787;
      f_4403 = term.getSubterm(0);
      v_4403 = term;
      IStrategoTerm term11191 = term;
      Success10954:
      { 
        Fail26788:
        { 
          IStrategoTerm p_4403 = null;
          IStrategoTerm r_4403 = null;
          IStrategoTerm s_4403 = null;
          IStrategoTerm b_4404 = null;
          term = get_sdf_main_module_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26788;
          IStrategoTerm term11192 = term;
          Success10955:
          { 
            Fail26789:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26789;
              if(true)
                break Success10955;
            }
            term = term11192;
            IStrategoTerm term11193 = term;
            Success10956:
            { 
              Fail26790:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26790;
                if(true)
                  break Success10956;
              }
              term = term11193;
              IStrategoTerm term11194 = term;
              Success10957:
              { 
                Fail26791:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26791;
                  if(true)
                    break Success10957;
                }
                term = term11194;
                IStrategoTerm term11195 = term;
                Success10958:
                { 
                  Fail26792:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26792;
                    if(true)
                      break Success10958;
                  }
                  term = term11195;
                  IStrategoTerm l_4403 = null;
                  IStrategoTerm m_4403 = null;
                  IStrategoTerm o_4403 = null;
                  l_4403 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail26788;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail26788;
                  m_4403 = ((IStrategoList)term).tail();
                  o_4403 = m_4403;
                  term = report_failure_0_2.instance.invoke(context, o_4403, generator.const7925, l_4403);
                  if(term == null)
                    break Fail26788;
                }
              }
            }
          }
          r_4403 = term;
          p_4403 = generator.const7143;
          s_4403 = r_4403;
          term = string_replace_0_2.instance.invoke(context, s_4403, p_4403, generator.const7162);
          if(term == null)
            break Fail26788;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7420, termFactory.makeListCons(term, (IStrategoList)generator.constCons5158));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26788;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
          g_4403 = term;
          term = generator.const7132;
          IStrategoTerm term11196 = term;
          Success10959:
          { 
            Fail26793:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26793;
              if(true)
                break Success10959;
            }
            term = mkdir_0_0.instance.invoke(context, term11196);
            if(term == null)
              break Fail26788;
          }
          term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{f_4403});
          b_4404 = term;
          term = pack_sdf_0_1.instance.invoke(context, b_4404, generator.constCons5159);
          if(term == null)
            break Fail26788;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail26788;
          h_4403 = term.getSubterm(1);
          term = termFactory.makeTuple(g_4403, generator.const6986);
          term = fopen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26788;
          i_4403 = term;
          term = asfix_yield_0_1.instance.invoke(context, h_4403, term);
          if(term == null)
            break Fail26788;
          term = fclose_0_0.instance.invoke(context, i_4403);
          if(term == null)
            break Fail26788;
          if(true)
            break Success10954;
        }
        term = term11191;
        IStrategoTerm t_4403 = null;
        IStrategoTerm u_4403 = null;
        IStrategoTerm d_4404 = null;
        t_4403 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26787;
        u_4403 = term;
        d_4404 = t_4403;
        term = report_with_failure_0_2.instance.invoke(context, d_4404, generator.const7927, u_4403);
        if(term == null)
          break Fail26787;
      }
      term = v_4403;
      if(g_4403 == null)
        break Fail26787;
      term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{g_4403});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}