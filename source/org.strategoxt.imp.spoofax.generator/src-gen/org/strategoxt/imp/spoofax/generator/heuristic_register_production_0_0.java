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

@SuppressWarnings("all") public class heuristic_register_production_0_0 extends Strategy 
{ 
  public static heuristic_register_production_0_0 instance = new heuristic_register_production_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("heuristic_register_production_0_0");
    Fail26284:
    { 
      TermReference l_4324 = new TermReference();
      TermReference m_4324 = new TermReference();
      lifted9442 lifted94420 = new lifted9442();
      lifted94420.m_4324 = m_4324;
      lifted94420.l_4324 = l_4324;
      term = try_1_0.instance.invoke(context, term, lifted94420);
      if(term == null)
        break Fail26284;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}