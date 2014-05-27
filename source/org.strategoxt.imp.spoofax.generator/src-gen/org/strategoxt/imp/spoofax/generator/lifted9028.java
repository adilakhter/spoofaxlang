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

@SuppressWarnings("all") final class lifted9028 extends Strategy 
{ 
  TermReference d_4223;

  TermReference g_4223;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29014:
    { 
      if(d_4223.value == null || g_4223.value == null)
        break Fail29014;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7005, termFactory.makeListCons(d_4223.value, termFactory.makeListCons(generator.const7011, termFactory.makeListCons(g_4223.value, (IStrategoList)generator.constNil7))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29014;
      if(true)
        return term;
    }
    return null;
  }
}