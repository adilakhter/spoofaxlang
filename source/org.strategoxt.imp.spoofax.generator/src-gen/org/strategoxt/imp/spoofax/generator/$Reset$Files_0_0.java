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

@SuppressWarnings("all") public class $Reset$Files_0_0 extends Strategy 
{ 
  public static $Reset$Files_0_0 instance = new $Reset$Files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ResetFiles_0_0");
    Fail27661:
    { 
      TermReference f_4523 = new TermReference();
      TermReference g_4523 = new TermReference();
      IStrategoTerm j_4523 = null;
      IStrategoTerm l_4523 = null;
      IStrategoTerm m_4523 = null;
      if(g_4523.value == null)
        g_4523.value = term;
      else
        if(g_4523.value != term && !g_4523.value.match(term))
          break Fail27661;
      if(f_4523.value == null)
        f_4523.value = term;
      else
        if(f_4523.value != term && !f_4523.value.match(term))
          break Fail27661;
      l_4523 = term;
      j_4523 = generator.const7888;
      m_4523 = l_4523;
      term = dr_lookup_rule_0_2.instance.invoke(context, m_4523, j_4523, generator.constCons4561);
      if(term == null)
        break Fail27661;
      lifted10239 lifted102390 = new lifted10239();
      lifted102390.f_4523 = f_4523;
      lifted102390.g_4523 = g_4523;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102390);
      if(term == null)
        break Fail27661;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}