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

@SuppressWarnings("all") public class $Imported$From_0_0 extends Strategy 
{ 
  public static $Imported$From_0_0 instance = new $Imported$From_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ImportedFrom_0_0");
    Fail27085:
    { 
      TermReference m_4427 = new TermReference();
      TermReference n_4427 = new TermReference();
      IStrategoTerm r_4427 = null;
      if(n_4427.value == null)
        n_4427.value = term;
      else
        if(n_4427.value != term && !n_4427.value.match(term))
          break Fail27085;
      if(m_4427.value == null)
        m_4427.value = term;
      else
        if(m_4427.value != term && !m_4427.value.match(term))
          break Fail27085;
      r_4427 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, r_4427, generator.const7027, n_4427.value);
      if(term == null)
        break Fail27085;
      lifted10041 lifted100410 = new lifted10041();
      lifted100410.m_4427 = m_4427;
      lifted100410.n_4427 = n_4427;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100410);
      if(term == null)
        break Fail27085;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}