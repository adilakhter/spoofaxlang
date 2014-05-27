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

@SuppressWarnings("all") final class lifted9079 extends Strategy 
{ 
  Strategy n_4230;

  Strategy o_4230;

  Strategy p_4230;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28956:
    { 
      IStrategoTerm q_4230 = null;
      IStrategoTerm t_4230 = null;
      IStrategoTerm r_4230 = null;
      IStrategoTerm u_4230 = null;
      t_4230 = term;
      term = as_string_1_0.instance.invoke(context, term, n_4230);
      if(term == null)
        break Fail28956;
      q_4230 = term;
      term = t_4230;
      u_4230 = t_4230;
      term = as_string_1_0.instance.invoke(context, term, o_4230);
      if(term == null)
        break Fail28956;
      r_4230 = term;
      term = u_4230;
      term = as_string_1_0.instance.invoke(context, term, p_4230);
      if(term == null)
        break Fail28956;
      term = (IStrategoTerm)termFactory.makeListCons(q_4230, termFactory.makeListCons(r_4230, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28956;
      if(true)
        return term;
    }
    return null;
  }
}