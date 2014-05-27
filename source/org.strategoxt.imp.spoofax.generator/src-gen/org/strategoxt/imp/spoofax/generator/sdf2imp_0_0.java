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

@SuppressWarnings("all") public class sdf2imp_0_0 extends Strategy 
{ 
  public static sdf2imp_0_0 instance = new sdf2imp_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sdf2imp_0_0");
    Fail26762:
    { 
      TermReference e_4399 = new TermReference();
      IStrategoTerm f_4399 = null;
      IStrategoTerm g_4399 = null;
      IStrategoTerm h_4399 = null;
      h_4399 = term;
      IStrategoTerm term11169 = term;
      Success10932:
      { 
        Fail26763:
        { 
          term = set_verbosity_0_0.instance.invoke(context, generator.const7070);
          if(term == null)
            break Fail26763;
          if(true)
            break Success10932;
        }
        term = term11169;
        TermReference i_4399 = new TermReference();
        if(i_4399.value == null)
          i_4399.value = term;
        else
          if(i_4399.value != term && !i_4399.value.match(term))
            break Fail26762;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26762;
        lifted9543 lifted95430 = new lifted9543();
        lifted95430.i_4399 = i_4399;
        term = report_failure_1_0.instance.invoke(context, term, lifted95430);
        if(term == null)
          break Fail26762;
      }
      term = h_4399;
      IStrategoTerm term11170 = term;
      Success10933:
      { 
        Fail26764:
        { 
          IStrategoTerm j_4399 = null;
          j_4399 = term;
          term = $Input$File_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26764;
          term = j_4399;
          { 
            term = $Input$File_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26762;
            term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{term});
            IStrategoTerm term11171 = term;
            Success10934:
            { 
              Fail26765:
              { 
                IStrategoTerm k_4399 = null;
                k_4399 = term;
                lifted9544 lifted95440 = new lifted9544();
                lifted95440.e_4399 = e_4399;
                term = $F$I$L$E_1_0.instance.invoke(context, term, lifted95440);
                if(term == null)
                  break Fail26765;
                term = k_4399;
                { 
                  IStrategoTerm l_4399 = null;
                  IStrategoTerm m_4399 = null;
                  IStrategoTerm d_4401 = null;
                  IStrategoTerm e_4401 = null;
                  IStrategoTerm g_4401 = null;
                  IStrategoTerm h_4401 = null;
                  IStrategoTerm i_4401 = null;
                  if(e_4399.value == null)
                    break Fail26762;
                  term = find_def_file_0_0.instance.invoke(context, e_4399.value);
                  if(term == null)
                    break Fail26762;
                  l_4399 = term;
                  m_4399 = term;
                  g_4401 = term;
                  d_4401 = generator.const7868;
                  h_4401 = g_4401;
                  e_4401 = generator.constCons4561;
                  i_4401 = h_4401;
                  term = termFactory.makeTuple(generator.const7869, m_4399);
                  term = dr_set_rule_0_3.instance.invoke(context, i_4401, d_4401, e_4401, term);
                  if(term == null)
                    break Fail26762;
                  term = l_4399;
                  term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success10934;
                }
              }
              term = term11171;
              IStrategoTerm o_4399 = null;
              o_4399 = term;
              Success10935:
              { 
                Fail26766:
                { 
                  IStrategoTerm v_4399 = null;
                  IStrategoTerm x_4399 = null;
                  IStrategoTerm y_4399 = null;
                  term = $Input$File_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26766;
                  IStrategoTerm term11173 = term;
                  Success10936:
                  { 
                    Fail26767:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26767;
                      if(true)
                        break Success10936;
                    }
                    term = term11173;
                    IStrategoTerm term11174 = term;
                    Success10937:
                    { 
                      Fail26768:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail26768;
                        if(true)
                          break Success10937;
                      }
                      term = term11174;
                      IStrategoTerm term11175 = term;
                      Success10938:
                      { 
                        Fail26769:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail26769;
                          if(true)
                            break Success10938;
                        }
                        term = term11175;
                        IStrategoTerm term11176 = term;
                        Success10939:
                        { 
                          Fail26770:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail26770;
                            if(true)
                              break Success10939;
                          }
                          term = term11176;
                          IStrategoTerm r_4399 = null;
                          IStrategoTerm s_4399 = null;
                          IStrategoTerm u_4399 = null;
                          r_4399 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail26766;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail26766;
                          s_4399 = ((IStrategoList)term).tail();
                          u_4399 = s_4399;
                          term = report_failure_0_2.instance.invoke(context, u_4399, generator.const7919, r_4399);
                          if(term == null)
                            break Fail26766;
                        }
                      }
                    }
                  }
                  x_4399 = term;
                  v_4399 = generator.const7143;
                  y_4399 = x_4399;
                  term = string_replace_0_2.instance.invoke(context, y_4399, v_4399, generator.const7162);
                  if(term == null)
                    break Fail26766;
                  term = (IStrategoTerm)termFactory.makeListCons(generator.const7420, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26766;
                  term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
                  term = file_exists_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26766;
                  if(true)
                    break Success10935;
                }
                term = generator.const7132;
                IStrategoTerm term11177 = term;
                Success10940:
                { 
                  Fail26771:
                  { 
                    term = file_exists_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26771;
                    if(true)
                      break Success10940;
                  }
                  term = mkdir_0_0.instance.invoke(context, term11177);
                  if(term == null)
                    break Fail26762;
                }
                term = $Input$File_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26762;
                term = termFactory.makeTuple(term, generator.const7132);
                term = copy_file_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26762;
              }
              term = o_4399;
            }
            g_4399 = term;
            if(true)
              break Success10933;
          }
        }
        term = term11170;
        IStrategoTerm s_4401 = null;
        IStrategoTerm j_4400 = null;
        IStrategoTerm l_4400 = null;
        IStrategoTerm m_4400 = null;
        IStrategoTerm n_4400 = null;
        IStrategoTerm o_4400 = null;
        IStrategoTerm d_4402 = null;
        IStrategoTerm e_4402 = null;
        IStrategoTerm g_4402 = null;
        IStrategoTerm h_4402 = null;
        IStrategoTerm i_4402 = null;
        s_4401 = term;
        term = require_option_1_1.instance.invoke(context, s_4401, lifted9545.instance, generator.const7437);
        if(term == null)
          break Fail26762;
        IStrategoTerm term11178 = term;
        Success10941:
        { 
          Fail26772:
          { 
            IStrategoTerm z_4399 = null;
            z_4399 = term;
            IStrategoTerm term11179 = term;
            Success10942:
            { 
              Fail26773:
              { 
                term = $Start$Symbol_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26773;
                { 
                  if(true)
                    break Fail26772;
                  if(true)
                    break Success10942;
                }
              }
              term = term11179;
            }
            term = z_4399;
            { 
              IStrategoTerm a_4400 = null;
              IStrategoTerm b_4400 = null;
              IStrategoTerm t_4401 = null;
              IStrategoTerm u_4401 = null;
              IStrategoTerm w_4401 = null;
              IStrategoTerm x_4401 = null;
              IStrategoTerm y_4401 = null;
              a_4400 = term;
              term = generator.const7289;
              b_4400 = generator.const7289;
              w_4401 = term;
              t_4401 = generator.const7443;
              x_4401 = w_4401;
              u_4401 = generator.constCons4561;
              y_4401 = x_4401;
              term = termFactory.makeTuple(generator.const7444, b_4400);
              term = dr_set_rule_0_3.instance.invoke(context, y_4401, t_4401, u_4401, term);
              if(term == null)
                break Fail26762;
              term = a_4400;
              if(true)
                break Success10941;
            }
          }
          term = term11178;
        }
        term = create_grammar_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        term = create_pp_table_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        term = create_example_trans_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        term = create_java_strategy_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        IStrategoTerm term11180 = term;
        Success10943:
        { 
          Fail26774:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26774;
            if(true)
              break Success10943;
          }
          term = term11180;
          IStrategoTerm term11181 = term;
          Success10944:
          { 
            Fail26775:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26775;
              if(true)
                break Success10944;
            }
            term = term11181;
            IStrategoTerm term11182 = term;
            Success10945:
            { 
              Fail26776:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26776;
                if(true)
                  break Success10945;
              }
              term = term11182;
              IStrategoTerm term11183 = term;
              Success10946:
              { 
                Fail26777:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26777;
                  if(true)
                    break Success10946;
                }
                term = term11183;
                IStrategoTerm f_4400 = null;
                IStrategoTerm g_4400 = null;
                IStrategoTerm i_4400 = null;
                f_4400 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26762;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26762;
                g_4400 = ((IStrategoList)term).tail();
                i_4400 = g_4400;
                term = report_failure_0_2.instance.invoke(context, i_4400, generator.const7919, f_4400);
                if(term == null)
                  break Fail26762;
              }
            }
          }
        }
        l_4400 = term;
        j_4400 = generator.const7143;
        m_4400 = l_4400;
        term = string_replace_0_2.instance.invoke(context, m_4400, j_4400, generator.const7159);
        if(term == null)
          break Fail26762;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7631, termFactory.makeListCons(term, (IStrategoList)generator.constCons4546));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7))});
        term = pack_default_sdf_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26762;
        g_4399 = term;
        if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
          break Fail26762;
        f_4399 = term.getSubterm(0);
        n_4400 = term;
        term = f_4399;
        o_4400 = f_4399;
        g_4402 = term;
        d_4402 = generator.const7912;
        h_4402 = g_4402;
        e_4402 = generator.constCons4561;
        i_4402 = h_4402;
        term = termFactory.makeTuple(generator.const7913, o_4400);
        term = dr_set_rule_0_3.instance.invoke(context, i_4402, d_4402, e_4402, term);
        if(term == null)
          break Fail26762;
        term = n_4400;
      }
      term = configure_main_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      IStrategoTerm term11184 = term;
      Success10947:
      { 
        Fail26778:
        { 
          IStrategoTerm q_4400 = null;
          q_4400 = term;
          term = is_heuristic_services_needed_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26778;
          term = q_4400;
          { 
            IStrategoTerm j_4402 = null;
            term = sdf2rtg_0_0.instance.invoke(context, g_4399);
            if(term == null)
              break Fail26762;
            if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRTG_2 != ((IStrategoAppl)term).getConstructor())
              break Fail26762;
            IStrategoTerm arg6526 = term.getSubterm(1);
            if(arg6526.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRules_1 != ((IStrategoAppl)arg6526).getConstructor())
              break Fail26762;
            j_4402 = arg6526.getSubterm(0);
            term = register_rtg_0_0.instance.invoke(context, j_4402);
            if(term == null)
              break Fail26762;
            if(true)
              break Success10947;
          }
        }
        term = term11184;
      }
      IStrategoTerm term11185 = term;
      Success10948:
      { 
        Fail26779:
        { 
          IStrategoTerm r_4400 = null;
          r_4400 = term;
          IStrategoTerm term11186 = term;
          Success10949:
          { 
            Fail26780:
            { 
              term = $Is$Launched$From$Eclipse_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26780;
              { 
                if(true)
                  break Fail26779;
                if(true)
                  break Success10949;
              }
            }
            term = term11186;
          }
          term = r_4400;
          { 
            term = copy_or_create_parse_table_0_0.instance.invoke(context, g_4399);
            if(term == null)
              break Fail26762;
            if(true)
              break Success10948;
          }
        }
        term = term11185;
      }
      IStrategoTerm term11187 = term;
      Success10950:
      { 
        Fail26781:
        { 
          IStrategoTerm s_4400 = null;
          s_4400 = term;
          term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26781;
          term = s_4400;
          { 
            term = create_main_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26762;
            if(true)
              break Success10950;
          }
        }
        term = term11187;
      }
      term = create_syntax_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_folding_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_outliner_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_colorer_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_builders_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_references_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_completions_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_packed_descriptor_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_parse_controller_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_validator_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_build_properties_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_project_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_activator_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_classpath_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_manifest_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_plugin_xml_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_build_xml_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_build_generated_xml_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_builder_xml_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_example_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_common_trans_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = copy_jars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = copy_def_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_jdt_prefs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_project_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = create_spoofaxlang_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26762;
      term = say_1_0.instance.invoke(context, term, lifted9546.instance);
      if(term == null)
        break Fail26762;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}