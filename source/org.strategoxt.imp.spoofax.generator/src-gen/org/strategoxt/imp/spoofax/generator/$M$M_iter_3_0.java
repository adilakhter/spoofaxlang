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

@SuppressWarnings("all") public class $M$M_iter_3_0 extends Strategy 
{ 
  public static $M$M_iter_3_0 instance = new $M$M_iter_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4412, Strategy f_4412, Strategy g_4412)
  { 
    context.push("MM_iter_3_0");
    Fail26954:
    { 
      lifted9649 lifted96490 = new lifted9649();
      lifted96490.g_4412 = g_4412;
      lifted96490.f_4412 = f_4412;
      lifted96490.e_4412 = e_4412;
      term = appl_2_0.instance.invoke(context, term, lifted9624.instance, lifted96490);
      if(term == null)
        break Fail26954;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}