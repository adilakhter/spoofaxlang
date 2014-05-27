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

@SuppressWarnings("all") public class create_project_file_0_0 extends Strategy 
{ 
  public static create_project_file_0_0 instance = new create_project_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_project_file_0_0");
    Fail26510:
    { 
      IStrategoTerm g_4355 = null;
      IStrategoTerm term10881 = term;
      Success10737:
      { 
        Fail26511:
        { 
          IStrategoTerm h_4355 = null;
          term = file_exists_0_0.instance.invoke(context, generator.const7623);
          if(term == null)
            break Fail26511;
          h_4355 = term;
          term = $Input$File_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26511;
          term = h_4355;
          if(true)
            break Success10737;
        }
        term = term10881;
        IStrategoTerm g_4356 = null;
        IStrategoTerm o_4355 = null;
        IStrategoTerm q_4355 = null;
        IStrategoTerm r_4355 = null;
        IStrategoTerm w_4355 = null;
        IStrategoTerm y_4355 = null;
        IStrategoTerm z_4355 = null;
        IStrategoTerm k_4356 = null;
        IStrategoTerm m_4356 = null;
        IStrategoTerm n_4356 = null;
        IStrategoTerm term10882 = term;
        Success10738:
        { 
          Fail26512:
          { 
            term = $Base$Package_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26512;
            if(true)
              break Success10738;
          }
          term = default_package_name_0_0.instance.invoke(context, term10882);
          if(term == null)
            break Fail26510;
        }
        term = builder_xml_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26510;
        term = termFactory.makeTuple(generator.const7624, term);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26510;
        g_4355 = term;
        term = $Project$Name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26510;
        IStrategoTerm term10883 = term;
        Success10739:
        { 
          Fail26513:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26513;
            if(true)
              break Success10739;
          }
          term = term10883;
          IStrategoTerm term10884 = term;
          Success10740:
          { 
            Fail26514:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26514;
              if(true)
                break Success10740;
            }
            term = term10884;
            IStrategoTerm term10885 = term;
            Success10741:
            { 
              Fail26515:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26515;
                if(true)
                  break Success10741;
              }
              term = term10885;
              IStrategoTerm term10886 = term;
              Success10742:
              { 
                Fail26516:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26516;
                  if(true)
                    break Success10742;
                }
                term = term10886;
                IStrategoTerm k_4355 = null;
                IStrategoTerm l_4355 = null;
                IStrategoTerm n_4355 = null;
                k_4355 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26510;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26510;
                l_4355 = ((IStrategoList)term).tail();
                n_4355 = l_4355;
                term = report_failure_0_2.instance.invoke(context, n_4355, generator.const7625, k_4355);
                if(term == null)
                  break Fail26510;
              }
            }
          }
        }
        q_4355 = term;
        o_4355 = generator.const7143;
        r_4355 = q_4355;
        term = string_replace_0_2.instance.invoke(context, r_4355, o_4355, generator.const7626);
        if(term == null)
          break Fail26510;
        g_4356 = term;
        term = g_4355;
        IStrategoTerm term10887 = term;
        Success10743:
        { 
          Fail26517:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26517;
            if(true)
              break Success10743;
          }
          term = term10887;
          IStrategoTerm term10888 = term;
          Success10744:
          { 
            Fail26518:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26518;
              if(true)
                break Success10744;
            }
            term = term10888;
            IStrategoTerm term10889 = term;
            Success10745:
            { 
              Fail26519:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26519;
                if(true)
                  break Success10745;
              }
              term = term10889;
              IStrategoTerm term10890 = term;
              Success10746:
              { 
                Fail26520:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26520;
                  if(true)
                    break Success10746;
                }
                term = term10890;
                IStrategoTerm s_4355 = null;
                IStrategoTerm t_4355 = null;
                IStrategoTerm v_4355 = null;
                s_4355 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26510;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26510;
                t_4355 = ((IStrategoList)term).tail();
                v_4355 = t_4355;
                term = report_failure_0_2.instance.invoke(context, v_4355, generator.const7625, s_4355);
                if(term == null)
                  break Fail26510;
              }
            }
          }
        }
        y_4355 = term;
        w_4355 = generator.const7143;
        z_4355 = y_4355;
        term = string_replace_0_2.instance.invoke(context, z_4355, w_4355, generator.const7627);
        if(term == null)
          break Fail26510;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7630, termFactory.makeListCons(g_4356, termFactory.makeListCons(generator.const7629, termFactory.makeListCons(term, (IStrategoList)generator.constCons4962))));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26510;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        m_4356 = term;
        k_4356 = generator.constNil7;
        n_4356 = m_4356;
        term = output_text_file_0_2.instance.invoke(context, n_4356, k_4356, generator.const7623);
        if(term == null)
          break Fail26510;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}