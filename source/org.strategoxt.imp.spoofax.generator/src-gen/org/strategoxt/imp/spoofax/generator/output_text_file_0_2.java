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

@SuppressWarnings("all") public class output_text_file_0_2 extends Strategy 
{ 
  public static output_text_file_0_2 instance = new output_text_file_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4255, IStrategoTerm u_4255)
  { 
    context.push("output_text_file_0_2");
    Fail25741:
    { 
      term = print_filename_0_2.instance.invoke(context, term, t_4255, u_4255);
      if(term == null)
        break Fail25741;
      term = output_text_file_p__0_2.instance.invoke(context, term, t_4255, u_4255);
      if(term == null)
        break Fail25741;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}