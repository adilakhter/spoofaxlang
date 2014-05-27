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

@SuppressWarnings("all") public class construct_text_by_pp_1_1 extends Strategy 
{ 
  public static construct_text_by_pp_1_1 instance = new construct_text_by_pp_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4271, IStrategoTerm b_4271)
  { 
    context.push("construct_text_by_pp_1_1");
    Fail25858:
    { 
      IStrategoTerm c_4271 = null;
      c_4271 = term;
      term = d_4271.invoke(context, term);
      if(term == null)
        break Fail25858;
      term = trim_chars_1_0.instance.invoke(context, term, lifted9280.instance);
      if(term == null)
        break Fail25858;
      term = add_origin_comments_0_1.instance.invoke(context, term, c_4271);
      if(term == null)
        break Fail25858;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}