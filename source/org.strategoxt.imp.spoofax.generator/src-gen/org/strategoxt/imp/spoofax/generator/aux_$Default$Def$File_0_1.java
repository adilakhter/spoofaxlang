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

@SuppressWarnings("all") public class aux_$Default$Def$File_0_1 extends Strategy 
{ 
  public static aux_$Default$Def$File_0_1 instance = new aux_$Default$Def$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_4541)
  { 
    Fail27766:
    { 
      IStrategoTerm d_4541 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27766;
      IStrategoTerm arg6668 = term.getSubterm(0);
      if(arg6668.getTermType() != IStrategoTerm.STRING || !"100819".equals(((IStrategoString)arg6668).stringValue()))
        break Fail27766;
      d_4541 = term.getSubterm(1);
      term = d_4541;
      if(true)
        return term;
    }
    context.push("aux_DefaultDefFile_0_1");
    context.popOnFailure();
    return null;
  }
}