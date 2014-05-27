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

@SuppressWarnings("all") final class lifted9224 extends Strategy 
{ 
  TermReference l_4257;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28824:
    { 
      IStrategoTerm m_4257 = null;
      IStrategoTerm n_4257 = null;
      n_4257 = term;
      m_4257 = term;
      term = n_4257;
      if(l_4257.value == null)
        break Fail28824;
      term = context.invokePrimitive("SSL_EXT_origin_equal", term, NO_STRATEGIES, new IStrategoTerm[]{m_4257, l_4257.value});
      if(term == null)
        break Fail28824;
      if(true)
        return term;
    }
    return null;
  }
}