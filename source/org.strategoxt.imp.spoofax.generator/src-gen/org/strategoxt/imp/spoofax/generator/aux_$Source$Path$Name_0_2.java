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

@SuppressWarnings("all") public class aux_$Source$Path$Name_0_2 extends Strategy 
{ 
  public static aux_$Source$Path$Name_0_2 instance = new aux_$Source$Path$Name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_4419, IStrategoTerm j_4419)
  { 
    Fail27034:
    { 
      IStrategoTerm k_4419 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27034;
      IStrategoTerm arg6533 = term.getSubterm(0);
      if(arg6533.getTermType() != IStrategoTerm.STRING || !"-115458".equals(((IStrategoString)arg6533).stringValue()))
        break Fail27034;
      k_4419 = term.getSubterm(1);
      term = k_4419;
      if(true)
        return term;
    }
    context.push("aux_SourcePathName_0_2");
    context.popOnFailure();
    return null;
  }
}