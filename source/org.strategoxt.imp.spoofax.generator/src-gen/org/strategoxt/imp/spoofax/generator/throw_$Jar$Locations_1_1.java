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

@SuppressWarnings("all") public class throw_$Jar$Locations_1_1 extends Strategy 
{ 
  public static throw_$Jar$Locations_1_1 instance = new throw_$Jar$Locations_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4510, IStrategoTerm z_4509)
  { 
    context.push("throw_JarLocations_1_1");
    Fail27587:
    { 
      IStrategoTerm c_4510 = null;
      c_4510 = term;
      term = dr_throw_1_2.instance.invoke(context, c_4510, a_4510, z_4509, generator.const7880);
      if(term == null)
        break Fail27587;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}