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

@SuppressWarnings("all") public class $I$T$A$L$I$C_0_0 extends Strategy 
{ 
  public static $I$T$A$L$I$C_0_0 instance = new $I$T$A$L$I$C_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26871:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consITALIC_0 != ((IStrategoAppl)term).getConstructor())
        break Fail26871;
      if(true)
        return term;
    }
    context.push("ITALIC_0_0");
    context.popOnFailure();
    return null;
  }
}