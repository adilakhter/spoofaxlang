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

@SuppressWarnings("all") final class lifted9802 extends Strategy 
{ 
  Strategy n_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28192:
    { 
      lifted9806 lifted98060 = new lifted9806();
      lifted9803 lifted98030 = new lifted9803();
      lifted98060.n_4412 = n_4412;
      lifted98030.n_4412 = n_4412;
      term = prod_3_0.instance.invoke(context, term, lifted98030, lifted98060, no_attrs_0_0.instance);
      if(term == null)
        break Fail28192;
      if(true)
        return term;
    }
    return null;
  }
}