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

@SuppressWarnings("all") public class $Open$Editor_0_0 extends Strategy 
{ 
  public static $Open$Editor_0_0 instance = new $Open$Editor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26859:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consOpenEditor_0 != ((IStrategoAppl)term).getConstructor())
        break Fail26859;
      if(true)
        return term;
    }
    context.push("OpenEditor_0_0");
    context.popOnFailure();
    return null;
  }
}