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

@SuppressWarnings("all") final class lifted9246 extends Strategy 
{ 
  public static final lifted9246 instance = new lifted9246();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28812:
    { 
      IStrategoTerm i_4262 = null;
      IStrategoTerm k_4262 = null;
      k_4262 = term;
      term = $Input$Dir$Prefix_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28812;
      i_4262 = term;
      term = k_4262;
      term = termFactory.makeTuple(i_4262, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28812;
      if(true)
        return term;
    }
    return null;
  }
}