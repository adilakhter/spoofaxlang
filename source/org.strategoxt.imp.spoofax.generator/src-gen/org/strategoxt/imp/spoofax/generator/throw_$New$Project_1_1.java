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

@SuppressWarnings("all") public class throw_$New$Project_1_1 extends Strategy 
{ 
  public static throw_$New$Project_1_1 instance = new throw_$New$Project_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4514, IStrategoTerm g_4514)
  { 
    context.push("throw_NewProject_1_1");
    Fail27613:
    { 
      IStrategoTerm j_4514 = null;
      j_4514 = term;
      term = dr_throw_1_2.instance.invoke(context, j_4514, h_4514, g_4514, generator.const7885);
      if(term == null)
        break Fail27613;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}