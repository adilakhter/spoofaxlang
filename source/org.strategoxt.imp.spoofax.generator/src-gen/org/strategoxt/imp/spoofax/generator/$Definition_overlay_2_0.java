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

@SuppressWarnings("all") public class $Definition_overlay_2_0 extends Strategy 
{ 
  public static $Definition_overlay_2_0 instance = new $Definition_overlay_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4412, Strategy k_4412)
  { 
    context.push("Definition_overlay_2_0");
    Fail26957:
    { 
      lifted9701 lifted97010 = new lifted9701();
      lifted97010.k_4412 = k_4412;
      lifted97010.j_4412 = j_4412;
      term = appl_2_0.instance.invoke(context, term, lifted9679.instance, lifted97010);
      if(term == null)
        break Fail26957;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}