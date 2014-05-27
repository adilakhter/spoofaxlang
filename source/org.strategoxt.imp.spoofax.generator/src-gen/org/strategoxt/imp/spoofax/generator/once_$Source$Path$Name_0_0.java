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

@SuppressWarnings("all") public class once_$Source$Path$Name_0_0 extends Strategy 
{ 
  public static once_$Source$Path$Name_0_0 instance = new once_$Source$Path$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_SourcePathName_0_0");
    Fail27028:
    { 
      IStrategoTerm f_4418 = null;
      TermReference g_4418 = new TermReference();
      TermReference h_4418 = new TermReference();
      TermReference i_4418 = new TermReference();
      IStrategoTerm j_4418 = null;
      IStrategoTerm k_4418 = null;
      IStrategoTerm m_4418 = null;
      IStrategoTerm o_4418 = null;
      if(h_4418.value == null)
        h_4418.value = term;
      else
        if(h_4418.value != term && !h_4418.value.match(term))
          break Fail27028;
      if(g_4418.value == null)
        g_4418.value = term;
      else
        if(g_4418.value != term && !g_4418.value.match(term))
          break Fail27028;
      m_4418 = term;
      o_4418 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, o_4418, generator.const7018, h_4418.value);
      if(term == null)
        break Fail27028;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27028;
      f_4418 = term.getSubterm(0);
      k_4418 = term.getSubterm(1);
      j_4418 = term.getSubterm(2);
      term = f_4418;
      lifted10020 lifted100200 = new lifted10020();
      lifted100200.g_4418 = g_4418;
      lifted100200.h_4418 = h_4418;
      lifted100200.i_4418 = i_4418;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100200);
      if(term == null)
        break Fail27028;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27028;
      term = hashtable_put_0_2.instance.invoke(context, j_4418, k_4418, term);
      if(term == null)
        break Fail27028;
      term = m_4418;
      if(i_4418.value == null)
        break Fail27028;
      term = i_4418.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}