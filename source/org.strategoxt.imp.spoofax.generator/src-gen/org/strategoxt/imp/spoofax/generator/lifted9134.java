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

@SuppressWarnings("all") final class lifted9134 extends Strategy 
{ 
  TermReference j_4239;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28911:
    { 
      IStrategoTerm k_4239 = null;
      IStrategoTerm l_4239 = null;
      l_4239 = term;
      term = pass_v_verbose_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28911;
      k_4239 = term;
      term = l_4239;
      if(j_4239.value == null)
        break Fail28911;
      IStrategoList list383;
      list383 = checkListTail(k_4239);
      if(list383 == null)
        break Fail28911;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7099, termFactory.makeListCons(generator.const7098, termFactory.makeListCons(j_4239.value, list383)));
      if(true)
        return term;
    }
    return null;
  }
}