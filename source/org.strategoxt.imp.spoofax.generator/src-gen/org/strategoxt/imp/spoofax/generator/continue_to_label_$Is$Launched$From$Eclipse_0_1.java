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

@SuppressWarnings("all") public class continue_to_label_$Is$Launched$From$Eclipse_0_1 extends Strategy 
{ 
  public static continue_to_label_$Is$Launched$From$Eclipse_0_1 instance = new continue_to_label_$Is$Launched$From$Eclipse_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_4523)
  { 
    context.push("continue_to_label_IsLaunchedFromEclipse_0_1");
    Fail27666:
    { 
      IStrategoTerm a_4524 = null;
      a_4524 = term;
      term = dr_continue_0_2.instance.invoke(context, a_4524, generator.const7895, y_4523);
      if(term == null)
        break Fail27666;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}