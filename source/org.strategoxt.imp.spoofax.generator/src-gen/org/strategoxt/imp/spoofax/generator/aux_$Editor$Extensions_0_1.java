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

@SuppressWarnings("all") public class aux_$Editor$Extensions_0_1 extends Strategy 
{ 
  public static aux_$Editor$Extensions_0_1 instance = new aux_$Editor$Extensions_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_4457)
  { 
    Fail27268:
    { 
      IStrategoTerm j_4457 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27268;
      IStrategoTerm arg6578 = term.getSubterm(0);
      if(arg6578.getTermType() != IStrategoTerm.STRING || !"-271127".equals(((IStrategoString)arg6578).stringValue()))
        break Fail27268;
      j_4457 = term.getSubterm(1);
      term = j_4457;
      if(true)
        return term;
    }
    context.push("aux_EditorExtensions_0_1");
    context.popOnFailure();
    return null;
  }
}