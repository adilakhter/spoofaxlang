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

@SuppressWarnings("all") public class start_4_0 extends Strategy 
{ 
  public static start_4_0 instance = new start_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4412, Strategy w_4412, Strategy x_4412, Strategy y_4412)
  { 
    context.push("start_4_0");
    Fail26967:
    { 
      lifted9836 lifted98360 = new lifted9836();
      lifted9820 lifted98200 = new lifted9820();
      lifted98360.y_4412 = y_4412;
      lifted98360.x_4412 = x_4412;
      lifted98360.w_4412 = w_4412;
      lifted98200.v_4412 = v_4412;
      term = appl_2_0.instance.invoke(context, term, lifted98200, lifted98360);
      if(term == null)
        break Fail26967;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}