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

@SuppressWarnings("all") public class aux_$Is$Reserved$Class$Name_0_2 extends Strategy 
{ 
  public static aux_$Is$Reserved$Class$Name_0_2 instance = new aux_$Is$Reserved$Class$Name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4448, IStrategoTerm u_4448)
  { 
    Fail27216:
    { 
      IStrategoTerm v_4448 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27216;
      IStrategoTerm arg6568 = term.getSubterm(0);
      if(arg6568.getTermType() != IStrategoTerm.STRING || !"-148424".equals(((IStrategoString)arg6568).stringValue()))
        break Fail27216;
      v_4448 = term.getSubterm(1);
      term = v_4448;
      if(true)
        return term;
    }
    context.push("aux_IsReservedClassName_0_2");
    context.popOnFailure();
    return null;
  }
}