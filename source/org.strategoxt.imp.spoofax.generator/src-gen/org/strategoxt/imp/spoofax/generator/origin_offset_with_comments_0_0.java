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

@SuppressWarnings("all") public class origin_offset_with_comments_0_0 extends Strategy 
{ 
  public static origin_offset_with_comments_0_0 instance = new origin_offset_with_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_offset_with_comments_0_0");
    Fail25760:
    { 
      IStrategoTerm b_4258 = null;
      IStrategoTerm c_4258 = null;
      c_4258 = term;
      term = c_4258;
      IStrategoTerm term10233 = term;
      Success10180:
      { 
        Fail25761:
        { 
          term = origin_offset_comment_before_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25761;
          if(true)
            break Success10180;
        }
        term = support_sublist_1_0.instance.invoke(context, term10233, prim_origin_offset_0_0.instance);
        if(term == null)
          break Fail25760;
      }
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25760;
      b_4258 = term;
      term = c_4258;
      IStrategoTerm term10234 = term;
      Success10181:
      { 
        Fail25762:
        { 
          term = origin_offset_comment_after_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25762;
          if(true)
            break Success10181;
        }
        term = origin_offset_0_0.instance.invoke(context, term10234);
        if(term == null)
          break Fail25760;
      }
      term = $Snd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25760;
      term = termFactory.makeTuple(b_4258, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}