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

@SuppressWarnings("all") public class aux_$Collect$All$Visited_0_2 extends Strategy 
{ 
  public static aux_$Collect$All$Visited_0_2 instance = new aux_$Collect$All$Visited_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_4484, IStrategoTerm o_4484)
  { 
    Fail27428:
    { 
      IStrategoTerm p_4484 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27428;
      IStrategoTerm arg6606 = term.getSubterm(0);
      if(arg6606.getTermType() != IStrategoTerm.STRING || !"-469688".equals(((IStrategoString)arg6606).stringValue()))
        break Fail27428;
      p_4484 = term.getSubterm(1);
      term = p_4484;
      if(true)
        return term;
    }
    context.push("aux_CollectAllVisited_0_2");
    context.popOnFailure();
    return null;
  }
}