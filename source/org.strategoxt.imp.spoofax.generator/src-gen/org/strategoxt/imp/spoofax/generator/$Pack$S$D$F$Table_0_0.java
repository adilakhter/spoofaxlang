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

@SuppressWarnings("all") public class $Pack$S$D$F$Table_0_0 extends Strategy 
{ 
  public static $Pack$S$D$F$Table_0_0 instance = new $Pack$S$D$F$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("PackSDFTable_0_0");
    Fail27059:
    { 
      TermReference j_4423 = new TermReference();
      IStrategoTerm m_4423 = null;
      IStrategoTerm o_4423 = null;
      IStrategoTerm p_4423 = null;
      if(j_4423.value == null)
        j_4423.value = term;
      else
        if(j_4423.value != term && !j_4423.value.match(term))
          break Fail27059;
      o_4423 = term;
      m_4423 = generator.const7022;
      p_4423 = o_4423;
      term = dr_lookup_rule_0_2.instance.invoke(context, p_4423, m_4423, generator.constCons4561);
      if(term == null)
        break Fail27059;
      lifted10032 lifted100320 = new lifted10032();
      lifted100320.j_4423 = j_4423;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100320);
      if(term == null)
        break Fail27059;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}