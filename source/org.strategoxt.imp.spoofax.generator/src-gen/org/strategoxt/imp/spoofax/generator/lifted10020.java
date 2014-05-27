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

@SuppressWarnings("all") final class lifted10020 extends Strategy 
{ 
  TermReference g_4418;

  TermReference h_4418;

  TermReference i_4418;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28022:
    { 
      term = aux_$Source$Path$Name_0_2.instance.invoke(context, term, g_4418.value, h_4418.value);
      if(term == null)
        break Fail28022;
      if(i_4418.value == null)
        i_4418.value = term;
      else
        if(i_4418.value != term && !i_4418.value.match(term))
          break Fail28022;
      if(true)
        return term;
    }
    return null;
  }
}