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

@SuppressWarnings("all") public class aux_$No$Existing$Descriptor_0_2 extends Strategy 
{ 
  public static aux_$No$Existing$Descriptor_0_2 instance = new aux_$No$Existing$Descriptor_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_4470, IStrategoTerm r_4470)
  { 
    Fail27346:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"19145".equals(((IStrategoString)term).stringValue()))
        break Fail27346;
      term = q_4470;
      if(true)
        return term;
    }
    context.push("aux_NoExistingDescriptor_0_2");
    context.popOnFailure();
    return null;
  }
}