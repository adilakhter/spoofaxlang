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

@SuppressWarnings("all") public class $S$D$F__$S$T$A$R$T_3_0 extends Strategy 
{ 
  public static $S$D$F__$S$T$A$R$T_3_0 instance = new $S$D$F__$S$T$A$R$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4412, Strategy b_4412, Strategy c_4412)
  { 
    context.push("SDF__START_3_0");
    Fail26951:
    { 
      lifted9598 lifted95980 = new lifted9598();
      lifted95980.c_4412 = c_4412;
      lifted95980.b_4412 = b_4412;
      lifted95980.a_4412 = a_4412;
      term = appl_2_0.instance.invoke(context, term, lifted9581.instance, lifted95980);
      if(term == null)
        break Fail26951;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}