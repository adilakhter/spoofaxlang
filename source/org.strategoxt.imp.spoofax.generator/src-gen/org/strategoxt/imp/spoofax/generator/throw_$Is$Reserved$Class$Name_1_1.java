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

@SuppressWarnings("all") public class throw_$Is$Reserved$Class$Name_1_1 extends Strategy 
{ 
  public static throw_$Is$Reserved$Class$Name_1_1 instance = new throw_$Is$Reserved$Class$Name_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4444, IStrategoTerm y_4444)
  { 
    context.push("throw_IsReservedClassName_1_1");
    Fail27193:
    { 
      IStrategoTerm b_4445 = null;
      b_4445 = term;
      term = dr_throw_1_2.instance.invoke(context, b_4445, z_4444, y_4444, generator.const7167);
      if(term == null)
        break Fail27193;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}