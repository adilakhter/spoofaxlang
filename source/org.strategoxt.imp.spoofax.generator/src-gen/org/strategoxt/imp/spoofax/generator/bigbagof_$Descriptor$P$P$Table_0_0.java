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

@SuppressWarnings("all") public class bigbagof_$Descriptor$P$P$Table_0_0 extends Strategy 
{ 
  public static bigbagof_$Descriptor$P$P$Table_0_0 instance = new bigbagof_$Descriptor$P$P$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_DescriptorPPTable_0_0");
    Fail27104:
    { 
      TermReference m_4430 = new TermReference();
      if(m_4430.value == null)
        m_4430.value = term;
      else
        if(m_4430.value != term && !m_4430.value.match(term))
          break Fail27104;
      Success11013:
      { 
        Fail27105:
        { 
          IStrategoTerm p_4430 = null;
          IStrategoTerm r_4430 = null;
          IStrategoTerm s_4430 = null;
          r_4430 = term;
          p_4430 = generator.const7124;
          s_4430 = r_4430;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, s_4430, p_4430, generator.constCons4561);
          if(term == null)
            break Fail27105;
          if(true)
            break Success11013;
        }
        term = generator.constNil7;
      }
      lifted10046 lifted100460 = new lifted10046();
      lifted100460.m_4430 = m_4430;
      term = filter_1_0.instance.invoke(context, term, lifted100460);
      if(term == null)
        break Fail27104;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}