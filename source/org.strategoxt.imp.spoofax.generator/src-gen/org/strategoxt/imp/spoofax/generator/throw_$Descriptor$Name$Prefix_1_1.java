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

@SuppressWarnings("all") public class throw_$Descriptor$Name$Prefix_1_1 extends Strategy 
{ 
  public static throw_$Descriptor$Name$Prefix_1_1 instance = new throw_$Descriptor$Name$Prefix_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4528, IStrategoTerm o_4528)
  { 
    context.push("throw_DescriptorNamePrefix_1_1");
    Fail27691:
    { 
      IStrategoTerm r_4528 = null;
      r_4528 = term;
      term = dr_throw_1_2.instance.invoke(context, r_4528, p_4528, o_4528, generator.const7899);
      if(term == null)
        break Fail27691;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}