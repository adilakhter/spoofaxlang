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

@SuppressWarnings("all") public class create_example_file_0_0 extends Strategy 
{ 
  public static create_example_file_0_0 instance = new create_example_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_example_file_0_0");
    Fail26633:
    { 
      IStrategoTerm l_4375 = null;
      IStrategoTerm m_4375 = null;
      IStrategoTerm term11021 = term;
      Success10834:
      { 
        Fail26634:
        { 
          IStrategoTerm term11022 = term;
          Success10835:
          { 
            Fail26635:
            { 
              term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26635;
              { 
                if(true)
                  break Fail26634;
                if(true)
                  break Success10835;
              }
            }
            term = term11022;
          }
          if(true)
            break Success10834;
        }
        term = term11021;
        IStrategoTerm n_4375 = null;
        IStrategoTerm b_4376 = null;
        IStrategoTerm d_4376 = null;
        IStrategoTerm e_4376 = null;
        n_4375 = term;
        IStrategoTerm term11023 = term;
        Success10836:
        { 
          Fail26636:
          { 
            IStrategoTerm r_4375 = null;
            IStrategoTerm u_4375 = null;
            IStrategoTerm w_4375 = null;
            term = get_sdf_main_module_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26636;
            l_4375 = term;
            u_4375 = term;
            term = require_option_1_1.instance.invoke(context, u_4375, $Editor$Extensions_0_0.instance, generator.const7253);
            if(term == null)
              break Fail26636;
            r_4375 = term;
            w_4375 = r_4375;
            term = string_tokenize_0_1.instance.invoke(context, w_4375, generator.constCons4956);
            if(term == null)
              break Fail26636;
            term = $Hd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26636;
            m_4375 = term;
            if(true)
              break Success10836;
          }
          term = term11023;
          TermReference o_4375 = new TermReference();
          if(o_4375.value == null)
            o_4375.value = term;
          else
            if(o_4375.value != term && !o_4375.value.match(term))
              break Fail26633;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail26633;
          lifted9493 lifted94930 = new lifted9493();
          lifted94930.o_4375 = o_4375;
          term = report_failure_1_0.instance.invoke(context, term, lifted94930);
          if(term == null)
            break Fail26633;
        }
        term = n_4375;
        if(l_4375 == null)
          break Fail26633;
        term = termFactory.makeTuple(generator.const7798, l_4375, generator.const7799, l_4375, generator.const7800);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26633;
        d_4376 = term;
        b_4376 = generator.constCons5106;
        term = d_4376;
        e_4376 = d_4376;
        if(m_4375 == null)
          break Fail26633;
        term = termFactory.makeTuple(generator.const7802, m_4375);
        term = add_extension_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26633;
        term = output_text_file_0_2.instance.invoke(context, e_4376, b_4376, term);
        if(term == null)
          break Fail26633;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}