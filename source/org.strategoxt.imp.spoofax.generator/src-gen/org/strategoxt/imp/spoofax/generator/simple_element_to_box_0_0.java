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

@SuppressWarnings("all") public class simple_element_to_box_0_0 extends Strategy 
{ 
  public static simple_element_to_box_0_0 instance = new simple_element_to_box_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25438:
    { 
      IStrategoTerm d_4219 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consEmptyElement_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25438;
      d_4219 = term.getSubterm(0);
      IStrategoTerm arg5847 = term.getSubterm(1);
      if(arg5847.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5847).isEmpty())
        break Fail25438;
      term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX10, termFactory.makeListCons(d_4219, (IStrategoList)generator.constCons4525))});
      if(true)
        return term;
    }
    context.push("simple_element_to_box_0_0");
    context.popOnFailure();
    return null;
  }
}