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

@SuppressWarnings("all") public class throw_$Main$Descriptor$Name_1_1 extends Strategy 
{ 
  public static throw_$Main$Descriptor$Name_1_1 instance = new throw_$Main$Descriptor$Name_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4532, IStrategoTerm v_4532)
  { 
    context.push("throw_MainDescriptorName_1_1");
    Fail27717:
    { 
      IStrategoTerm y_4532 = null;
      y_4532 = term;
      term = dr_throw_1_2.instance.invoke(context, y_4532, w_4532, v_4532, generator.const7897);
      if(term == null)
        break Fail27717;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}