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

@SuppressWarnings("all") public class construct_list_text_1_2 extends Strategy 
{ 
  public static construct_list_text_1_2 instance = new construct_list_text_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4271, IStrategoTerm v_4271, IStrategoTerm w_4271)
  { 
    context.push("construct_list_text_1_2");
    Fail25862:
    { 
      term = construct_list_fragments_1_1.instance.invoke(context, term, y_4271, v_4271);
      if(term == null)
        break Fail25862;
      term = map_1_0.instance.invoke(context, term, trim_leading_whitespace_0_0.instance);
      if(term == null)
        break Fail25862;
      term = concat_fragments_0_1.instance.invoke(context, term, w_4271);
      if(term == null)
        break Fail25862;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}