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

@SuppressWarnings("all") public class construct_text_for_primitive_0_0 extends Strategy 
{ 
  public static construct_text_for_primitive_0_0 instance = new construct_text_for_primitive_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("construct_text_for_primitive_0_0");
    Fail25850:
    { 
      IStrategoTerm y_4269 = null;
      y_4269 = term;
      IStrategoTerm term10284 = term;
      Success10223:
      { 
        Fail25851:
        { 
          term = is_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25851;
          if(true)
            break Success10223;
        }
        term = int_to_string_0_0.instance.invoke(context, term10284);
        if(term == null)
          break Fail25850;
      }
      term = add_origin_comments_0_1.instance.invoke(context, term, y_4269);
      if(term == null)
        break Fail25850;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}