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

@SuppressWarnings("all") public class include_pathname_0_0 extends Strategy 
{ 
  public static include_pathname_0_0 instance = new include_pathname_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("include_pathname_0_0");
    Fail25474:
    { 
      IStrategoTerm q_4222 = null;
      IStrategoTerm r_4222 = null;
      r_4222 = term;
      term = parse_sdf2_module_to_asfix_0_0.instance.invoke(context, r_4222);
      if(term == null)
        break Fail25474;
      q_4222 = term;
      term = get_module_name_from_asfix_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25474;
      term = register_source_pathname_0_1.instance.invoke(context, r_4222, term);
      if(term == null)
        break Fail25474;
      term = termFactory.makeTuple(r_4222, q_4222);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}