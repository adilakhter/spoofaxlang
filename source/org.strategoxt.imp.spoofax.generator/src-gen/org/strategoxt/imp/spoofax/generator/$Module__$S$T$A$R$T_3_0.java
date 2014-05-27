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

@SuppressWarnings("all") public class $Module__$S$T$A$R$T_3_0 extends Strategy 
{ 
  public static $Module__$S$T$A$R$T_3_0 instance = new $Module__$S$T$A$R$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4411, Strategy y_4411, Strategy z_4411)
  { 
    context.push("Module__START_3_0");
    Fail26950:
    { 
      lifted9577 lifted95770 = new lifted9577();
      lifted95770.z_4411 = z_4411;
      lifted95770.y_4411 = y_4411;
      lifted95770.x_4411 = x_4411;
      term = appl_2_0.instance.invoke(context, term, lifted9560.instance, lifted95770);
      if(term == null)
        break Fail26950;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}