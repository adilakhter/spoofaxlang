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

@SuppressWarnings("all") public class $Source$Path$Name_0_0 extends Strategy 
{ 
  public static $Source$Path$Name_0_0 instance = new $Source$Path$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("SourcePathName_0_0");
    Fail27033:
    { 
      TermReference c_4419 = new TermReference();
      TermReference d_4419 = new TermReference();
      IStrategoTerm h_4419 = null;
      if(d_4419.value == null)
        d_4419.value = term;
      else
        if(d_4419.value != term && !d_4419.value.match(term))
          break Fail27033;
      if(c_4419.value == null)
        c_4419.value = term;
      else
        if(c_4419.value != term && !c_4419.value.match(term))
          break Fail27033;
      h_4419 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, h_4419, generator.const7018, d_4419.value);
      if(term == null)
        break Fail27033;
      lifted10023 lifted100230 = new lifted10023();
      lifted100230.c_4419 = c_4419;
      lifted100230.d_4419 = d_4419;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100230);
      if(term == null)
        break Fail27033;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}