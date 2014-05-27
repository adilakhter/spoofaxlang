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

@SuppressWarnings("all") public class heuristic_collect_all_rtg_1_0 extends Strategy 
{ 
  public static heuristic_collect_all_rtg_1_0 instance = new heuristic_collect_all_rtg_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4325)
  { 
    context.push("heuristic_collect_all_rtg_1_0");
    Fail26289:
    { 
      IStrategoTerm d_4325 = null;
      IStrategoTerm e_4325 = null;
      e_4325 = term;
      d_4325 = generator.const7483;
      term = e_4325;
      lifted9449 lifted94490 = new lifted9449();
      lifted94490.b_4325 = b_4325;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94490, d_4325);
      if(term == null)
        break Fail26289;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}