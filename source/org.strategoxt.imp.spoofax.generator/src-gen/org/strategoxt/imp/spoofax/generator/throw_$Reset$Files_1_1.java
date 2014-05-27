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

@SuppressWarnings("all") public class throw_$Reset$Files_1_1 extends Strategy 
{ 
  public static throw_$Reset$Files_1_1 instance = new throw_$Reset$Files_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4519, IStrategoTerm a_4519)
  { 
    context.push("throw_ResetFiles_1_1");
    Fail27639:
    { 
      IStrategoTerm d_4519 = null;
      d_4519 = term;
      term = dr_throw_1_2.instance.invoke(context, d_4519, b_4519, a_4519, generator.const7888);
      if(term == null)
        break Fail27639;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}