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

@SuppressWarnings("all") final class lifted9338 extends Strategy 
{ 
  TermReference x_4294;

  TermReference y_4294;

  TermReference z_4294;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28720:
    { 
      if(x_4294.value == null || (y_4294.value == null || z_4294.value == null))
        break Fail28720;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7198, termFactory.makeListCons(x_4294.value, termFactory.makeListCons(generator.const7009, termFactory.makeListCons(y_4294.value, termFactory.makeListCons(z_4294.value, (IStrategoList)generator.constNil7)))));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28720;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28720;
      if(true)
        return term;
    }
    return null;
  }
}