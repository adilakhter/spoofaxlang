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

@SuppressWarnings("all") public class bagof_$Descriptor$P$P$Table_0_0 extends Strategy 
{ 
  public static bagof_$Descriptor$P$P$Table_0_0 instance = new bagof_$Descriptor$P$P$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_DescriptorPPTable_0_0");
    Fail27109:
    { 
      TermReference m_4431 = new TermReference();
      if(m_4431.value == null)
        m_4431.value = term;
      else
        if(m_4431.value != term && !m_4431.value.match(term))
          break Fail27109;
      Success11015:
      { 
        Fail27110:
        { 
          IStrategoTerm p_4431 = null;
          IStrategoTerm r_4431 = null;
          IStrategoTerm s_4431 = null;
          r_4431 = term;
          p_4431 = generator.const7124;
          s_4431 = r_4431;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_4431, p_4431, generator.constCons4561);
          if(term == null)
            break Fail27110;
          if(true)
            break Success11015;
        }
        term = generator.constNil7;
      }
      lifted10049 lifted100490 = new lifted10049();
      lifted100490.m_4431 = m_4431;
      term = filter_1_0.instance.invoke(context, term, lifted100490);
      if(term == null)
        break Fail27109;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}