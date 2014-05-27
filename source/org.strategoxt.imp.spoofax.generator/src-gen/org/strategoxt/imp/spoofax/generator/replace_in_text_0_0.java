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

@SuppressWarnings("all") public class replace_in_text_0_0 extends Strategy 
{ 
  public static replace_in_text_0_0 instance = new replace_in_text_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("replace_in_text_0_0");
    Fail25942:
    { 
      IStrategoTerm h_4282 = null;
      IStrategoTerm i_4282 = null;
      IStrategoTerm k_4282 = null;
      IStrategoTerm l_4282 = null;
      IStrategoTerm n_4282 = null;
      IStrategoTerm o_4282 = null;
      IStrategoTerm p_4282 = null;
      IStrategoTerm s_4282 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
        break Fail25942;
      h_4282 = term.getSubterm(0);
      o_4282 = term.getSubterm(1);
      i_4282 = term.getSubterm(2);
      k_4282 = term.getSubterm(3);
      term = explode_string_0_0.instance.invoke(context, h_4282);
      if(term == null)
        break Fail25942;
      l_4282 = term;
      term = split_at_0_1.instance.invoke(context, term, i_4282);
      if(term == null)
        break Fail25942;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25942;
      n_4282 = term.getSubterm(0);
      term = split_at_0_1.instance.invoke(context, l_4282, k_4282);
      if(term == null)
        break Fail25942;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25942;
      p_4282 = term.getSubterm(1);
      term = implode_string_0_0.instance.invoke(context, n_4282);
      if(term == null)
        break Fail25942;
      s_4282 = term;
      term = implode_string_0_0.instance.invoke(context, p_4282);
      if(term == null)
        break Fail25942;
      term = termFactory.makeTuple(s_4282, o_4282, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25942;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}