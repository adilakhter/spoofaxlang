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

@SuppressWarnings("all") public class output_xml_file_0_2 extends Strategy 
{ 
  public static output_xml_file_0_2 instance = new output_xml_file_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_4255, IStrategoTerm o_4255)
  { 
    context.push("output_xml_file_0_2");
    Fail25739:
    { 
      term = print_filename_0_2.instance.invoke(context, term, n_4255, o_4255);
      if(term == null)
        break Fail25739;
      IStrategoTerm term10228 = term;
      Success10176:
      { 
        Fail25740:
        { 
          IStrategoTerm q_4255 = null;
          term = topdown_1_0.instance.invoke(context, term, lifted9212.instance);
          if(term == null)
            break Fail25740;
          q_4255 = term;
          term = box2text_string_0_1.instance.invoke(context, q_4255, generator.const7123);
          if(term == null)
            break Fail25740;
          if(true)
            break Success10176;
        }
        term = term10228;
        IStrategoTerm s_4255 = null;
        s_4255 = term;
        term = fatal_err_0_1.instance.invoke(context, s_4255, generator.const7137);
        if(term == null)
          break Fail25739;
      }
      term = output_text_file_p__0_2.instance.invoke(context, term, n_4255, o_4255);
      if(term == null)
        break Fail25739;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}