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

@SuppressWarnings("all") public class aux_$Project$Name_0_1 extends Strategy 
{ 
  public static aux_$Project$Name_0_1 instance = new aux_$Project$Name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4509)
  { 
    Fail27584:
    { 
      IStrategoTerm t_4509 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27584;
      IStrategoTerm arg6636 = term.getSubterm(0);
      if(arg6636.getTermType() != IStrategoTerm.STRING || !"34095".equals(((IStrategoString)arg6636).stringValue()))
        break Fail27584;
      t_4509 = term.getSubterm(1);
      term = t_4509;
      if(true)
        return term;
    }
    context.push("aux_ProjectName_0_1");
    context.popOnFailure();
    return null;
  }
}