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

@SuppressWarnings("all") final class lifted9002 extends Strategy 
{ 
  Strategy u_4219;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29037:
    { 
      term = u_4219.invoke(context, generator.const6968);
      if(term == null)
        break Fail29037;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const6980, termFactory.makeListCons(term, (IStrategoList)generator.constCons4539));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29037;
      if(true)
        return term;
    }
    return null;
  }
}