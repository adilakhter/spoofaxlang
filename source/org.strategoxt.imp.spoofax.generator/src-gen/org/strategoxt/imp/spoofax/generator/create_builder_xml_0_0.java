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

@SuppressWarnings("all") public class create_builder_xml_0_0 extends Strategy 
{ 
  public static create_builder_xml_0_0 instance = new create_builder_xml_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_builder_xml_0_0");
    Fail26673:
    { 
      IStrategoTerm r_4384 = null;
      IStrategoTerm term11101 = term;
      Success10870:
      { 
        Fail26674:
        { 
          IStrategoTerm y_4384 = null;
          IStrategoTerm a_4385 = null;
          IStrategoTerm b_4385 = null;
          term = builder_xml_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26674;
          IStrategoTerm term11102 = term;
          Success10871:
          { 
            Fail26675:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26675;
              if(true)
                break Success10871;
            }
            term = term11102;
            IStrategoTerm term11103 = term;
            Success10872:
            { 
              Fail26676:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26676;
                if(true)
                  break Success10872;
              }
              term = term11103;
              IStrategoTerm term11104 = term;
              Success10873:
              { 
                Fail26677:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26677;
                  if(true)
                    break Success10873;
                }
                term = term11104;
                IStrategoTerm term11105 = term;
                Success10874:
                { 
                  Fail26678:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26678;
                    if(true)
                      break Success10874;
                  }
                  term = term11105;
                  IStrategoTerm u_4384 = null;
                  IStrategoTerm v_4384 = null;
                  IStrategoTerm x_4384 = null;
                  u_4384 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail26674;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail26674;
                  v_4384 = ((IStrategoList)term).tail();
                  x_4384 = v_4384;
                  term = report_failure_0_2.instance.invoke(context, x_4384, generator.const7820, u_4384);
                  if(term == null)
                    break Fail26674;
                }
              }
            }
          }
          a_4385 = term;
          y_4384 = generator.const7143;
          b_4385 = a_4385;
          term = string_replace_0_2.instance.invoke(context, b_4385, y_4384, generator.const7641);
          if(term == null)
            break Fail26674;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7821, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26674;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26674;
          if(true)
            break Success10870;
        }
        term = term11101;
        IStrategoTerm term11106 = term;
        Success10875:
        { 
          Fail26679:
          { 
            IStrategoTerm h_4386 = null;
            IStrategoTerm i_4385 = null;
            IStrategoTerm k_4385 = null;
            IStrategoTerm l_4385 = null;
            IStrategoTerm term11107 = term;
            Success10876:
            { 
              Fail26680:
              { 
                term = $Project$Name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26680;
                { 
                  if(true)
                    break Fail26679;
                  if(true)
                    break Success10876;
                }
              }
              term = term11107;
            }
            h_4386 = term;
            term = builder_xml_name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26679;
            IStrategoTerm term11108 = term;
            Success10877:
            { 
              Fail26681:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26681;
                if(true)
                  break Success10877;
              }
              term = term11108;
              IStrategoTerm term11109 = term;
              Success10878:
              { 
                Fail26682:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26682;
                  if(true)
                    break Success10878;
                }
                term = term11109;
                IStrategoTerm term11110 = term;
                Success10879:
                { 
                  Fail26683:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26683;
                    if(true)
                      break Success10879;
                  }
                  term = term11110;
                  IStrategoTerm term11111 = term;
                  Success10880:
                  { 
                    Fail26684:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26684;
                      if(true)
                        break Success10880;
                    }
                    term = term11111;
                    IStrategoTerm e_4385 = null;
                    IStrategoTerm f_4385 = null;
                    IStrategoTerm h_4385 = null;
                    e_4385 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26679;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26679;
                    f_4385 = ((IStrategoList)term).tail();
                    h_4385 = f_4385;
                    term = report_failure_0_2.instance.invoke(context, h_4385, generator.const7820, e_4385);
                    if(term == null)
                      break Fail26679;
                  }
                }
              }
            }
            k_4385 = term;
            i_4385 = generator.const7143;
            l_4385 = k_4385;
            term = string_replace_0_2.instance.invoke(context, l_4385, i_4385, generator.const7822);
            if(term == null)
              break Fail26679;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7823, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26679;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = warn_msg_0_1.instance.invoke(context, h_4386, term);
            if(term == null)
              break Fail26679;
            if(true)
              break Success10875;
          }
          term = term11106;
          IStrategoTerm q_4386 = null;
          IStrategoTerm q_4385 = null;
          IStrategoTerm s_4385 = null;
          IStrategoTerm t_4385 = null;
          IStrategoTerm y_4385 = null;
          IStrategoTerm a_4386 = null;
          IStrategoTerm b_4386 = null;
          IStrategoTerm u_4386 = null;
          IStrategoTerm w_4386 = null;
          IStrategoTerm x_4386 = null;
          term = $Project$Name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26673;
          r_4384 = term;
          term = r_4384;
          IStrategoTerm term11112 = term;
          Success10881:
          { 
            Fail26685:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26685;
              if(true)
                break Success10881;
            }
            term = term11112;
            IStrategoTerm term11113 = term;
            Success10882:
            { 
              Fail26686:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26686;
                if(true)
                  break Success10882;
              }
              term = term11113;
              IStrategoTerm term11114 = term;
              Success10883:
              { 
                Fail26687:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26687;
                  if(true)
                    break Success10883;
                }
                term = term11114;
                IStrategoTerm term11115 = term;
                Success10884:
                { 
                  Fail26688:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26688;
                    if(true)
                      break Success10884;
                  }
                  term = term11115;
                  IStrategoTerm m_4385 = null;
                  IStrategoTerm n_4385 = null;
                  IStrategoTerm p_4385 = null;
                  m_4385 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail26673;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail26673;
                  n_4385 = ((IStrategoList)term).tail();
                  p_4385 = n_4385;
                  term = report_failure_0_2.instance.invoke(context, p_4385, generator.const7820, m_4385);
                  if(term == null)
                    break Fail26673;
                }
              }
            }
          }
          s_4385 = term;
          q_4385 = generator.const7143;
          t_4385 = s_4385;
          term = string_replace_0_2.instance.invoke(context, t_4385, q_4385, generator.const7824);
          if(term == null)
            break Fail26673;
          q_4386 = term;
          term = r_4384;
          IStrategoTerm term11116 = term;
          Success10885:
          { 
            Fail26689:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26689;
              if(true)
                break Success10885;
            }
            term = term11116;
            IStrategoTerm term11117 = term;
            Success10886:
            { 
              Fail26690:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26690;
                if(true)
                  break Success10886;
              }
              term = term11117;
              IStrategoTerm term11118 = term;
              Success10887:
              { 
                Fail26691:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26691;
                  if(true)
                    break Success10887;
                }
                term = term11118;
                IStrategoTerm term11119 = term;
                Success10888:
                { 
                  Fail26692:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26692;
                    if(true)
                      break Success10888;
                  }
                  term = term11119;
                  IStrategoTerm u_4385 = null;
                  IStrategoTerm v_4385 = null;
                  IStrategoTerm x_4385 = null;
                  u_4385 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail26673;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail26673;
                  v_4385 = ((IStrategoList)term).tail();
                  x_4385 = v_4385;
                  term = report_failure_0_2.instance.invoke(context, x_4385, generator.const7820, u_4385);
                  if(term == null)
                    break Fail26673;
                }
              }
            }
          }
          a_4386 = term;
          y_4385 = generator.const7143;
          b_4386 = a_4386;
          term = string_replace_0_2.instance.invoke(context, b_4386, y_4385, generator.const7825);
          if(term == null)
            break Fail26673;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7830, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7829, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7827, termFactory.makeListCons(q_4386, termFactory.makeListCons(generator.const7828, termFactory.makeListCons(generator.const7519, termFactory.makeListCons(generator.const7827, termFactory.makeListCons(term, (IStrategoList)generator.constCons5113))))))))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26673;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
          w_4386 = term;
          u_4386 = generator.constCons5114;
          term = w_4386;
          x_4386 = w_4386;
          term = builder_xml_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26673;
          term = output_text_file_0_2.instance.invoke(context, x_4386, u_4386, term);
          if(term == null)
            break Fail26673;
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