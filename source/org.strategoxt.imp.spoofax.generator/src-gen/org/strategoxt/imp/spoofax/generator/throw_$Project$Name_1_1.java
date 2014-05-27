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

@SuppressWarnings("all") public class throw_$Project$Name_1_1 extends Strategy 
{ 
  public static throw_$Project$Name_1_1 instance = new throw_$Project$Name_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4505, IStrategoTerm s_4505)
  { 
    context.push("throw_ProjectName_1_1");
    Fail27561:
    { 
      IStrategoTerm v_4505 = null;
      v_4505 = term;
      term = dr_throw_1_2.instance.invoke(context, v_4505, t_4505, s_4505, generator.const7876);
      if(term == null)
        break Fail27561;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}