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

@SuppressWarnings("all") final class lifted9243 extends Strategy 
{ 
  TermReference o_4260;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28815:
    { 
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28815;
      if(o_4260.value == null)
        o_4260.value = ((IStrategoList)term).head();
      else
        if(o_4260.value != ((IStrategoList)term).head() && !o_4260.value.match(((IStrategoList)term).head()))
          break Fail28815;
      IStrategoTerm arg6217 = ((IStrategoList)term).tail();
      if(arg6217.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6217).isEmpty())
        break Fail28815;
      if(o_4260.value == null)
        break Fail28815;
      term = o_4260.value;
      if(true)
        return term;
    }
    return null;
  }
}