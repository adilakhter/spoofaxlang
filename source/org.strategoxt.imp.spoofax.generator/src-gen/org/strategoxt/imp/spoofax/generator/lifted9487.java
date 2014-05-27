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

@SuppressWarnings("all") final class lifted9487 extends Strategy 
{ 
  public static final lifted9487 instance = new lifted9487();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28544:
    { 
      IStrategoTerm term10961 = term;
      Success11284:
      { 
        Fail28545:
        { 
          IStrategoTerm args47 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(args47.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args47).isEmpty())
            break Fail28545;
          IStrategoTerm arg6483 = ((IStrategoList)args47).tail();
          if(arg6483.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6483).isEmpty())
            break Fail28545;
          IStrategoTerm arg6484 = ((IStrategoList)arg6483).head();
          if(arg6484.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6484).isEmpty())
            break Fail28545;
          IStrategoTerm arg6485 = ((IStrategoList)arg6483).tail();
          if(arg6485.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6485).isEmpty())
            break Fail28545;
          { 
            if(true)
              break Fail28544;
            if(true)
              break Success11284;
          }
        }
        term = term10961;
      }
      if(true)
        return term;
    }
    return null;
  }
}