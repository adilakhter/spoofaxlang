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

@SuppressWarnings("all") public class break_to_label_$Pack$S$D$F$Table_0_1 extends Strategy 
{ 
  public static break_to_label_$Pack$S$D$F$Table_0_1 instance = new break_to_label_$Pack$S$D$F$Table_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4420)
  { 
    context.push("break_to_label_PackSDFTable_0_1");
    Fail27041:
    { 
      IStrategoTerm d_4420 = null;
      d_4420 = term;
      term = dr_break_0_2.instance.invoke(context, d_4420, generator.const7022, b_4420);
      if(term == null)
        break Fail27041;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}