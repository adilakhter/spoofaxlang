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

@SuppressWarnings("all") public class continue_$Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static continue_$Cached$Parse$Table$Descriptor_0_0 instance = new continue_$Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("continue_CachedParseTableDescriptor_0_0");
    Fail27169:
    { 
      IStrategoTerm z_4440 = null;
      z_4440 = term;
      term = dr_continue_0_1.instance.invoke(context, z_4440, generator.const7154);
      if(term == null)
        break Fail27169;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}