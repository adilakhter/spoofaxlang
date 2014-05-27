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

@SuppressWarnings("all") final class lifted10272 extends Strategy 
{ 
  TermReference w_4539;

  TermReference x_4539;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27770:
    { 
      term = aux_$Default$Def$File_0_1.instance.invoke(context, term, w_4539.value);
      if(term == null)
        break Fail27770;
      if(x_4539.value == null)
        x_4539.value = term;
      else
        if(x_4539.value != term && !x_4539.value.match(term))
          break Fail27770;
      if(true)
        return term;
    }
    return null;
  }
}