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

@SuppressWarnings("all") public class create_builders_definition_0_0 extends Strategy 
{ 
  public static create_builders_definition_0_0 instance = new create_builders_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_builders_definition_0_0");
    Fail26500:
    { 
      IStrategoTerm p_4353 = null;
      IStrategoTerm d_4354 = null;
      IStrategoTerm g_4354 = null;
      IStrategoTerm i_4354 = null;
      IStrategoTerm v_4353 = null;
      IStrategoTerm x_4353 = null;
      IStrategoTerm y_4353 = null;
      IStrategoTerm term10874 = term;
      Success10730:
      { 
        Fail26501:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26501;
          if(true)
            break Success10730;
        }
        term = default_package_name_0_0.instance.invoke(context, term10874);
        if(term == null)
          break Fail26500;
      }
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26500;
      g_4354 = term;
      term = require_option_1_1.instance.invoke(context, g_4354, $Editor$Extensions_0_0.instance, generator.const7253);
      if(term == null)
        break Fail26500;
      d_4354 = term;
      i_4354 = d_4354;
      term = string_tokenize_0_1.instance.invoke(context, i_4354, generator.constCons4956);
      if(term == null)
        break Fail26500;
      term = $Hd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26500;
      p_4353 = term;
      term = p_4353;
      IStrategoTerm term10875 = term;
      Success10731:
      { 
        Fail26502:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26502;
          if(true)
            break Success10731;
        }
        term = term10875;
        IStrategoTerm term10876 = term;
        Success10732:
        { 
          Fail26503:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26503;
            if(true)
              break Success10732;
          }
          term = term10876;
          IStrategoTerm term10877 = term;
          Success10733:
          { 
            Fail26504:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26504;
              if(true)
                break Success10733;
            }
            term = term10877;
            IStrategoTerm term10878 = term;
            Success10734:
            { 
              Fail26505:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26505;
                if(true)
                  break Success10734;
              }
              term = term10878;
              IStrategoTerm r_4353 = null;
              IStrategoTerm s_4353 = null;
              IStrategoTerm u_4353 = null;
              r_4353 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26500;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26500;
              s_4353 = ((IStrategoList)term).tail();
              u_4353 = s_4353;
              term = report_failure_0_2.instance.invoke(context, u_4353, generator.const7616, r_4353);
              if(term == null)
                break Fail26500;
            }
          }
        }
      }
      x_4353 = term;
      v_4353 = generator.const7143;
      y_4353 = x_4353;
      term = string_replace_0_2.instance.invoke(context, y_4353, v_4353, generator.const7617);
      if(term == null)
        break Fail26500;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7619, termFactory.makeListCons(term, (IStrategoList)generator.constCons4957));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26500;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}