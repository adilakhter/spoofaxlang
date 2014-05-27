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

@SuppressWarnings("all") final class lifted9090 extends Strategy 
{ 
  Strategy o_4235;

  Strategy p_4235;

  Strategy q_4235;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28944:
    { 
      IStrategoTerm r_4235 = null;
      IStrategoTerm u_4235 = null;
      IStrategoTerm s_4235 = null;
      IStrategoTerm v_4235 = null;
      u_4235 = term;
      term = as_string_1_0.instance.invoke(context, term, o_4235);
      if(term == null)
        break Fail28944;
      r_4235 = term;
      term = u_4235;
      v_4235 = u_4235;
      term = as_string_1_0.instance.invoke(context, term, p_4235);
      if(term == null)
        break Fail28944;
      s_4235 = term;
      term = v_4235;
      term = as_string_1_0.instance.invoke(context, term, q_4235);
      if(term == null)
        break Fail28944;
      term = termFactory.makeTuple(r_4235, generator.const7064, s_4235, generator.const7064, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28944;
      if(true)
        return term;
    }
    return null;
  }
}