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

@SuppressWarnings("all") public class simplify_ambiguity_element_0_0 extends Strategy 
{ 
  public static simplify_ambiguity_element_0_0 instance = new simplify_ambiguity_element_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simplify_ambiguity_element_0_0");
    Fail25826:
    { 
      IStrategoTerm term10265 = term;
      Success10206:
      { 
        Fail25827:
        { 
          IStrategoTerm w_4266 = null;
          IStrategoTerm b_4267 = null;
          IStrategoTerm d_4267 = null;
          IStrategoTerm e_4267 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail25827;
          w_4266 = ((IStrategoList)term).head();
          IStrategoTerm arg6236 = ((IStrategoList)term).tail();
          if(arg6236.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6236).isEmpty())
            break Fail25827;
          term = this.invoke(context, w_4266);
          if(term == null)
            break Fail25827;
          IStrategoTerm term10266 = term;
          Success10207:
          { 
            Fail25828:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25828;
              if(true)
                break Success10207;
            }
            term = term10266;
            IStrategoTerm term10267 = term;
            Success10208:
            { 
              Fail25829:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25829;
                if(true)
                  break Success10208;
              }
              term = term10267;
              IStrategoTerm term10268 = term;
              Success10209:
              { 
                Fail25830:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25830;
                  if(true)
                    break Success10209;
                }
                term = term10268;
                IStrategoTerm term10269 = term;
                Success10210:
                { 
                  Fail25831:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25831;
                    if(true)
                      break Success10210;
                  }
                  term = term10269;
                  IStrategoTerm x_4266 = null;
                  IStrategoTerm y_4266 = null;
                  IStrategoTerm a_4267 = null;
                  x_4266 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail25827;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail25827;
                  y_4266 = ((IStrategoList)term).tail();
                  a_4267 = y_4266;
                  term = report_failure_0_2.instance.invoke(context, a_4267, generator.const7161, x_4266);
                  if(term == null)
                    break Fail25827;
                }
              }
            }
          }
          d_4267 = term;
          b_4267 = generator.const7143;
          e_4267 = d_4267;
          term = string_replace_0_2.instance.invoke(context, e_4267, b_4267, generator.const7162);
          if(term == null)
            break Fail25827;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7163, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25827;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
          if(true)
            break Success10206;
        }
        term = term10265;
        IStrategoTerm p_4266 = null;
        IStrategoTerm q_4266 = null;
        IStrategoTerm t_4266 = null;
        IStrategoTerm cons317 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        p_4266 = cons317;
        t_4266 = term;
        IStrategoTerm term10270 = term;
        Success10211:
        { 
          Fail25832:
          { 
            term = p_4266;
            IStrategoTerm term10271 = term;
            Success10212:
            { 
              Fail25833:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25833;
                if(true)
                  break Success10212;
              }
              term = write_to_string_0_0.instance.invoke(context, term10271);
              if(term == null)
                break Fail25832;
            }
            q_4266 = term;
            if(true)
              break Success10211;
          }
          term = term10270;
          IStrategoTerm r_4266 = null;
          IStrategoTerm s_4266 = null;
          IStrategoTerm v_4266 = null;
          r_4266 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail25826;
          s_4266 = term;
          v_4266 = r_4266;
          term = report_with_failure_0_2.instance.invoke(context, v_4266, generator.const7164, s_4266);
          if(term == null)
            break Fail25826;
        }
        term = t_4266;
        if(q_4266 == null)
          break Fail25826;
        term = q_4266;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}