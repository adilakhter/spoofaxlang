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

@SuppressWarnings("all") final class lifted9482 extends Strategy 
{ 
  TermReference a_4366;

  TermReference b_4366;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28546:
    { 
      IStrategoTerm f_4366 = null;
      IStrategoTerm g_4366 = null;
      g_4366 = term;
      f_4366 = generator.const7458;
      term = g_4366;
      lifted9483 lifted94830 = new lifted9483();
      lifted94830.a_4366 = a_4366;
      lifted94830.b_4366 = b_4366;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94830, f_4366);
      if(term == null)
        break Fail28546;
      if(true)
        return term;
    }
    return null;
  }
}