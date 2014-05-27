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

@SuppressWarnings("all") public class $Conc$Cf$Layout_2_0 extends Strategy 
{ 
  public static $Conc$Cf$Layout_2_0 instance = new $Conc$Cf$Layout_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4413, Strategy b_4413)
  { 
    context.push("ConcCfLayout_2_0");
    Fail26969:
    { 
      lifted9865 lifted98650 = new lifted9865();
      lifted98650.b_4413 = b_4413;
      lifted98650.a_4413 = a_4413;
      term = appl_2_0.instance.invoke(context, term, lifted9850.instance, lifted98650);
      if(term == null)
        break Fail26969;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}