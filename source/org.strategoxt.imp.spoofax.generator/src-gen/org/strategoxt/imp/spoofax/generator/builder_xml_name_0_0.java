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

@SuppressWarnings("all") public class builder_xml_name_0_0 extends Strategy 
{ 
  public static builder_xml_name_0_0 instance = new builder_xml_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("builder_xml_name_0_0");
    Fail26668:
    { 
      IStrategoTerm j_4384 = null;
      IStrategoTerm l_4384 = null;
      IStrategoTerm m_4384 = null;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26668;
      IStrategoTerm term11097 = term;
      Success10866:
      { 
        Fail26669:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26669;
          if(true)
            break Success10866;
        }
        term = term11097;
        IStrategoTerm term11098 = term;
        Success10867:
        { 
          Fail26670:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26670;
            if(true)
              break Success10867;
          }
          term = term11098;
          IStrategoTerm term11099 = term;
          Success10868:
          { 
            Fail26671:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26671;
              if(true)
                break Success10868;
            }
            term = term11099;
            IStrategoTerm term11100 = term;
            Success10869:
            { 
              Fail26672:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26672;
                if(true)
                  break Success10869;
              }
              term = term11100;
              IStrategoTerm f_4384 = null;
              IStrategoTerm g_4384 = null;
              IStrategoTerm i_4384 = null;
              f_4384 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26668;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26668;
              g_4384 = ((IStrategoList)term).tail();
              i_4384 = g_4384;
              term = report_failure_0_2.instance.invoke(context, i_4384, generator.const7818, f_4384);
              if(term == null)
                break Fail26668;
            }
          }
        }
      }
      l_4384 = term;
      j_4384 = generator.const7143;
      m_4384 = l_4384;
      term = string_replace_0_2.instance.invoke(context, m_4384, j_4384, generator.const7143);
      if(term == null)
        break Fail26668;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constCons5112);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26668;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}