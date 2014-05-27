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

@SuppressWarnings("all") public class dbg_1_0 extends Strategy 
{ 
  public static dbg_1_0 instance = new dbg_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4246)
  { 
    context.push("dbg_1_0");
    Fail25678:
    { 
      IStrategoTerm c_4246 = null;
      IStrategoTerm d_4246 = null;
      IStrategoTerm f_4246 = null;
      IStrategoTerm g_4246 = null;
      IStrategoTerm h_4246 = null;
      f_4246 = term;
      c_4246 = generator.constDebug0;
      g_4246 = f_4246;
      term = b_4246.invoke(context, generator.const6968);
      if(term == null)
        break Fail25678;
      d_4246 = term;
      term = g_4246;
      h_4246 = g_4246;
      term = log_0_3.instance.invoke(context, h_4246, c_4246, d_4246, term);
      if(term == null)
        break Fail25678;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}