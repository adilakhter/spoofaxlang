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

@SuppressWarnings("all") public class throw_$No$Existing$Descriptor_1_1 extends Strategy 
{ 
  public static throw_$No$Existing$Descriptor_1_1 instance = new throw_$No$Existing$Descriptor_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4466, IStrategoTerm d_4466)
  { 
    context.push("throw_NoExistingDescriptor_1_1");
    Fail27323:
    { 
      IStrategoTerm g_4466 = null;
      g_4466 = term;
      term = dr_throw_1_2.instance.invoke(context, g_4466, e_4466, d_4466, generator.const7463);
      if(term == null)
        break Fail27323;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}