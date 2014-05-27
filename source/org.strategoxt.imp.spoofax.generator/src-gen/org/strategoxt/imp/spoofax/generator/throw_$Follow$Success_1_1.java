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

@SuppressWarnings("all") public class throw_$Follow$Success_1_1 extends Strategy 
{ 
  public static throw_$Follow$Success_1_1 instance = new throw_$Follow$Success_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4488, IStrategoTerm y_4488)
  { 
    context.push("throw_FollowSuccess_1_1");
    Fail27457:
    { 
      IStrategoTerm b_4489 = null;
      b_4489 = term;
      term = dr_throw_1_2.instance.invoke(context, b_4489, z_4488, y_4488, generator.const7487);
      if(term == null)
        break Fail27457;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}