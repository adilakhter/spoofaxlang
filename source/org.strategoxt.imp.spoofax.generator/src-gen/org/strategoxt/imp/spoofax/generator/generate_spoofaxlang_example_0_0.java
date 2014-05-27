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

@SuppressWarnings("all") public class generate_spoofaxlang_example_0_0 extends Strategy 
{ 
  public static generate_spoofaxlang_example_0_0 instance = new generate_spoofaxlang_example_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_spoofaxlang_example_0_0");
    Fail26757:
    { 
      IStrategoTerm r_4397 = null;
      IStrategoTerm s_4397 = null;
      IStrategoTerm i_4398 = null;
      IStrategoTerm y_4397 = null;
      IStrategoTerm z_4397 = null;
      IStrategoTerm p_4398 = null;
      IStrategoTerm q_4398 = null;
      IStrategoTerm s_4398 = null;
      IStrategoTerm t_4398 = null;
      IStrategoTerm u_4398 = null;
      IStrategoTerm b_4398 = null;
      IStrategoTerm v_4398 = null;
      IStrategoTerm w_4398 = null;
      IStrategoTerm y_4398 = null;
      IStrategoTerm z_4398 = null;
      IStrategoTerm a_4399 = null;
      r_4397 = term;
      term = say_1_0.instance.invoke(context, term, lifted9536.instance);
      if(term == null)
        break Fail26757;
      term = r_4397;
      s_4397 = r_4397;
      IStrategoTerm term11165 = term;
      Success10928:
      { 
        Fail26758:
        { 
          term = set_verbosity_0_0.instance.invoke(context, generator.const7070);
          if(term == null)
            break Fail26758;
          if(true)
            break Success10928;
        }
        term = term11165;
        TermReference t_4397 = new TermReference();
        if(t_4397.value == null)
          t_4397.value = term;
        else
          if(t_4397.value != term && !t_4397.value.match(term))
            break Fail26757;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26757;
        lifted9537 lifted95370 = new lifted9537();
        lifted95370.t_4397 = t_4397;
        term = report_failure_1_0.instance.invoke(context, term, lifted95370);
        if(term == null)
          break Fail26757;
      }
      i_4398 = s_4397;
      term = require_option_1_1.instance.invoke(context, i_4398, lifted9538.instance, generator.const7437);
      if(term == null)
        break Fail26757;
      IStrategoTerm term11166 = term;
      Success10929:
      { 
        Fail26759:
        { 
          IStrategoTerm u_4397 = null;
          u_4397 = term;
          IStrategoTerm term11167 = term;
          Success10930:
          { 
            Fail26760:
            { 
              term = $Start$Symbol_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26760;
              { 
                if(true)
                  break Fail26759;
                if(true)
                  break Success10930;
              }
            }
            term = term11167;
          }
          term = u_4397;
          { 
            IStrategoTerm v_4397 = null;
            IStrategoTerm w_4397 = null;
            IStrategoTerm j_4398 = null;
            IStrategoTerm k_4398 = null;
            IStrategoTerm m_4398 = null;
            IStrategoTerm n_4398 = null;
            IStrategoTerm o_4398 = null;
            v_4397 = term;
            term = generator.const7289;
            w_4397 = generator.const7289;
            m_4398 = term;
            j_4398 = generator.const7443;
            n_4398 = m_4398;
            k_4398 = generator.constCons4561;
            o_4398 = n_4398;
            term = termFactory.makeTuple(generator.const7444, w_4397);
            term = dr_set_rule_0_3.instance.invoke(context, o_4398, j_4398, k_4398, term);
            if(term == null)
              break Fail26757;
            term = v_4397;
            if(true)
              break Success10929;
          }
        }
        term = term11166;
      }
      term = create_spxlang_lexicalconstructs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_spxlang_definitions_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_spxlang_adapters_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_java_strategy_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_spx_common_strategies_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      y_4397 = term;
      term = generator.const7120;
      z_4397 = generator.const7120;
      s_4398 = term;
      p_4398 = generator.const7912;
      t_4398 = s_4398;
      q_4398 = generator.constCons4561;
      u_4398 = t_4398;
      term = termFactory.makeTuple(generator.const7913, z_4397);
      term = dr_set_rule_0_3.instance.invoke(context, u_4398, p_4398, q_4398, term);
      if(term == null)
        break Fail26757;
      term = y_4397;
      b_4398 = y_4397;
      y_4398 = term;
      v_4398 = generator.const7463;
      z_4398 = y_4398;
      w_4398 = generator.constCons4561;
      a_4399 = z_4398;
      term = dr_set_rule_0_3.instance.invoke(context, a_4399, v_4398, w_4398, generator.const7464);
      if(term == null)
        break Fail26757;
      term = say_1_0.instance.invoke(context, b_4398, lifted9539.instance);
      if(term == null)
        break Fail26757;
      term = create_spoofaxlang_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = say_1_0.instance.invoke(context, term, lifted9540.instance);
      if(term == null)
        break Fail26757;
      term = create_spxlang_main_descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_spxlang_editorservices_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_parse_controller_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_validator_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_activator_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = create_example_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      IStrategoTerm term11168 = term;
      Success10931:
      { 
        Fail26761:
        { 
          IStrategoTerm c_4398 = null;
          c_4398 = term;
          term = $New$Project_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26761;
          term = c_4398;
          { 
            term = say_1_0.instance.invoke(context, term, lifted9541.instance);
            if(term == null)
              break Fail26757;
            term = create_build_properties_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_project_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_classpath_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_manifest_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_jdt_prefs_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_project_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_plugin_xml_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_build_xml_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_build_generated_xml_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            term = create_builder_xml_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26757;
            if(true)
              break Success10931;
          }
        }
        term = term11168;
      }
      term = copy_jars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = copy_def_file_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26757;
      term = say_1_0.instance.invoke(context, term, lifted9542.instance);
      if(term == null)
        break Fail26757;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}