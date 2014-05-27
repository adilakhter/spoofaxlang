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

@SuppressWarnings("all") public class $Productions_0_0 extends Strategy 
{ 
  public static $Productions_0_0 instance = new $Productions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Productions_0_0");
    Fail27401:
    { 
      TermReference e_4480 = new TermReference();
      TermReference f_4480 = new TermReference();
      IStrategoTerm j_4480 = null;
      if(f_4480.value == null)
        f_4480.value = term;
      else
        if(f_4480.value != term && !f_4480.value.match(term))
          break Fail27401;
      if(e_4480.value == null)
        e_4480.value = term;
      else
        if(e_4480.value != term && !e_4480.value.match(term))
          break Fail27401;
      j_4480 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, j_4480, generator.const7480, f_4480.value);
      if(term == null)
        break Fail27401;
      lifted10149 lifted101490 = new lifted10149();
      lifted101490.e_4480 = e_4480;
      lifted101490.f_4480 = f_4480;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101490);
      if(term == null)
        break Fail27401;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}