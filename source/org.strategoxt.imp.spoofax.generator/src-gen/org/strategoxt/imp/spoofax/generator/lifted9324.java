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

@SuppressWarnings("all") final class lifted9324 extends Strategy 
{ 
  TermReference g_4283;

  TermReference e_4283;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28733:
    { 
      IStrategoTerm i_4283 = null;
      IStrategoTerm j_4283 = null;
      j_4283 = term;
      if(g_4283.value == null)
        break Fail28733;
      term = write_to_string_0_0.instance.invoke(context, g_4283.value);
      if(term == null)
        break Fail28733;
      i_4283 = term;
      term = j_4283;
      if(e_4283.value == null)
        break Fail28733;
      term = termFactory.makeTuple(e_4283.value, i_4283);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28733;
      if(true)
        return term;
    }
    return null;
  }
}