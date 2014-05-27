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

@SuppressWarnings("all") public class aux_$Jar$Locations_0_1 extends Strategy 
{ 
  public static aux_$Jar$Locations_0_1 instance = new aux_$Jar$Locations_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4513)
  { 
    Fail27610:
    { 
      IStrategoTerm a_4514 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27610;
      IStrategoTerm arg6641 = term.getSubterm(0);
      if(arg6641.getTermType() != IStrategoTerm.STRING || !"-793957".equals(((IStrategoString)arg6641).stringValue()))
        break Fail27610;
      a_4514 = term.getSubterm(1);
      term = a_4514;
      if(true)
        return term;
    }
    context.push("aux_JarLocations_0_1");
    context.popOnFailure();
    return null;
  }
}