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

@SuppressWarnings("all") public class $Follow$Success_0_0 extends Strategy 
{ 
  public static $Follow$Success_0_0 instance = new $Follow$Success_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("FollowSuccess_0_0");
    Fail27479:
    { 
      TermReference n_4492 = new TermReference();
      TermReference o_4492 = new TermReference();
      IStrategoTerm s_4492 = null;
      if(o_4492.value == null)
        o_4492.value = term;
      else
        if(o_4492.value != term && !o_4492.value.match(term))
          break Fail27479;
      if(n_4492.value == null)
        n_4492.value = term;
      else
        if(n_4492.value != term && !n_4492.value.match(term))
          break Fail27479;
      s_4492 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, s_4492, generator.const7487, o_4492.value);
      if(term == null)
        break Fail27479;
      lifted10176 lifted101760 = new lifted10176();
      lifted101760.n_4492 = n_4492;
      lifted101760.o_4492 = o_4492;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101760);
      if(term == null)
        break Fail27479;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}