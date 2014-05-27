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

@SuppressWarnings("all") final class postprocess_feedback_message_0_0 extends Strategy 
{ 
  public static final postprocess_feedback_message_0_0 instance = new postprocess_feedback_message_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("postprocess_feedback_message_0_0");
    Fail25817:
    { 
      IStrategoTerm term10257 = term;
      Success10199:
      { 
        Fail25818:
        { 
          IStrategoTerm l_4265 = null;
          l_4265 = term;
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25818;
          term = l_4265;
          { 
            term = flatten_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25817;
            term = map_1_0.instance.invoke(context, term, lifted9261.instance);
            if(term == null)
              break Fail25817;
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25817;
            if(true)
              break Success10199;
          }
        }
        term = term10257;
        IStrategoTerm term10259 = term;
        Success10200:
        { 
          Fail25819:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25819;
            if(true)
              break Success10200;
          }
          term = write_to_string_0_0.instance.invoke(context, term10259);
          if(term == null)
            break Fail25817;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}