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

@SuppressWarnings("all") public class is_modification_0_0 extends Strategy 
{ 
  public static is_modification_0_0 instance = new is_modification_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25946:
    { 
      IStrategoTerm c_4283 = null;
      IStrategoTerm term10359 = term;
      Success10285:
      { 
        Fail25947:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25947;
          IStrategoTerm arg6261 = term.getSubterm(0);
          if(arg6261.getTermType() != IStrategoTerm.TUPLE || arg6261.getSubtermCount() != 2)
            break Fail25947;
          c_4283 = arg6261.getSubterm(0);
          if(arg6261.getSubterm(1) != c_4283 && !c_4283.match(arg6261.getSubterm(1)))
            break Fail25947;
          IStrategoTerm arg6262 = term.getSubterm(1);
          if(arg6262.getTermType() != IStrategoTerm.STRING || !"".equals(((IStrategoString)arg6262).stringValue()))
            break Fail25947;
          { 
            if(true)
              break Fail25946;
            if(true)
              break Success10285;
          }
        }
        term = term10359;
      }
      if(true)
        return term;
    }
    context.push("is_modification_0_0");
    context.popOnFailure();
    return null;
  }
}