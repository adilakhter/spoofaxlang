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

@SuppressWarnings("all") public class aux_$Imported$From_0_2 extends Strategy 
{ 
  public static aux_$Imported$From_0_2 instance = new aux_$Imported$From_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4427, IStrategoTerm t_4427)
  { 
    Fail27086:
    { 
      IStrategoTerm u_4427 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27086;
      IStrategoTerm arg6543 = term.getSubterm(0);
      if(arg6543.getTermType() != IStrategoTerm.STRING || !"-213243".equals(((IStrategoString)arg6543).stringValue()))
        break Fail27086;
      u_4427 = term.getSubterm(1);
      term = u_4427;
      if(true)
        return term;
    }
    context.push("aux_ImportedFrom_0_2");
    context.popOnFailure();
    return null;
  }
}