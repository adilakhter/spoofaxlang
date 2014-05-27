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

@SuppressWarnings("all") public class $Cf$Layout_1_0 extends Strategy 
{ 
  public static $Cf$Layout_1_0 instance = new $Cf$Layout_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4412)
  { 
    context.push("CfLayout_1_0");
    Fail26968:
    { 
      lifted9848 lifted98480 = new lifted9848();
      lifted98480.z_4412 = z_4412;
      term = appl_2_0.instance.invoke(context, term, lifted9840.instance, lifted98480);
      if(term == null)
        break Fail26968;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}