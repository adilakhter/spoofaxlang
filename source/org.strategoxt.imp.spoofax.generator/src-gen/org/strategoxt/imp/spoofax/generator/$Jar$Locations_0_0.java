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

@SuppressWarnings("all") public class $Jar$Locations_0_0 extends Strategy 
{ 
  public static $Jar$Locations_0_0 instance = new $Jar$Locations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("JarLocations_0_0");
    Fail27609:
    { 
      TermReference s_4513 = new TermReference();
      IStrategoTerm v_4513 = null;
      IStrategoTerm x_4513 = null;
      IStrategoTerm y_4513 = null;
      if(s_4513.value == null)
        s_4513.value = term;
      else
        if(s_4513.value != term && !s_4513.value.match(term))
          break Fail27609;
      x_4513 = term;
      v_4513 = generator.const7880;
      y_4513 = x_4513;
      term = dr_lookup_rule_0_2.instance.invoke(context, y_4513, v_4513, generator.constCons4561);
      if(term == null)
        break Fail27609;
      lifted10221 lifted102210 = new lifted10221();
      lifted102210.s_4513 = s_4513;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102210);
      if(term == null)
        break Fail27609;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}