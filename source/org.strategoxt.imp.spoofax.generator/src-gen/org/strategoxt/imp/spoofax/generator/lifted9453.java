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

@SuppressWarnings("all") final class lifted9453 extends Strategy 
{ 
  Strategy v_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28627:
    { 
      IStrategoTerm d_4326 = null;
      term = heuristic_child_sorts_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28627;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28627;
      d_4326 = ((IStrategoList)term).head();
      IStrategoTerm arg6366 = ((IStrategoList)term).tail();
      if(arg6366.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6366).isEmpty())
        break Fail28627;
      term = d_4326;
      w_4325 w_43250 = new w_4325();
      w_43250.v_4325 = v_4325;
      term = w_43250.invoke(context, term);
      if(term == null)
        break Fail28627;
      if(true)
        return term;
    }
    return null;
  }
}