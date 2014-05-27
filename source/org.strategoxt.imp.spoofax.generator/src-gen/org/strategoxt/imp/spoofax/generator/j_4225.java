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

@SuppressWarnings("all") final class j_4225 extends Strategy 
{ 
  Strategy j_4225;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29005:
    { 
      IStrategoTerm term10060 = term;
      Success11422:
      { 
        Fail29006:
        { 
          lifted9036 lifted90360 = new lifted9036();
          lifted90360.j_4225 = j_4225;
          term = appl_2_0.instance.invoke(context, term, _Id.instance, lifted90360);
          if(term == null)
            break Fail29006;
          term = h_4225.instance.invoke(context, term);
          if(term == null)
            break Fail29006;
          if(true)
            break Success11422;
        }
        term = i_4225.instance.invoke(context, term10060);
        if(term == null)
          break Fail29005;
      }
      if(true)
        return term;
    }
    return null;
  }
}