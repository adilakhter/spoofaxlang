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

@SuppressWarnings("all") public class throw_$Start$Symbol_1_1 extends Strategy 
{ 
  public static throw_$Start$Symbol_1_1 instance = new throw_$Start$Symbol_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4461, IStrategoTerm w_4461)
  { 
    context.push("throw_StartSymbol_1_1");
    Fail27297:
    { 
      IStrategoTerm z_4461 = null;
      z_4461 = term;
      term = dr_throw_1_2.instance.invoke(context, z_4461, x_4461, w_4461, generator.const7443);
      if(term == null)
        break Fail27297;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}