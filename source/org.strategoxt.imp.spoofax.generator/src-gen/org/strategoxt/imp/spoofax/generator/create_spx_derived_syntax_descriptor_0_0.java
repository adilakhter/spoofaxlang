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

@SuppressWarnings("all") public class create_spx_derived_syntax_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_derived_syntax_descriptor_0_0 instance = new create_spx_derived_syntax_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_derived_syntax_descriptor_0_0");
    Fail25957:
    { 
      IStrategoTerm j_4284 = null;
      IStrategoTerm k_4284 = null;
      IStrategoTerm f_4285 = null;
      IStrategoTerm h_4285 = null;
      IStrategoTerm p_4284 = null;
      IStrategoTerm r_4284 = null;
      IStrategoTerm s_4284 = null;
      IStrategoTerm z_4284 = null;
      IStrategoTerm b_4285 = null;
      IStrategoTerm c_4285 = null;
      IStrategoTerm o_4687 = null;
      k_4284 = term;
      j_4284 = generator.const7188;
      term = k_4284;
      h_4285 = term;
      term = j_4284;
      IStrategoTerm term10365 = term;
      Success10288:
      { 
        Fail25958:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25958;
          if(true)
            break Success10288;
        }
        term = term10365;
        IStrategoTerm term10366 = term;
        Success10289:
        { 
          Fail25959:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25959;
            if(true)
              break Success10289;
          }
          term = term10366;
          IStrategoTerm term10367 = term;
          Success10290:
          { 
            Fail25960:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25960;
              if(true)
                break Success10290;
            }
            term = term10367;
            IStrategoTerm term10368 = term;
            Success10291:
            { 
              Fail25961:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25961;
                if(true)
                  break Success10291;
              }
              term = term10368;
              IStrategoTerm l_4284 = null;
              IStrategoTerm m_4284 = null;
              IStrategoTerm o_4284 = null;
              l_4284 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail25957;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25957;
              m_4284 = ((IStrategoList)term).tail();
              o_4284 = m_4284;
              term = report_failure_0_2.instance.invoke(context, o_4284, generator.const7189, l_4284);
              if(term == null)
                break Fail25957;
            }
          }
        }
      }
      r_4284 = term;
      p_4284 = generator.const7143;
      s_4284 = r_4284;
      term = string_replace_0_2.instance.invoke(context, s_4284, p_4284, generator.const7159);
      if(term == null)
        break Fail25957;
      f_4285 = term;
      term = h_4285;
      term = build_syntax_descriptor_generated_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25957;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25957;
      o_4687 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, o_4687);
      if(term == null)
        break Fail25957;
      IStrategoTerm term10369 = term;
      Success10292:
      { 
        Fail25962:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25962;
          if(true)
            break Success10292;
        }
        term = term10369;
        IStrategoTerm term10370 = term;
        Success10293:
        { 
          Fail25963:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25963;
            if(true)
              break Success10293;
          }
          term = term10370;
          IStrategoTerm term10371 = term;
          Success10294:
          { 
            Fail25964:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25964;
              if(true)
                break Success10294;
            }
            term = term10371;
            IStrategoTerm term10372 = term;
            Success10295:
            { 
              Fail25965:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25965;
                if(true)
                  break Success10295;
              }
              term = term10372;
              IStrategoTerm v_4284 = null;
              IStrategoTerm w_4284 = null;
              IStrategoTerm y_4284 = null;
              v_4284 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail25957;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25957;
              w_4284 = ((IStrategoList)term).tail();
              y_4284 = w_4284;
              term = report_failure_0_2.instance.invoke(context, y_4284, generator.const7189, v_4284);
              if(term == null)
                break Fail25957;
            }
          }
        }
      }
      b_4285 = term;
      z_4284 = generator.const7143;
      c_4285 = b_4285;
      term = string_replace_0_2.instance.invoke(context, c_4285, z_4284, generator.const7143);
      if(term == null)
        break Fail25957;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(f_4285, termFactory.makeListCons(generator.const7190, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25957;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}