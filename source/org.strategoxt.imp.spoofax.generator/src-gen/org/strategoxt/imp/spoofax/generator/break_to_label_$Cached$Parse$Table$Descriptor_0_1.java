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

@SuppressWarnings("all") public class break_to_label_$Cached$Parse$Table$Descriptor_0_1 extends Strategy 
{ 
  public static break_to_label_$Cached$Parse$Table$Descriptor_0_1 instance = new break_to_label_$Cached$Parse$Table$Descriptor_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_4441)
  { 
    context.push("break_to_label_CachedParseTableDescriptor_0_1");
    Fail27171:
    { 
      IStrategoTerm e_4441 = null;
      e_4441 = term;
      term = dr_break_0_2.instance.invoke(context, e_4441, generator.const7154, c_4441);
      if(term == null)
        break Fail27171;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}