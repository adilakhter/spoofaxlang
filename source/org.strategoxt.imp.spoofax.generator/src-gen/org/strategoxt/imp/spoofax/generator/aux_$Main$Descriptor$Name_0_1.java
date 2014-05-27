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

@SuppressWarnings("all") public class aux_$Main$Descriptor$Name_0_1 extends Strategy 
{ 
  public static aux_$Main$Descriptor$Name_0_1 instance = new aux_$Main$Descriptor$Name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_4536)
  { 
    Fail27740:
    { 
      IStrategoTerm w_4536 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27740;
      IStrategoTerm arg6663 = term.getSubterm(0);
      if(arg6663.getTermType() != IStrategoTerm.STRING || !"136411".equals(((IStrategoString)arg6663).stringValue()))
        break Fail27740;
      w_4536 = term.getSubterm(1);
      term = w_4536;
      if(true)
        return term;
    }
    context.push("aux_MainDescriptorName_0_1");
    context.popOnFailure();
    return null;
  }
}