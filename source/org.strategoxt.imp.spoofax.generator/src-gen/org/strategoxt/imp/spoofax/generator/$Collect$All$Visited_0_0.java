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

@SuppressWarnings("all") public class $Collect$All$Visited_0_0 extends Strategy 
{ 
  public static $Collect$All$Visited_0_0 instance = new $Collect$All$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CollectAllVisited_0_0");
    Fail27427:
    { 
      TermReference h_4484 = new TermReference();
      TermReference i_4484 = new TermReference();
      IStrategoTerm m_4484 = null;
      if(i_4484.value == null)
        i_4484.value = term;
      else
        if(i_4484.value != term && !i_4484.value.match(term))
          break Fail27427;
      if(h_4484.value == null)
        h_4484.value = term;
      else
        if(h_4484.value != term && !h_4484.value.match(term))
          break Fail27427;
      m_4484 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, m_4484, generator.const7483, i_4484.value);
      if(term == null)
        break Fail27427;
      lifted10158 lifted101580 = new lifted10158();
      lifted101580.h_4484 = h_4484;
      lifted101580.i_4484 = i_4484;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101580);
      if(term == null)
        break Fail27427;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}