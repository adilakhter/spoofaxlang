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

@SuppressWarnings("all") public class create_spx_syntax_descriptor_0_0 extends Strategy 
{ 
  public static create_spx_syntax_descriptor_0_0 instance = new create_spx_syntax_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spx_syntax_descriptor_0_0");
    Fail25966:
    { 
      IStrategoTerm j_4285 = null;
      IStrategoTerm k_4285 = null;
      IStrategoTerm f_4286 = null;
      IStrategoTerm h_4286 = null;
      IStrategoTerm p_4285 = null;
      IStrategoTerm r_4285 = null;
      IStrategoTerm s_4285 = null;
      IStrategoTerm z_4285 = null;
      IStrategoTerm b_4286 = null;
      IStrategoTerm c_4286 = null;
      IStrategoTerm p_4687 = null;
      k_4285 = term;
      j_4285 = generator.const7188;
      term = k_4285;
      h_4286 = term;
      term = j_4285;
      IStrategoTerm term10373 = term;
      Success10296:
      { 
        Fail25967:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25967;
          if(true)
            break Success10296;
        }
        term = term10373;
        IStrategoTerm term10374 = term;
        Success10297:
        { 
          Fail25968:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25968;
            if(true)
              break Success10297;
          }
          term = term10374;
          IStrategoTerm term10375 = term;
          Success10298:
          { 
            Fail25969:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25969;
              if(true)
                break Success10298;
            }
            term = term10375;
            IStrategoTerm term10376 = term;
            Success10299:
            { 
              Fail25970:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25970;
                if(true)
                  break Success10299;
              }
              term = term10376;
              IStrategoTerm l_4285 = null;
              IStrategoTerm m_4285 = null;
              IStrategoTerm o_4285 = null;
              l_4285 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail25966;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25966;
              m_4285 = ((IStrategoList)term).tail();
              o_4285 = m_4285;
              term = report_failure_0_2.instance.invoke(context, o_4285, generator.const7192, l_4285);
              if(term == null)
                break Fail25966;
            }
          }
        }
      }
      r_4285 = term;
      p_4285 = generator.const7143;
      s_4285 = r_4285;
      term = string_replace_0_2.instance.invoke(context, s_4285, p_4285, generator.const7159);
      if(term == null)
        break Fail25966;
      f_4286 = term;
      term = h_4286;
      term = build_syntax_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25966;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25966;
      p_4687 = term.getSubterm(2);
      term = pp_descriptor_to_string_0_0.instance.invoke(context, p_4687);
      if(term == null)
        break Fail25966;
      IStrategoTerm term10377 = term;
      Success10300:
      { 
        Fail25971:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25971;
          if(true)
            break Success10300;
        }
        term = term10377;
        IStrategoTerm term10378 = term;
        Success10301:
        { 
          Fail25972:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25972;
            if(true)
              break Success10301;
          }
          term = term10378;
          IStrategoTerm term10379 = term;
          Success10302:
          { 
            Fail25973:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25973;
              if(true)
                break Success10302;
            }
            term = term10379;
            IStrategoTerm term10380 = term;
            Success10303:
            { 
              Fail25974:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25974;
                if(true)
                  break Success10303;
              }
              term = term10380;
              IStrategoTerm v_4285 = null;
              IStrategoTerm w_4285 = null;
              IStrategoTerm y_4285 = null;
              v_4285 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail25966;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25966;
              w_4285 = ((IStrategoList)term).tail();
              y_4285 = w_4285;
              term = report_failure_0_2.instance.invoke(context, y_4285, generator.const7192, v_4285);
              if(term == null)
                break Fail25966;
            }
          }
        }
      }
      b_4286 = term;
      z_4285 = generator.const7143;
      c_4286 = b_4286;
      term = string_replace_0_2.instance.invoke(context, c_4286, z_4285, generator.const7193);
      if(term == null)
        break Fail25966;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(f_4286, termFactory.makeListCons(generator.const7194, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25966;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}