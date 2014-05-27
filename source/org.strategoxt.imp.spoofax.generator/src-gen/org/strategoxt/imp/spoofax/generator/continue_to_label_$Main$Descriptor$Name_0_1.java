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

@SuppressWarnings("all") public class continue_to_label_$Main$Descriptor$Name_0_1 extends Strategy 
{ 
  public static continue_to_label_$Main$Descriptor$Name_0_1 instance = new continue_to_label_$Main$Descriptor$Name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4532)
  { 
    context.push("continue_to_label_MainDescriptorName_0_1");
    Fail27718:
    { 
      IStrategoTerm b_4533 = null;
      b_4533 = term;
      term = dr_continue_0_2.instance.invoke(context, b_4533, generator.const7897, z_4532);
      if(term == null)
        break Fail27718;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}