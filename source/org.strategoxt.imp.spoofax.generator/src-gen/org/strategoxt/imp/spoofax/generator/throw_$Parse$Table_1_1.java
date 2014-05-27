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

@SuppressWarnings("all") public class throw_$Parse$Table_1_1 extends Strategy 
{ 
  public static throw_$Parse$Table_1_1 instance = new throw_$Parse$Table_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4501, IStrategoTerm l_4501)
  { 
    context.push("throw_ParseTable_1_1");
    Fail27535:
    { 
      IStrategoTerm o_4501 = null;
      o_4501 = term;
      term = dr_throw_1_2.instance.invoke(context, o_4501, m_4501, l_4501, generator.const7871);
      if(term == null)
        break Fail27535;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}