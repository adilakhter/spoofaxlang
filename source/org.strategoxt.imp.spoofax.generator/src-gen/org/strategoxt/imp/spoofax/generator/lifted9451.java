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

@SuppressWarnings("all") final class lifted9451 extends Strategy 
{ 
  TermReference l_4325;

  Strategy m_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28628:
    { 
      IStrategoTerm o_4325 = null;
      IStrategoTerm q_4325 = null;
      IStrategoTerm p_4325 = null;
      IStrategoTerm r_4325 = null;
      q_4325 = term;
      if(l_4325.value == null)
        break Fail28628;
      term = m_4325.invoke(context, l_4325.value);
      if(term == null)
        break Fail28628;
      o_4325 = term;
      term = q_4325;
      r_4325 = q_4325;
      p_4325 = term;
      term = r_4325;
      IStrategoList list400;
      list400 = checkListTail(p_4325);
      if(list400 == null)
        break Fail28628;
      term = (IStrategoTerm)termFactory.makeListCons(o_4325, list400);
      if(true)
        return term;
    }
    return null;
  }
}