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

@SuppressWarnings("all") public class asfix_lex_yield_0_0 extends Strategy 
{ 
  public static asfix_lex_yield_0_0 instance = new asfix_lex_yield_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("asfix_lex_yield_0_0");
    Fail25491:
    { 
      j_4225 j_42251 = new j_4225();
      j_4225 j_42250 = new j_4225();
      j_42250.j_4225 = j_42251;
      j_42251.j_4225 = j_42251;
      term = j_42250.invoke(context, term);
      if(term == null)
        break Fail25491;
      term = implode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25491;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}