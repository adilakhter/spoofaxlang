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

@SuppressWarnings("all") final class lifted10087 extends Strategy 
{ 
  public static final lifted10087 instance = new lifted10087();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27955:
    { 
      IStrategoTerm e_4450 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27955;
      e_4450 = term.getSubterm(0);
      IStrategoTerm arg6569 = term.getSubterm(1);
      term = aux_$Main$Descriptor_0_1.instance.invoke(context, e_4450, arg6569);
      if(term == null)
        break Fail27955;
      if(true)
        return term;
    }
    return null;
  }
}