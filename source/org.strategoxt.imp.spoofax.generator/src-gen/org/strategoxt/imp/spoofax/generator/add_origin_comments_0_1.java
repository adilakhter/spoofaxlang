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

@SuppressWarnings("all") public class add_origin_comments_0_1 extends Strategy 
{ 
  public static add_origin_comments_0_1 instance = new add_origin_comments_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4271)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_origin_comments_0_1");
    Fail25859:
    { 
      IStrategoTerm f_4271 = null;
      IStrategoTerm g_4271 = null;
      f_4271 = term;
      Success10226:
      { 
        Fail25860:
        { 
          IStrategoTerm h_4271 = null;
          h_4271 = term;
          term = e_4271;
          IStrategoTerm term10292 = term;
          Success10227:
          { 
            Fail25861:
            { 
              term = support_sublist_1_0.instance.invoke(context, term, lifted9281.instance);
              if(term == null)
                break Fail25861;
              if(true)
                break Success10227;
            }
            term = support_sublist_1_0.instance.invoke(context, term10292, lifted9282.instance);
            if(term == null)
              break Fail25860;
          }
          term = h_4271;
          { 
            IStrategoTerm j_4271 = null;
            IStrategoTerm k_4271 = null;
            IStrategoTerm q_4271 = null;
            IStrategoTerm l_4271 = null;
            IStrategoTerm u_4271 = null;
            term = support_sublist_1_0.instance.invoke(context, e_4271, lifted9283.instance);
            if(term == null)
              break Fail25859;
            j_4271 = term;
            q_4271 = f_4271;
            term = origin_indent_node_0_0.instance.invoke(context, e_4271);
            if(term == null)
              break Fail25859;
            term = prefix_lines_0_1.instance.invoke(context, q_4271, term);
            if(term == null)
              break Fail25859;
            term = trim_leading_whitespace_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25859;
            k_4271 = term;
            term = origin_text_with_comments_0_0.instance.invoke(context, e_4271);
            if(term == null)
              break Fail25859;
            l_4271 = term;
            term = origin_offset_with_comments_0_0.instance.invoke(context, e_4271);
            if(term == null)
              break Fail25859;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(j_4271, k_4271), (IStrategoList)generator.constNil7), l_4271, term);
            term = apply_text_changes_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25859;
            u_4271 = term;
            term = origin_indent_value_node_0_0.instance.invoke(context, e_4271);
            if(term == null)
              break Fail25859;
            term = remove_indentation_0_1.instance.invoke(context, u_4271, term);
            if(term == null)
              break Fail25859;
            g_4271 = term;
            if(true)
              break Success10226;
          }
        }
        term = f_4271;
        g_4271 = f_4271;
      }
      term = g_4271;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}