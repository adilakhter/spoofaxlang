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

@SuppressWarnings("all") final class lifted10083 extends Strategy 
{ 
  TermReference r_4447;

  TermReference s_4447;

  TermReference t_4447;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27959:
    { 
      term = aux_$Is$Reserved$Class$Name_0_2.instance.invoke(context, term, r_4447.value, s_4447.value);
      if(term == null)
        break Fail27959;
      if(t_4447.value == null)
        t_4447.value = term;
      else
        if(t_4447.value != term && !t_4447.value.match(term))
          break Fail27959;
      if(true)
        return term;
    }
    return null;
  }
}