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

@SuppressWarnings("all") final class lifted9357 extends Strategy 
{ 
  TermReference u_4302;

  TermReference t_4302;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28704:
    { 
      term = verbose_msg_3_0.instance.invoke(context, term, lifted9358.instance, heuristic_asfix_sort_name_0_0.instance, constructor_name_0_0.instance);
      if(term == null)
        break Fail28704;
      lifted9362 lifted93620 = new lifted9362();
      lifted93620.t_4302 = t_4302;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9361.instance, lifted93620);
      if(term == null)
        break Fail28704;
      lifted9364 lifted93640 = new lifted9364();
      lifted93640.u_4302 = u_4302;
      term = verbose_msg_2_0.instance.invoke(context, term, lifted9363.instance, lifted93640);
      if(term == null)
        break Fail28704;
      if(true)
        return term;
    }
    return null;
  }
}