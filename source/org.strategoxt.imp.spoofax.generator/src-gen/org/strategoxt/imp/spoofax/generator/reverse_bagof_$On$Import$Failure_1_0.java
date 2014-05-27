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

@SuppressWarnings("all") public class reverse_bagof_$On$Import$Failure_1_0 extends Strategy 
{ 
  public static reverse_bagof_$On$Import$Failure_1_0 instance = new reverse_bagof_$On$Import$Failure_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4474)
  { 
    context.push("reverse_bagof_OnImportFailure_1_0");
    Fail27367:
    { 
      TermReference l_4474 = new TermReference();
      TermReference m_4474 = new TermReference();
      if(m_4474.value == null)
        m_4474.value = term;
      else
        if(m_4474.value != term && !m_4474.value.match(term))
          break Fail27367;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27367;
      if(l_4474.value == null)
        l_4474.value = term.getSubterm(0);
      else
        if(l_4474.value != term.getSubterm(0) && !l_4474.value.match(term.getSubterm(0)))
          break Fail27367;
      Success11084:
      { 
        Fail27368:
        { 
          IStrategoTerm q_4474 = null;
          IStrategoTerm s_4474 = null;
          IStrategoTerm t_4474 = null;
          s_4474 = term;
          q_4474 = generator.const7458;
          t_4474 = s_4474;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4474, q_4474, generator.const7459);
          if(term == null)
            break Fail27368;
          if(true)
            break Success11084;
        }
        term = generator.constNil7;
      }
      lifted10138 lifted101380 = new lifted10138();
      lifted101380.l_4474 = l_4474;
      lifted101380.m_4474 = m_4474;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101380, o_4474);
      if(term == null)
        break Fail27367;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}