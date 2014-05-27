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

@SuppressWarnings("all") final class lifted9039 extends Strategy 
{ 
  TermReference l_4225;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29003:
    { 
      IStrategoTerm o_4225 = null;
      IStrategoTerm p_4225 = null;
      IStrategoTerm q_4225 = null;
      IStrategoTerm s_4225 = null;
      IStrategoTerm t_4225 = null;
      o_4225 = term;
      p_4225 = term;
      s_4225 = term;
      q_4225 = generator.const7027;
      term = s_4225;
      t_4225 = s_4225;
      if(l_4225.value == null)
        break Fail29003;
      term = termFactory.makeTuple(generator.const7028, l_4225.value);
      term = dr_add_rule_0_3.instance.invoke(context, t_4225, q_4225, o_4225, term);
      if(term == null)
        break Fail29003;
      term = p_4225;
      if(true)
        return term;
    }
    return null;
  }
}