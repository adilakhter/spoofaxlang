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

@SuppressWarnings("all") final class lifted9424 extends Strategy 
{ 
  public static final lifted9424 instance = new lifted9424();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28650:
    { 
      IStrategoTerm o_4319 = null;
      o_4319 = term;
      term = dr_scope_1_1.instance.invoke(context, o_4319, lifted9425.instance, generator.const7458);
      if(term == null)
        break Fail28650;
      if(true)
        return term;
    }
    return null;
  }
}