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

@SuppressWarnings("all") public class construct_text_by_compare_1_1 extends Strategy 
{ 
  public static construct_text_by_compare_1_1 instance = new construct_text_by_compare_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4270, IStrategoTerm ref_f_4270)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_4270 = new TermReference(ref_f_4270);
    context.push("construct_text_by_compare_1_1");
    Fail25854:
    { 
      IStrategoTerm g_4270 = null;
      IStrategoTerm i_4270 = null;
      IStrategoTerm j_4270 = null;
      IStrategoTerm n_4270 = null;
      IStrategoTerm s_4270 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25854;
      g_4270 = term.getSubterm(0);
      j_4270 = term.getSubterm(1);
      term = termFactory.makeTuple(g_4270, j_4270);
      term = collect_ast_changes_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25854;
      lifted9273 lifted92730 = new lifted9273();
      lifted92730.l_4270 = l_4270;
      lifted92730.f_4270 = f_4270;
      term = map_1_0.instance.invoke(context, term, lifted92730);
      if(term == null)
        break Fail25854;
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25854;
      i_4270 = term;
      term = origin_text_with_comments_0_0.instance.invoke(context, j_4270);
      if(term == null)
        break Fail25854;
      n_4270 = term;
      term = origin_offset_with_comments_0_0.instance.invoke(context, j_4270);
      if(term == null)
        break Fail25854;
      term = termFactory.makeTuple(i_4270, n_4270, term);
      term = apply_text_changes_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25854;
      s_4270 = term;
      term = origin_indent_value_node_0_0.instance.invoke(context, j_4270);
      if(term == null)
        break Fail25854;
      term = remove_indentation_0_1.instance.invoke(context, s_4270, term);
      if(term == null)
        break Fail25854;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}