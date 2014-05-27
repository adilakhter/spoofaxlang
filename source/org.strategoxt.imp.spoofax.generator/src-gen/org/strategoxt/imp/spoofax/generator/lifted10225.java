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

@SuppressWarnings("all") final class lifted10225 extends Strategy 
{ 
  public static final lifted10225 instance = new lifted10225();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27817:
    { 
      IStrategoTerm p_4516 = null;
      IStrategoTerm z_4516 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27817;
      z_4516 = term.getSubterm(0);
      IStrategoTerm arg6645 = term.getSubterm(1);
      p_4516 = arg6645;
      term = aux_$New$Project_0_2.instance.invoke(context, z_4516, arg6645, p_4516);
      if(term == null)
        break Fail27817;
      if(true)
        return term;
    }
    return null;
  }
}