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

@SuppressWarnings("all") final class lifted9454 extends Strategy 
{ 
  Strategy k_4326;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28615:
    { 
      IStrategoTerm o_4326 = null;
      IStrategoTerm p_4326 = null;
      p_4326 = term;
      o_4326 = generator.const7487;
      term = p_4326;
      lifted9455 lifted94550 = new lifted9455();
      lifted94550.k_4326 = k_4326;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94550, o_4326);
      if(term == null)
        break Fail28615;
      if(true)
        return term;
    }
    return null;
  }
}