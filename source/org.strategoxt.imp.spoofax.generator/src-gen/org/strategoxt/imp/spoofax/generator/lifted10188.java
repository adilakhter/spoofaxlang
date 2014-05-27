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

@SuppressWarnings("all") final class lifted10188 extends Strategy 
{ 
  public static final lifted10188 instance = new lifted10188();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27854:
    { 
      IStrategoTerm e_4499 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27854;
      e_4499 = term.getSubterm(0);
      IStrategoTerm arg6624 = term.getSubterm(1);
      term = aux_$Input$File_0_1.instance.invoke(context, e_4499, arg6624);
      if(term == null)
        break Fail27854;
      if(true)
        return term;
    }
    return null;
  }
}