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

@SuppressWarnings("all") final class lifted9111 extends Strategy 
{ 
  Strategy b_4238;

  Strategy c_4238;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28928:
    { 
      IStrategoTerm d_4238 = null;
      IStrategoTerm g_4238 = null;
      IStrategoTerm e_4238 = null;
      IStrategoTerm h_4238 = null;
      IStrategoTerm f_4238 = null;
      IStrategoTerm i_4238 = null;
      g_4238 = term;
      term = b_4238.invoke(context, generator.const6968);
      if(term == null)
        break Fail28928;
      term = xtc_find_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28928;
      d_4238 = term;
      h_4238 = g_4238;
      term = c_4238.invoke(context, generator.const6968);
      if(term == null)
        break Fail28928;
      e_4238 = term;
      i_4238 = h_4238;
      term = pass_v_verbose_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail28928;
      f_4238 = term;
      term = i_4238;
      IStrategoList list379;
      list379 = checkListTail(f_4238);
      if(list379 == null)
        break Fail28928;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7088, termFactory.makeListCons(generator.const7083, termFactory.makeListCons(d_4238, termFactory.makeListCons(generator.const7089, termFactory.makeListCons(e_4238, list379)))));
      if(true)
        return term;
    }
    return null;
  }
}