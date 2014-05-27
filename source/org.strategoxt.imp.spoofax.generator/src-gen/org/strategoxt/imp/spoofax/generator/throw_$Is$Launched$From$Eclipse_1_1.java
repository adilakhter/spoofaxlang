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

@SuppressWarnings("all") public class throw_$Is$Launched$From$Eclipse_1_1 extends Strategy 
{ 
  public static throw_$Is$Launched$From$Eclipse_1_1 instance = new throw_$Is$Launched$From$Eclipse_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4523, IStrategoTerm u_4523)
  { 
    context.push("throw_IsLaunchedFromEclipse_1_1");
    Fail27665:
    { 
      IStrategoTerm x_4523 = null;
      x_4523 = term;
      term = dr_throw_1_2.instance.invoke(context, x_4523, v_4523, u_4523, generator.const7895);
      if(term == null)
        break Fail27665;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}