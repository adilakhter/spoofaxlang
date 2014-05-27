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

@SuppressWarnings("all") public class collect_ast_changes_in_list_0_1 extends Strategy 
{ 
  public static collect_ast_changes_in_list_0_1 instance = new collect_ast_changes_in_list_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4275)
  { 
    context.push("collect_ast_changes_in_list_0_1");
    Fail25892:
    { 
      IStrategoTerm term10317 = term;
      Success10247:
      { 
        Fail25893:
        { 
          term = collect_ast_changes_in_list_insert_at_end_0_1.instance.invoke(context, term, k_4275);
          if(term == null)
            break Fail25893;
          if(true)
            break Success10247;
        }
        term = term10317;
        IStrategoTerm term10318 = term;
        Success10248:
        { 
          Fail25894:
          { 
            term = collect_ast_changes_in_list_match_header_0_1.instance.invoke(context, term, k_4275);
            if(term == null)
              break Fail25894;
            if(true)
              break Success10248;
          }
          term = collect_ast_changes_in_list_no_header_match_0_1.instance.invoke(context, term10318, k_4275);
          if(term == null)
            break Fail25892;
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