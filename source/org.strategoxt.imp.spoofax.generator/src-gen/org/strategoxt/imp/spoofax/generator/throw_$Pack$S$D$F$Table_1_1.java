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

@SuppressWarnings("all") public class throw_$Pack$S$D$F$Table_1_1 extends Strategy 
{ 
  public static throw_$Pack$S$D$F$Table_1_1 instance = new throw_$Pack$S$D$F$Table_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4419, IStrategoTerm q_4419)
  { 
    context.push("throw_PackSDFTable_1_1");
    Fail27037:
    { 
      IStrategoTerm t_4419 = null;
      t_4419 = term;
      term = dr_throw_1_2.instance.invoke(context, t_4419, r_4419, q_4419, generator.const7022);
      if(term == null)
        break Fail27037;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}