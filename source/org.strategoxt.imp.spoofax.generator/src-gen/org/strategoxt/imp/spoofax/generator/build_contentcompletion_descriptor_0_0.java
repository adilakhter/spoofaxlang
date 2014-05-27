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

@SuppressWarnings("all") public class build_contentcompletion_descriptor_0_0 extends Strategy 
{ 
  public static build_contentcompletion_descriptor_0_0 instance = new build_contentcompletion_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("build_contentcompletion_descriptor_0_0");
    Fail26163:
    { 
      term = descriptor_name_0_0.instance.invoke(context, generator.const7256);
      if(term == null)
        break Fail26163;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{term, generator.constNoImports0, generator.constCons4740});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}