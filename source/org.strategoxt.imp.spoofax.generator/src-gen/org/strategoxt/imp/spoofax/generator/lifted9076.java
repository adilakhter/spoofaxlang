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

@SuppressWarnings("all") final class lifted9076 extends Strategy 
{ 
  public static final lifted9076 instance = new lifted9076();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28959:
    { 
      IStrategoTerm l_4684 = null;
      l_4684 = term;
      term = explode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28959;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28959;
      IStrategoTerm arg5947 = ((IStrategoList)term).head();
      if(arg5947.getTermType() != IStrategoTerm.INT || 45 != ((IStrategoInt)arg5947).intValue())
        break Fail28959;
      term = l_4684;
      if(true)
        return term;
    }
    return null;
  }
}