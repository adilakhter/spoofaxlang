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

@SuppressWarnings("all") public class sdf2imp_jvm_0_0 extends Strategy 
{ 
  public static sdf2imp_jvm_0_0 instance = new sdf2imp_jvm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sdf2imp_jvm_0_0");
    Fail26741:
    { 
      IStrategoTerm c_4394 = null;
      IStrategoTerm j_4394 = null;
      IStrategoTerm m_4394 = null;
      IStrategoTerm f_4394 = null;
      IStrategoTerm g_4394 = null;
      IStrategoTerm n_4394 = null;
      IStrategoTerm o_4394 = null;
      IStrategoTerm q_4394 = null;
      IStrategoTerm r_4394 = null;
      IStrategoTerm s_4394 = null;
      IStrategoTerm t_4394 = null;
      IStrategoTerm u_4394 = null;
      IStrategoTerm w_4394 = null;
      IStrategoTerm x_4394 = null;
      IStrategoTerm y_4394 = null;
      c_4394 = term;
      j_4394 = term;
      IStrategoTerm term11151 = term;
      Success10914:
      { 
        Fail26742:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26742;
          IStrategoTerm term11152 = term;
          Success10915:
          { 
            Fail26743:
            { 
              term = get_config_0_0.instance.invoke(context, generator.constSdfMainModuleFlag0);
              if(term == null)
                break Fail26743;
              { 
                if(true)
                  break Fail26742;
                if(true)
                  break Success10915;
              }
            }
            term = term11152;
          }
          if(true)
            break Success10914;
        }
        term = term11151;
        IStrategoTerm d_4394 = null;
        IStrategoTerm e_4394 = null;
        IStrategoTerm l_4394 = null;
        d_4394 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26741;
        e_4394 = term;
        l_4394 = d_4394;
        term = report_with_failure_0_2.instance.invoke(context, l_4394, generator.const7894, e_4394);
        if(term == null)
          break Fail26741;
      }
      term = j_4394;
      m_4394 = j_4394;
      f_4394 = term;
      term = c_4394;
      g_4394 = c_4394;
      q_4394 = term;
      n_4394 = generator.const7868;
      r_4394 = q_4394;
      o_4394 = generator.constCons4561;
      s_4394 = r_4394;
      term = termFactory.makeTuple(generator.const7869, g_4394);
      term = dr_set_rule_0_3.instance.invoke(context, s_4394, n_4394, o_4394, term);
      if(term == null)
        break Fail26741;
      term = f_4394;
      w_4394 = term;
      t_4394 = generator.const7895;
      x_4394 = w_4394;
      u_4394 = generator.constCons4561;
      y_4394 = x_4394;
      term = dr_set_rule_0_3.instance.invoke(context, y_4394, t_4394, u_4394, generator.const7896);
      if(term == null)
        break Fail26741;
      term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{c_4394});
      term = sdf2imp_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26741;
      term = m_4394;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26741;
      term = termFactory.makeTuple(term, generator.const7725);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26741;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}