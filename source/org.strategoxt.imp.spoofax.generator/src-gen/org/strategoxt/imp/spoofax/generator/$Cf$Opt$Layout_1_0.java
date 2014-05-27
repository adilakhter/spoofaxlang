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

@SuppressWarnings("all") public class $Cf$Opt$Layout_1_0 extends Strategy 
{ 
  public static $Cf$Opt$Layout_1_0 instance = new $Cf$Opt$Layout_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4413)
  { 
    context.push("CfOptLayout_1_0");
    Fail26971:
    { 
      lifted9884 lifted98840 = new lifted9884();
      lifted98840.c_4413 = c_4413;
      term = appl_2_0.instance.invoke(context, term, lifted9875.instance, lifted98840);
      if(term == null)
        break Fail26971;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}