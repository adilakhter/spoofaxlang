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

@SuppressWarnings("all") final class lifted9578 extends Strategy 
{ 
  Strategy z_4411;

  Strategy y_4411;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28375:
    { 
      lifted9579 lifted95790 = new lifted9579();
      lifted95790.z_4411 = z_4411;
      term = $Cons_2_0.instance.invoke(context, term, y_4411, lifted95790);
      if(term == null)
        break Fail28375;
      if(true)
        return term;
    }
    return null;
  }
}