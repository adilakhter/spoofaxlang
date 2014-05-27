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

@SuppressWarnings("all") public class once_$Reset$Files_0_0 extends Strategy 
{ 
  public static once_$Reset$Files_0_0 instance = new once_$Reset$Files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ResetFiles_0_0");
    Fail27656:
    { 
      IStrategoTerm c_4522 = null;
      TermReference d_4522 = new TermReference();
      TermReference e_4522 = new TermReference();
      TermReference f_4522 = new TermReference();
      IStrategoTerm g_4522 = null;
      IStrategoTerm h_4522 = null;
      IStrategoTerm j_4522 = null;
      IStrategoTerm k_4522 = null;
      IStrategoTerm m_4522 = null;
      IStrategoTerm n_4522 = null;
      if(e_4522.value == null)
        e_4522.value = term;
      else
        if(e_4522.value != term && !e_4522.value.match(term))
          break Fail27656;
      if(d_4522.value == null)
        d_4522.value = term;
      else
        if(d_4522.value != term && !d_4522.value.match(term))
          break Fail27656;
      j_4522 = term;
      m_4522 = term;
      k_4522 = generator.const7888;
      n_4522 = m_4522;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, n_4522, k_4522, generator.constCons4561);
      if(term == null)
        break Fail27656;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27656;
      c_4522 = term.getSubterm(0);
      h_4522 = term.getSubterm(1);
      g_4522 = term.getSubterm(2);
      term = c_4522;
      lifted10236 lifted102360 = new lifted10236();
      lifted102360.d_4522 = d_4522;
      lifted102360.e_4522 = e_4522;
      lifted102360.f_4522 = f_4522;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102360);
      if(term == null)
        break Fail27656;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27656;
      term = hashtable_put_0_2.instance.invoke(context, g_4522, h_4522, term);
      if(term == null)
        break Fail27656;
      term = j_4522;
      if(f_4522.value == null)
        break Fail27656;
      term = f_4522.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}