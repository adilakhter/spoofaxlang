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

@SuppressWarnings("all") public class apply_text_changes_0_0 extends Strategy 
{ 
  public static apply_text_changes_0_0 instance = new apply_text_changes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("apply_text_changes_0_0");
    Fail25940:
    { 
      IStrategoTerm p_4281 = null;
      IStrategoTerm q_4281 = null;
      TermReference r_4281 = new TermReference();
      TermReference s_4281 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail25940;
      q_4281 = term.getSubterm(0);
      if(s_4281.value == null)
        s_4281.value = term.getSubterm(1);
      else
        if(s_4281.value != term.getSubterm(1) && !s_4281.value.match(term.getSubterm(1)))
          break Fail25940;
      p_4281 = term.getSubterm(2);
      term = $Fst_0_0.instance.invoke(context, p_4281);
      if(term == null)
        break Fail25940;
      if(r_4281.value == null)
        r_4281.value = term;
      else
        if(r_4281.value != term && !r_4281.value.match(term))
          break Fail25940;
      term = make_set_0_0.instance.invoke(context, q_4281);
      if(term == null)
        break Fail25940;
      term = filter_1_0.instance.invoke(context, term, is_modification_0_0.instance);
      if(term == null)
        break Fail25940;
      term = sort_list_1_0.instance.invoke(context, term, lifted9314.instance);
      if(term == null)
        break Fail25940;
      lifted9316 lifted93160 = new lifted9316();
      lifted93160.r_4281 = r_4281;
      lifted93160.s_4281 = s_4281;
      term = foldr_2_0.instance.invoke(context, term, lifted93160, apply_textual_change_0_0.instance);
      if(term == null)
        break Fail25940;
      term = $Snd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25940;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}