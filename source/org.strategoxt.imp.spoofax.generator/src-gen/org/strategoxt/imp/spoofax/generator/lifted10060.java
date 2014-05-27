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

@SuppressWarnings("all") final class lifted10060 extends Strategy 
{ 
  public static final lifted10060 instance = new lifted10060();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27982:
    { 
      IStrategoTerm i_4437 = null;
      IStrategoTerm r_4437 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27982;
      r_4437 = term.getSubterm(0);
      IStrategoTerm arg6554 = term.getSubterm(1);
      i_4437 = arg6554;
      term = aux_$Is$Imported_0_2.instance.invoke(context, r_4437, arg6554, i_4437);
      if(term == null)
        break Fail27982;
      if(true)
        return term;
    }
    return null;
  }
}