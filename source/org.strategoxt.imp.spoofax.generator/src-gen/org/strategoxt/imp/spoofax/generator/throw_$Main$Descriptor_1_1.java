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

@SuppressWarnings("all") public class throw_$Main$Descriptor_1_1 extends Strategy 
{ 
  public static throw_$Main$Descriptor_1_1 instance = new throw_$Main$Descriptor_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4449, IStrategoTerm b_4449)
  { 
    context.push("throw_MainDescriptor_1_1");
    Fail27219:
    { 
      IStrategoTerm e_4449 = null;
      e_4449 = term;
      term = dr_throw_1_2.instance.invoke(context, e_4449, c_4449, b_4449, generator.const7251);
      if(term == null)
        break Fail27219;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}