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

@SuppressWarnings("all") public class all_keys_$Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static all_keys_$Main$Descriptor$Name_0_0 instance = new all_keys_$Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("all_keys_MainDescriptorName_0_0");
    Fail27723:
    { 
      IStrategoTerm m_4533 = null;
      m_4533 = term;
      term = dr_all_keys_0_1.instance.invoke(context, m_4533, generator.const7897);
      if(term == null)
        break Fail27723;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}