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

@SuppressWarnings("all") public class throw_$Imported$From_1_1 extends Strategy 
{ 
  public static throw_$Imported$From_1_1 instance = new throw_$Imported$From_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4423, IStrategoTerm x_4423)
  { 
    context.push("throw_ImportedFrom_1_1");
    Fail27063:
    { 
      IStrategoTerm a_4424 = null;
      a_4424 = term;
      term = dr_throw_1_2.instance.invoke(context, a_4424, y_4423, x_4423, generator.const7027);
      if(term == null)
        break Fail27063;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}