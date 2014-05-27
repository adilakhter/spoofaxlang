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

@SuppressWarnings("all") public class $Combine$Layout_2_0 extends Strategy 
{ 
  public static $Combine$Layout_2_0 instance = new $Combine$Layout_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4250, Strategy m_4250)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CombineLayout_2_0");
    Fail25709:
    { 
      IStrategoTerm f_4250 = null;
      IStrategoTerm g_4250 = null;
      IStrategoTerm h_4250 = null;
      IStrategoTerm i_4250 = null;
      IStrategoTerm j_4250 = null;
      IStrategoTerm k_4250 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25709;
      IStrategoTerm arg6176 = term.getSubterm(0);
      if(arg6176.getTermType() != IStrategoTerm.TUPLE || arg6176.getSubtermCount() != 3)
        break Fail25709;
      f_4250 = arg6176.getSubterm(0);
      g_4250 = arg6176.getSubterm(1);
      h_4250 = arg6176.getSubterm(2);
      IStrategoTerm arg6177 = term.getSubterm(1);
      if(arg6177.getTermType() != IStrategoTerm.TUPLE || arg6177.getSubtermCount() != 3)
        break Fail25709;
      i_4250 = arg6177.getSubterm(0);
      j_4250 = arg6177.getSubterm(1);
      k_4250 = arg6177.getSubterm(2);
      term = termFactory.makeTuple(h_4250, i_4250);
      term = m_4250.invoke(context, term);
      if(term == null)
        break Fail25709;
      term = termFactory.makeTuple(g_4250, term, j_4250);
      term = l_4250.invoke(context, term);
      if(term == null)
        break Fail25709;
      term = termFactory.makeTuple(f_4250, term, k_4250);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}