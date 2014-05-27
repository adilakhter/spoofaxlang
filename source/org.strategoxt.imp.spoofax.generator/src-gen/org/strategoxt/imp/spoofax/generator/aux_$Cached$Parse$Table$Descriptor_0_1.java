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

@SuppressWarnings("all") public class aux_$Cached$Parse$Table$Descriptor_0_1 extends Strategy 
{ 
  public static aux_$Cached$Parse$Table$Descriptor_0_1 instance = new aux_$Cached$Parse$Table$Descriptor_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_4444)
  { 
    Fail27190:
    { 
      IStrategoTerm s_4444 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27190;
      IStrategoTerm arg6563 = term.getSubterm(0);
      if(arg6563.getTermType() != IStrategoTerm.STRING || !"144048".equals(((IStrategoString)arg6563).stringValue()))
        break Fail27190;
      s_4444 = term.getSubterm(1);
      term = s_4444;
      if(true)
        return term;
    }
    context.push("aux_CachedParseTableDescriptor_0_1");
    context.popOnFailure();
    return null;
  }
}