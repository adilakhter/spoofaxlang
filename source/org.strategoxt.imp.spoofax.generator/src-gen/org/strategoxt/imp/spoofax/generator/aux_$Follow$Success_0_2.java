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

@SuppressWarnings("all") public class aux_$Follow$Success_0_2 extends Strategy 
{ 
  public static aux_$Follow$Success_0_2 instance = new aux_$Follow$Success_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4492, IStrategoTerm u_4492)
  { 
    Fail27480:
    { 
      IStrategoTerm v_4492 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27480;
      IStrategoTerm arg6616 = term.getSubterm(0);
      if(arg6616.getTermType() != IStrategoTerm.STRING || !"154863".equals(((IStrategoString)arg6616).stringValue()))
        break Fail27480;
      v_4492 = term.getSubterm(1);
      term = v_4492;
      if(true)
        return term;
    }
    context.push("aux_FollowSuccess_0_2");
    context.popOnFailure();
    return null;
  }
}