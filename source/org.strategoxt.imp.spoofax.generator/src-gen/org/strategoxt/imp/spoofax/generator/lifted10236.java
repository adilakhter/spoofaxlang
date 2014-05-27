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

@SuppressWarnings("all") final class lifted10236 extends Strategy 
{ 
  TermReference d_4522;

  TermReference e_4522;

  TermReference f_4522;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27806:
    { 
      term = aux_$Reset$Files_0_2.instance.invoke(context, term, d_4522.value, e_4522.value);
      if(term == null)
        break Fail27806;
      if(f_4522.value == null)
        f_4522.value = term;
      else
        if(f_4522.value != term && !f_4522.value.match(term))
          break Fail27806;
      if(true)
        return term;
    }
    return null;
  }
}