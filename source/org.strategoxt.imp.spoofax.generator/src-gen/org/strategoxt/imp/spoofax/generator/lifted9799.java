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

@SuppressWarnings("all") final class lifted9799 extends Strategy 
{ 
  Strategy m_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28197:
    { 
      lifted9800 lifted98000 = new lifted9800();
      lifted98000.m_4412 = m_4412;
      term = cf_1_0.instance.invoke(context, term, lifted98000);
      if(term == null)
        break Fail28197;
      if(true)
        return term;
    }
    return null;
  }
}