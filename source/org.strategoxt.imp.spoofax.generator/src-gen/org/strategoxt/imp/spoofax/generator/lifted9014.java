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

@SuppressWarnings("all") final class lifted9014 extends Strategy 
{ 
  public static final lifted9014 instance = new lifted9014();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29027:
    { 
      IStrategoTerm g_4221 = null;
      IStrategoTerm h_4221 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail29027;
      g_4221 = term.getSubterm(1);
      h_4221 = term.getSubterm(2);
      IStrategoList list366;
      list366 = checkListTail(h_4221);
      if(list366 == null)
        break Fail29027;
      term = (IStrategoTerm)termFactory.makeListCons(g_4221, list366);
      if(true)
        return term;
    }
    return null;
  }
}