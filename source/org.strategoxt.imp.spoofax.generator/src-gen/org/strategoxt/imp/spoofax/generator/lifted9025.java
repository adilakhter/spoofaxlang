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

@SuppressWarnings("all") final class lifted9025 extends Strategy 
{ 
  TermReference z_4222;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29017:
    { 
      if(z_4222.value == null)
        break Fail29017;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7005, termFactory.makeListCons(z_4222.value, (IStrategoList)generator.constCons4547));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29017;
      if(true)
        return term;
    }
    return null;
  }
}