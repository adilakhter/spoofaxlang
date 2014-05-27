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

@SuppressWarnings("all") public class output_main_descriptor_file_2_0 extends Strategy 
{ 
  public static output_main_descriptor_file_2_0 instance = new output_main_descriptor_file_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4252, Strategy w_4252)
  { 
    context.push("output_main_descriptor_file_2_0");
    Fail25723:
    { 
      term = output_descriptor_file_3_0.instance.invoke(context, term, v_4252, w_4252, lifted9204.instance);
      if(term == null)
        break Fail25723;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}