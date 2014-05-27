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

@SuppressWarnings("all") public class aux_$Input$File_0_1 extends Strategy 
{ 
  public static aux_$Input$File_0_1 instance = new aux_$Input$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4501)
  { 
    Fail27532:
    { 
      IStrategoTerm f_4501 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27532;
      IStrategoTerm arg6626 = term.getSubterm(0);
      if(arg6626.getTermType() != IStrategoTerm.STRING || !"58206".equals(((IStrategoString)arg6626).stringValue()))
        break Fail27532;
      f_4501 = term.getSubterm(1);
      term = f_4501;
      if(true)
        return term;
    }
    context.push("aux_InputFile_0_1");
    context.popOnFailure();
    return null;
  }
}