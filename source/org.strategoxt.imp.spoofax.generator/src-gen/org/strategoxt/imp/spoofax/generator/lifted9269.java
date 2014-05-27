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

@SuppressWarnings("all") final class lifted9269 extends Strategy 
{ 
  TermReference o_4541;

  Strategy n_4541;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28788:
    { 
      IStrategoTerm term10277 = term;
      Success11372:
      { 
        Fail28789:
        { 
          term = n_4541.invoke(context, term);
          if(term == null)
            break Fail28789;
          if(true)
            break Success11372;
        }
        term = term10277;
        IStrategoTerm p_4269 = null;
        IStrategoTerm r_4269 = null;
        p_4269 = term;
        if(o_4541.value == null)
          break Fail28788;
        term = (IStrategoTerm)termFactory.makeListCons(o_4541.value, (IStrategoList)generator.constNil7);
        term = ast2abox_0_1.instance.invoke(context, p_4269, term);
        if(term == null)
          break Fail28788;
        r_4269 = term;
        term = box2text_string_0_1.instance.invoke(context, r_4269, generator.const7040);
        if(term == null)
          break Fail28788;
      }
      if(true)
        return term;
    }
    return null;
  }
}