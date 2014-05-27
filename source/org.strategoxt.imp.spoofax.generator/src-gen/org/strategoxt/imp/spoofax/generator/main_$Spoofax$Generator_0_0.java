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

@SuppressWarnings("all") public class main_$Spoofax$Generator_0_0 extends Strategy 
{ 
  public static main_$Spoofax$Generator_0_0 instance = new main_$Spoofax$Generator_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("main_SpoofaxGenerator_0_0");
    Fail26740:
    { 
      TermReference x_4393 = new TermReference();
      lifted9532 lifted95320 = new lifted9532();
      lifted95320.x_4393 = x_4393;
      term = option_wrap_2_0.instance.invoke(context, term, sdf2imp_options_0_0.instance, lifted95320);
      if(term == null)
        break Fail26740;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}