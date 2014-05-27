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

@SuppressWarnings("all") public class aux_$Is$Imported_0_2 extends Strategy 
{ 
  public static aux_$Is$Imported_0_2 instance = new aux_$Is$Imported_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4440, IStrategoTerm k_4440)
  { 
    Fail27164:
    { 
      IStrategoTerm l_4440 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27164;
      IStrategoTerm arg6558 = term.getSubterm(0);
      if(arg6558.getTermType() != IStrategoTerm.STRING || !"-597601".equals(((IStrategoString)arg6558).stringValue()))
        break Fail27164;
      l_4440 = term.getSubterm(1);
      term = l_4440;
      if(true)
        return term;
    }
    context.push("aux_IsImported_0_2");
    context.popOnFailure();
    return null;
  }
}