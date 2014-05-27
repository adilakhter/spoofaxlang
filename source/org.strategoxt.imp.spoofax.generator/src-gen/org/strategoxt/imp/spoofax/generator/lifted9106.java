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

@SuppressWarnings("all") final class lifted9106 extends Strategy 
{ 
  Strategy r_4237;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28933:
    { 
      IStrategoTerm s_4237 = null;
      term = r_4237.invoke(context, generator.const6968);
      if(term == null)
        break Fail28933;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28933;
      s_4237 = term;
      term = pass_verbose_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail28933;
      term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(generator.const7085, termFactory.makeListCons(s_4237, (IStrategoList)generator.constNil7)), term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28933;
      if(true)
        return term;
    }
    return null;
  }
}