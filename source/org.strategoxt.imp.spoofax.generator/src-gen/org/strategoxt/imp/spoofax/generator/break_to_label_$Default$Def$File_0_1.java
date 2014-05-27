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

@SuppressWarnings("all") public class break_to_label_$Default$Def$File_0_1 extends Strategy 
{ 
  public static break_to_label_$Default$Def$File_0_1 instance = new break_to_label_$Default$Def$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_4537)
  { 
    context.push("break_to_label_DefaultDefFile_0_1");
    Fail27747:
    { 
      IStrategoTerm p_4537 = null;
      p_4537 = term;
      term = dr_break_0_2.instance.invoke(context, p_4537, generator.const7912, n_4537);
      if(term == null)
        break Fail27747;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}