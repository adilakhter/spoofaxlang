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

@SuppressWarnings("all") final class lifted9113 extends Strategy 
{ 
  TermReference j_4238;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28926:
    { 
      IStrategoTerm k_4238 = null;
      IStrategoTerm m_4238 = null;
      IStrategoTerm l_4238 = null;
      IStrategoTerm n_4238 = null;
      m_4238 = term;
      if(j_4238.value == null)
        break Fail28926;
      term = xtc_find_0_0.instance.invoke(context, j_4238.value);
      if(term == null)
        break Fail28926;
      k_4238 = term;
      n_4238 = m_4238;
      term = pass_verbose_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail28926;
      l_4238 = term;
      term = n_4238;
      IStrategoList list380;
      list380 = checkListTail(l_4238);
      if(list380 == null)
        break Fail28926;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7083, termFactory.makeListCons(k_4238, list380));
      if(true)
        return term;
    }
    return null;
  }
}