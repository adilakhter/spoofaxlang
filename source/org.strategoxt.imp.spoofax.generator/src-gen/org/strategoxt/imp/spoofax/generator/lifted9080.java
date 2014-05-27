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

@SuppressWarnings("all") final class lifted9080 extends Strategy 
{ 
  Strategy x_4230;

  Strategy y_4230;

  Strategy z_4230;

  Strategy a_4231;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28955:
    { 
      IStrategoTerm b_4231 = null;
      IStrategoTerm f_4231 = null;
      IStrategoTerm c_4231 = null;
      IStrategoTerm g_4231 = null;
      IStrategoTerm d_4231 = null;
      IStrategoTerm h_4231 = null;
      f_4231 = term;
      term = as_string_1_0.instance.invoke(context, term, x_4230);
      if(term == null)
        break Fail28955;
      b_4231 = term;
      term = f_4231;
      g_4231 = f_4231;
      term = as_string_1_0.instance.invoke(context, term, y_4230);
      if(term == null)
        break Fail28955;
      c_4231 = term;
      term = g_4231;
      h_4231 = g_4231;
      term = as_string_1_0.instance.invoke(context, term, z_4230);
      if(term == null)
        break Fail28955;
      d_4231 = term;
      term = h_4231;
      term = as_string_1_0.instance.invoke(context, term, a_4231);
      if(term == null)
        break Fail28955;
      term = (IStrategoTerm)termFactory.makeListCons(b_4231, termFactory.makeListCons(c_4231, termFactory.makeListCons(d_4231, termFactory.makeListCons(term, (IStrategoList)generator.constNil7))));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28955;
      if(true)
        return term;
    }
    return null;
  }
}