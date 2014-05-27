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

@SuppressWarnings("all") final class lifted10068 extends Strategy 
{ 
  TermReference d_4440;

  TermReference e_4440;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27974:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, d_4440.value, e_4440.value);
      if(term == null)
        break Fail27974;
      if(true)
        return term;
    }
    return null;
  }
}