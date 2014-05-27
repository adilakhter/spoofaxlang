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

@SuppressWarnings("all") final class lifted9285 extends Strategy 
{ 
  public static final lifted9285 instance = new lifted9285();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28769:
    { 
      IStrategoTerm c_4272 = null;
      c_4272 = term;
      IStrategoTerm term10293 = term;
      Success11366:
      { 
        Fail28770:
        { 
          term = origin_sublist_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28770;
          if(true)
            break Success11366;
        }
        term = term10293;
        term = length_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28769;
        term = termFactory.makeTuple(term, generator.const6989);
        term = eq_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28769;
      }
      term = c_4272;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
      if(true)
        return term;
    }
    return null;
  }
}