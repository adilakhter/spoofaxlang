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

@SuppressWarnings("all") public class throw_$Input$Dir$Prefix_1_1 extends Strategy 
{ 
  public static throw_$Input$Dir$Prefix_1_1 instance = new throw_$Input$Dir$Prefix_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4432, IStrategoTerm h_4432)
  { 
    context.push("throw_InputDirPrefix_1_1");
    Fail27115:
    { 
      IStrategoTerm k_4432 = null;
      k_4432 = term;
      term = dr_throw_1_2.instance.invoke(context, k_4432, i_4432, h_4432, generator.const7147);
      if(term == null)
        break Fail27115;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}