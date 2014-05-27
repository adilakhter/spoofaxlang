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

@SuppressWarnings("all") public class foldr1a_1_0 extends Strategy 
{ 
  public static foldr1a_1_0 instance = new foldr1a_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4250)
  { 
    context.push("foldr1a_1_0");
    Fail25711:
    { 
      y_4250 y_42500 = new y_4250();
      y_42500.x_4250 = x_4250;
      term = y_42500.invoke(context, term);
      if(term == null)
        break Fail25711;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}