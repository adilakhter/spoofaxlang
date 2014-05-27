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

@SuppressWarnings("all") final class lifted9052 extends Strategy 
{ 
  TermReference d_4227;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28984:
    { 
      if(d_4227.value == null)
        break Fail28984;
      term = termFactory.makeTuple(generator.const7045, d_4227.value);
      term = separate_by_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28984;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28984;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7048, termFactory.makeListCons(term, (IStrategoList)generator.constCons4605));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28984;
      if(true)
        return term;
    }
    return null;
  }
}