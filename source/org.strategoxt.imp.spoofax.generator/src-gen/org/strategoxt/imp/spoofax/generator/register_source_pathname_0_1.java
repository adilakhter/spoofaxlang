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

@SuppressWarnings("all") public class register_source_pathname_0_1 extends Strategy 
{ 
  public static register_source_pathname_0_1 instance = new register_source_pathname_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4223)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("register_source_pathname_0_1");
    Fail25478:
    { 
      IStrategoTerm l_4223 = null;
      IStrategoTerm m_4223 = null;
      IStrategoTerm n_4223 = null;
      IStrategoTerm p_4223 = null;
      IStrategoTerm q_4223 = null;
      l_4223 = term;
      m_4223 = term;
      p_4223 = term;
      n_4223 = generator.const7018;
      q_4223 = p_4223;
      term = termFactory.makeTuple(generator.const7019, l_4223);
      term = dr_set_rule_0_3.instance.invoke(context, q_4223, n_4223, k_4223, term);
      if(term == null)
        break Fail25478;
      term = m_4223;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}