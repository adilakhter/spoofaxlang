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

@SuppressWarnings("all") public class tname__$O$U$T$L$I$N$E$R$B$A$S$E_0_0 extends Strategy 
{ 
  public static tname__$O$U$T$L$I$N$E$R$B$A$S$E_0_0 instance = new tname__$O$U$T$L$I$N$E$R$B$A$S$E_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("tname__OUTLINERBASE_0_0");
    Fail26977:
    { 
      term = $Type$Name_2_0.instance.invoke(context, term, lifted9973.instance, lifted9988.instance);
      if(term == null)
        break Fail26977;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}