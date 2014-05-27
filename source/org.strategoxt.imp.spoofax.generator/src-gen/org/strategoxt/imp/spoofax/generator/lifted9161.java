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

@SuppressWarnings("all") final class lifted9161 extends Strategy 
{ 
  public static final lifted9161 instance = new lifted9161();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28880:
    { 
      term = is_list_symbol_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28880;
      term = get_nonterm_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28880;
      if(true)
        return term;
    }
    return null;
  }
}