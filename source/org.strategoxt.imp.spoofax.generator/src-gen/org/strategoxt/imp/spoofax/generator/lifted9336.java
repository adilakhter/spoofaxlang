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

@SuppressWarnings("all") final class lifted9336 extends Strategy 
{ 
  TermReference t_4289;

  TermReference u_4289;

  TermReference v_4289;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28722:
    { 
      if(t_4289.value == null || (u_4289.value == null || v_4289.value == null))
        break Fail28722;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7198, termFactory.makeListCons(t_4289.value, termFactory.makeListCons(generator.const7009, termFactory.makeListCons(u_4289.value, termFactory.makeListCons(v_4289.value, (IStrategoList)generator.constNil7)))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28722;
      if(true)
        return term;
    }
    return null;
  }
}