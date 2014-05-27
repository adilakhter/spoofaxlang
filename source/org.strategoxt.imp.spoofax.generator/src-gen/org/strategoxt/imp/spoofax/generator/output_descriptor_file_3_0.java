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

@SuppressWarnings("all") public class output_descriptor_file_3_0 extends Strategy 
{ 
  public static output_descriptor_file_3_0 instance = new output_descriptor_file_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4253, Strategy n_4253, Strategy o_4253)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_descriptor_file_3_0");
    Fail25726:
    { 
      IStrategoTerm g_4253 = null;
      IStrategoTerm h_4253 = null;
      TermReference i_4253 = new TermReference();
      IStrategoTerm j_4253 = null;
      j_4253 = term;
      IStrategoTerm term10220 = term;
      Success10169:
      { 
        Fail25727:
        { 
          term = m_4253.invoke(context, term);
          if(term == null)
            break Fail25727;
          term = termFactory.makeTuple(term, generator.const7127);
          term = add_extension_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25727;
          h_4253 = term;
          g_4253 = generator.const7128;
          term = termFactory.makeTuple(generator.const7128, generator.const7009, h_4253);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25727;
          if(i_4253.value == null)
            i_4253.value = term;
          else
            if(i_4253.value != term && !i_4253.value.match(term))
              break Fail25727;
          if(true)
            break Success10169;
        }
        term = term10220;
        TermReference k_4253 = new TermReference();
        if(k_4253.value == null)
          k_4253.value = term;
        else
          if(k_4253.value != term && !k_4253.value.match(term))
            break Fail25726;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail25726;
        lifted9207 lifted92070 = new lifted9207();
        lifted92070.k_4253 = k_4253;
        term = report_failure_1_0.instance.invoke(context, term, lifted92070);
        if(term == null)
          break Fail25726;
      }
      term = j_4253;
      IStrategoTerm term10221 = term;
      Success10170:
      { 
        Fail25728:
        { 
          IStrategoTerm l_4253 = null;
          l_4253 = term;
          IStrategoTerm term10222 = term;
          Success10171:
          { 
            Fail25729:
            { 
              term = $Reset$Files_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25729;
              if(true)
                break Success10171;
            }
            term = term10222;
            if(i_4253.value == null)
              break Fail25728;
            term = o_4253.invoke(context, i_4253.value);
            if(term == null)
              break Fail25728;
          }
          term = l_4253;
          { 
            IStrategoTerm w_4253 = null;
            IStrategoTerm a_4254 = null;
            w_4253 = term;
            term = print_filename_0_2.instance.invoke(context, w_4253, generator.constCons4618, h_4253);
            if(term == null)
              break Fail25726;
            term = n_4253.invoke(context, term);
            if(term == null)
              break Fail25726;
            IStrategoTerm term10223 = term;
            Success10172:
            { 
              Fail25730:
              { 
                if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail25730;
                term = pp_descriptor_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25730;
                if(true)
                  break Success10172;
              }
              term = term10223;
              IStrategoTerm y_4253 = null;
              y_4253 = term;
              term = fatal_err_0_1.instance.invoke(context, y_4253, generator.const7130);
              if(term == null)
                break Fail25726;
            }
            a_4254 = term;
            if(g_4253 == null)
              break Fail25726;
            term = (IStrategoTerm)termFactory.makeListCons(g_4253, (IStrategoList)generator.constNil7);
            term = output_text_file_p__0_2.instance.invoke(context, a_4254, term, h_4253);
            if(term == null)
              break Fail25726;
            if(true)
              break Success10170;
          }
        }
        term = term10221;
        lifted9209 lifted92090 = new lifted9209();
        lifted92090.i_4253 = i_4253;
        term = verbose_msg_2_0.instance.invoke(context, term, lifted9208.instance, lifted92090);
        if(term == null)
          break Fail25726;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}