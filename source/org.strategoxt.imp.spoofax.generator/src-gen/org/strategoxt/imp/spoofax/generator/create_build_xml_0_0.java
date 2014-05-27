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

@SuppressWarnings("all") public class create_build_xml_0_0 extends Strategy 
{ 
  public static create_build_xml_0_0 instance = new create_build_xml_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_build_xml_0_0");
    Fail26693:
    { 
      IStrategoTerm c_4387 = null;
      IStrategoTerm term11120 = term;
      Success10889:
      { 
        Fail26694:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7832);
          if(term == null)
            break Fail26694;
          if(true)
            break Success10889;
        }
        term = term11120;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26693;
        c_4387 = term;
        term = trans_module_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26693;
        term = get_main_class_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26693;
        IStrategoTerm term11121 = term;
        Success10890:
        { 
          Fail26695:
          { 
            IStrategoTerm d_4387 = null;
            d_4387 = term;
            IStrategoTerm term11122 = term;
            Success10891:
            { 
              Fail26696:
              { 
                term = file_exists_0_0.instance.invoke(context, generator.const7832);
                if(term == null)
                  break Fail26696;
                { 
                  if(true)
                    break Fail26695;
                  if(true)
                    break Success10891;
                }
              }
              term = term11122;
            }
            term = d_4387;
            { 
              IStrategoTerm i_4387 = null;
              IStrategoTerm k_4387 = null;
              IStrategoTerm l_4387 = null;
              IStrategoTerm w_4387 = null;
              IStrategoTerm y_4387 = null;
              IStrategoTerm z_4387 = null;
              term = c_4387;
              IStrategoTerm term11123 = term;
              Success10892:
              { 
                Fail26697:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26697;
                  if(true)
                    break Success10892;
                }
                term = term11123;
                IStrategoTerm term11124 = term;
                Success10893:
                { 
                  Fail26698:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26698;
                    if(true)
                      break Success10893;
                  }
                  term = term11124;
                  IStrategoTerm term11125 = term;
                  Success10894:
                  { 
                    Fail26699:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26699;
                      if(true)
                        break Success10894;
                    }
                    term = term11125;
                    IStrategoTerm term11126 = term;
                    Success10895:
                    { 
                      Fail26700:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail26700;
                        if(true)
                          break Success10895;
                      }
                      term = term11126;
                      IStrategoTerm e_4387 = null;
                      IStrategoTerm f_4387 = null;
                      IStrategoTerm h_4387 = null;
                      e_4387 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail26693;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail26693;
                      f_4387 = ((IStrategoList)term).tail();
                      h_4387 = f_4387;
                      term = report_failure_0_2.instance.invoke(context, h_4387, generator.const7833, e_4387);
                      if(term == null)
                        break Fail26693;
                    }
                  }
                }
              }
              k_4387 = term;
              i_4387 = generator.const7143;
              l_4387 = k_4387;
              term = string_replace_0_2.instance.invoke(context, l_4387, i_4387, generator.const7646);
              if(term == null)
                break Fail26693;
              term = (IStrategoTerm)termFactory.makeListCons(generator.const7841, termFactory.makeListCons(term, (IStrategoList)generator.constCons5127));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26693;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
              y_4387 = term;
              w_4387 = generator.constNil7;
              z_4387 = y_4387;
              term = output_text_file_0_2.instance.invoke(context, z_4387, w_4387, generator.const7832);
              if(term == null)
                break Fail26693;
              if(true)
                break Success10890;
            }
          }
          term = term11121;
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