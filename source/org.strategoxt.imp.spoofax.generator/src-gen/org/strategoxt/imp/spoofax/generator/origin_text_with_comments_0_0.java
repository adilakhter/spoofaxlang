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

@SuppressWarnings("all") public class origin_text_with_comments_0_0 extends Strategy 
{ 
  public static origin_text_with_comments_0_0 instance = new origin_text_with_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_text_with_comments_0_0");
    Fail25776:
    { 
      IStrategoTerm n_4258 = null;
      IStrategoTerm o_4258 = null;
      IStrategoTerm p_4258 = null;
      o_4258 = term;
      term = origin_offset_with_comments_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25776;
      n_4258 = term;
      term = $Fst_0_0.instance.invoke(context, n_4258);
      if(term == null)
        break Fail25776;
      p_4258 = term;
      term = $Snd_0_0.instance.invoke(context, n_4258);
      if(term == null)
        break Fail25776;
      term = termFactory.makeTuple(p_4258, term, o_4258);
      term = origin_textfragment_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25776;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}