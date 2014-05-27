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

@SuppressWarnings("all") public class origin_has_comments_0_0 extends Strategy 
{ 
  public static origin_has_comments_0_0 instance = new origin_has_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("origin_has_comments_0_0");
    Fail25765:
    { 
      IStrategoTerm term10235 = term;
      Success10182:
      { 
        Fail25766:
        { 
          term = support_sublist_1_0.instance.invoke(context, term, prim_origin_offset_comment_before_0_0.instance);
          if(term == null)
            break Fail25766;
          if(true)
            break Success10182;
        }
        term = support_sublist_1_0.instance.invoke(context, term10235, prim_origin_offset_comment_after_0_0.instance);
        if(term == null)
          break Fail25765;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}