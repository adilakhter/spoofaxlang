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

@SuppressWarnings("all") public class aux_$Input$Dir$Prefix_0_1 extends Strategy 
{ 
  public static aux_$Input$Dir$Prefix_0_1 instance = new aux_$Input$Dir$Prefix_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_4436)
  { 
    Fail27138:
    { 
      IStrategoTerm i_4436 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27138;
      IStrategoTerm arg6553 = term.getSubterm(0);
      if(arg6553.getTermType() != IStrategoTerm.STRING || !"-159177".equals(((IStrategoString)arg6553).stringValue()))
        break Fail27138;
      i_4436 = term.getSubterm(1);
      term = i_4436;
      if(true)
        return term;
    }
    context.push("aux_InputDirPrefix_0_1");
    context.popOnFailure();
    return null;
  }
}