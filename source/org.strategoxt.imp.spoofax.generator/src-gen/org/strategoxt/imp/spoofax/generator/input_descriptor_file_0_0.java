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

@SuppressWarnings("all") public class input_descriptor_file_0_0 extends Strategy 
{ 
  public static input_descriptor_file_0_0 instance = new input_descriptor_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("input_descriptor_file_0_0");
    Fail25796:
    { 
      TermReference e_4261 = new TermReference();
      TermReference f_4261 = new TermReference();
      IStrategoTerm g_4261 = null;
      IStrategoTerm h_4261 = null;
      h_4261 = term;
      g_4261 = generator.const7145;
      term = h_4261;
      lifted9244 lifted92440 = new lifted9244();
      lifted92440.e_4261 = e_4261;
      lifted92440.f_4261 = f_4261;
      term = dr_scope_1_1.instance.invoke(context, term, lifted92440, g_4261);
      if(term == null)
        break Fail25796;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}