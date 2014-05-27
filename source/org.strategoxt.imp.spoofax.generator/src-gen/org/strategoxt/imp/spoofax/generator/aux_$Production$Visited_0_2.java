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

@SuppressWarnings("all") public class aux_$Production$Visited_0_2 extends Strategy 
{ 
  public static aux_$Production$Visited_0_2 instance = new aux_$Production$Visited_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_4496, IStrategoTerm x_4496)
  { 
    Fail27506:
    { 
      IStrategoTerm y_4496 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27506;
      IStrategoTerm arg6621 = term.getSubterm(0);
      if(arg6621.getTermType() != IStrategoTerm.STRING || !"29931".equals(((IStrategoString)arg6621).stringValue()))
        break Fail27506;
      y_4496 = term.getSubterm(1);
      term = y_4496;
      if(true)
        return term;
    }
    context.push("aux_ProductionVisited_0_2");
    context.popOnFailure();
    return null;
  }
}