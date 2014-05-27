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

@SuppressWarnings("all") final class lifted9782 extends Strategy 
{ 
  Strategy l_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28203:
    { 
      lifted9785 lifted97850 = new lifted9785();
      lifted9783 lifted97830 = new lifted9783();
      lifted97850.l_4412 = l_4412;
      lifted97830.l_4412 = l_4412;
      term = $Cons_2_0.instance.invoke(context, term, lifted97830, lifted97850);
      if(term == null)
        break Fail28203;
      if(true)
        return term;
    }
    return null;
  }
}