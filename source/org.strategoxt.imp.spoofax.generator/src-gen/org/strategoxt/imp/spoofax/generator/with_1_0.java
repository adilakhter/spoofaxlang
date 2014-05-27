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

@SuppressWarnings("all") public class with_1_0 extends Strategy 
{ 
  public static with_1_0 instance = new with_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4234)
  { 
    context.push("with_1_0");
    Fail25542:
    { 
      IStrategoTerm q_4234 = null;
      q_4234 = term;
      term = verify_2_0.instance.invoke(context, term, r_4234, lifted9087.instance);
      if(term == null)
        break Fail25542;
      term = q_4234;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}