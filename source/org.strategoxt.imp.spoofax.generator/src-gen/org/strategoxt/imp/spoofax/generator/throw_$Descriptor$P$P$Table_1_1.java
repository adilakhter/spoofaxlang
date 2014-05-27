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

@SuppressWarnings("all") public class throw_$Descriptor$P$P$Table_1_1 extends Strategy 
{ 
  public static throw_$Descriptor$P$P$Table_1_1 instance = new throw_$Descriptor$P$P$Table_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4428, IStrategoTerm a_4428)
  { 
    context.push("throw_DescriptorPPTable_1_1");
    Fail27089:
    { 
      IStrategoTerm d_4428 = null;
      d_4428 = term;
      term = dr_throw_1_2.instance.invoke(context, d_4428, b_4428, a_4428, generator.const7124);
      if(term == null)
        break Fail27089;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}