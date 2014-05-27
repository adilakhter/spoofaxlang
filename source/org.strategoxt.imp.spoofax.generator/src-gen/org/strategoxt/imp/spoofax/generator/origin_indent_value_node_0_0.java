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

@SuppressWarnings("all") public class origin_indent_value_node_0_0 extends Strategy 
{ 
  public static origin_indent_value_node_0_0 instance = new origin_indent_value_node_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("origin_indent_value_node_0_0");
    Fail25768:
    { 
      term = origin_indent_node_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25768;
      term = explode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25768;
      term = take_while_1_0.instance.invoke(context, term, lifted9235.instance);
      if(term == null)
        break Fail25768;
      term = foldr_3_0.instance.invoke(context, term, lifted9236.instance, add_0_0.instance, lifted9238.instance);
      if(term == null)
        break Fail25768;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}