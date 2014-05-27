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

@SuppressWarnings("all") public class $Input$Dir$Prefix_0_0 extends Strategy 
{ 
  public static $Input$Dir$Prefix_0_0 instance = new $Input$Dir$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("InputDirPrefix_0_0");
    Fail27137:
    { 
      TermReference a_4436 = new TermReference();
      IStrategoTerm d_4436 = null;
      IStrategoTerm f_4436 = null;
      IStrategoTerm g_4436 = null;
      if(a_4436.value == null)
        a_4436.value = term;
      else
        if(a_4436.value != term && !a_4436.value.match(term))
          break Fail27137;
      f_4436 = term;
      d_4436 = generator.const7147;
      g_4436 = f_4436;
      term = dr_lookup_rule_0_2.instance.invoke(context, g_4436, d_4436, generator.constCons4561);
      if(term == null)
        break Fail27137;
      lifted10059 lifted100590 = new lifted10059();
      lifted100590.a_4436 = a_4436;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100590);
      if(term == null)
        break Fail27137;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}