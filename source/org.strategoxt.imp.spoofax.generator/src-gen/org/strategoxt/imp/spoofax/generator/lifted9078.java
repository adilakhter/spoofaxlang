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

@SuppressWarnings("all") final class lifted9078 extends Strategy 
{ 
  Strategy g_4230;

  Strategy h_4230;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28957:
    { 
      IStrategoTerm i_4230 = null;
      IStrategoTerm k_4230 = null;
      k_4230 = term;
      term = as_string_1_0.instance.invoke(context, term, g_4230);
      if(term == null)
        break Fail28957;
      i_4230 = term;
      term = k_4230;
      term = as_string_1_0.instance.invoke(context, term, h_4230);
      if(term == null)
        break Fail28957;
      term = (IStrategoTerm)termFactory.makeListCons(i_4230, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28957;
      if(true)
        return term;
    }
    return null;
  }
}