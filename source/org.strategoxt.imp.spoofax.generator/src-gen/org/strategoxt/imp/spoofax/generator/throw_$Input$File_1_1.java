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

@SuppressWarnings("all") public class throw_$Input$File_1_1 extends Strategy 
{ 
  public static throw_$Input$File_1_1 instance = new throw_$Input$File_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4497, IStrategoTerm e_4497)
  { 
    context.push("throw_InputFile_1_1");
    Fail27509:
    { 
      IStrategoTerm h_4497 = null;
      h_4497 = term;
      term = dr_throw_1_2.instance.invoke(context, h_4497, f_4497, e_4497, generator.const7868);
      if(term == null)
        break Fail27509;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}