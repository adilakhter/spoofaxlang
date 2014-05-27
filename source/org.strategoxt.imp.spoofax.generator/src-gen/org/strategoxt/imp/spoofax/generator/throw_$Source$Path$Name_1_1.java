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

@SuppressWarnings("all") public class throw_$Source$Path$Name_1_1 extends Strategy 
{ 
  public static throw_$Source$Path$Name_1_1 instance = new throw_$Source$Path$Name_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4415, IStrategoTerm n_4415)
  { 
    context.push("throw_SourcePathName_1_1");
    Fail27011:
    { 
      IStrategoTerm q_4415 = null;
      q_4415 = term;
      term = dr_throw_1_2.instance.invoke(context, q_4415, o_4415, n_4415, generator.const7018);
      if(term == null)
        break Fail27011;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}