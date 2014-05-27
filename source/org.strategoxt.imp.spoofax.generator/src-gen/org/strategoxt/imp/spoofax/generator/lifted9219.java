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

@SuppressWarnings("all") final class lifted9219 extends Strategy 
{ 
  TermReference j_4256;

  TermReference k_4256;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28830:
    { 
      IStrategoTerm m_4256 = null;
      IStrategoTerm n_4256 = null;
      IStrategoTerm p_4256 = null;
      n_4256 = term;
      if(j_4256.value == null)
        break Fail28830;
      p_4256 = j_4256.value;
      term = separate_by_0_1.instance.invoke(context, p_4256, generator.const7009);
      if(term == null)
        break Fail28830;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28830;
      m_4256 = term;
      term = n_4256;
      if(k_4256.value == null)
        break Fail28830;
      term = termFactory.makeTuple(m_4256, generator.const7009, k_4256.value);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28830;
      if(true)
        return term;
    }
    return null;
  }
}