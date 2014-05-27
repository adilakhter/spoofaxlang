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

@SuppressWarnings("all") public class construct_text_by_pp_rec_1_1 extends Strategy 
{ 
  public static construct_text_by_pp_rec_1_1 instance = new construct_text_by_pp_rec_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4270, IStrategoTerm ref_w_4270)
  { 
    TermReference w_4270 = new TermReference(ref_w_4270);
    context.push("construct_text_by_pp_rec_1_1");
    Fail25857:
    { 
      IStrategoTerm x_4270 = null;
      x_4270 = term;
      term = x_4270;
      lifted9274 lifted92740 = new lifted9274();
      lifted92740.z_4270 = z_4270;
      lifted92740.w_4270 = w_4270;
      term = SRTS_all.instance.invoke(context, term, lifted92740);
      if(term == null)
        break Fail25857;
      term = z_4270.invoke(context, term);
      if(term == null)
        break Fail25857;
      term = trim_chars_1_0.instance.invoke(context, term, lifted9279.instance);
      if(term == null)
        break Fail25857;
      term = add_origin_comments_0_1.instance.invoke(context, term, x_4270);
      if(term == null)
        break Fail25857;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}