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

@SuppressWarnings("all") public class simplify_ambiguity_report_0_0 extends Strategy 
{ 
  public static simplify_ambiguity_report_0_0 instance = new simplify_ambiguity_report_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simplify_ambiguity_report_0_0");
    Fail25820:
    { 
      IStrategoTerm term10260 = term;
      IStrategoConstructor cons347 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10201:
      { 
        if(cons347 == SpoofaxGenerator._consamb_1)
        { 
          Fail25821:
          { 
            IStrategoTerm arg6231 = term.getSubterm(0);
            if(arg6231.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6231).isEmpty())
              break Fail25821;
            term = concat_strings_0_0.instance.invoke(context, generator.constCons4619);
            if(term == null)
              break Fail25821;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            if(true)
              break Success10201;
          }
          term = term10260;
        }
        if(cons347 == SpoofaxGenerator._consamb_1)
        { 
          IStrategoTerm m_4265 = null;
          IStrategoTerm n_4265 = null;
          IStrategoTerm o_4265 = null;
          IStrategoTerm z_4265 = null;
          IStrategoTerm b_4266 = null;
          IStrategoTerm g_4266 = null;
          IStrategoTerm t_4265 = null;
          IStrategoTerm v_4265 = null;
          IStrategoTerm w_4265 = null;
          IStrategoTerm arg6232 = term.getSubterm(0);
          m_4265 = arg6232;
          if(arg6232.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6232).isEmpty())
            break Fail25820;
          term = map_1_0.instance.invoke(context, m_4265, lifted9262.instance);
          if(term == null)
            break Fail25820;
          term = map_1_0.instance.invoke(context, term, simplify_ambiguity_element_0_0.instance);
          if(term == null)
            break Fail25820;
          o_4265 = term;
          b_4266 = term;
          z_4265 = term;
          term = b_4266;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25820;
          term = termFactory.makeTuple(z_4265, term);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25820;
          term = o_4265;
          g_4266 = term;
          term = separate_by_0_1.instance.invoke(context, g_4266, generator.const7157);
          if(term == null)
            break Fail25820;
          n_4265 = term;
          term = n_4265;
          IStrategoTerm term10261 = term;
          Success10202:
          { 
            Fail25822:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25822;
              if(true)
                break Success10202;
            }
            term = term10261;
            IStrategoTerm term10262 = term;
            Success10203:
            { 
              Fail25823:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25823;
                if(true)
                  break Success10203;
              }
              term = term10262;
              IStrategoTerm term10263 = term;
              Success10204:
              { 
                Fail25824:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25824;
                  if(true)
                    break Success10204;
                }
                term = term10263;
                IStrategoTerm term10264 = term;
                Success10205:
                { 
                  Fail25825:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25825;
                    if(true)
                      break Success10205;
                  }
                  term = term10264;
                  IStrategoTerm p_4265 = null;
                  IStrategoTerm q_4265 = null;
                  IStrategoTerm s_4265 = null;
                  p_4265 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail25820;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail25820;
                  q_4265 = ((IStrategoList)term).tail();
                  s_4265 = q_4265;
                  term = report_failure_0_2.instance.invoke(context, s_4265, generator.const7158, p_4265);
                  if(term == null)
                    break Fail25820;
                }
              }
            }
          }
          v_4265 = term;
          t_4265 = generator.const7143;
          w_4265 = v_4265;
          term = string_replace_0_2.instance.invoke(context, w_4265, t_4265, generator.const7159);
          if(term == null)
            break Fail25820;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7160, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25820;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        }
        else
        { 
          break Fail25820;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}