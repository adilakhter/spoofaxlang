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

@SuppressWarnings("all") final class lifted9115 extends Strategy 
{ 
  TermReference o_4238;

  TermReference p_4238;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28924:
    { 
      IStrategoTerm q_4238 = null;
      IStrategoTerm s_4238 = null;
      IStrategoTerm r_4238 = null;
      IStrategoTerm t_4238 = null;
      s_4238 = term;
      if(o_4238.value == null)
        break Fail28924;
      term = xtc_find_0_0.instance.invoke(context, o_4238.value);
      if(term == null)
        break Fail28924;
      q_4238 = term;
      t_4238 = s_4238;
      term = pass_verbose_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail28924;
      r_4238 = term;
      term = t_4238;
      if(p_4238.value == null)
        break Fail28924;
      IStrategoList list381;
      list381 = checkListTail(r_4238);
      if(list381 == null)
        break Fail28924;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7083, termFactory.makeListCons(q_4238, termFactory.makeListCons(generator.const7091, termFactory.makeListCons(p_4238.value, list381))));
      if(true)
        return term;
    }
    return null;
  }
}