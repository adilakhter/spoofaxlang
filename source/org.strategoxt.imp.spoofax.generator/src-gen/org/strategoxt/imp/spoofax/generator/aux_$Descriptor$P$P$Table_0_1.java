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

@SuppressWarnings("all") public class aux_$Descriptor$P$P$Table_0_1 extends Strategy 
{ 
  public static aux_$Descriptor$P$P$Table_0_1 instance = new aux_$Descriptor$P$P$Table_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_4432)
  { 
    Fail27112:
    { 
      IStrategoTerm b_4432 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27112;
      IStrategoTerm arg6548 = term.getSubterm(0);
      if(arg6548.getTermType() != IStrategoTerm.STRING || !"-56401".equals(((IStrategoString)arg6548).stringValue()))
        break Fail27112;
      b_4432 = term.getSubterm(1);
      term = b_4432;
      if(true)
        return term;
    }
    context.push("aux_DescriptorPPTable_0_1");
    context.popOnFailure();
    return null;
  }
}