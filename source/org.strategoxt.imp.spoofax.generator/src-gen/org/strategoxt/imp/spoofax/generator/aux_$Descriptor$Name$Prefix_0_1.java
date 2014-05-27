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

@SuppressWarnings("all") public class aux_$Descriptor$Name$Prefix_0_1 extends Strategy 
{ 
  public static aux_$Descriptor$Name$Prefix_0_1 instance = new aux_$Descriptor$Name$Prefix_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_4532)
  { 
    Fail27714:
    { 
      IStrategoTerm p_4532 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27714;
      IStrategoTerm arg6658 = term.getSubterm(0);
      if(arg6658.getTermType() != IStrategoTerm.STRING || !"74836".equals(((IStrategoString)arg6658).stringValue()))
        break Fail27714;
      p_4532 = term.getSubterm(1);
      term = p_4532;
      if(true)
        return term;
    }
    context.push("aux_DescriptorNamePrefix_0_1");
    context.popOnFailure();
    return null;
  }
}