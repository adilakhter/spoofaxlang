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

@SuppressWarnings("all") public class collect_ast_changes_in_list_match_header_0_2 extends Strategy 
{ 
  public static collect_ast_changes_in_list_match_header_0_2 instance = new collect_ast_changes_in_list_match_header_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4275, IStrategoTerm a_4276)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_ast_changes_in_list_match_header_0_2");
    Fail25900:
    { 
      term = termFactory.makeTuple(term, a_4276);
      term = collect_ast_changes_in_list_match_header_0_1.instance.invoke(context, term, z_4275);
      if(term == null)
        break Fail25900;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}