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

@SuppressWarnings("all") final class lifted9109 extends Strategy 
{ 
  Strategy w_4237;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28930:
    { 
      IStrategoTerm x_4237 = null;
      IStrategoTerm z_4237 = null;
      IStrategoTerm y_4237 = null;
      IStrategoTerm a_4238 = null;
      z_4237 = term;
      term = w_4237.invoke(context, generator.const6968);
      if(term == null)
        break Fail28930;
      term = xtc_find_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28930;
      x_4237 = term;
      a_4238 = z_4237;
      term = pass_v_verbose_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail28930;
      y_4237 = term;
      term = a_4238;
      IStrategoList list378;
      list378 = checkListTail(y_4237);
      if(list378 == null)
        break Fail28930;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7088, termFactory.makeListCons(generator.const7083, termFactory.makeListCons(x_4237, list378)));
      if(true)
        return term;
    }
    return null;
  }
}