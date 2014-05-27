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

@SuppressWarnings("all") final class lifted9018 extends Strategy 
{ 
  public static final lifted9018 instance = new lifted9018();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29025:
    { 
      IStrategoTerm s_4221 = null;
      s_4221 = term;
      Success11425:
      { 
        Fail29026:
        { 
          term = get_source_pathname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail29026;
          if(true)
            break Success11425;
        }
        term = generator.const6995;
      }
      term = termFactory.makeTuple(generator.conststderr0, (IStrategoTerm)termFactory.makeListCons(generator.const6997, termFactory.makeListCons(s_4221, termFactory.makeListCons(generator.const6996, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)))));
      term = fprintnl_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29025;
      if(true)
        return term;
    }
    return null;
  }
}