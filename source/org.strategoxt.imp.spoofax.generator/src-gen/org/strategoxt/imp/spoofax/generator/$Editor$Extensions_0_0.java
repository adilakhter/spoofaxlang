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

@SuppressWarnings("all") public class $Editor$Extensions_0_0 extends Strategy 
{ 
  public static $Editor$Extensions_0_0 instance = new $Editor$Extensions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("EditorExtensions_0_0");
    Fail27267:
    { 
      TermReference b_4457 = new TermReference();
      IStrategoTerm e_4457 = null;
      IStrategoTerm g_4457 = null;
      IStrategoTerm h_4457 = null;
      if(b_4457.value == null)
        b_4457.value = term;
      else
        if(b_4457.value != term && !b_4457.value.match(term))
          break Fail27267;
      g_4457 = term;
      e_4457 = generator.const7453;
      h_4457 = g_4457;
      term = dr_lookup_rule_0_2.instance.invoke(context, h_4457, e_4457, generator.constCons4561);
      if(term == null)
        break Fail27267;
      lifted10104 lifted101040 = new lifted10104();
      lifted101040.b_4457 = b_4457;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101040);
      if(term == null)
        break Fail27267;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}