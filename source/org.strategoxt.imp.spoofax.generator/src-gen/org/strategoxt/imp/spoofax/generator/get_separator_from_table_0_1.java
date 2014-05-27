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

@SuppressWarnings("all") public class get_separator_from_table_0_1 extends Strategy 
{ 
  public static get_separator_from_table_0_1 instance = new get_separator_from_table_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4281)
  { 
    context.push("get_separator_from_table_0_1");
    Fail25939:
    { 
      IStrategoTerm f_4281 = null;
      TermReference g_4281 = new TermReference();
      TermReference h_4281 = new TermReference();
      TermReference i_4281 = new TermReference();
      IStrategoTerm o_4281 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25939;
      if(g_4281.value == null)
        g_4281.value = term.getSubterm(0);
      else
        if(g_4281.value != term.getSubterm(0) && !g_4281.value.match(term.getSubterm(0)))
          break Fail25939;
      f_4281 = term.getSubterm(1);
      term = int_to_string_0_0.instance.invoke(context, f_4281);
      if(term == null)
        break Fail25939;
      if(h_4281.value == null)
        h_4281.value = term;
      else
        if(h_4281.value != term && !h_4281.value.match(term))
          break Fail25939;
      term = e_4281;
      lifted9310 lifted93100 = new lifted9310();
      lifted93100.g_4281 = g_4281;
      lifted93100.h_4281 = h_4281;
      lifted93100.i_4281 = i_4281;
      term = collect_one_1_0.instance.invoke(context, term, lifted93100);
      if(term == null)
        break Fail25939;
      if(i_4281.value == null)
        break Fail25939;
      term = filter_1_0.instance.invoke(context, i_4281.value, lifted9311.instance);
      if(term == null)
        break Fail25939;
      o_4281 = term;
      term = box2text_string_0_1.instance.invoke(context, o_4281, generator.const7040);
      if(term == null)
        break Fail25939;
      term = un_double_quote_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25939;
      term = trim_whitespace_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25939;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}