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

@SuppressWarnings("all") public class $Module_s_overlay_1_0 extends Strategy 
{ 
  public static $Module_s_overlay_1_0 instance = new $Module_s_overlay_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4412)
  { 
    context.push("Module_s_overlay_1_0");
    Fail26956:
    { 
      lifted9677 lifted96770 = new lifted9677();
      lifted96770.i_4412 = i_4412;
      term = appl_2_0.instance.invoke(context, term, lifted9666.instance, lifted96770);
      if(term == null)
        break Fail26956;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}